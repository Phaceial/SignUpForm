package temple.edu.signupform;

import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.saveButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextInputEditText name  = (TextInputEditText) findViewById(R.id.nameInput);
                TextInputEditText email  = (TextInputEditText) findViewById(R.id.emailInput);
                TextInputEditText pass  = (TextInputEditText) findViewById(R.id.passInput);
                TextInputEditText passConfirm  = (TextInputEditText) findViewById(R.id.passConfirmInput);


                if(name.getText().toString().isEmpty() ||
                        email.getText().toString().isEmpty() ||
                        pass.getText().toString().isEmpty() ||
                        passConfirm.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, "Must enter all requested information", Toast.LENGTH_SHORT).show();
                } else if(!pass.getText().toString().equals(passConfirm.getText().toString())){
                    Toast.makeText(FormActivity.this, "Passwords do not match", Toast.LENGTH_SHORT).show();
                } else if (!name.getText().toString().isEmpty() &&
                        !email.getText().toString().isEmpty() &&
                        !pass.getText().toString().isEmpty() &&
                        !passConfirm.getText().toString().isEmpty()){
                    Toast.makeText(FormActivity.this, "Welcome " + name.getText().toString() + " to the SignUpForm App", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
