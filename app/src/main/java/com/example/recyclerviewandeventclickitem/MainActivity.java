package com.example.recyclerviewandeventclickitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements OnClick {
    RecyclerView recyclerView;
    BirdAdapter mAdapter;
    List<Bird> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mList = new ArrayList<>();
        for (int i = 1; i < 20; i++){
            mList.add(new Bird(R.drawable.angry4, "angry4", "description..."));
            mList.add(new Bird(R.drawable.angry5, "angry5", "description..."));
        }

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new BirdAdapter(this, mList);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    public void OnClick(int position) {
        Toast.makeText(this, "Position "+ position, Toast.LENGTH_SHORT).show();
        //Nếu lỗi k click item dc thì xem lại trong item.xml xem có để android:clickable="true" k? nếu có thì bỏ đi hoặc thay bằng bên dưới
        //android:clickable="false"
        //android:focusable="false"
    }
}
