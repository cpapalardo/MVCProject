package com.example.carla.mvcproject.Views;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.carla.mvcproject.Models.Pessoa;
import com.example.carla.mvcproject.R;

public class TestView extends ActionBarActivity
{

    private Button buttonOk;
    private EditText editTextName;
    private EditText editTextLastName;
    private EditText editTextAge;
    private MainActivity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_view);
        buttonOk = (Button) findViewById(R.id.buttonOk);
        editTextAge = (EditText) findViewById(R.id.editTextAge);
        editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        editTextName = (EditText) findViewById(R.id.editTextName);
    }

    View.OnClickListener buttonOk_Click = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            Pessoa pessoa = new Pessoa(editTextName.getText().toString(), editTextLastName.getText().toString(), Integer.parseInt(editTextAge.getText().toString()));
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            intent.putExtra(pessoa.getNome(), true);
        }
    };


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_test_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
