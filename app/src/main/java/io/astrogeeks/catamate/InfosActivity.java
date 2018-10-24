package io.astrogeeks.catamate;

import android.content.Intent;
import android.support.v4.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class InfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infos);

        findViewById(R.id.save_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validateInput()){
                    saveInfos();
                    Intent homeIntent = new Intent(InfosActivity.this, HomeActivity.class);
                    startActivity(homeIntent);
                    finish();
                }
            }
        });
    }

    private boolean validateInput(){
        // TODO fix it
        return true;
    }

    private void saveInfos(){}

    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
}
