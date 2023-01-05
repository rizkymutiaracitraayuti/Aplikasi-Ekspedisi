package com.example.aplikasiuts;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.EditText;
import android.widget.AdapterView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;


public class MainActivity extends AppCompatActivity {

    String [] tujuan = {
            "Makassar", "Bone", "Sinjai","Palopo","Barru","Bulukumba","Soppeng","Takalar","Enrekang"
    };
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button daftar;
    EditText resi,pengirim,penerima,alamat,berat ;
    Button cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resi  = findViewById(R.id.editText);
        pengirim = findViewById(R.id.editText2);
        penerima = findViewById(R.id.editText3);
        alamat = findViewById(R.id.editText4);
        berat = findViewById(R.id.editText7);

        Spinner spinner = findViewById(R.id.listItem);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,tujuan);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                out.tuju = spinner.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        addListenerButton();
    }
    private void addListenerButton() {
        radioGroup = findViewById(R.id.radioG);
        daftar = findViewById(R.id.daftar);
        cancel = findViewById(R.id.batal);
        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedID = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(selectedID);
                out.layanan = radioButton.getText().toString();
                out.noresi = resi.getText().toString();
                out.penerima = penerima.getText().toString();
                out.pengirim = pengirim.getText().toString();
                out.alamat = alamat.getText().toString();
                out.berat = berat.getText().toString();
                if(out.berat.isEmpty()){
                    Toast.makeText(MainActivity.this, "Tolong isi berat", Toast.LENGTH_LONG).show();
                }else{
                    count();
                    Intent intent = new Intent(MainActivity.this,ActivityResi.class);
                    startActivity(intent);
                }
            }
        });
    }
    public void count(){
        String wil = out.tuju;
        switch (wil){
            case "Makassar":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
//                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*20000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*50000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Bone":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*75000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*110000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Sinjai":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*75000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*110000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Palopo":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*100000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*130000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Barru":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*50000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*80000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Bulukumba":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*50000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*80000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Soppeng":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C :"+c);
                    if(c.contains("Regular")){
                        out.total =helper*60000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*90000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Takalar":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*40000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*70000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
            case "Enrekang":
            {
                String coba = berat.getText().toString();
                int helper = Integer.parseInt(coba);
                if(helper!=0){
                    helper = Integer.parseInt(coba);
                    String c = out.layanan;
                    //                        String c = "Kilat";
                    System.out.println("ini variabel C : "+c);
                    if(c.contains("Regular")){
                        out.total =helper*65000;
                    }else if (c.contains("Kilat")){
                        out.total =helper*85000;
                    } else{
                        Toast.makeText(MainActivity.this, "Pilih Layanan",Toast.LENGTH_SHORT).show();
                    }
                } else{
                    Toast.makeText(MainActivity.this, "Tidak Boleh Kosong",Toast.LENGTH_SHORT).show();
                }
            }
            break;
        }

    }


}
class out{
    public static String noresi;
    public static String pengirim;
    public static String penerima;
    public static String alamat;
    public static String tuju;
    public static String berat;
    public static String layanan;
    public static double total;

}