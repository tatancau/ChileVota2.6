package com.example.sebax.miapp;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class Core extends AppCompatActivity implements View.OnClickListener {
TextView tvcarlos,tvcampodonico,tvximena,tvbecerra,tvjoselee,tvlee,tvjorge,tvdiaz,tvgiancarlo,tvbartolu,tvgary,tvtapia;
Button btncarlos,btnximena,btnjoslee,btnjorge,btngiancarlo,btngary;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_core);

        tvcarlos=findViewById(R.id.TVcarlosferry);
        tvcampodonico=findViewById(R.id.TVcompodonico);
        tvximena=findViewById(R.id.TVximena);
        tvbecerra=findViewById(R.id.TVbecerra);
        tvjoselee=findViewById(R.id.TVjoselee);
        tvlee=findViewById(R.id.TVlee);
        tvjorge=findViewById(R.id.TVjorgediaz);
        tvdiaz=findViewById(R.id.TVdiaz);
        tvgiancarlo=findViewById(R.id.TVgiancarlo);
        tvbartolu=findViewById(R.id.TVbaltolu);
        tvgary=findViewById(R.id.TVgary);
        tvtapia=findViewById(R.id.TVtapia);

        btncarlos=findViewById(R.id.BTcarlosferry);
        btnximena=findViewById(R.id.BTNximena);
        btnjoslee=findViewById(R.id.BTNjoselee);
        btnjorge=findViewById(R.id.BTNjorgediaz);
        btngiancarlo=findViewById(R.id.BTNgiancarlo);
        btngary=findViewById(R.id.BTNgary);

        btncarlos.setOnClickListener(this);
        btnximena.setOnClickListener(this);
        btnjoslee.setOnClickListener(this);
        btnjorge.setOnClickListener(this);
        btngiancarlo.setOnClickListener(this);
        btngary.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BTcarlosferry:

                final String pablo = tvcarlos.getText().toString();
                final String bossay = tvcampodonico.getText().toString();
                Response.Listener<String> responListenerpablo = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObjectpablo = new JSONObject(response);
                            Boolean success = jsonObjectpablo.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest candiRequest = new CoreRequest(pablo, bossay, responListenerpablo);
                RequestQueue queue = Volley.newRequestQueue(Core.this);
                queue.add(candiRequest);

                break;
            case R.id.BTNximena:

                final String sandra = tvximena.getText().toString();
                final String velasquez = tvbecerra.getText().toString();
                Response.Listener<String> responListenerraul = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest raulRequest = new CoreRequest(sandra, velasquez, responListenerraul);
                RequestQueue queueraul = Volley.newRequestQueue(Core.this);
                queueraul.add(raulRequest);

                break;
            case R.id.BTNjoselee:

                final String claudio = tvjoselee.getText().toString();
                final String murilo = tvlee.getText().toString();
                Response.Listener<String> responListenercarolina = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest candiRequestcarolina = new CoreRequest(claudio, murilo, responListenercarolina);
                RequestQueue queuecarolina = Volley.newRequestQueue(Core.this);
                queuecarolina.add(candiRequestcarolina);

                break;
            case R.id.BTNjorgediaz:

                final String rodrigo = tvjorge.getText().toString();
                final String diaz = tvdiaz.getText().toString();
                Response.Listener<String> responListenerjorge = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest candiRequestjorge = new CoreRequest(rodrigo, diaz, responListenerjorge);
                RequestQueue queuejorge = Volley.newRequestQueue(Core.this);
                queuejorge.add(candiRequestjorge);

                break;
            case R.id.BTNgiancarlo:

                final String veronica = tvgiancarlo.getText().toString();
                final String foppiano = tvbartolu.getText().toString();
                Response.Listener<String> responListenerjulian = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest candiRequestjulian = new CoreRequest(veronica, foppiano, responListenerjulian);
                RequestQueue queuejulian = Volley.newRequestQueue(Core.this);
                queuejulian.add(candiRequestjulian);

                break;
            case R.id.BTNgary:

                final String jose = tvgary.getText().toString();
                final String miguel = tvtapia.getText().toString();
                Response.Listener<String> responListenerpatricia = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Core.this, Registro.class);
                                Core.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Core.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                CoreRequest candiRequestpatricia = new CoreRequest(jose, miguel, responListenerpatricia);
                RequestQueue queuepatricia = Volley.newRequestQueue(Core.this);
                queuepatricia.add(candiRequestpatricia);

                break;






        }
    }
}
