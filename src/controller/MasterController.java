package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Paint;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MasterController {
    @FXML JFXTextField Resultat;
    boolean b = false;



    public void Aun(ActionEvent e){
        Resultat.setText(Resultat.getText()+1);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));
    }
    public void Adeux(ActionEvent e){
        Resultat.setText(Resultat.getText()+2);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Atrois(ActionEvent e){
        Resultat.setText(Resultat.getText()+3);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Aquatre(ActionEvent e){
        Resultat.setText(Resultat.getText()+4);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Acinq(ActionEvent e){
        Resultat.setText(Resultat.getText()+5);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Asix(ActionEvent e){
        Resultat.setText(Resultat.getText()+6);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Asept(ActionEvent e){
        Resultat.setText(Resultat.getText()+7);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Ahuit(ActionEvent e){
        Resultat.setText(Resultat.getText()+8);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Aneuf(ActionEvent e){
        Resultat.setText(Resultat.getText()+9);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Aplus(ActionEvent e){
        Resultat.setText(Resultat.getText()+'+');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Amoins(ActionEvent e){
        Resultat.setText(Resultat.getText()+'-');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Amultiple(ActionEvent e){
        Resultat.setText(Resultat.getText()+'*');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Adivision(ActionEvent e){
        Resultat.setText(Resultat.getText()+'/');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Apercent(ActionEvent e){
        Resultat.setText(Resultat.getText()+'%');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Aac(ActionEvent e){
        Resultat.clear();
        b=false;
        Resultat.setUnFocusColor(Paint.valueOf("#4d4d4d"));


    }
    public void Adelete(ActionEvent e){
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));
        String s = Resultat.getText();
        s = s.substring(0,s.length()-1);
        Resultat.setText(s);


    }
    public void Aparent(ActionEvent e){
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));
        if(b==false){
            Resultat.setText(Resultat.getText()+'(');
            b=true;
        }else{
            Resultat.setText(Resultat.getText()+')');
        }
    }
    public void Aegale(ActionEvent e) throws ScriptException {
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = Resultat.getText();
        foo.substring(foo.length());
        try{
            Resultat.setText('='+String.valueOf(engine.eval(foo)));
        }catch (Exception ee){
            Resultat.setText("Erreur !");
        }


    }
    public void Azero(ActionEvent e){
        Resultat.setText(Resultat.getText()+0);
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
    public void Avirgule(ActionEvent e){
        Resultat.setText(Resultat.getText()+'.');
        Resultat.setUnFocusColor(Paint.valueOf("#f22d2d"));



    }
}
