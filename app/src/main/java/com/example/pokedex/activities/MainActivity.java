package com.example.pokedex.activities;

import android.os.Bundle;

import com.example.model.entities.local.PokemonLocalEntity;
import com.example.pokedex.PokedexApplication;
import com.example.pokedex.R;
import com.example.pokedex.annotations.Layout;
import com.example.pokedex.annotations.Title;
import com.example.pokedex.fragments.dashboard.DashboardBuilder;
import com.example.pokedex.fragments.dashboard.DashboardFragment;

import java.util.List;

@Layout(R.layout.activity_main)
@Title(R.string.app_name)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DashboardFragment dashboardFragment = new DashboardBuilder().build(mActivityComponent);
        mActivityComponent.transitionController().transition(dashboardFragment);

        String json = ((PokedexApplication) getApplication()).getApplicationComponent()
                .assetsController()
                .getContent("data/pokemon.json");

        List<PokemonLocalEntity> list = ((PokedexApplication) getApplication())
                .getApplicationComponent().gsonController()
                .listFromJson(json, PokemonLocalEntity[].class);

        System.out.println(list.get(0));
    }

    @Override
    public int getFragmentLayoutId() {
        return R.id.fragment_container;
    }
}
