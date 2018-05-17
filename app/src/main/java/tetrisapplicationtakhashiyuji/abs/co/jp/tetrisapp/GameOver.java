package tetrisapplicationtakhashiyuji.abs.co.jp.tetrisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class GameOver extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
    }



    public void onStartButton(View view) {
        Intent intent = new Intent(this, Title.class);
        startActivity(intent);

    }
}
