package com.programacion.uelbosque.trikiproject;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion.uelbosque.trikiproject.trikilogic.ClasicTrikiGame;
import com.programacion.uelbosque.trikiproject.trikilogic.Player;

import java.util.ArrayList;

public class TrikiVsGameActivity extends AppCompatActivity {

    private LinearLayout layoutNew,layoutStatics;
    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private GridLayout layoutTable;
    private TextView tvPlayers, tvTurn;
    private ClasicTrikiGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triki_vs_game);

        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        b5 = (Button)findViewById(R.id.b5);
        b6 = (Button)findViewById(R.id.b6);
        b7 = (Button)findViewById(R.id.b7);
        b8 = (Button)findViewById(R.id.b8);
        b9 = (Button)findViewById(R.id.b9);
        layoutTable = (GridLayout)findViewById(R.id.layoutTable);
        layoutNew = (LinearLayout)findViewById(R.id.layoutNew);
        layoutStatics = (LinearLayout)findViewById(R.id.layoutStatics);
        tvPlayers = (TextView)findViewById(R.id.tvPlayers);
        tvTurn = (TextView)findViewById(R.id.tvTurn);

        Bundle bundle = getIntent().getExtras();
        String names1 = bundle.getString("name1");
        String names2 = bundle.getString("name2");

        String players = tvPlayers.getText().toString()+"\n1. "+names1+"\n"+"2. "+names2;
        tvPlayers.setText(players);

        game = new ClasicTrikiGame(new Player(names1,1),new Player(names2,2));
        tvTurn.setText(String.valueOf(tvTurn.getText().toString()+game.getTurn().getTurn()));
    }

    public void fabMenu(View v)
    {

        if(layoutNew.getVisibility()==View.INVISIBLE && layoutStatics.getVisibility()==View.INVISIBLE)
        {
            layoutNew.setVisibility(View.VISIBLE);
            layoutStatics.setVisibility(View.VISIBLE);

        }
        else if(layoutNew.getVisibility()==View.VISIBLE && layoutStatics.getVisibility()==View.VISIBLE)
        {
            layoutNew.setVisibility(View.INVISIBLE);
            layoutStatics.setVisibility(View.INVISIBLE);
        }


    }

    public void statics2(View v)
    {
        msg(game.getStatics());
    }

    public void newGame2(View v)
    {
        if(game.isGameOn())
        {
            game.addStatistics(0);
        }
        boolean success = game.newGame();
        if(success)
        {
            upDateTurnTextView();
            cleanTableButtons();
            msg("NEW GAME\n\nLET'S GO");
        }
    }

    public void msg(String msg)
    {
        Toast t = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    public void upDateTurnTextView()
    {
        tvTurn.setText("Turn: "+game.getTurn().getTurn());
    }

    public void b1(View v)
    {
        if(b1.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b1.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(1);
        verifyWinner(win);


        upDateTurnTextView();

    }

    public void b2(View v)
    {
        if(b2.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b2.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(2);
        verifyWinner(win);


        upDateTurnTextView();

    }

    public void b3(View v)
    {
        if(b3.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b3.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(3);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b4(View v)
    {
        if(b4.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b4.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(4);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b5(View v)
    {
        if(b5.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b5.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(5);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b6(View v)
    {
        if(b6.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b6.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(6);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b7(View v)
    {
        if(b7.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b7.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(7);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b8(View v)
    {
        if(b8.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b8.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(8);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void b9(View v)
    {
        if(b9.getText().toString().equalsIgnoreCase("") && game.isGameOn())
        {
            b9.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(9);
        verifyWinner(win);


        upDateTurnTextView();
    }

    public void verifyWinner(int win)
    {
        if(win != 0)
        {
            String name = "";
            if(game.getPlayer1().getNumber()==win)
            {
                name = game.getPlayer1().getName();
            }
            else if(game.getPlayer2().getNumber()==win)
            {
                name = game.getPlayer2().getName();
            }
            msg( "YOU ARE A WINNER "+name+"!\n\nLet's play again!");
        }
        else if(win == 0 && game.getMarks() == 9)
        {
            msg("NOBODY WINS\n\nLet's do it again!");
        }
    }

    public String chooseSimbol(int turn)
    {
        String simbol = "N";
        if(turn == 1)
        {
            simbol="X";
        }
        else if(turn == 2)
        {
            simbol="O";
        }

        return simbol;
    }

    public void cleanTableButtons()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

}
