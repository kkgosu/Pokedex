package com.example.pokedex.fragments.detail;

import com.example.pokedex.di.ActivityComponent;
import com.example.pokedex.fragments.base.BaseBuilder;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailBuilder extends BaseBuilder<DetailFragment> {
    @Override
    public DetailFragment build(ActivityComponent component) {
        DetailFragment detailFragment = DetailFragment.newInstance();
        DetailPresenterImpl detailPresenter = new DetailPresenterImpl();
        DetailComponent detailComponent = DaggerDetailComponent.builder()
                .detailModule(new DetailModule(detailFragment, detailPresenter))
                .activityComponent(component)
                .build();

        detailComponent.inject(detailFragment);
        detailComponent.inject(detailPresenter);

        return detailFragment;
    }
}
