package pizzaorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaOrder extends javax.swing.JFrame {
    

    public static void main(String[] args) {
        new PizzaOrder().show();
    }
    public PizzaOrder(){
        setTitle("Pizza Order");
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                exitForm(e);
            }
        });
        
        getContentPane().setLayout(new GridBagLayout());
        pack();
        Dimension screenSize =
        Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width -
        getWidth())), (int) (0.5 * (screenSize.height -
        getHeight())), getWidth(), getHeight());
        }
    
    private void exitForm(WindowEvent e){
    System.exit(0);
    }
    
    
    
}
