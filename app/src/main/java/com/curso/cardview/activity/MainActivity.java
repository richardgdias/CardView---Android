package com.curso.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.curso.cardview.R;
import com.curso.cardview.adapter.PostagemAdapter;
import com.curso.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Definir layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir adapter
        this.prepararPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p;

        p = new Postagem("Richard Dias", "#tbt Viajem Legal", R.drawable.imagem1);
        postagens.add(p);

        p = new Postagem("Hotel WD", "Viaje, aproveite nossos descontos!", R.drawable.imagem2);
        postagens.add(p);

        p = new Postagem("Maria Luiza", "Paris!!", R.drawable.imagem3);
        postagens.add(p);

        p = new Postagem("Marcos Paulo", "Que foto linda!", R.drawable.imagem4);
        postagens.add(p);
    }

}
