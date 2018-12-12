package com.programacion.uelbosque.trikiproject;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.programacion.uelbosque.trikiproject.trikilogic.SingleTrikiGame;

public class MainActivity extends AppCompatActivity {

    private BluetoothAdapter BA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BA = BluetoothAdapter.getDefaultAdapter();
    }

    public void singleGame(View v)
    {
        Intent i = new Intent(this, SingleTrikiGameActivity.class);
        startActivity(i);

    }

    public void vsGame(View v)
    {
        Intent i = new Intent(this,TowPlayesFormActivity.class);
        startActivity(i);

    }

    public void bluetoothGame(View v)
    {
        Intent i = new Intent(this,BluetoothTrikiActivity.class);
        startActivity(i);

        if (BA == null) {
            Toast.makeText(this, "Bluetooth is not available on your device!", Toast.LENGTH_SHORT).show();
            finish();
        }
        if (!BA.isEnabled()) {
            Intent turnOn = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(turnOn, 0);
            Toast.makeText(getApplicationContext(), "Turned on",Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "Already on", Toast.LENGTH_LONG).show();
        }

        Intent getVisible = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        startActivityForResult(getVisible, 0);



    }
}
