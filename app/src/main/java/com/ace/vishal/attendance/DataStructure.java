package com.ace.vishal.attendance;


import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hp on 10/19/2016.
 */
public class DataStructure extends AppCompatActivity implements View.OnClickListener {
    Button submit;
    EditText date;
    String roll1,roll2,roll3,roll4,roll5,roll6,roll8,roll9,roll10,roll11,roll12,roll13,roll14,roll15,roll16,roll17,roll18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_structure);
        submit=(Button)findViewById(R.id.submit);
        date=(EditText)findViewById(R.id.date);
        submit.setOnClickListener(this);
    }
    public void onClick(View v) {
        if (v == submit) {
            RadioGroup rollnum1 = (RadioGroup) findViewById(R.id.roll1);
            if (rollnum1.getCheckedRadioButtonId() == R.id.roll1a) {
                roll1 = "Absent";
            } else {
                roll1 = "Present";
            }
            RadioGroup rollnum2 = (RadioGroup) findViewById(R.id.roll2);
            if (rollnum2.getCheckedRadioButtonId() == R.id.roll2a) {
                roll2 = "Absent";
            } else {
                roll2 = "Present";
            }
            RadioGroup rollnum3 = (RadioGroup) findViewById(R.id.roll3);
            if (rollnum3.getCheckedRadioButtonId() == R.id.roll3a) {
                roll3 = "Absent";
            } else {
                roll3 = "Present";
            }
            RadioGroup rollnum4 = (RadioGroup) findViewById(R.id.roll4);
            if (rollnum4.getCheckedRadioButtonId() == R.id.roll14) {
                roll4 = "Absent";
            } else {
                roll4 = "Present";
            }
            RadioGroup rollnum5 = (RadioGroup) findViewById(R.id.roll5);
            if (rollnum5.getCheckedRadioButtonId() == R.id.roll5a) {
                roll5 = "Absent";
            } else {
                roll5 = "Present";
            }
            RadioGroup rollnum6 = (RadioGroup) findViewById(R.id.roll6);
            if (rollnum6.getCheckedRadioButtonId() == R.id.roll6a) {
                roll6 = "Absent";
            } else {
                roll6 = "Present";
            }
            RadioGroup rollnum8 = (RadioGroup) findViewById(R.id.roll8);
            if (rollnum8.getCheckedRadioButtonId() == R.id.roll8a) {
                roll8 = "Absent";
            } else {
                roll8 = "Present";
            }
            RadioGroup rollnum9 = (RadioGroup) findViewById(R.id.roll9);
            if (rollnum9.getCheckedRadioButtonId() == R.id.roll9a) {
                roll9 = "Absent";
            } else {
                roll9 = "Present";
            }
            RadioGroup rollnum10 = (RadioGroup) findViewById(R.id.roll10);
            if (rollnum10.getCheckedRadioButtonId() == R.id.roll10a) {
                roll10 = "Absent";
            } else {
                roll10 = "Present";
            }
            RadioGroup rollnum11 = (RadioGroup) findViewById(R.id.roll11);
            if (rollnum11.getCheckedRadioButtonId() == R.id.roll11a) {
                roll11 = "Absent";
            } else {
                roll11 = "Present";
            }
            RadioGroup rollnum12 = (RadioGroup) findViewById(R.id.roll12);
            if (rollnum12.getCheckedRadioButtonId() == R.id.roll12a) {
                roll12 = "Absent";
            } else {
                roll12 = "Present";
            }
            RadioGroup rollnum13 = (RadioGroup) findViewById(R.id.roll13);
            if (rollnum13.getCheckedRadioButtonId() == R.id.roll13a) {
                roll13 = "Absent";
            } else {
                roll13 = "Present";
            }
            RadioGroup rollnum14 = (RadioGroup) findViewById(R.id.roll14);
            if (rollnum14.getCheckedRadioButtonId() == R.id.roll14a) {
                roll14 = "Absent";
            } else {
                roll14 = "Present";
            }
            RadioGroup rollnum15 = (RadioGroup) findViewById(R.id.roll15);
            if (rollnum15.getCheckedRadioButtonId() == R.id.roll15a) {
                roll15 = "Absent";
            } else {
                roll15 = "Present";
            }
            RadioGroup rollnum16 = (RadioGroup) findViewById(R.id.roll16);
            if (rollnum16.getCheckedRadioButtonId() == R.id.roll16a) {
                roll16 = "Absent";
            } else {
                roll16 = "Present";
            }
            RadioGroup rollnum17 = (RadioGroup) findViewById(R.id.roll17);
            if (rollnum17.getCheckedRadioButtonId() == R.id.roll17a) {
                roll17 = "Absent";
            } else {
                roll17 = "Present";
            }
            RadioGroup rollnum18 = (RadioGroup) findViewById(R.id.roll18);
            if (rollnum18.getCheckedRadioButtonId() == R.id.roll18a) {
                roll18 = "Absent";
            } else {
                roll18 = "Present";
            }
            String currentDateTimeString =date.getText().toString().trim();
            Log.d("",currentDateTimeString);
            sendToServer(currentDateTimeString,roll1,roll2,roll3,roll4,roll5,roll6,roll8,roll9,roll10,roll11,roll12,roll13,roll14,roll15,roll16,roll17,roll18);
        }
    }
    public void sendToServer(final String date,final String roll1,final String roll2, final String roll3, final String roll4, final String roll5, final String roll6, final String roll8, final String roll9, final String roll10, final String roll11, final String roll12, final String roll13, final String roll14, final String roll15, final String roll16, final String roll17, final String roll18){
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Submitting attendance...");
        progressDialog.show();
        StringRequest req = new StringRequest(Request.Method.POST, Constants.REGISTER_URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        //dismissing the progress dialog
                        Log.d("",response);
                        progressDialog.dismiss();

                        //if the server returned the string success
                        if (response.trim().equalsIgnoreCase("success")) {
                            //Displaying a success toast
                            Toast.makeText(DataStructure.this, "Attendance Successfully Taken", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(DataStructure.this,"Error",Toast.LENGTH_SHORT).show();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> params = new HashMap<>();
                params.put("cdate",date);
                params.put("roll1", roll1);
                params.put("roll2", roll2);
                params.put("roll3",roll3);
                params.put("roll4",roll4);
                params.put("roll5",roll5);
                params.put("roll6",roll6);
                params.put("roll8",roll8);
                params.put("roll9",roll9);
                params.put("roll10",roll10);
                params.put("roll11",roll11);
                params.put("roll12",roll12);
                params.put("roll13",roll13);
                params.put("roll14",roll14);
                params.put("roll15",roll15);
                params.put("roll16",roll16);
                params.put("roll17",roll17);
                params.put("roll18",roll18);
                return params;
            }
        };

        //Adding the request to the queue
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(req);
    }
}