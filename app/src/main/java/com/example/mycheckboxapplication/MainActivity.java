package com.example.mycheckboxapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onClicked(View view)
    {
        TextView textView=(TextView) findViewById(R.id.mytext);
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId())
        {
            case R.id.tea:
                if(checked)
                    textView.setText("Tea Selected");
                break;

            case R.id.cofee:
                if(checked)
                    textView.setText("Cofee Selected");

        }

    }

}
