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

public class Senadores extends AppCompatActivity implements View.OnClickListener {
TextView tvpablo,tvbossay,tvsandra,tvvelasquez,tvclaudio,tvmurillo,tvrodrigo,tvdiaz,tvveronica,tvfoppiano,tvjose,tvmiquel;
Button btnpablo,btnsandra,btnclaudio,btnrodrigo,btnveronica,btnjosemiguel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_senadores);

        tvpablo = findViewById(R.id.TVpablo);
        tvbossay = findViewById(R.id.TVbossay);
        tvsandra = findViewById(R.id.TVsandra);
        tvvelasquez = findViewById(R.id.TVvelasquez);
        tvclaudio = findViewById(R.id.TVclaudio);
        tvmurillo = findViewById(R.id.TVmurillo);
        tvrodrigo = findViewById(R.id.TVrodrigo);
        tvdiaz = findViewById(R.id.TVdiaz);
        tvveronica = findViewById(R.id.TVveronica);
        tvfoppiano = findViewById(R.id.TVFoppiano);
        tvjose = findViewById(R.id.TVjoseMiguel);
        tvmiquel = findViewById(R.id.TVmiguel);

        btnpablo.findViewById(R.id.BTbosay);
        btnsandra.findViewById(R.id.BTNsandra);
        btnclaudio.findViewById(R.id.BTNclaudio);
        btnrodrigo.findViewById(R.id.BTNrodrigo);
        btnveronica.findViewById(R.id.BTveronica);
        btnjosemiguel.findViewById(R.id.BTNjoseMiguel);


        btnpablo.setOnClickListener(this);
        btnsandra.setOnClickListener(this);
        btnclaudio.setOnClickListener(this);
        btnrodrigo.setOnClickListener(this);
        btnveronica.setOnClickListener(this);
        btnjosemiguel.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.BTbosay:

                final String pablo = tvpablo.getText().toString();
                final String bossay = tvbossay.getText().toString();
                Response.Listener<String> responListenerpablo = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObjectpablo = new JSONObject(response);
                            Boolean success = jsonObjectpablo.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest candiRequest = new SenadoresRequest(pablo, bossay, responListenerpablo);
                RequestQueue queue = Volley.newRequestQueue(Senadores.this);
                queue.add(candiRequest);

                break;
            case R.id.BTNsandra:

                final String sandra = tvsandra.getText().toString();
                final String velasquez = tvvelasquez.getText().toString();
                Response.Listener<String> responListenerraul = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest raulRequest = new SenadoresRequest(sandra, velasquez, responListenerraul);
                RequestQueue queueraul = Volley.newRequestQueue(Senadores.this);
                queueraul.add(raulRequest);

                break;
            case R.id.BTNclaudio:

                final String claudio = tvclaudio.getText().toString();
                final String murilo = tvmurillo.getText().toString();
                Response.Listener<String> responListenercarolina = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest candiRequestcarolina = new SenadoresRequest(claudio, murilo, responListenercarolina);
                RequestQueue queuecarolina = Volley.newRequestQueue(Senadores.this);
                queuecarolina.add(candiRequestcarolina);

                break;
            case R.id.BTNrodrigo:

                final String rodrigo = tvrodrigo.getText().toString();
                final String diaz = tvdiaz.getText().toString();
                Response.Listener<String> responListenerjorge = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest candiRequestjorge = new SenadoresRequest(rodrigo, diaz, responListenerjorge);
                RequestQueue queuejorge = Volley.newRequestQueue(Senadores.this);
                queuejorge.add(candiRequestjorge);

                break;
            case R.id.BTveronica:

                final String veronica = tvveronica.getText().toString();
                final String foppiano = tvfoppiano.getText().toString();
                Response.Listener<String> responListenerjulian = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest candiRequestjulian = new SenadoresRequest(veronica, foppiano, responListenerjulian);
                RequestQueue queuejulian = Volley.newRequestQueue(Senadores.this);
                queuejulian.add(candiRequestjulian);

                break;
            case R.id.BTNjoseMiguel:

                final String jose = tvjose.getText().toString();
                final String miguel = tvmiquel.getText().toString();
                Response.Listener<String> responListenerpatricia = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Senadores.this, Registro.class);
                                Senadores.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Senadores.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                SenadoresRequest candiRequestpatricia = new SenadoresRequest(jose, miguel, responListenerpatricia);
                RequestQueue queuepatricia = Volley.newRequestQueue(Senadores.this);
                queuepatricia.add(candiRequestpatricia);

                break;





        }
    }
}
