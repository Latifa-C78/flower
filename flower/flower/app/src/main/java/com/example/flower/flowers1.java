package com.example.flower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class flowers1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flowers1);


        ArrayList<flower1class> fl=new ArrayList<>();
        flower1class f1 = new flower1class("زهرة الزنبق","زهرة الزنبق هي من الزهور الأكثر شعبيه في العالم والزنبق من النباتات المزهرة والمعمرة مما يعني أن الزنبق يمكنه البقاء على قيد الحياة أكثر من عامين في البرية.","هناك مئات الأصناف من زهرة الزنبق حيث انه يمكن العثور عليه في الغالب في (أوروبا وآسيا وأمريكا الشمالية)","ينمو معظم أنواعه في المناطق المعتدلة والاستوائية ، وعادة ما يسكن الغابات والمراعي والمستنقعات والجبال .","وقت زراعتها في نهاية فصل الشتاء و بداية فصل الربيع .","تزرع على عمق 15 سنتيمترًا و أكثر من سطح التربة",R.drawable.f1);
        flower1class f2 = new flower1class("","","","","","",R.drawable.f1);
        flower1class f3 = new flower1class("","","","","","",R.drawable.f1);


    }

}