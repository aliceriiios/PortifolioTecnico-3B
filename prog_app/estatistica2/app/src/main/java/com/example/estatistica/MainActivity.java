package com.example.estatistica;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Repositorio r = new Repositorio();
    EditText e1;
    EditText e2;
    EditText e3;
    EditText e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText) findViewById(R.id.name);
        e2 = (EditText) findViewById(R.id.mat);
        e3 = (EditText) findViewById(R.id.idade);
        e4 = (EditText) findViewById(R.id.nota);

    }
    public void cadastra(View view){
        String nome = e1.getText().toString();
        int matricula = Integer.parseInt(e2.getText().toString());
        int idade = Integer.parseInt(e3.getText().toString());
        float nota = Float.parseFloat(e4.getText().toString());

        r.alunos.add(new Aluno(nome, matricula, idade, nota));
    }
    public  void calcula(View view){

    }

}
