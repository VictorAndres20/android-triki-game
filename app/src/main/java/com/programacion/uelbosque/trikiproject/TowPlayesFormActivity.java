package com.programacion.uelbosque.trikiproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class TowPlayesFormActivity extends AppCompatActivity {

    private EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tow_playes_form);

        et1 = (EditText)findViewById(R.id.etNamePlayer1);
        et2 = (EditText)findViewById(R.id.etNamePlayer2);
    }

    public void goVsGame(View v)
    {
        String player1 = et1.getText().toString();
        String player2 = et2.getText().toString();

        if(player1.equalsIgnoreCase("") || player2.equalsIgnoreCase(""))
        {
            Toast.makeText(this,"ENTER ALL NAMES",Toast.LENGTH_SHORT).show();
        }
        else if(player1!="" && player2!="")
        {
            Intent i = new Intent(this,TrikiVsGameActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("name1",player1);
            bundle.putString("name2",player2);
            i.putExtras(bundle);
            startActivity(i);

        }



    }
}
