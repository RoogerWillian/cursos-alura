package br.com.alura.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class ListaAlunosActivity extends AppCompatActivity {

    private String[] alunos;
    private ListView listView;
    private Button btnNovoAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        this.alunos = new String[]{"Roger Willian", "Derik Gabriel", "Enes Rocha", "Solange Nizoli"};
        this.listView = (ListView) this.findViewById(R.id.lista_alunos);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos);
        this.listView.setAdapter(adapter);

        this.btnNovoAluno = (Button) this.findViewById(R.id.novo_aluno);
        this.btnNovoAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentVaiProFormulario = new Intent(ListaAlunosActivity.this,FormularioActivity.class);
                startActivity(intentVaiProFormulario);
            }
        });
    }
}
