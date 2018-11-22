package Aufgabe2;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten
{
    public static void main(String[] args)
    {
        int min=1; /*Mein Minimaler Wert für diese Aufgabe*/
        int max=10;/*Mein Maximaler Wert für diese Aufgabe*/



        Random rnd = new Random(); /*Hier wird wahrscheinlich dem System befohlen das es einen Zufallswert ausgeben wird und ein import javax.swing wird eingefügt*/
        int zufallszahl = rnd.nextInt(max - min + 1) + min;


        /*if (zufallszahl % 2 == 0) /Mit dem Befel IF prüfe ich ob meine Zufallszahl eine gerade Zahl ist gibt jedoch keinen Wert aus/
        {/*
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade");
            /Mein Output falls die Zahl gerade ist wird hier festgelegt/
        }*/


        /*else
        /Falls die Zahl nicht gerade ist bestimme ich mit ELSE was passieren oder ausgegeben werden soll aber gibt keinen Wert aus/
        {/*
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade");
            /Mein Output Dialog ist hier Die Zahl ist ungerade/
        }
        /If und Else Befehl ausgeklammert bzw. deaktiviert*/


        /*Aufgabe 3*/
        /*Mein Dialog sagt dem Nutzer das er eine ganze Zahl zwischen 1und10 eingeben soll*/

        String Satz= JOptionPane.showInputDialog("Geben Sie eine ganze Zahl zwischen 1 und 10 ein");

        int Eingabe = Integer.parseInt(Satz);





        int Versuche;
        for (Versuche=1; Versuche<3; Versuche++) /*Versuche<=3 sagt mir wieviel Versuche der Nutzer hat Versuche++ zählt die Versuche für den Nutzer mit*/
        {
            if (Eingabe != zufallszahl) /*Falls meine Zahl nicht die Zufallszahl ist gebe ich ihm mit show Dialog darunter an das die Zahl falsch war*/
            { /*In der Regel bzw. optimaler ist es wenn man nach == frägt da man ja wissen will ob es richtig ist*/
              Eingabe = Integer.parseInt(JOptionPane.showInputDialog("Die Zahl war falsch versuchen Sie es noch einmal"));


                if (Eingabe == zufallszahl)
                {
                    JOptionPane.showMessageDialog(null, "Die Zahl stimmt überein");
                }

                else if ((zufallszahl-Eingabe) <= -2 &&(zufallszahl-Eingabe)<=2)
                {

                    JOptionPane.showMessageDialog(null, "Die Zahl liegt innerhalb der Grenze -2 oder +2");
                }

                else
                {
                    JOptionPane.showMessageDialog(null, "Die Zahl stimmt nich überein");
                }
            }


            else /*Falls die Zahl gleich der Zufallszahl ist gibt das System aus die Zahl war richtig aus*/
            {
                JOptionPane.showMessageDialog(null, "Die Zahl war richtig");
                break;
            }

            if (Versuche==2)
            {
                JOptionPane.showMessageDialog(null, "Ihre 3 Versuche waren falsch");
            }
        }

    }
}
