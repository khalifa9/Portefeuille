package com.example.mahmoud.portefeuille.Screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mahmoud.portefeuille.Presenters.MotDePassePresenter;
import com.example.mahmoud.portefeuille.R;

public class MotDePasseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mot_de_passe);
        MotDePassePresenter p=new MotDePassePresenter(this){
            @Override
            public void onEmailExistLoaded(Boolean exist) {
                //tr
            }
        };
        p.emailExist("email");
    }
}
