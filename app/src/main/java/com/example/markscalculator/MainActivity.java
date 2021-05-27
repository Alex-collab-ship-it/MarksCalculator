package com.example.markscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    public int k = 0;
    public double summ = 0;
    public int[] c = new int[200];
    TextView av;
    TextView tab;
    TextView tofive;
    TextView tofour;
    TextView tothree;
    TextView unlist;
    EditText roundPoint;
    Button save;
    RelativeLayout tb;
    String countings = "(";
    boolean f = true;
    boolean unlisted = false;
    public static double point = 0.5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        av = findViewById(R.id.aver);
        tab = findViewById(R.id.tab);
        tofive = findViewById(R.id.tofive);
        tofour = findViewById(R.id.tofour);
        tothree = findViewById(R.id.tothree);
        unlist = findViewById(R.id.unlist);
        tb = findViewById(R.id.tb);
        roundPoint = findViewById(R.id.roundPoint);
        save = findViewById(R.id.save_btn);
    }
    float convertDpToPixels(Context context, float dp) {
        return dp * context.getResources().getDisplayMetrics().density;
    }
    public void toGood() {
        if (k!=0) {
            String res = summ / k >= 4 + point ? "До 5-ки:---" : Countings.tofive(summ, k);
            tofive.setText(res);
            res = summ / k >= 3 + point ? "До 4-ки:---" : Countings.tofour(summ, k);
            tofour.setText(res);
            res = summ / k >= 2 + point ? "До 3-ки:---" : Countings.tothree(summ, k);
            tothree.setText(res);
        }
    }
    public void tab(){
        if (!f) {
            countings += "+"+c[k];
            tab.setText(countings+")/" + k);
        }
        else{
            countings += c[k];
            tab.setText(countings+")/" + k);
            f=false;
        }
    }
    public void two(View view){
        k++;
        summ+=2;
        c[k]=2;
        av.setText(String.format("%.2f" ,summ/k));
        av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
        tab();
        toGood();
    }
    public void three(View view){
        k++;
        summ+=3;
        c[k]=3;
        av.setText(String.format("%.2f" ,summ/k));
        av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
        tab();
        toGood();
    }
    public void four(View view){
        k++;
        summ+=4;
        c[k]=4;
        av.setText(String.format("%.2f" ,summ/k));
        av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
        tab();
        toGood();
    }
    public void five(View view){
        k++;
        summ+=5;
        c[k]=5;
        av.setText(String.format("%.2f" ,summ/k));
        av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
        tab();
        toGood();
    }
    public void unlistClick(View view)  {
        if(!f){
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) tb.getLayoutParams();
            params.height = 0;
            tb.setLayoutParams(params);
            unlist.setText("\\/");
            f=true;
        }
        else {
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) tb.getLayoutParams();
            params.height = Math.round(convertDpToPixels(this.getApplicationContext(),160));
            tb.setLayoutParams(params);
            unlist.setText("/\\");
            f=false;
        }
    }
    public void del(View view){
        if (k!=0 && k!=1){
            summ -= c[k];
            c[k] = 0;
            k--;
            av.setText(String.format("%.2f" ,summ/k));
            countings = "("+c[1];
            for(int i = 2;i<k+1;i++){
                countings += "+" + c[i];
            }
            tab.setText(countings+")/"+k);
            av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
            toGood();
        }
        else{
            clear(view);
        }

    }

    public void clear(View view) {
        summ = 0;
        c = new int[200];
        k = 0;
        countings = "(";
        av.setText("0.00");
        av.setTextColor(Color.parseColor("#A4A4A4"));
        tab.setText("0/0");
        tofive.setText("До 5-ки:---");
        tofour.setText("До 4-ки:---");
        tothree.setText("До 3-ки:---");
        f=true;
    }
    public void round(View view) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Неправильный формат", Toast.LENGTH_SHORT);
        String str = (roundPoint.getText().toString());
        if (str.equals("") || str.length()!=2 || str.charAt(0) != '.'){
            toast.show();
        }
        else{
            point = Double.parseDouble("0" + str);
            Countings.point = this.point;
            toGood();
            av.setTextColor(Color.parseColor(Countings.avclr(summ , k)));
        }
    }
}