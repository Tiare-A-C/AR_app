package android.example.app6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button features;
    private Button officeNum;
    private Button roomNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        features = (Button) findViewById(R.id.features);
        features.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FeaturesActivity();
            }
        });

        officeNum = (Button) findViewById(R.id.officeHours);
        officeNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OfficeNumActivity();
            }
        });

        roomNum = (Button) findViewById(R.id.roomNumbers);
        roomNum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RoomNumActivity();
            }
        });


    }
    public void FeaturesActivity(){
        Intent intent = new Intent(this, FeaturesActivity.class);
        startActivity(intent);
    }

    public void OfficeNumActivity(){
        Intent intent = new Intent(this, OfficeNumActivity.class);
        startActivity(intent);
    }

    public void RoomNumActivity(){
        Intent intent = new Intent(this, RoomNumActivity.class);
        startActivity(intent);
    }
}