package com.projeto.danilosetubal.biblioapp;

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
    private static final String DATABASE_NAME = "biblioteca.db";

    // Versão da base de dados
    private static final int DATABASE_VERSION = 1;

    // Caso vocë queira ter apenas uma instância da base de dados (singleton)
    private static MyORMLiteHelper mInstance = null;

    private Dao<Autor, Integer> autorDao = null;
    private Dao<Livro, Integer> livroaDao = null;

    public MyORMLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static MyORMLiteHelper getInstance(Context ctx) {

        if (mInstance == null) {
            mInstance = new MyORMLiteHelper(ctx);
        }

        return mInstance;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource) {
        // Criar tabelas no banco de dados
        try {
            TableUtils.createTable(connectionSource, Livro.class);
            TableUtils.createTable(connectionSource, Autor.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, ConnectionSource connectionSource, int i, int i1) {
        try {
            TableUtils.createTable(connectionSource, Livro.class);
            TableUtils.createTable(connectionSource, Autor.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        onCreate(sqLiteDatabase, connectionSource);
    }

    // DAOs //

    public Dao<Autor, Integer> getAutorDao() throws  SQLException {
        if (autorDao == null) {
            autorDao = getDao(Autor.class);
        }
        return autorDao;
    }

    public Dao<Livro, Integer> getLivroaDao() throws SQLException {
        if (livroaDao == null) {
            livroaDao = getDao(Livro.class);
        }
        return livroaDao;
    }

}
