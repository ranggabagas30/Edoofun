package com.example.edoofun;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private FirebaseAuth auth;

    private EditText emailUsername, password;
    private TextView forgetpass;
    private AppCompatButton btnregister1,btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        auth = FirebaseAuth.getInstance();

        emailUsername = findViewById(R.id.user_txt);
        password = findViewById(R.id.password_txt);
        forgetpass = findViewById(R.id.ForgetPass_txt);
        forgetpass.setOnClickListener(v -> {
            Intent i = new Intent(MainActivity.this, ForgotPassActivity.class);
            startActivity(i);
        });

        btnregister1 = findViewById(R.id.btnregister);
        btnregister1.setOnClickListener(v -> {
            Intent a = new Intent(MainActivity.this, Register.class);
            startActivity(a);
        });

        btnlogin = findViewById(R.id.btn_login1);
        btnlogin.setOnClickListener(v -> {
            String email = emailUsername.getText().toString();
            String pass = password.getText().toString();
            if (isLoginValid(email, pass))
                doLogin(email, pass);
            else
                Toast.makeText(MainActivity.this, "Pastikan data login terisi lengkap", Toast.LENGTH_LONG).show();
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (auth.getCurrentUser() != null) { // masih ada akun user yang login
            navigateToHome();
        }
    }

    private void navigateToHome() {
        Intent c = new Intent(MainActivity.this, HalamanHome.class);
        startActivity(c);
    }

    private boolean isLoginValid(String email, String password) {
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password);
    }

    private void doLogin(String email, String password) {
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        navigateToHome();
                    } else {
                        // If sign in fails, display a message to the user.
                        Log.w(TAG, "signInWithCustomToken:failure", task.getException());
                        Toast.makeText(MainActivity.this, "Authentication failed.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
    }
}