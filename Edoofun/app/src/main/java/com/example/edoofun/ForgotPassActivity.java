package com.example.edoofun;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassActivity extends AppCompatActivity {
    private TextInputLayout emailInputLayout;
    private TextInputEditText emailInputText;
    private MaterialButton btnResetPassword;
    private ProgressDialog progressDialog;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        auth = FirebaseAuth.getInstance();
        progressDialog = new ProgressDialog(this);
        progressDialog.setCancelable(false);

        emailInputLayout = findViewById(R.id.emailInputLayout);
        emailInputText = findViewById(R.id.emailInputText);
        btnResetPassword = findViewById(R.id.btnResetPassword);

        emailInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (TextUtils.isEmpty(s)) {
                    emailInputLayout.setError(getResources().getString(R.string.forget_password_error_text_email_is_required));
                } else {
                    emailInputLayout.setError(null);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        btnResetPassword.setOnClickListener(v -> {
            String email = emailInputLayout.getEditText().getText().toString();
            if (!TextUtils.isEmpty(email)) {
                sendRequestChangePassword(email);
            } else {
                Toast.makeText(ForgotPassActivity.this, "Email tidak boleh kosong", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void sendRequestChangePassword(String email) {
        if (progressDialog != null) {
            progressDialog.setMessage("Mengirimkan email forget password");
            progressDialog.show();
        }
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(this, task -> {
                    progressDialog.dismiss();
                    if (task.isSuccessful()) {
                        Toast.makeText(ForgotPassActivity.this, "Berhasil mengirimkan email forget password", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ForgotPassActivity.this, "Gagal mengirimkan email forget password: " + task.getException(), Toast.LENGTH_LONG).show();
                    }
                });
    }
}
