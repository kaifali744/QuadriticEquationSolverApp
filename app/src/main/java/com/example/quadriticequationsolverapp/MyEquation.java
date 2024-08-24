package com.example.quadriticequationsolverapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadriticequationsolverapp.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    String a;
    String b;
    String c;
    ActivityMainBinding binding;

    public MyEquation(ActivityMainBinding binding) {
        this.binding = binding;
    }

    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void equationSolver(View view){
        int a = Integer.parseInt(getA());
        int b = Integer.parseInt(getB());
        int c = Integer.parseInt(getC());

        double disc = b*b-(4*a*c);

        double x1, x2;
        if (disc>=0){
            x1= (-b+ Math.sqrt(disc))/(2*a);
            x2= (-b- Math.sqrt(disc))/(2*a);

            binding.textView.setText("x1= "+x1+" x2= "+x2);
        } else if (disc < 0) {
            binding.textView.setText("No real roots (Complex Roots)");
        }
    }
}
