package com.projeto.danilosetubal.exemplobancoormlite;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.j256.ormlite.dao.Dao;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // O Dao é somente a ponte entre objeto e bd
    Dao<Categoria, Integer> categoriaDao;
    ArrayList<Categoria> listCategoria;
    // Adapter é a ponte entre os dados da listCategoria e o listView
    ArrayAdapter<Categoria> adapterCategoria;
    ListView lvCategorias;
    EditText editNome;
    Categoria categoria = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvCategorias = (ListView) findViewById(R.id.lvCategoria);
        editNome = (EditText) findViewById(R.id.editNome);

        // Chamar o Dao de categoria
        try {
            categoriaDao = MyORMLiteHelper.getmInstance(this).getCategoriaDao();

            // Carregando a lista do banco no listView
            adapterCategoria = new ArrayAdapter<Categoria>(this, android.R.layout.simple_list_item_1,
                    categoriaDao.queryForAll());
            lvCategorias.setAdapter(adapterCategoria);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        lvCategorias.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int position, long l) {
                categoria = adapterCategoria.getItem(position);
                editNome.setText(categoria.getNome());
                Toast.makeText(MainActivity.this, "Editando " + categoria.toString() , Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        // Clique curto no listView
        lvCategorias.setOnItemClickListener(cliqueCurto());

    }

    private AdapterView.OnItemClickListener cliqueCurto() {
        return new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                categoria = adapterCategoria.getItem(position);
                AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                alerta.setTitle("Deletando categoria!");
                alerta.setMessage("Confirmar exclusão de " + categoria.toString());
                alerta.setNegativeButton("Não", null);
                alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int wich) {
                        try {
                            categoriaDao.delete(categoria);
                            adapterCategoria.remove(categoria);
                            categoria = null;
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                });
                alerta.show();
            }
        };
    }

    public void salvar(View v) throws SQLException {

        if (categoria == null) {
            categoria = new Categoria();
        }

        categoria.setNome(editNome.getText().toString());
        Dao.CreateOrUpdateStatus res = categoriaDao.createOrUpdate(categoria);

        if (res.isCreated()) {
            adapterCategoria.add(categoria);
            Toast.makeText(this, "Cadastrado!", Toast.LENGTH_SHORT).show();
        } else {
            adapterCategoria.notifyDataSetChanged();
            Toast.makeText(this, "Editado!", Toast.LENGTH_SHORT).show();
        }

        editNome.setText("");
        categoria = null;
        
    }
}
