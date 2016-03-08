package br.com.agecomnet.gestoremobile.br.com.agecomnet.gestoremobile.assincrona;

import android.app.ProgressDialog;
import android.os.AsyncTask;

import br.com.agecomnet.gestoremobile.ListaTestaWS;

/**
 * Created by Michel Soares on 07/03/2016.
 */
public class DownloadJsonAsyncTask extends AsyncTask {


    private ProgressDialog dialog;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
       // dialog = ProgressDialog.show(ListaTestaWS.this, "Aguarde", "Baixando JSON, Por Favor Aguarde...");
    }

    @Override
    protected Object doInBackground(Object[] params) {
        return null;
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
    }
}
