package com.example.sebax.miapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.content.Intent;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;
import android.support.v7.app.AlertDialog;

import org.json.JSONException;
import org.json.JSONObject;

public class Diputados extends AppCompatActivity implements View.OnClickListener {
TextView tvandrea,tvduarte,tvraul,tvmaraboli,tvcarolina,tvhinojosa,tvjorge,tvarroyo,tvjulian,tvalcayaga,tvpatricia,tvvalenzuela;
Button btnandrea,btnraul,btncarolina,btnjorge,btnjulian,btnpatricia;
@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diputados);

        tvandrea=findViewById(R.id.TVandrea);
        tvduarte=findViewById(R.id.TVduarte);
        tvraul=findViewById(R.id.TVraul);
        tvmaraboli=findViewById(R.id.TVmaraboli);
        tvcarolina=findViewById(R.id.TVcarolina);
        tvhinojosa=findViewById(R.id.TVHinojosa);
        tvjorge=findViewById(R.id.TVjorge);
        tvarroyo=findViewById(R.id.TVarroyo);
        tvjulian=findViewById(R.id.TVjulian);
        tvalcayaga=findViewById(R.id.TValcayaga);
        tvpatricia=findViewById(R.id.TVpatricia);
        tvvalenzuela=findViewById(R.id.TVvalenzuela);


        btnandrea=findViewById(R.id.BTNandrea);
        btnraul=findViewById(R.id.BTNraul);
        btncarolina=findViewById(R.id.BTNcarolina);
        btnjorge=findViewById(R.id.BTjorge);
        btnjulian=findViewById(R.id.BTjulian);
        btnpatricia=findViewById(R.id.BTNpatricia);

        btnandrea.setOnClickListener(this);
        btnraul.setOnClickListener(this);
        btncarolina.setOnClickListener(this);
        btnjorge.setOnClickListener(this);
        btnjulian.setOnClickListener(this);
        btnpatricia.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.BTNandrea:

                final String Nombre = tvandrea.getText().toString();
                final String Apellido = tvduarte.getText().toString();
                Response.Listener<String> responListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest candiRequest = new DiputadosRequest(Nombre, Apellido, responListener);
                RequestQueue queue = Volley.newRequestQueue(Diputados.this);
                queue.add(candiRequest);

                break;
            case R.id.BTNraul:

                final String raul = tvraul.getText().toString();
                final String maraboli = tvmaraboli.getText().toString();
                Response.Listener<String> responListenerraul = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest raulRequest = new DiputadosRequest(raul, maraboli, responListenerraul);
                RequestQueue queueraul = Volley.newRequestQueue(Diputados.this);
                queueraul.add(raulRequest);

                break;
            case R.id.BTNcarolina:

                final String carolina = tvcarolina.getText().toString();
                final String hinojosa = tvhinojosa.getText().toString();
                Response.Listener<String> responListenercarolina = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest candiRequestcarolina = new DiputadosRequest(carolina, hinojosa, responListenercarolina);
                RequestQueue queuecarolina = Volley.newRequestQueue(Diputados.this);
                queuecarolina.add(candiRequestcarolina);

                break;
            case R.id.BTjorge:

                final String jorge = tvjorge.getText().toString();
                final String arroyo = tvarroyo.getText().toString();
                Response.Listener<String> responListenerjorge = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest candiRequestjorge = new DiputadosRequest(jorge, arroyo, responListenerjorge);
                RequestQueue queuejorge = Volley.newRequestQueue(Diputados.this);
                queuejorge.add(candiRequestjorge);

                break;
            case R.id.BTjulian:

                final String julian = tvjulian.getText().toString();
                final String alcayaga = tvalcayaga.getText().toString();
                Response.Listener<String> responListenerjulian = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest candiRequestjulian = new DiputadosRequest(julian, alcayaga, responListenerjulian);
                RequestQueue queuejulian = Volley.newRequestQueue(Diputados.this);
                queuejulian.add(candiRequestjulian);

                break;
            case R.id.BTNpatricia:

                final String patricia = tvpatricia.getText().toString();
                final String valenzuela = tvvalenzuela.getText().toString();
                Response.Listener<String> responListenerpatricia = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            Boolean success = jsonObject.getBoolean("success");
                            if (success) {
                                Intent intent = new Intent(Diputados.this, Registro.class);
                                Diputados.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(Diputados.this);
                                builder.setMessage("Intentar otra vez").setNegativeButton("Retry", null).create().show();

                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                };

                DiputadosRequest candiRequestpatricia = new DiputadosRequest(patricia, valenzuela, responListenerpatricia);
                RequestQueue queuepatricia = Volley.newRequestQueue(Diputados.this);
                queuepatricia.add(candiRequestpatricia);

                break;

        }
    }
}
