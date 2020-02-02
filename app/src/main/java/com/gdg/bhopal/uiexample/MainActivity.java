package com.gdg.bhopal.uiexample;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText no1Edt,no2Edt;
    TextView resultTV;
    Button addBtn;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //set xml files to load
        Toolbar toolbar = findViewById(R.id.toolbar); //that green toolbar
        setSupportActionBar(toolbar);

        no1Edt = (EditText)findViewById(R.id.no1Edt);
        no2Edt = (EditText)findViewById(R.id.no2Edt);
        resultTV=(TextView)findViewById(R.id.resultTV);
        addBtn= (Button)findViewById(R.id.addBtn);

       addBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
                try{
               int no1 = Integer.parseInt(no1Edt.getText().toString());

               int no2 = Integer.parseInt(no2Edt.getText().toString());
               int no3 = no1 + no2;
               // resultTV.setText(Integer.toString(no3));
               //  resultTV.setText(no3+"");
               resultTV.setText(String.valueOf(no3));
                //    resultTV.setText(no3);
           }
                catch (Exception ee)
                {
                   Log.e("Mainactivity",ee.toString());
                   Toast.makeText(getApplicationContext(),"Error Occured"+ee.toString(),Toast.LENGTH_LONG).show();


                }

           }
       });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
