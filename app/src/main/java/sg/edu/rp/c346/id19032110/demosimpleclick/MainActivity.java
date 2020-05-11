package sg.edu.rp.c346.id19032110.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    //Step 1: Declare the field variables
    TextView tvDisplay;
    Button btnDisplay;
    EditText etInput;
    ToggleButton togglebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 2: Link the field variables to UI components in layout
        tvDisplay = findViewById(R.id.textViewDisplay);
        btnDisplay = findViewById(R.id.buttonDisplay);
        etInput = findViewById(R.id.editText);
        togglebtn = findViewById(R.id.toggleButtonEnabled);

        btnDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the text of EditText etInput and covert to string
                etInput.getText().toString();
                // Assign it to a variable called stringResponse
                String stringResponse = etInput.getText().toString();
                // Display the value of stringResources via the TextView tvDisplay
                tvDisplay.setText(stringResponse);
            }
        });

togglebtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if (togglebtn.isChecked()) {
            etInput.setEnabled(true);
        }
        else {
            etInput.setEnabled(false);
        }
    }
});

    }
}
