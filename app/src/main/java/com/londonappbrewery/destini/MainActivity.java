package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button topButton;
    private Button botButton;
    private int mStory = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);//1.0<->1.1
        topButton = (Button)findViewById(R.id.buttonTop);//2.0<->2.1
        botButton = (Button)findViewById(R.id.buttonBottom);//3.0<-3.1




        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini","Top button pressed!!!");
                Toast.makeText(getApplicationContext(),"Top button pressed!",Toast.LENGTH_SHORT).show();
                if (mStory == 1) {//esto lo que dice es que si mStory es = 1 se ejecute esto, solamente si es mStory es = 1, si no esto no se ejecutara
                    mStoryTextView.setText(R.string.T3_Story);// esto hace que al dar click cambie el texto por a historia 3
                    topButton.setText(R.string.T3_Ans1);// esto hara que el boton de arriba muetre la respuesta T3_Ans1
                    botButton.setText(R.string.T3_Ans2);// esto hara que el boton de arriba muetre la respuesta T3_Ans2
                    mStory = 3;// aqui le damos a mStory un nuevo valor, mStory = 2, lo cual nos ayudara a rastrear por que parte del juego andamos y nos ayudara a implantar una condicion
                } else if (mStory == 3) {
                    mStoryTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);//esto hara que los botones desaparezcan
                    botButton.setVisibility(View.GONE);
                }else if (mStory == 2){
                    mStoryTextView.setText(R.string.T3_Story);
                    topButton.setText(R.string.T3_Ans1);
                    mStory = 4;
                }else if (mStory == 4){
                    mStoryTextView.setText(R.string.T6_End);
                    topButton.setVisibility(View.GONE);//esto hara que los botones desaparezcan
                    botButton.setVisibility(View.GONE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        botButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Destini","Bot button pressed!!!");
                Toast.makeText(getApplicationContext(),"Bot button pressed!",Toast.LENGTH_SHORT).show();
                if (mStory == 1) {
                    mStoryTextView.setText(R.string.T2_Story);
                    topButton.setText(R.string.T2_Ans1);
                    botButton.setText(R.string.T2_Ans2);
                    mStory = 2;
                } else if (mStory == 2){
                    mStoryTextView.setText(R.string.T4_End);
                    topButton.setVisibility(View.GONE);//esto hara que los botones desaparezcan
                    botButton.setVisibility(View.GONE);
                } else if (mStory == 3) {
                    mStoryTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);//esto hara que los botones desaparezcan
                    botButton.setVisibility(View.GONE);
                }else if(mStory == 4){
                    mStoryTextView.setText(R.string.T5_End);
                    topButton.setVisibility(View.GONE);//esto hara que los botones desaparezcan
                    botButton.setVisibility(View.GONE);
                }
            }
        });

    }
}
