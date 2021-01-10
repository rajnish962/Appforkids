package com.example.appforkids;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements TextToSpeech.OnInitListener {
    GridView gridView;
    EditText inputText;
    TextToSpeech textToSpeech;
    String name[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.g1);
        Myadapt myadapt = new Myadapt(getApplicationContext(), name);
        gridView.setAdapter(myadapt);
        textToSpeech=new TextToSpeech(this,this);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    String text;
                    text="A for apple";
                    Toast.makeText(MainActivity.this, "alphabet", Toast.LENGTH_SHORT).show();
                    textToSpeech.speak(text,TextToSpeech.QUEUE_FLUSH,null);

                }
            }
        });
    }

          @Override
          public void onInit(int status) {



          }
      }