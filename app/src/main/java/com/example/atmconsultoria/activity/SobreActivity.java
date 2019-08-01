package com.example.atmconsultoria.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_sobre);

        String descricao = "Contrary to popular belief, Lorem Ipsum is not simply random text. " +
                "It has roots in a piece of classical Latin literature from 45 BC, making it " +
                "over 2000 years old.\n" + " Et harum quidem rerum facilis est et expedita distinctio. " +
                "Nam libero tempore, cum soluta nobis est eligendi optio cumque nihil impedit " +
                "quo minus id quod maxime placeat facere possimus, omnis voluptas assumenda est,\n " +
                "omnis dolor repellendus";

        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Fale Conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie um e-mail")
                .addWebsite("https://www.linkedin.com/in/michelle-sinibaldi-574b9064/", "Acesse o nosso site!")
                .addGroup("Acesse nossas Redes Sociais")
                .addFacebook("michelle.sinibaldi.9", "Acesse nosso Facebook")
                .addInstagram("misinibaldi")
                .addTwitter("@Mi_sinibaldi21")
                .addYoutube("google")
                .addGitHub("google")
                .addPlayStore("com.google.android.plus")
                .create();

        setContentView(sobre);

    }
}
