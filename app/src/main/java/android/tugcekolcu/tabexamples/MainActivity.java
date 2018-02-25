package android.tugcekolcu.tabexamples;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = (ViewPager) findViewById(R.id.pager);
        FragmentManager fm  = getSupportFragmentManager();
        viewPager.setAdapter(new MyAdapter(fm));
    }

    class MyAdapter extends FragmentPagerAdapter{


        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) { //parmagin sag sol yapinca hangi ekranin secilecegini soyler
            Fragment fragment=null;

            Log.d("TUGCEEE", "get Item method");

            if(i==0){

                 fragment = new FragmentA();
            }
            else if(i==1){
                fragment = new FragmentB();

            }
            else if(i==2){
                fragment = new FragmentC();

            }
            return fragment;
        }

        @Override
        public int getCount() {
            Log.d("TUGCEEE", "get count method");
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int i) {
            String str = new String();
            if(i==0){

               str ="Birinci tab";
            }
            else if(i==1){
                str ="ikinci tab";

            }
            else if(i==2){
                str ="ucuncu tab";

            }
            return str;
        }
    }
}
