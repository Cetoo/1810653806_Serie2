package Aufgabe2;

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


        if (zufallszahl % 2 == 0) /*Mit dem Befel IF prüfe ich ob meine Zufallszahl eine gerade Zahl ist*/
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade");
            /*Mein Output falls die Zahl gerade ist wird hier festgelegt*/
        }


        else /*Falls die Zahl nicht gerade ist bestimme ich mit ELSE was passieren oder ausgegeben werden soll*/
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist ungerade");
            /*Mein Output Dialog ist hier Die Zahl ist ungerade*/
        }
    }
}
