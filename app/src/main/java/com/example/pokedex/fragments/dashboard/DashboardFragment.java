package com.example.pokedex.fragments.dashboard;

import android.os.Bundle;

import com.example.pokedex.R;
import com.example.pokedex.fragments.base.BaseFragment;
import com.example.pokedex.fragments.base.BasePresenter;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DashboardFragment extends BaseFragment implements DashboardView {

    @Inject
    DashboardPresenter mPresenter;

    @OnClick(R.id.dashboard_textview)
    void onDashboardTextViewCLicked() {
        mPresenter.transitToDetail(1);
    }

    public DashboardFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected BasePresenter provideConcretePresenter() {
        return mPresenter;
    }

    public static DashboardFragment newInstance() {

        Bundle args = new Bundle();

        DashboardFragment fragment = new DashboardFragment(R.layout.fragment_dashboard);
        fragment.setArguments(args);
        return fragment;
    }
}
