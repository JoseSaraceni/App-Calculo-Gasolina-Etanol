package devandroid.saraceni.appgaseta2.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.saraceni.appgaseta2.R;
import devandroid.saraceni.appgaseta2.apoio.UtilGasEta;
import devandroid.saraceni.appgaseta2.model.Combustivel;

public class GasEtaActivity extends AppCompatActivity {

    Combustivel combustivel;
    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;

     EditText edit_gasolina;
     EditText edit_etanol;

     TextView txt_resultado;

     Button btn_calcular;
     Button btn_limpar;
     Button btn_salvar;
     Button btn_finalizar;

     double precoGasolina;
     double precoEtanol;
     String result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        edit_gasolina = findViewById(R.id.edit_gasolina);
        edit_etanol = findViewById(R.id.edit_etanol);

        txt_resultado = findViewById(R.id.txt_resultado);

        btn_calcular = findViewById(R.id.btn_calcular);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_limpar = findViewById(R.id.btn_limpar);
        btn_finalizar = findViewById(R.id.btn_finalizar);


        btn_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


        boolean isDadosOk = true;

        if (TextUtils.isEmpty(edit_gasolina.getText())){
            edit_gasolina.setError("* Obrigatório *");
            edit_gasolina.requestFocus();
        isDadosOk = false;
        }

        if (TextUtils.isEmpty(edit_etanol.getText())){
            edit_etanol.setError("* Obrigatório *");
            edit_etanol.requestFocus();
        isDadosOk = false;
        }

        if (isDadosOk){
            precoGasolina = Double.parseDouble(edit_gasolina.getText().toString());
            precoEtanol = Double.parseDouble(edit_etanol.getText().toString());

            result = UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol);

            txt_resultado.setText(result);

            btn_salvar.setEnabled(true);
        }

        else {
            Toast.makeText(GasEtaActivity.this, "Por favor, Digitar os dados obrigatórios.", Toast.LENGTH_LONG).show();
            btn_salvar.setEnabled(false);
        }

            }
        });



        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                combustivelGasolina = new Combustivel();
                combustivelEtanol = new Combustivel();

                combustivelEtanol.setNomeDoCombustivel("Etanol");
                combustivelEtanol.setPrecoDoCombustivel(precoEtanol);

                combustivelGasolina.setNomeDoCombustivel("Gasolina");
                combustivelGasolina.setPrecoDoCombustivel(precoGasolina);

                combustivelGasolina.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.calcularMelhorOpcao(precoGasolina, precoEtanol));



            }
        });


        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              edit_gasolina.setText("");
              edit_etanol.setText("");

              btn_salvar.setEnabled(false);
            }
        });


        btn_finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GasEtaActivity.this, "Volte Sempre", Toast.LENGTH_LONG).show();
                finish();
            }
        });


        Toast.makeText(GasEtaActivity.this, UtilGasEta.calcularMelhorOpcao(5.12, 3.25),
        Toast.LENGTH_LONG).show();
    }
}


