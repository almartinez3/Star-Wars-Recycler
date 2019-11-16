package co.devbeerloper.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import model.Band;
import providers.ReadInformation;

public class MainActivity extends AppCompatActivity {


    private RecyclerView swRecycleView;
    private RecyclerView.Adapter swAdapter1;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<Swars> swarsList;
    private RequestQueue swRequestQueue;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swRecycleView= findViewById(R.id.swRecyclerView);
        swRecycleView.setLayoutManager(new LinearLayoutManager(this));

        swarsList = new ArrayList<>();
        swRequestQueue = Volley.newRequestQueue(this);
        parseJson();

    }

    private void parseJson (){
        String url = "https://swapi.co/api/people/";
        JsonObjectRequest request = new JsonObjectRequest(Request.Method.GET, url, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray jsonArray = response.getJSONArray("results");

                            for (int i = 0;i< jsonArray.length();i++){
                                JSONObject results = jsonArray.getJSONObject(i);
                                String Jnombre = results.getString("name");
                                String JHeight = results.getString("height");
                                String Jmass = results.getString("mass");
                                String Jhair_color = results.getString("hair_color");
                                String Jskin_color = results.getString("skin_color");
                                String Jeye_color = results.getString("eye_color");
                                String Jbirth_year = results.getString("birth_year");
                                String Jgender = results.getString("gender");

                                swarsList.add(new Swars(Jnombre,JHeight,Jmass,Jhair_color, Jskin_color,Jeye_color,Jbirth_year,Jgender));


                            }

                            swAdapter1 = new swAdapter(MainActivity.this,swarsList);
                            swRecycleView.setAdapter(swAdapter1);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();

            }
        });

        swRequestQueue.add(request);

    }
}
