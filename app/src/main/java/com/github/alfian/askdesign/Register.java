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

public class Register extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button tmbl = (Button) findViewById(R.id.btn_register);
        tmbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Register.this, Login.class);
                startActivity(in);
            }
        });
    }
}
