package rmr.java.mouredev22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Esta pequeña app tiene como objetivo crear el famoso test fizzbuzz utilizado en muchas entrevistas
 * de trabajo usando Android y Java
 *
 * @author Rafa M.
 * @version 1.0
 * @since 1.0
 */
public class MainActivity extends AppCompatActivity {
    private TextView tvText;
    private Button btStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvText = findViewById(R.id.tvText);
        this.btStart = findViewById(R.id.btStart);
        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createFizzBuzz(tvText);
            }
        });
    }

    /**
     * Este método crea la sucesión de fizzbuzz esperada por las especificaciones de la prueba
     *
     * @param tvText ==> TextView en el que plasmar el resultado
     * @author Rafa M.
     * @version 1.0
     * @since 1.0
     */
    private void createFizzBuzz(TextView tvText) {
        String textForFizzBuzz = "";
        for (int i = 0; i <= 100; i++) {

            textForFizzBuzz += isProductFrom(i) + "\n";

        }
        tvText.setText(textForFizzBuzz);
    }

    /**
     * Este método comprueba si tenemos un múltiplo de 3, de 5 o de ambos, otorgando a la cadena
     * el valor correspondiente, siendo fizz, buzz y fizzbuzz respectivamente
     *
     * @param number ==> número que estamos comprobando si corresponde a una condición u otra
     * @author Rafa M.
     * @version 1.0
     * @since 1.0
     */
    private String isProductFrom(int number) {
        String textForFizzBuzz = "";
        if ((number % 3 == 0) && (number % 5 == 0)) {
            textForFizzBuzz = getString(R.string.str_fizzbuzz);
        } else if (number % 3 == 0) {
            textForFizzBuzz = getString(R.string.str_fizz);
        } else if (number % 5 == 0) {
            textForFizzBuzz = getString(R.string.str_buzz);
        } else {
            textForFizzBuzz = String.valueOf(number);
        }
        return textForFizzBuzz;
    }
}