package br.com.agecomnet.gestoremobile;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;



public class TelaSplash extends AppCompatActivity implements Runnable {

    private final int DELAY = 3500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_splash);
        Toast.makeText(this, "Aguarde o carregamento da aplicação", Toast.LENGTH_SHORT).show();

        Handler h = new Handler();
        h.postDelayed(this, DELAY);

    }

    @Override
    public void run() {
        startActivity(new Intent(this, ScreenLogin.class));
        finish();
    }
}
