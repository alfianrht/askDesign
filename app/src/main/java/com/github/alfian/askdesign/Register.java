package com.github.alfian.askdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by aufa18 on 27/12/17.
 */

public class Register extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_register)
    public void onBtnReisterClicked() {
        Intent in = new Intent(Register.this, Login.class);
        startActivity(in);
        finish();
    }
}
