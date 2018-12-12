package com.programacion.uelbosque.trikiproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.programacion.uelbosque.trikiproject.trikilogic.Player;
import com.programacion.uelbosque.trikiproject.trikilogic.SingleTrikiGame;

import java.util.ArrayList;

public class SingleTrikiGameActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    private ArrayList<Button> buttons;
    private LinearLayout layoutNew,layoutStatics;
    private TextView tvTurn;
    private SingleTrikiGame game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_triki_game);

        buttons = new ArrayList<Button>();
        this.b1 = (Button)findViewById(R.id.b1s);
        this.b2 = (Button)findViewById(R.id.b2s);
        this.b3 = (Button)findViewById(R.id.b3s);
        this.b4 = (Button)findViewById(R.id.b4s);
        this.b5 = (Button)findViewById(R.id.b5s);
        this.b6 = (Button)findViewById(R.id.b6s);
        this.b7 = (Button)findViewById(R.id.b7s);
        this.b8 = (Button)findViewById(R.id.b8s);
        this.b9 = (Button)findViewById(R.id.b9s);
        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);

        this.layoutNew = (LinearLayout)findViewById(R.id.layoutNewS);
        this.layoutStatics = (LinearLayout)findViewById(R.id.layoutStaticsS);

        this.tvTurn = (TextView)findViewById(R.id.tvTurnS);

        this.game = new SingleTrikiGame(new Player("YOU",1));
        upDateTurnTextView();
    }

    public void upDateTurnTextView()
    {
        tvTurn.setText("Turn: "+game.getTurn().getTurn());
    }

    public void newGame(View v)
    {
        if(this.game.isGameOn())
        {
            this.game.addStatistics(0);
        }
        boolean success = this.game.newGame();
        if(success)
        {
            upDateTurnTextView();
            cleanTableButtons();
            msg("NEW GAME\n\nLET'S GO");
        }
    }

    public void fabMenuS(View v)
    {

        if(this.layoutNew.getVisibility()==View.INVISIBLE && this.layoutStatics.getVisibility()==View.INVISIBLE)
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

    public void msg(String msg)
    {
        Toast t = Toast.makeText(this,msg,Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER,0,0);
        t.show();
    }

    public void b1s(View v)
    {
        if(b1.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b1.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(1);
        verifyWinner(win);


        upDateTurnTextView();


        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();


    }

    public void b2s(View v)
    {
        if(b2.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b2.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(2);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);


        upDateTurnTextView();

    }

    public void b3s(View v)
    {
        if(b3.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b3.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(3);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b4s(View v)
    {
        if(b4.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b4.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(4);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b5s(View v)
    {
        if(b5.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b5.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(5);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b6s(View v)
    {
        if(b6.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b6.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(6);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b7s(View v)
    {
        if(b7.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b7.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(7);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b8s(View v)
    {
        if(b8.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b8.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(8);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void b9s(View v)
    {
        if(b9.getText().toString().equalsIgnoreCase("" ) && game.isGameOn())
        {
            b9.setText(chooseSimbol(game.getTurn().getTurn()));
        }
        int win = game.markSpaceAndVerify(9);
        verifyWinner(win);


        upDateTurnTextView();

        win = game.autoMark();
        int space = game.getTable().getSpace();
        autoMarkButton(space);
        this.game.getTurn().change();
        verifyWinner(win);

        upDateTurnTextView();
    }

    public void autoMarkButton(int space)
    {
        buttons.get(space-1).setText(chooseSimbol(game.getTurn().getTurn()));

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

    public void statics(View v)
    {
        msg(game.getStatics());
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
