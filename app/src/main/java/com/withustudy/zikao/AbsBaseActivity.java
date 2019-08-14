package com.withustudy.zikao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.withustudy.zikao.config.KouDaiSP;

public abstract class AbsBaseActivity extends FragmentActivity {
    protected KouDaiSP mSP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.mSP = KouDaiSP.getInstance(this);
        initAllData();
        setContentView();
        initView();
        initData();
        bindData();
        initListener();
    }

    protected void initListener() {

    }

    protected void bindData() {

    }

    protected void initData() {

    }

    protected void initAllData() {

    }

    protected void initView() {
    }



    protected abstract void setContentView();

    public final void startNewActivity(Class<? extends Activity> paramClass, boolean paramBoolean, Bundle paramBundle)
    {
        Intent localIntent = new Intent(this, paramClass);
        if (paramBundle != null)
            localIntent.putExtras(paramBundle);
        startActivity(localIntent);
        if (getParent() == null)
            overridePendingTransition(R.id.activity_right_in, 2130968579);
        while (true)
        {
            if (paramBoolean)
                super.finish();
            return;
            getParent().overridePendingTransition(2130968581, 2130968579);
        }
    }
}
