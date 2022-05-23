package com.example.beeradviser_java;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class FindBeerActivity extends Activity {
    private BeerExpert expert = new BeerExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }
    //Click do botão
    public void onClickFindBeer(View view) {
        //Obtém uma referência para TextView
        TextView brands = (TextView) findViewById(R.id.brands);
        //Obtém uma referência para o Spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //Obtém o item selecionado no Spinner
        String beerType = String.valueOf((color.getSelectedItem()));
        //Obtém recomendações da classe BeerExpert
        List<String> brandList = expert.getBrands(beerType); //Usa a classe BeerExpert para obetr uma Lista de marcas
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand: brandList) {
            brandsFormatted.append(brand).append('\n'); //Constrói uma String exibindo cada marca em uma nova linha
        }
        //Exibe as cervejas
        brands.setText(brandsFormatted);
    }
}