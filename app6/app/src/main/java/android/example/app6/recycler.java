package android.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class recycler extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_item);

        // info screens
        //setContentView(R.layout.features);
        //setContentView(R.layout.officehours);
        //setContentView(R.layout.roomnumbers);
    }
}