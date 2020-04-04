package com.example.pokedex.fragments.base;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;
import timber.log.Timber;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public abstract class BaseFragment extends Fragment implements BaseView {

    protected BasePresenter mPresenter;
    private Unbinder mUnbinder;

    public BaseFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = provideConcretePresenter();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        ButterKnife.bind(this, view);
        initViews();

        if (mPresenter != null) {
            mPresenter.onCreate();
        } else {
            Timber.d("Presenter is null");
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (mPresenter != null) {
            mPresenter.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (mPresenter != null) {
            mPresenter.onPause();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mUnbinder != null) {
            mUnbinder.unbind();
        }
    }

    protected abstract void initViews();

    protected abstract BasePresenter provideConcretePresenter();
}
