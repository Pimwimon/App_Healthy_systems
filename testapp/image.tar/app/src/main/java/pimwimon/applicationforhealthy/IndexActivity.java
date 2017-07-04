package pimwimon.applicationforhealthy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import java.util.ArrayList;

public class IndexActivity extends AppCompatActivity {

    private Spinner nature;
    private ArrayList<String> Snature = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }

}
