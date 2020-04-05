package com.example.pokedex.fragments.dashboard;

import com.example.pokedex.di.components.ActivityComponent;
import com.example.pokedex.fragments.base.BaseBuilder;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DashboardBuilder extends BaseBuilder<DashboardFragment> {

    @Override
    public DashboardFragment build(ActivityComponent component) {
        DashboardFragment dashboardFragment = DashboardFragment.newInstance();
        DashboardPresenterImpl dashboardPresenter = new DashboardPresenterImpl();
        DashboardComponent dashboardComponent = DaggerDashboardComponent.builder()
                .dashboardModule(new DashboardModule(dashboardFragment, dashboardPresenter))
                .activityComponent(component)
                .build();

        dashboardComponent.inject(dashboardFragment);
        dashboardComponent.inject(dashboardPresenter);

        return dashboardFragment;
    }
}
