package com.example.pokemonivcalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	// Wigets - GUI
	Spinner sppokemon;
	Spinner sppokemonType;


	// Data Source
	String pokemon[] = { "Pikachu", "Snorlax", "Grodon", "Bulbasaur", "Squirtle", "Kayogre", "Eve", "Diglet", "Mew", "SandSlash", "Hoho", "Weezy" };
	String pokemonType[] = { "Hardy", "Lonely", "Brave", "Adamant", "Naughty", "Bold", "Docile", "Relaxed", "Impish", "Lax","Timid", "Hasty" };


	// Adapter
	ArrayAdapter<String> adapterpokemon;
	ArrayAdapter<String> adapterpokemonType;


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Initialize Spinners
		sppokemon = (Spinner) findViewById(R.id.pokemon);
		sppokemonType = (Spinner) findViewById(R.id.pokemonType);

		//Initialize and set Adapter
		adapterpokemon = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, pokemon);
		sppokemon.setAdapter(adapterpokemon);

		adapterpokemonType = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, pokemonType);
		sppokemonType.setAdapter(adapterpokemonType);


		sppokemon.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View v,
					int position, long id) {
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});


		sppokemonType.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> adapter, View v,
					int position, long id) {
			}

			@Override
			public void onNothingSelected(AdapterView<?> arg0) {
				// TODO Auto-generated method stub

			}
		});
	}
}
