package com.github.alfian.askdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by aufa18 on 28/12/17.
 */

public class ActivityDetail extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_order)
    public void doneClicked() {
        startActivity(new Intent(this, Invoice.class));
    }
}
