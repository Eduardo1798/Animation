package com.example.edu.images;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {


    public void  fade (View view){

        ImageView uno = (ImageView)findViewById(R.id.uno);
        ImageView dos = (ImageView)findViewById(R.id.dos);
        ImageView tres = (ImageView)findViewById(R.id.tres);
        ImageView cuatro = (ImageView)findViewById(R.id.cuatro);
        ImageView cinco = (ImageView)findViewById(R.id.cinco);
        ImageView seis = (ImageView)findViewById(R.id.seis);
        ImageView siete = (ImageView)findViewById(R.id.siete);
        Button one = (Button)findViewById(R.id.one);
        Button two = (Button)findViewById(R.id.two);
        Button three = (Button)findViewById(R.id.three);
        Button four = (Button)findViewById(R.id.four);
        Button five = (Button)findViewById(R.id.five);
        Button six = (Button)findViewById(R.id.six);
        Button seven = (Button)findViewById(R.id.seven);


        uno.animate().alpha (0f).setDuration(3000);
        dos.animate().alpha(1f).setDuration(3000);

        one.setEnabled(false);
        one.setVisibility(View.INVISIBLE);

        two.setEnabled(true);
        one.setVisibility(View.VISIBLE);

    }

        public void movetres (View view) {

            ImageView tres = (ImageView) findViewById(R.id.tres);
            ImageView dos = (ImageView) findViewById(R.id.dos);
            Button two = (Button) findViewById(R.id.two);
            Button three = (Button) findViewById(R.id.three);

            dos.animate().translationXBy(-1000f).setDuration(3000);
            tres.setVisibility(View.VISIBLE);
            tres.animate().translationYBy(-3000f).setDuration(3000);

            two.setEnabled(false);
            two.setVisibility(View.INVISIBLE);

            three.setEnabled(true);
            three.setVisibility(View.VISIBLE);
        }

                public void movecuatro (View view) {

                    ImageView cuatro = (ImageView) findViewById(R.id.cuatro);
                    ImageView tres = (ImageView) findViewById(R.id.tres);
                    Button three = (Button) findViewById(R.id.three);
                    Button four = (Button) findViewById(R.id.four);

                    tres.animate().translationXBy(1000f).setDuration(3000);
                    cuatro.setVisibility(View.VISIBLE);
                    cuatro.animate().translationYBy(3000f).setDuration(3000);

                    three.setEnabled(false);
                    three.setVisibility(View.INVISIBLE);

                    four.setEnabled(true);
                    four.setVisibility(View.VISIBLE);
                }

                      public void movecinco (View view) {

                          ImageView cinco = (ImageView) findViewById(R.id.cinco);
                          ImageView cuatro = (ImageView) findViewById(R.id.cuatro);
                          Button four = (Button) findViewById(R.id.four);
                          Button five = (Button) findViewById(R.id.five);

                          cuatro.animate().translationXBy(-1000f).setDuration(3000);
                          cinco.setVisibility(View.VISIBLE);
                          cinco.animate().translationYBy(-3000f).setDuration(3000);

                          four.setEnabled(false);
                          four.setVisibility(View.INVISIBLE);

                          five.setEnabled(true);
                          five.setVisibility(View.VISIBLE);
                      }

                             public void movesix (View view) {

                                 ImageView seis = (ImageView) findViewById(R.id.seis);
                                 ImageView cinco = (ImageView) findViewById(R.id.cinco);
                                 Button five = (Button) findViewById(R.id.five);
                                 Button six = (Button) findViewById(R.id.six);

                                 cinco.animate().translationXBy(1000f).setDuration(3000);
                                 seis.setVisibility(View.VISIBLE);
                                 seis.animate().translationYBy(3000f).setDuration(3000);

                                 five.setEnabled(false);
                                 five.setVisibility(View.INVISIBLE);

                                 six.setEnabled(true);
                                 six.setVisibility(View.VISIBLE);
                             }

                                     public void moveseven (View view) {

                                         ImageView siete = (ImageView) findViewById(R.id.siete);
                                         ImageView seis = (ImageView) findViewById(R.id.seis);
                                         Button six = (Button) findViewById(R.id.six);
                                         Button seven = (Button) findViewById(R.id.seven);

                                         seis.animate().translationXBy(-1000f).setDuration(3000);
                                         siete.setVisibility(View.VISIBLE);
                                         siete.animate().translationYBy(-3000f).setDuration(3000);

                                         six.setEnabled(false);
                                         six.setVisibility(View.INVISIBLE);

                                         seven.setEnabled(true);
                                         seven.setVisibility(View.VISIBLE);
                                     }

                                             public void movesevenregresar (View view) {

                                                 Button one = (Button) findViewById(R.id.one);
                                                 Button seven = (Button) findViewById(R.id.seven);
                                                 ImageView uno = (ImageView) findViewById(R.id.uno);
                                                 ImageView seis = (ImageView) findViewById(R.id.seis);
                                                 ImageView siete = (ImageView) findViewById(R.id.siete);

                                                 siete.setVisibility(view.INVISIBLE);
                                                 siete.setTranslationY(3000);
                                                 seis.setAlpha(0f);
                                                 seis.animate().translationX(0f).setDuration(0);
                                                 uno.setAlpha(1f);

                                                 seven.setEnabled(false);
                                                 seven.setVisibility(view.INVISIBLE);

                                                 one.setEnabled(true);
                                                 one.setVisibility(view.VISIBLE);
                                             }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView siete = (ImageView) findViewById(R.id.siete);
        siete.setTranslationY(-3000);
    }

                                   }












































