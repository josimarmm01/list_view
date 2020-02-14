package com.example.listview.activity.activity.activity;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listview.R;
import com.example.listview.activity.activity.adapter.Adapter;
import com.example.listview.activity.activity.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> filmes = new ArrayList<>();
    private final String KEY_RECYCLER_STATE = "recycler_state";
    private static Bundle mBundleRecyclerViewState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem Filmes
        this.criarFIlmes();

        //Configurar Adapter
        Adapter adapter = new Adapter(filmes);

        //Configurar Recycler
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapter);

        //Enveto de Click
        recyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    recyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {

                            Filme filme = filmes.get(position);

                            Toast.makeText(getApplicationContext(),
                                    "Item presionado" + filme.getTituloFilme() ,
                                    Toast.LENGTH_LONG
                            ).show();

                        }

                        @Override
                        public void onLongItemClick(View view, int position) {

                            Filme filme = filmes.get(position);

                            Toast.makeText(getApplicationContext(),
                                    "Item presionado Longo" + filme.getAno(),
                                    Toast.LENGTH_LONG
                            ).show();
                        }

                        @Override
                        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        }
                    }
            )
        );

    }

    @Override
    protected void onPause() {
        super.onPause();

        // save RecyclerView state
        mBundleRecyclerViewState = new Bundle();
        Parcelable listState = recyclerView.getLayoutManager().onSaveInstanceState();
        mBundleRecyclerViewState.putParcelable(KEY_RECYCLER_STATE, listState);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // restore RecyclerView state
        if (mBundleRecyclerViewState != null) {
            Parcelable listState = mBundleRecyclerViewState.getParcelable(KEY_RECYCLER_STATE);
            recyclerView.getLayoutManager().onRestoreInstanceState(listState);
        }
    }

    public void criarFIlmes() {

        Filme filme = new Filme("Homem aramnha", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Vingadores", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Dragonbol Z", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Super Mario", "Ação", "2017");
        this.filmes.add(filme);

        filme = new Filme("Velozes e furiosos", "Ação", "2017");
        this.filmes.add(filme);
    }


}
