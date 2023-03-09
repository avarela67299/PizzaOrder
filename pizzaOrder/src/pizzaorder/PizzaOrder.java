package pizzaorder;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PizzaOrder extends javax.swing.JFrame {
    
    //size panel
    JPanel sizePanel = new JPanel();
    ButtonGroup sizeButtonGroup = new ButtonGroup();
    JRadioButton smallRadioButton = new JRadioButton(); 
    JRadioButton mediumRadioButton = new JRadioButton(); 
    JRadioButton largeRadioButton = new JRadioButton();
    
    //crust panel
    JPanel crustPanel = new JPanel();
    ButtonGroup crustButtonGroup = new ButtonGroup();
    JRadioButton thinRadioButton = new JRadioButton();
    JRadioButton thickRadioButton = new JRadioButton();
    

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
        
        //set the frame layout
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints gridConstraints = new GridBagConstraints();
        
        //size panel layout
        sizePanel.setLayout(new GridBagLayout());
        sizePanel.setBorder(BorderFactory.createTitledBorder("Size "));
        
        //add radio buttons to the size panel
        smallRadioButton.setText("Small");
        smallRadioButton.setSelected(true);
        sizeButtonGroup.add(smallRadioButton);
        gridConstraints = new GridBagConstraints();
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(smallRadioButton, gridConstraints);
        smallRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                sizeRadioButtonActionPerformed(e);
            } 
        });
        
        mediumRadioButton.setText("Medium");
        sizeButtonGroup.add(mediumRadioButton);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(mediumRadioButton, gridConstraints);
        mediumRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                sizeRadioButtonActionPerformed(e);
            } 
        });
        
        largeRadioButton.setText("Medium");
        sizeButtonGroup.add(largeRadioButton);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        sizePanel.add(largeRadioButton, gridConstraints);
        largeRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                sizeRadioButtonActionPerformed(e);
            } 
        });
        
        //add the size pannel to the frame
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        getContentPane().add(sizePanel, gridConstraints);
        
        // crust panel layout
        crustPanel.setLayout(new GridBagLayout());
        crustPanel.setBorder(BorderFactory.createTitledBorder("Crust"));
        
        // add controls to panel
        thinRadioButton.setText("Thin");
        thinRadioButton.setSelected(true);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        crustButtonGroup.add(thinRadioButton);
        gridConstraints.anchor = GridBagConstraints.WEST;
        crustPanel.add(thinRadioButton, gridConstraints);
        thinRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                crustRadioButtonActionPerformed(e);
            } 

        });
        
        thickRadioButton.setText("Thick");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        crustButtonGroup.add(thickRadioButton);
        crustPanel.add(thickRadioButton, gridConstraints);
        thickRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                crustRadioButtonActionPerformed(e);
            } 

        });
        
        // add crust panel to the frame
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        getContentPane().add(crustPanel,gridConstraints);
        pack();
        
        //place the program in the middle of the screen
        Dimension screenSize =
        Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((int) (0.5 * (screenSize.width -
        getWidth())), (int) (0.5 * (screenSize.height -
        getHeight())), getWidth(), getHeight());
        }
    
    
    private void sizeRadioButtonActionPerformed(ActionEvent e) {
            }
    
    private void crustRadioButtonActionPerformed(ActionEvent e){
    }
    
    private void exitForm(WindowEvent e){
    System.exit(0);
    }
    
    
    
}
