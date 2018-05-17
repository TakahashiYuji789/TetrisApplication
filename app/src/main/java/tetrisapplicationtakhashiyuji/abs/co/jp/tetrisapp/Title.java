package tetrisapplicationtakhashiyuji.abs.co.jp.tetrisapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Title extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        }



    public void onPlayButton(View view) {
        Intent intent = new Intent(this, Top.class);
        startActivity(intent);

    }
}
