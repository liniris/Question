package com.iris.question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView question;
    public TextView tvQue;
    private String[] thrQue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question = (ListView) findViewById(R.id.list);
        thrQue = new String[]{"year?","last year?","next year?"};
        ArrayAdapter ada = new ArrayAdapter(this, android.R.layout.simple_list_item_1, thrQue);
        question.setAdapter(ada);
        question.setOnItemClickListener(this);
        tvQue = (TextView) findViewById(R.id.tvquest);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        if (i == 0 ) {
            //tvQue.setText(thrQue[0]);
            startActivity(new Intent(this,AnsActivity.class));
        }else if (i == 1){
           // tvQue.setText(thrQue[1]);
            startActivity(new Intent(this,AnsActivity.class));
        }else if (i == 2){
           // tvQue.setText(thrQue[2]);
            startActivity(new Intent(this,AnsActivity.class));
        }
    }
}
