package pl.zabrze.zs10.listy_3ac;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView listViewKategorie;
    private Spinner spinnerKategorie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewKategorie = findViewById(R.id.ListView);
        listViewKategorie.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        int ktory = i; //indeks elementy,który został kliknięty
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this, "Kliknięto "+Integer.toString(i)+" Kategoria: "+kategoria, Toast.LENGTH_SHORT).show();
                        wyswietlNowaAktywnosc(kategoria,i);
                    }
                }

        );
        spinnerKategorie = findViewById(R.id.spinner);
        spinnerKategorie.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        int ktory = i; //indeks elementy,który został kliknięty
                        String kategoria = listViewKategorie.getItemAtPosition(i).toString();
                        Toast.makeText(MainActivity.this, "Kliknięto "+Integer.toString(i)+" Kategoria: "+kategoria, Toast.LENGTH_SHORT).show();
                        //wyswietlNowaAktywnosc(kategoria,i);
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(MainActivity.this, "Wybirze kategorię", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
    private void wyswietlNowaAktywnosc(String kategorie,int numer){
        // notatka o intencjach jawnych
        Intent intent = new Intent(MainActivity.this,ListaPrzepisowActivity2.class);
        intent.putExtra("KATEGORIA",kategorie);
        intent.putExtra("NR",numer);
        startActivity(intent);
    }
}