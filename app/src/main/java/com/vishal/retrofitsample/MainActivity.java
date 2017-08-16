package com.vishal.retrofitsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.vishal.retrofitsample.adapter.ImageListAdapter;
import com.vishal.retrofitsample.collection.FlowerCollection;
import com.vishal.retrofitsample.interfaces.FlowerService;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.listView) ListView listView;
    ImageListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        if(listView == null) {

            listView = (ListView) findViewById(R.id.listView);
            Log.v(getString(R.string.app_name), "listView is null !!");
        }

        FlowerApiClient apiClient = new FlowerApiClient("http://www.json-generator.com/api/json/get/");
        FlowerService flowerService = apiClient.getClient().create(FlowerService.class);

        Call<FlowerCollection> call = flowerService.getFlowerList();
        call.enqueue(new Callback<FlowerCollection>() {
            @Override
            public void onResponse(Call<FlowerCollection> call, Response<FlowerCollection> response) {
                adapter = new ImageListAdapter(MainActivity.this, response.body());
                listView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<FlowerCollection> call, Throwable t) {
                Log.e(getString(R.string.app_name), "onFailure .... " + t);
            }
        });
    }
}
