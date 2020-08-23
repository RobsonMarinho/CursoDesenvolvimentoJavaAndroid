package com.example.componentesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private EditText          campoNome;
    private TextInputEditText campoEmail;
    private TextView          textoResultado;

    private CheckBox checkVerde, checkBranco ,checkVermelho;

    //RadioButton
    private RadioButton sexoMasculino, sexoFeminino;
    private RadioButton opcaoSexo;


    @Override //Método que sempre é chamado para exibir a interface
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoNome       = findViewById(R.id.editNome);
        campoEmail      = findViewById(R.id.editEmail);
        textoResultado  = findViewById(R.id.textResultado);

        //Checkbox
        checkVerde      = findViewById(R.id.checkVerde);
        checkBranco     = findViewById(R.id.checkBranco);
        checkVermelho   = findViewById(R.id.checkVermelho);

        //RadioButton
        sexoFeminino    = findViewById(R.id.radioButtonFeminino);
        sexoMasculino   = findViewById(R.id.radioButtonMasculino);
        opcaoSexo       = findViewById(R.id.radioGroupSexo);

        radiobutton();
    }

    public void radiobutton(){

        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup group, int checkedId) {

                    if (checkedId == R.id.radioButtonMasculino ) {
                        textoResultado.setText("Masculino");
                    } else if (checkedId == R.id.radioButtonFeminino ) {
                        textoResultado.setText("Feminino");
                        }
                    }
                });
        /*
        if( sexoMasculino.isChecked() ){
            textoResultado.setText("Masculino");
        }else if(sexoFeminino.isChecked() ){
            textoResultado.setText("Feminino");
        }
         */
    }

    public void enviar(View view) {

        //radiobutton();
        //checkBox();
        /*
        String nome = campoNome.getText().toString();
        String email = campoEmail.getText().toString();

        textoResultado.setText( "Nome: " + nome + " Email: " + email );
        */
    }

    public void checkBox(){

        String texto = "";

        if (checkVerde.isChecked() ){
            String corSelecionada = checkVerde.getText().toString();
            texto = corSelecionada + " Selecionado! ";
        }
        if (checkBranco.isChecked() ){
            texto = texto +" Branco selecionado! ";
        }
        if (checkVermelho.isChecked() ){
            texto = texto + " Vermelho selecionado! ";
        }

        textoResultado.setText( texto );
    }

    public void limpar(View view){

        campoNome.setText("");
        campoEmail.setText("");

    }

}