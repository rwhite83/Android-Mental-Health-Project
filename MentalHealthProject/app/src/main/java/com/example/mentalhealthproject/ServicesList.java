package com.example.mentalhealthproject;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.util.Log;
import android.widget.ListView;
import android.widget.Toast;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

=======
import android.widget.TextView;
>>>>>>> 56fb0735481525bf24857d9272a945dd77b2eff2

public class ServicesList extends AppCompatActivity {
    private String TAG = ServicesList.class.getSimpleName();

    private ProgressDialog pDialog;
    private ListView lv;
    private static String SERVICE_URL = "http://opendata.newwestcity.ca/downloads/health/HEALTH_MENTAL_HEALTH_AND_ADDICTIONS_SERVICES.json";
    private ArrayList<Toon> toonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_list);

<<<<<<< HEAD
        toonList = new ArrayList<Toon>();
        lv = (ListView) findViewById(R.id.toonList);
        new GetContacts().execute();
    }

    /**
     * Async task class to get json by making HTTP call
     */
    private class GetContacts extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            pDialog = new ProgressDialog(ServicesList.this);
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);
            pDialog.show();

        }


        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();
            String jsonStr = sh.makeServiceCall(SERVICE_URL);

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);
                    JSONArray jsonArray = jsonObj.getJSONArray("features");

                    for (int i = 0; i < jsonArray.length(); i++) {
                        JSONObject c = jsonArray.getJSONObject(i);

                        JSONObject properties = c.getJSONObject("properties");

                        Property property = new Property();
                        property.setName(properties.getString("Name"));
                        property.setDescription(properties.getString("Description"));
                        property.setHours(properties.getString("Hours"));
                        property.setLocation(properties.getString("Location"));
                        property.setPhone(properties.getString("Phone"));
                        property.setEmail(properties.getString("Email"));
                        property.setWebsite(properties.getString("Website"));
                        property.setCategory(properties.getString("Category"));

                        // tmp hash map for single contact
                        Toon toon = new Toon();
                        toon.setProperties(property);

                        // adding contact to contact list
                        toonList.add(toon);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }


        @Override
        protected void onPostExecute(Void result) {
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();

            ToonsAdapter adapter = new ToonsAdapter(ServicesList.this, toonList);

            // Attach the adapter to a ListView
            lv.setAdapter(adapter);
        }
    }
=======

        String thePain = getIntent().getExtras().get("type").toString();

        TextView testView = findViewById(R.id.testView);
        testView.setText(thePain);
    }



>>>>>>> 56fb0735481525bf24857d9272a945dd77b2eff2

}
