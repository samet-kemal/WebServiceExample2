package com.samet.webserviceexample2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Adapter.InformationAdapter;
import Model.Information;
import RestAPI.RestApiClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    List<Information> infolist;
    ListView infoListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Initialize();
        Request();

    }

    public void Initialize(){
        infoListView=(ListView) findViewById(R.id.InfoListView);
    }



    public void Request(){

        infolist=new ArrayList<>();
        Call<List<Information>> listCall= RestApiClient.getInstance().getMyApi().getInformation();
        listCall.enqueue(new Callback<List<Information>>() {
            @Override
            public void onResponse(Call<List<Information>> call, Response<List<Information>> response) {

                if (response.isSuccessful()){
                    InformationAdapter informationAdapter = new InformationAdapter(response.body(),getApplicationContext());
                    infoListView.setAdapter(informationAdapter);
                    //Log.i("ListIncome", infolist.toString()); ----> For Check Data;

                }

            }

            @Override
            public void onFailure(Call<List<Information>> call, Throwable t) {

            }
        });
    }

}