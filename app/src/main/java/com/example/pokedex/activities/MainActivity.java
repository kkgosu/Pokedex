package com.example.pokedex.activities;

import android.os.Bundle;

import com.example.model.models.Pokemon;
import com.example.pokedex.PokedexApplication;
import com.example.pokedex.R;
import com.example.pokedex.annotations.Layout;
import com.example.pokedex.annotations.Title;
import com.example.pokedex.fragments.dashboard.DashboardBuilder;
import com.example.pokedex.fragments.dashboard.DashboardFragment;

@Layout(R.layout.activity_main)
@Title(R.string.app_name)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DashboardFragment dashboardFragment = new DashboardBuilder().build(mActivityComponent);
        mActivityComponent.transitionController().transition(dashboardFragment);

        Pokemon pokemon = ((PokedexApplication) getApplication()).getApplicationComponent().pokemonDatastore().getPokemonById(25);
        System.out.println(pokemon);
    }

    @Override
    public int getFragmentLayoutId() {
        return R.id.fragment_container;
    }
}
