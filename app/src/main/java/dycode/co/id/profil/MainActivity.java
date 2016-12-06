package dycode.co.id.profil;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurizka on 04/12/2016.
 */
public class MainActivity extends AppCompatActivity {

    private static final int RC_CHANGE_INPUT = 1;
    @BindView(R.id.editText)
    EditText editText;
    @BindView(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button2)
    public void onClick() {
        if(editText.getText().toString().equals(""))
        {
            Toast.makeText(MainActivity.this, "Masukan Nama Anda", Toast.LENGTH_SHORT).show();
        } else  {Intent intent = new Intent(MainActivity.this, NextActivity.class);
            String data = editText.getText().toString();
            intent.putExtra("input", data);
            startActivityForResult(intent, RC_CHANGE_INPUT);}
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_CHANGE_INPUT && resultCode == RESULT_OK);
        String result = data.getExtras().getString("result");
        editText.setText(result);
    }
}

