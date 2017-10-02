package com.projeto.danilosetubal.exemplobancoormlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by danilosetubal on 27/09/17.
 */

public class MyORMLiteHelper extends OrmLiteSqliteOpenHelper {

    // Nome da base de dados
    private static final String DATABASE_NAME = "minhapedida.db";

    // Versão da base de dados
    private static final int DATABASE_VERSION = 3;

    // Caso vocë queira ter apenas uma instância da base de dados (singleton)
    private static MyORMLiteHelper mInstance = null;

    private Dao<Categoria, Integer> categoriaDao = null;
    // private Dao<Produto, Integer> produtoDao = null;

    public MyORMLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static MyORMLiteHelper getmInstance(Context ctx) {

        if (mInstance == null) {
            mInstance = new MyORMLiteHelper(ctx);
        }

        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        // Criar tabelas no banco de dados
        try {
            TableUtils.createTable(connectionSource, Categoria.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.dropTable(connectionSource, Categoria.class, true);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        onCreate(sqLiteDatabase, connectionSource);
    }

    public Dao<Categoria, Integer> getCategoriaDao() throws SQLException {
        if (categoriaDao == null) {
            categoriaDao = getDao(Categoria.class);
        }
        return categoriaDao;
    }

}
