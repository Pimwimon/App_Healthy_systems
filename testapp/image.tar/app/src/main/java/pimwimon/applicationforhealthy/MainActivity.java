package pimwimon.applicationforhealthy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.LocalActivityManager;
import android.widget.TabHost;

public class MainActivity extends AppCompatActivity {

    LocalActivityManager mLocalActivityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLocalActivityManager = new LocalActivityManager(this,false);
        mLocalActivityManager.dispatchCreate(savedInstanceState);


        TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
        tabHost.setup(mLocalActivityManager);

//
//         Error อยู่
//  tabHost.getTabWidget().getChildAt(0).setBackgroundResource(R.drawable.profile);
//        tabHost.getTabWidget().getChildAt(1).setBackgroundResource(R.drawable.sfood);
//        tabHost.getTabWidget().getChildAt(2).setBackgroundResource(R.drawable.exericeh);
//        tabHost.getTabWidget().getChildAt(3).setBackgroundResource(R.drawable.pie);


        TabHost.TabSpec tabSpec = tabHost.newTabSpec("tab1")
                .setIndicator("Home")

                .setContent(new Intent(this, Tab1.class));

        TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("tab2")
                .setIndicator("Food")
                .setContent(new Intent(this, Tab2.class));

        TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("tab3")
                .setIndicator("Exercise")
                .setContent(new Intent(this, Tab3.class));
        TabHost.TabSpec tabSpec4 = tabHost.newTabSpec("tab4")
                .setIndicator("Summarie")
                .setContent(new Intent(this, Tab4.class));

        tabHost.addTab(tabSpec);
        tabHost.addTab(tabSpec2);
        tabHost.addTab(tabSpec3);
        tabHost.addTab(tabSpec4);
    }
    @Override
    protected void onPause(){
        super.onPause();
        mLocalActivityManager.dispatchPause(!isFinishing());
    }
    @Override
    protected void onResume(){
        super.onResume();
        mLocalActivityManager.dispatchResume();
    }

}
