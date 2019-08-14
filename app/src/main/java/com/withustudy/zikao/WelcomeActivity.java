package com.withustudy.zikao;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class WelcomeActivity extends AbsBaseActivity {

    private ImageView image;
    private ImageView image1;
    @Override
    public void initView() {
        super.initView();
        this.image = ((ImageView) findViewById(R.id.image_welcome));
        this.image1 = ((ImageView) findViewById(R.id.image_welcome1));
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(WelcomeActivity.this,GuideActivity.class));
            }
        });
    }

    @Override
    public void setContentView() {
        setContentView(R.layout.activity_welcome);
    }

}