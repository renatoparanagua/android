package com.projeto.danilosetubal.pesquisaapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pessoa = new Pessoa();
    }

    int codRequisicao = 0;

    public void dados(View v) {
        Intent it = null;
        switch (v.getId()) {
            case R.id.btnDadosContato:
                it = new Intent(this, DadosContatoActivity.class);
                codRequisicao = Constantes.REQUEST_DADOS_CONTATO;
                break;

            case R.id.btnDadosEndereco:
                it = new Intent(this, DadosEnderecoActivity.class);
                codRequisicao = Constantes.REQUEST_DADOS_ENDERECO;
                break;

            case R.id.btnDadosPessoais:
                it = new Intent(this, DadosPessoaisActivity.class);
                codRequisicao = Constantes.REQUEST_DADOS_PESSOAIS;
                break;

            case R.id.btnFinalizar:
                it = new Intent(this, ResultadoActivity.class);

                finish();
                break;

        }

        if (it != null) {
            startActivityForResult(it, codRequisicao);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        Bundle param;

        if(resultCode == RESULT_OK) {
            if (requestCode == Constantes.REQUEST_DADOS_CONTATO) {
                param = data.getExtras();
                pessoa.setEmail(param.getString("pemail"));
                pessoa.setTelefone(param.getString("ptelefone"));

            } else if (requestCode == Constantes.REQUEST_DADOS_ENDERECO) {
                param = data.getExtras();
                pessoa.setCep(param.getString("pcep"));
                pessoa.setRua(param.getString("prua"));
                pessoa.setCidade(param.getString("pcidade"));

            } else if (requestCode == Constantes.REQUEST_DADOS_PESSOAIS) {
                param = data.getExtras();
                pessoa.setNome(param.getString("pnome"));
                pessoa.setIdade(param.getString("pidade"));
                pessoa.setProfissao(param.getString("pprofissao"));
            }
        }

        Toast.makeText(this, ""+pessoa.toString(), Toast.LENGTH_SHORT).show();
    }
}
