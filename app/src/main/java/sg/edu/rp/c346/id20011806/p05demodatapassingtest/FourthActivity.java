package sg.edu.rp.c346.id20011806.p05demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {

    TextView tvDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);

        tvDouble = findViewById(R.id.textView3);

        double tvDoubleReceived = getIntent().getDoubleExtra("doubleAns", 6.9);
        tvDouble.setText("Double value received is: " + tvDoubleReceived);
    }
}