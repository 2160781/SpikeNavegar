package com.example.spikenavegar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    boolean estadoBoton;
    Button boton;
    TextView cajadetexto;
    ImageView ver_imagen;

    private DadosApp dadosApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dadosApp = new DadosApp();

        /* informação da receita */
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        estadoBoton=true;
        boton=findViewById(R.id.button);
        cajadetexto= findViewById(R.id.textView);
        cajadetexto.setText(dadosApp.getTextoPassoReceita());
        ver_imagen=findViewById(R.id.imageView);
    }

    //Metodos
    @Override
    public boolean dispatchKeyEvent( KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_RIGHT:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                    ver_imagen.setImageResource(R.drawable.image);

                    dadosApp.avancar();
                    cajadetexto.setText(dadosApp.getTextoPassoReceita());

                    estadoBoton= false;

                }
                return true;
            case KeyEvent.KEYCODE_DPAD_DOWN_LEFT:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                    dadosApp.retroceder();
                    cajadetexto.setText(dadosApp.getTextoPassoReceita());


                    estadoBoton= false;

                }

                return true;
            case KeyEvent.KEYCODE_DPAD_UP:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                }
                return true;
            case KeyEvent.KEYCODE_DPAD_DOWN:
                if (action == KeyEvent.ACTION_DOWN) {
                    //TODO

                }
                return true;
            case KeyEvent.KEYCODE_ENTER:
                if (action == KeyEvent.ACTION_DOWN) {
                    estadoBoton= false;

                }
            default:
                return super.dispatchKeyEvent(event);
        }
    }




/*
public void pulsarboton(){
if (estadoBoton==true){


boton.setText("Hola");
cajadetexto.setText("Hola");
estadoBoton= false;



}else{
    boton.setText("Adios");
cajadetexto.setText("Adios");
estadoBoton= false;
}
*/

//}

}