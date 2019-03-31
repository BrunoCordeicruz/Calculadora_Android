package br.edu.unifacear.calculadoraandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double valor1 = 0.0;
    int operacao = 0;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    public void limpar(View view) {
        if (view.getId() == R.id.btnLimpar) {
            textView.setText("");
        }
    }

    public void clique(View view) {
        if (view.getId() == R.id.btn9) {
            String valor = textView.getText().toString();
            textView.setText(valor + "9");
        }
        if (view.getId() == R.id.btn8) {
            String valor = textView.getText().toString();
            textView.setText(valor + "8");
        }
        if (view.getId() == R.id.btn7) {
            String valor = textView.getText().toString();
            textView.setText(valor + "7");
        }
        if (view.getId() == R.id.btn6) {
            String valor = textView.getText().toString();
            textView.setText(valor + "6");
        }
        if (view.getId() == R.id.btn5) {
            String valor = textView.getText().toString();
            textView.setText(valor + "5");
        }
        if (view.getId() == R.id.btn4) {
            String valor = textView.getText().toString();
            textView.setText(valor + "4");
        }
        if (view.getId() == R.id.btn3) {
            String valor = textView.getText().toString();
            textView.setText(valor + "3");
        }
        if (view.getId() == R.id.btn2) {
            String valor = textView.getText().toString();
            textView.setText(valor + "2");
        }
        if (view.getId() == R.id.btn1) {
            String valor = textView.getText().toString();
            textView.setText(valor + "1");
        }
        if (view.getId() == R.id.btn0) {
            String valor = textView.getText().toString();
            textView.setText(valor + "0");
        }

        if (view.getId() == R.id.btnMais) {
            operacao = 1;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnMenos) {
            operacao = 2;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnVezes) {
            operacao = 3;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnDividir) {
            operacao = 4;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnPotencia) {
            operacao = 5;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnPorcentagem) {
            operacao = 6;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }
        if (view.getId() == R.id.btnRaiz) {
            operacao = 7;
            valor1 = Double.valueOf(textView.getText().toString());
            textView.setText("");
        }

        if (view.getId() == R.id.btnIgual) {
            Double valor2 = Double.valueOf(textView.getText().toString());
            if (operacao == 1) {
                Double resultado = valor1 + valor2;
                textView.setText(resultado.toString());
            }
            if (operacao == 2) {
                Double resultado = valor1 - valor2;
                textView.setText(resultado.toString());
            }
            if (operacao == 3) {
                Double resultado = valor1 * valor2;
                textView.setText(resultado.toString());
            }
            if (operacao == 4) {
                Double resultado = valor1 / valor2;
                textView.setText(resultado.toString());
            }
            if (operacao == 5) {
                Double resultado = Math.pow(valor1, valor2);
                textView.setText(resultado.toString());
            }
            if (operacao == 6) {
                Double resultado = (valor1 * valor2) / 100;
                textView.setText(resultado.toString());
            }
            if (operacao == 7) {
                Double resultado = Math.sqrt(valor1);
                textView.setText(resultado.toString());
            }
        }
    }
}
