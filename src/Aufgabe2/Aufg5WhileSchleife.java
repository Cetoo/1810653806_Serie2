package Aufgabe2;

import javax.swing.*;
import java.util.Random;

public class Aufg5WhileSchleife {

    public static void main(String[] args) {
        int min = 1;
        int max = 10;

        Random rnd = new Random();


        int zufallszahl = rnd.nextInt(max - min + 1) + min;

        int i = 0;

        /*Aufgabe Nummer 5 While Schleife*/


        //   while (i < 3) {
        //       int rueckgabewert = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte geben Sie eine Zahl zwischen 1 und 10 ein."));
        //       if (rueckgabewert == zufallszahl) {
        //           JOptionPane.showMessageDialog(null, "Glückwunsch! Ihre eingegebene Zahl war richtig.");
        //           break;
        /*Falls die eingegebene Zahl gleich der Zufallszahl ist wird ausgegeben das die Zahl richtig erraten wurde*/

        //       } else {
        //           i++;
        //           if (i > 2) {
       // JOptionPane.showMessageDialog(null, "Keine Übereinstimmung mit der Zufallszahl " + zufallszahl + "! Alle Versuche sind aufgebraucht!");
        /*Falls die Anzahl an Versuche 3 war und die Zahl nicht erraten wurde zeigt es an das es keine Übereinstimmung gab und was die Zufallszahl war*/

        //           } else {
        //               JOptionPane.showMessageDialog(null, "Keine Übereinstimmung mit der Zufallszahl Sie haben noch " + (3 - i) + " " +
        //                       "Versuche übrig");
        /*Falls der Nutzer noch übrige Versuche hat wird ihm hiermit seine Anzahl an noch übrigen Versuche angezeigt*/

        //               }
        //           }

        //
//

        /*Aufgabe Nummer 6 und dafür die Aufgabe Nummer 5 darüber mit // auskommentiert*/


        do {
            int rueckgabewert = Integer.parseInt(JOptionPane.showInputDialog(null, "Geben Sie eine ganze Zahl zwischen 1 und 10 ein"));
            if (rueckgabewert == zufallszahl) {
                JOptionPane.showMessageDialog(null, "Ihre eingegebene Zahl war richtig!");
                break;
            } else {
                i++;
                if (i > 2) {
                    JOptionPane.showMessageDialog(null, "Es gab keine Übereinstimmung mit der Zufallszahl: " + zufallszahl + "! + Alle Versuche aufgebraucht!");

                } else {
                    JOptionPane.showMessageDialog(null, "Es gab keine Übereinstimmung mit der Zufallszahl  sie haben noch " + (3 - i) + "Versuche übrig");
                }
            }
        } while (i < 3);
    }
}


