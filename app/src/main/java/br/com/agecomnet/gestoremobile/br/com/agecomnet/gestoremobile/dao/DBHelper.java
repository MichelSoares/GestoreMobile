package br.com.agecomnet.gestoremobile.br.com.agecomnet.gestoremobile.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Michel Soares on 29/02/2016.
 */
public class DBHelper extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "GESTORE_MOBILE";
    private static final int BANCO_VERSAO = 1;

    public DBHelper(Context ctx) {
        super(ctx, NOME_BANCO, null, BANCO_VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        /*Este método pode ser usado para criar todas as tabelas do banco de
        dados e também se necessário adicionar algumas informações iniciais.*/
        String sql = "CREATE TABLE Usuario(id INTEGER PRIMARY KEY," +
                "TEXT nome," +
                "TEXT senha," +
                "TEXT email," +
                "TEXT privilegio);";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        String sql = "DROP TABLE EXISTS Usuario";
        db.execSQL(sql);
        onCreate(db);

    }
}
