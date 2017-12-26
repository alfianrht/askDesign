package com.github.alfian.askdesign;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

/**
 * Created by aufa18 on 27/12/17.
 */

public class Login extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button tmbl = (Button) findViewById(R.id.btn_login);
        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Login.this, MainActivity.class);
                startActivity(in);
            }
        });
    }
}
