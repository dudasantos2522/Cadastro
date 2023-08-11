package br.edu.scl.ifsp.ads.cadastro;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import br.edu.scl.ifsp.ads.cadastro.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.limparBt.setOnClickListener(view -> {
            activityMainBinding.nomeCompletoEt.setText("");
            activityMainBinding.telefoneEt.setText("");
            activityMainBinding.emailEt.setText("");
            activityMainBinding.ingressarCb.setChecked(false);
            activityMainBinding.masculinoRb.setChecked(true);
            activityMainBinding.cidadeEt.setText("");
            activityMainBinding.ufSp.setSelection(0);
        });

        activityMainBinding.salvarBt.setOnClickListener(view -> {
            String nomeCompleto = String.valueOf(activityMainBinding.nomeCompletoEt.getText());
            String telefone = String.valueOf(activityMainBinding.telefoneEt.getText());
            String email = String.valueOf(activityMainBinding.emailEt.getText());
            Boolean ingressarNaListaDeEmails = activityMainBinding.ingressarCb.isChecked();
            String genero = activityMainBinding.masculinoRb.isChecked() ? "Masculino" : "Feminino";
            String cidade = String.valueOf(activityMainBinding.cidadeEt.getText());
            String estado = String.valueOf(activityMainBinding.ufSp.getSelectedItem());

            Formulario formulario = new Formulario(nomeCompleto, telefone, email, ingressarNaListaDeEmails, genero, cidade, estado);
            Toast.makeText(MainActivity.this, formulario.toString(), Toast.LENGTH_LONG).show();
        });
    }
}