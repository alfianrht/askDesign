package com.github.alfian.askdesign.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.github.alfian.askdesign.ActivityDetail;
import com.github.alfian.askdesign.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by aufa18 on 27/12/17.
 */

public class FragmentHome extends Fragment {

    //@BindView(R.id.item_cardView) LinearLayout item;

    public FragmentHome() {}

    @Nullable @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ButterKnife.bind(this, view);

    }

    @OnClick(R.id.item_cardView)
    public void onCardClicked() {
        startActivity(new Intent(getContext(), ActivityDetail.class));
    }
}
