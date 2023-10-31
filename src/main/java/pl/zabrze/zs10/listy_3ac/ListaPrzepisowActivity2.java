package pl.zabrze.zs10.listy_3ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import kotlin.reflect.KAnnotatedElement;

public class ListaPrzepisowActivity2 extends AppCompatActivity {
    private ArrayList<Przepis> wybranePrzepisy;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow2);
        String kategoria = getIntent().getStringExtra("KATEGORIA");
        int nr = getIntent().getIntExtra("NR",0);
        TextView textView = findViewById(R.id.textView2);
        textView.setText(kategoria);
        RepozytoriumPrzepisow repozytoriumPrzepisow = new RepozytoriumPrzepisow();
        wybranePrzepisy = repozytoriumPrzepisow.przepisyZKategorii(nr);
        listView = findViewById(R.id.listView2);
        ArrayAdapter<Przepis> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,wybranePrzepisy);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        //intencja nie jawna
                        Intent intent = new Intent(ListaPrzepisowActivity2.this,PrzepisActivity2.class);
                        Przepis przepis = wybranePrzepisy.get(i);
                        int id = przepis.getId();
                        intent.putExtra("ID",id);
                        startActivity(intent);
                    }
                }
        );

    }
}