package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        EditText inputUsuario = (EditText) findViewById(R.id.inputUsuario);
        EditText inputClave = (EditText) findViewById(R.id.inputClave);
        Button iniciarSesion = (Button) findViewById(R.id.boton);


        String user = "Pablito";
        String user2= "TrickHoope";
        String user3= "Pacita";
        String pass = "123456789";
        iniciarSesion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String usuarioIngresado = inputUsuario.getText().toString().trim();
                String claveIngresada = inputClave.getText().toString().trim();

                if(usuarioIngresado.isEmpty() || claveIngresada.isEmpty()){
                    Toast.makeText(Login.this,"Por favor, ingresar sus credenciales",Toast.LENGTH_LONG);
                }else{
                    if(usuarioIngresado.equalsIgnoreCase(user)|| usuarioIngresado.equalsIgnoreCase(user2) || usuarioIngresado.equalsIgnoreCase(user3)){
                        if (claveIngresada.equalsIgnoreCase(pass)){
                            Toast.makeText(Login.this,"Clave incorrecta",Toast.LENGTH_LONG);
                        }else{
                            Toast.makeText(Login.this,"Bienvenido!",Toast.LENGTH_LONG);
                            Intent intent = new Intent(Login.this, MainActivity.class);
                            startActivity(intent);
                        }
                    }else{
                        Toast.makeText(Login.this,"usuario incorrecto",Toast.LENGTH_LONG);
                    }
                }

                inputUsuario.setText("");
                inputClave.setText("");

            }
        });
    }


}