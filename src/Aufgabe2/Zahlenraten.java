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

        for (int i=0; i<3; i++)
        {
            String rueckgabewert;
            rueckgabewert = JOptionPane.showInputDialog(null, "Geben Sie bitte eine ganze Zahl zwischen 1 und 10 ein.");

            if (Integer.parseInt(rueckgabewert) == zufallszahl) /*Falls meine Zahl richtig war wird die Schleife abgebrochen durch einen Break und Deine Zahl ist richtig ausgegeben*/
            {
                JOptionPane.showMessageDialog(null, "Deine Zahl ist richtig");
                break;
            }


            else if ((Integer.parseInt(rueckgabewert)- zufallszahl) >= -2 && (Integer.parseInt(rueckgabewert)- zufallszahl) <= 2)
            /*Falls die eingegebene Zahl 2 zu wenig oder 2 zu hoch ist kommt die Message das die Zahl im Wertebereich liegt*/
            {
                JOptionPane.showMessageDialog(null, "Ihre Zahl liegt im Grenzbereich +2 oder -2");
            }


            else {
                JOptionPane.showMessageDialog(null, "Ihre Zahl war leider falsch");
                /*Ihre Zahl war leider falsch erscheint nur dann wenn meine eingegebene Zahl mehr 2 unterschied hat*/
            }
                if (i == 2)
                {
                    JOptionPane.showMessageDialog(null, "Ihre maximale Anzahl an Versuchen ist verbraucht");
                    /*Falls mein ==2 also mein 0,1,2 Versuch und somit 3ter falsch war kommt die Message das die Anzahl an Versuche verbraucht wurde*/
                }
            }
        }
    }
