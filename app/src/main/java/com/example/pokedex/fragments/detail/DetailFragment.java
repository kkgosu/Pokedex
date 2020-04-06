package com.example.pokedex.fragments.detail;

import android.os.Bundle;

import com.example.pokedex.R;
import com.example.pokedex.fragments.base.BaseFragment;
import com.example.pokedex.fragments.base.BasePresenter;

import javax.inject.Inject;

import butterknife.OnClick;

/**
 * Created by Konstantin Koval on 04.04.2020
 */
public class DetailFragment extends BaseFragment implements DetailView {

    @Inject
    DetailPresenter mPresenter;

    @OnClick(R.id.detail_textview)
    void onDetailTextViewClicked(){
        mPresenter.transistToDashboard();
    }

    public DetailFragment(int contentLayoutId) {
        super(contentLayoutId);
    }

    @Override
    protected void initViews() {

    }

    @Override
    protected BasePresenter provideConcretePresenter() {
        return mPresenter;
    }

    public static DetailFragment newInstance() {

        Bundle args = new Bundle();

        DetailFragment fragment = new DetailFragment(R.layout.fragment_detail);
        fragment.setArguments(args);
        return fragment;
    }
}
