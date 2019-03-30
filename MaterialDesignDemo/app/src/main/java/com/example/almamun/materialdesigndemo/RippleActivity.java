package com.example.almamun.materialdesigndemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RippleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ripple);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Ripple Animations");


    }
    public void dummyClick(View view) {
        // Needed to enable Ripple effect on Views.
        // Without Click event, the Ripple effect is not visible on Views.
        // Remove onClick attribute on Views and see the difference. Try it yourself.
    }
    @Override
    public boolean onSupportNavigateUp() {
        finishAfterTransition();
        return true;
    }
}
