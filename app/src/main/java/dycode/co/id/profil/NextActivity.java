package dycode.co.id.profil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Nurizka on 04/12/2016.
 */
public class NextActivity extends AppCompatActivity {

    @BindView(R.id.textView11)
    TextView textView11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        ButterKnife.bind(this);

        String data = getIntent().getExtras().getString("input");
        textView11.setText(data);
    }
}
