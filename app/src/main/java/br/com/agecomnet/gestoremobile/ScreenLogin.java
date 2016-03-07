package br.com.agecomnet.gestoremobile;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ScreenLogin extends AppCompatActivity {

    private Button btLoginEntrar;
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

                if(etUsuario.getText().toString().equals("") || etSenha.getText().toString().equals("")){
                    mensagemDeValidacao("Atenção", "Favor preencher todos os campos!");
                } else {
                    Toast.makeText(ScreenLogin.this, "AGORA só validar no webservice", Toast.LENGTH_SHORT).show();
                }

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
        etUsuario = (EditText) findViewById(R.id.et_usuario);
        etSenha = (EditText) findViewById(R.id.et_senha);
    }

}
