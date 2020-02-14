package com.example.listview.activity.activity.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.R;

public class MainActivity extends AppCompatActivity {

    private ListView listaLocais;
    private String[] itens = {"Angra dos Reis", "Caldas Novas", "Campos do Jordão", "Costa do Sauípe",
                              "Angra dos Reis", "Caldas Novas", "Campos do Jordão", "Costa do Sauípe"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaLocais = findViewById(R.id.listLocais);

        //Criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                itens
        );

        listaLocais.setAdapter(adaptador);

        listaLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor_selecionado = listaLocais.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(), valor_selecionado, Toast.LENGTH_LONG).show();
            }
        });

    }
}
