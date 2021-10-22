package br.com.local.aplicativo1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {

    private Button botao;
    private Button log;
    private TextInputLayout usu;
    private TextInputLayout senha;
    private TextInputLayout admin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();



        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Login.this,SignUP.class);
                startActivity(intent);

            }

        });

        log = findViewById(R.id.btn_conectar);
        usu = findViewById(R.id.emailLogin);
        senha = findViewById(R.id.SenhaLogin);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                usu = admin;
                senha = admin;

                if (usu == admin && senha == admin){
                    Toast.makeText(getApplicationContext(), "you have been logged in!",Toast.LENGTH_SHORT).show();
                }else{

                    Toast.makeText(getApplicationContext(), "error when logging in",Toast.LENGTH_SHORT).show();

                }

            }
        });



    }}