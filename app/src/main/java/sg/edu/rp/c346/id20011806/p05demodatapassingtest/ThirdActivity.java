package sg.edu.rp.c346.id20011806.p05demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView tvChar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        tvChar = findViewById(R.id.textView2);

        char charAns = getIntent().getCharExtra("char", 'z');
        tvChar.setText("Character value received is: " + charAns);
    }
}