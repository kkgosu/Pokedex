package com.example.pokedex.activities;

import android.widget.TextView;

import com.example.pokedex.R;
import com.example.pokedex.annotations.Layout;
import com.example.pokedex.annotations.Title;

import butterknife.BindView;

@Layout(R.layout.activity_main)
@Title(R.string.app_name)
public class MainActivity extends BaseActivity {

    @BindView(R.id.text)
    TextView mTextView;

    @Override
    protected void onResume() {
        super.onResume();
        mTextView.setText("Updated");
    }
}
