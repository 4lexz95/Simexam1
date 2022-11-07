package alex.example.simexam1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtcigcant;
    private TextView txtdinero;

    private Button btnfumar;
    private int cigarros;
    private int dinero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarvistas();
        dinero =0;
        cigarros = 20;
        txtcigcant.setText(String.valueOf(cigarros));
        btnfumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cigarros--;
             txtcigcant.setText(String.valueOf(cigarros));
             if (cigarros == 0) {
                 dinero += 5;
                 txtdinero.setText(String.valueOf(dinero));
                 cigarros = 20;
             }
            }
        });


    }

    private void inicializarvistas() {
        txtcigcant = this.findViewById(R.id.txtcantidadcig);
        txtdinero = this.findViewById(R.id.txtdineroahorrado);
        btnfumar = this.findViewById(R.id.btnfumar);


    }
}