package br.com.agecomnet.gestoremobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaTestaWS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista_testa_ws);

        ListView listaTestaWS = (ListView) findViewById(R.id.listaTestaWS);

        String [] nomes = {"Michel","Marlene","Rosangela"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, nomes);
        listaTestaWS.setAdapter(adapter);
    }

}
