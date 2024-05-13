import javax.swing.JOptionPane;

public class Joption{
    public static void main(String[] args){

        String response;

        response = JOptionPane.showInputDialog("What's your Name? ");
        String name = response;
        

        response = JOptionPane.showInputDialog("Type a number: ");
        double a = Double.parseDouble(response);



        response = JOptionPane.showInputDialog("Type a number: ");
        int b = Integer.parseInt(response);

        double sum = a + b;
        String message  = "Hi, " + name + " the sum of your favourite numbers is " + sum;
        
        System.out.println(message);
    }
}