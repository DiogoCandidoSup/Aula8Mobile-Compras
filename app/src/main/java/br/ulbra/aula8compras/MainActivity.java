package br.ulbra.aula8compras;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity
{
    CheckBox cbArroz, cbLeite, cbCarne, cbFeijao, cbCoca;

    Button btTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbArroz = findViewById(R.id.cbArroz);
        cbLeite = findViewById(R.id.cbLeite);
        cbCarne = findViewById(R.id.cbCarne);
        cbFeijao = findViewById(R.id.cbFeijao);
        cbCoca = findViewById(R.id.cbCoca);

        btTotal = findViewById(R.id.btTotal);

        btTotal.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                double total = 0;

                if (cbArroz.isChecked()) { total += 2.70; }
                if (cbLeite.isChecked()) { total += 5.00; }
                if (cbCarne.isChecked()) { total += 10.00; }
                if (cbFeijao.isChecked()) { total += 2.30; }
                if (cbCoca.isChecked()) { total += 2.00; }

                AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
                dialogo.setTitle("Resultado");
                dialogo.setMessage("Valor total da compra: R$" + String.valueOf(total));
                dialogo.setNeutralButton("Fechar", null);
                dialogo.show();
            }
        });

    }
}