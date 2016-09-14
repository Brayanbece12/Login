package com.example.brayan.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button boton = (Button) findViewById(R.id.ingresar);
        boton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {

                String usuario = ((EditText) findViewById(R.id.txtusuario)).getText().toString();
                String contraseña = ((EditText) findViewById(R.id.txtcontraseña)).getText().toString();

                if (usuario.equals("brayan") && contraseña.equals("brayan"))
                {
                     Intent nuevoform = new Intent(Login.this,Secundario.class);

                    startActivity(nuevoform);

                }
                else {

                    Toast.makeText(getApplicationContext(), "El Usuario Incorrecto", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
}
