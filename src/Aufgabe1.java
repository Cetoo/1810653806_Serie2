import javax.swing.*;

public class Aufgabe1
{

    public static void main(String[] args)
    {
        /*Mit JOptionPane.showInputDialog lege ich fest was er mir anzeigen bzw. fragen soll in diesem Fall: Geben Sie Ihren Namen ein*/
        String Name = JOptionPane.showInputDialog("Geben Sie Ihren Namen ein.");
        int alter = Integer.parseInt(JOptionPane.showInputDialog("Geben Sie Ihr Alter ein."));
        /*Integer.parseInt konvertiert einen String in einen Integer Wert um*/


        /*Mit dem IF Befehl lege ich fest was passiert wenn mein int also mein alter Beispielsweise unter 18 ist was er mir ausgeben soll*/
        if (alter<18)
        {
            JOptionPane.showMessageDialog(null, "Du bist noch nicht Volljährig");
            /*JOptionPane.showMessageDialog braucht immer ein parentComponent mit dem Wert null, und dann kann ich meine Message schreiben*/
        }


        /*Mit dem Befehl ELSE lege ich fest was passiert oder angezeigt werden soll wenn das eingegebene Alter über 17 ist*/
        else
        {
            JOptionPane.showMessageDialog(null, "Du bist Volljährig");
            /*Das ist mein Ausgabe Dialog wenn das Alter über 17 war*/
        }

    }

}
