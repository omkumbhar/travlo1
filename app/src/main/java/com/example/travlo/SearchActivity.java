package com.example.travlo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

import com.example.travlo.Adapter.CityAdapter;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {
    RecyclerView ReView;
    CityAdapter cityAdapter;
    List<String> result = new ArrayList<>();
    List<String> type_name_copy = new ArrayList<String>();
    EditText location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        ReView = (RecyclerView) findViewById(R.id.locationList);
        location= (EditText) findViewById(R.id.location);

        result.add("Mumbai");
        result.add("ABC");
        result.add("Can");
        result.add("CanNot");
        result.add("Ekajr");




        UpdateUI(result);







        location.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                List<String> type_name_filter = new ArrayList<String>();
                String text = editable.toString();
                for (int i = 0; i < result.size(); i++) {
                    /*if ((result.get(i).toLowerCase()).contains(text.toLowerCase())) {
                        type_name_filter.add(result.get(i));
                    }*/
                    if((result.get(i).toLowerCase()).startsWith(text.toLowerCase())){
                        type_name_filter.add(result.get(i));
                    }


                }
                type_name_copy = type_name_filter;
                UpdateUI(type_name_copy);


            }
        });
    }

    private void UpdateUI(List<String> result) {
        cityAdapter = new CityAdapter(result,getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        ReView.setLayoutManager(mLayoutManager);
        ReView.setAdapter(cityAdapter);
        cityAdapter.notifyDataSetChanged();
    }


}
