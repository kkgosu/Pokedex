package com.example.pokedex.fragments.detail;

import com.example.pokedex.di.components.ActivityComponent;
import com.example.pokedex.fragments.base.BaseBuilder;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailBuilder extends BaseBuilder<DetailFragment> {

    private int pokemonId;

    public DetailBuilder() {
    }
    public DetailBuilder(int pokemonId) {
        this.pokemonId = pokemonId;
    }

    public static class Builder {
        private int pokemonId;

        public Builder setPokemonId(int pokemonId) {
            this.pokemonId = pokemonId;
            return this;
        }

        public DetailBuilder build() {
            return new DetailBuilder(pokemonId);
        }
    }

    @Override
    public DetailFragment build(ActivityComponent component) {
        DetailFragment detailFragment = DetailFragment.newInstance();
        DetailPresenterImpl detailPresenter = new DetailPresenterImpl(pokemonId);

        DetailComponent detailComponent = DaggerDetailComponent.builder()
                .detailModule(new DetailModule(detailFragment, detailPresenter))
                .activityComponent(component)
                .build();

        detailComponent.inject(detailFragment);
        detailComponent.inject(detailPresenter);

        return detailFragment;
    }
}
