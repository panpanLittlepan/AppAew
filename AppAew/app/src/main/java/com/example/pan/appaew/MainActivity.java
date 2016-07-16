package com.example.pan.appaew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Months> mMonthsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Months m1 = new Months();
        m1.setMonth("มกราคม");
        Months m2 = new Months();
        m2.setMonth("กุมภาพันธ์");
        Months m3 = new Months();
        m3.setMonth("พฤษภาคม");
        Months m4 = new Months();
        m4.setMonth("มิถุนายน");
        Months m5 = new Months();
        m5.setMonth("พฤศจิกายน");
        Months m6 = new Months();
        m6.setMonth("ธันวาคม");

        mMonthsList.add(m1);
        mMonthsList.add(m2);
        mMonthsList.add(m3);
        mMonthsList.add(m4);
        mMonthsList.add(m5);
        mMonthsList.add(m6);

        MonthsAdapter mAdapter = new MonthsAdapter(MainActivity.this,R.layout.list_month,mMonthsList);
        ListView mListView = (ListView)findViewById(R.id.list_month);
        mListView.setAdapter(mAdapter);
    }
}
