package com.consequat.rillis.myapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class Cadastro extends AppCompatActivity {
    private EditText edtNome, edtEmail, edtSenha1, edtSenha2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        edtNome = (EditText) findViewById(R.id.edtNome);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        edtSenha1 = (EditText) findViewById(R.id.edtSenha1);
        edtSenha2 = (EditText) findViewById(R.id.edtSenha2);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtNome.getText().length()<5 || edtNome.getText().length()>80){
                    Snackbar.make(view, "Erro: O nome deve conter entre 5 e 80 caracteres.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(!edtEmail.getText().toString().contains("@") || !edtEmail.getText().toString().contains(".") || edtEmail.getText().toString().contains(" ") ){
                    Snackbar.make(view, "Erro: Email invalido.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(edtSenha1.getText().toString().contains(" ") ){
                    Snackbar.make(view, "Erro: A senha não pode conter espaço.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(edtSenha1.getText().toString().length() < 6 || edtSenha1.getText().length()>25){
                    Snackbar.make(view, "Erro: A senha deve conter entre 6 e 25 caraceteres.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }else if(!edtSenha1.getText().toString().equals(edtSenha2.getText().toString())){
                    Snackbar.make(view, "Erro: As senhas devem ser identicas.", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                }
                /**
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                 **/
            }
        });
    }

}
