package com.example.orcbuilder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnWarlock = findViewById(R.id.btnWarlock);

        btnWarlock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TalentsActivity.class);
                intent.putExtra("GAME_CLASS", "warlock");
                intent.putExtra("FIRST_PAGE_BG", R.drawable.warlock_affliction);
                intent.putExtra("SECOND_PAGE_BG", R.drawable.warlock_demonology);
                intent.putExtra("THIRD_PAGE_BG", R.drawable.warlock_destruction);
                MainActivity.this.startActivity(intent);
            }
        });
    }


}
