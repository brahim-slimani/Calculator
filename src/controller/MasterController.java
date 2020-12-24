package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MasterController {
    @FXML Label Resultat;
    @FXML Label prcedent;
    boolean b = false;



    public void Aun(ActionEvent e){
        Resultat.setText(Resultat.getText()+1);
    }
    public void Adeux(ActionEvent e){
        Resultat.setText(Resultat.getText()+2);



    }
    public void Atrois(ActionEvent e){
        Resultat.setText(Resultat.getText()+3);



    }
    public void Aquatre(ActionEvent e){
        Resultat.setText(Resultat.getText()+4);
    }
    public void Acinq(ActionEvent e){
        Resultat.setText(Resultat.getText()+5);



    }
    public void Asix(ActionEvent e){
        Resultat.setText(Resultat.getText()+6);



    }
    public void Asept(ActionEvent e){
        Resultat.setText(Resultat.getText()+7);



    }
    public void Ahuit(ActionEvent e){
        Resultat.setText(Resultat.getText()+8);



    }
    public void Aneuf(ActionEvent e){
        Resultat.setText(Resultat.getText()+9);



    }
    public void Aplus(ActionEvent e){
        Resultat.setText(Resultat.getText()+'+');



    }
    public void Amoins(ActionEvent e){
        Resultat.setText(Resultat.getText()+'-');



    }
    public void Amultiple(ActionEvent e){
        Resultat.setText(Resultat.getText()+'*');



    }
    public void Adivision(ActionEvent e){
        Resultat.setText(Resultat.getText()+'/');



    }
    public void Apercent(ActionEvent e){
        Resultat.setText(Resultat.getText()+'%');



    }
    public void Aac(ActionEvent e){
        Resultat.setText("");
        prcedent.setText("");
        b=false;


    }
    public void Adelete(ActionEvent e){
        String s = Resultat.getText();
        s = s.substring(0,s.length()-1);
        Resultat.setText(s);


    }
    public void Aparent(ActionEvent e){
        if(b==false){
            Resultat.setText(Resultat.getText()+'(');
            b=true;
        }else{
            Resultat.setText(Resultat.getText()+')');
        }
    }
    public void Aegale(ActionEvent e) throws ScriptException {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = Resultat.getText();
        prcedent.setText(foo+'=');
        foo.substring(foo.length());
        try{
            Resultat.setText(String.valueOf(engine.eval(foo)));
        }catch (Exception ee){
            prcedent.setText("");
            Resultat.setText("Erreur !");
        }



    }
    public void Azero(ActionEvent e){
        Resultat.setText(Resultat.getText()+0);



    }
    public void Avirgule(ActionEvent e){
        Resultat.setText(Resultat.getText()+'.');



    }
}
