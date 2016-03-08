package br.com.agecomnet.gestoremobile;

import android.content.Intent;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import br.com.agecomnet.gestoremobile.br.com.agecomnet.gestoremobile.assincrona.DownloadJsonAsyncTask;


public class ScreenLogin extends AppCompatActivity {

    private Button btLoginEntrar;
    private Button btTestaWS;
    private EditText etUsuario;
    private EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);

        inicializarObjetos();

        btLoginEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (etUsuario.getText().toString().equals("") || etSenha.getText().toString().equals("")) {
                    mensagemDeValidacao("Atenção", "Favor preencher todos os campos!");
                } else {
                    Toast.makeText(ScreenLogin.this, "AGORA só validar no webservice", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btTestaWS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ScreenLogin.this, ListaTestaWS.class));

                /**
                 * código do webservice
                 */

                //new DownloadJsonAsyncTask().execute("http://192.168.0.101:6906/Restful/usuario/listaTodos");

                
            }
        });

    }

    public void mensagemDeValidacao(String titulo, String texto){

        AlertDialog.Builder alerta = new AlertDialog.Builder(ScreenLogin.this);
        alerta.setTitle(titulo);
        alerta.setMessage(texto);
        alerta.setNeutralButton("OK", null);
        alerta.show();
    }

    public void inicializarObjetos(){
        btLoginEntrar = (Button) findViewById(R.id.btLoginEntrar);
        btTestaWS = (Button) findViewById(R.id.btTestaWS);
        etUsuario = (EditText) findViewById(R.id.et_usuario);
        etSenha = (EditText) findViewById(R.id.et_senha);


    }

}
