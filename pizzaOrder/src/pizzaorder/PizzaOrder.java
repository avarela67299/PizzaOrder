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
    
    //toppings panel 
    JPanel toppingsPanel = new JPanel();
    JCheckBox cheeseCheckBox = new JCheckBox();
    JCheckBox mushroomsCheckBox = new JCheckBox();
    JCheckBox olivesCheckBox = new JCheckBox();
    JCheckBox onionsCheckBox = new JCheckBox();
    JCheckBox peppersCheckBox = new JCheckBox();
    JCheckBox tomatoesCheckBox = new JCheckBox();
    
    //dining panel
    JPanel diningPanel = new JPanel();
    ButtonGroup diningButtonGroup = new ButtonGroup();
    JRadioButton eatInButton = new JRadioButton();
    JRadioButton eatOutButton = new JRadioButton();
    
    // butons
    JButton orderButton = new JButton();
    JButton historyButton = new JButton();
    
    
    

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
        gridConstraints.gridheight = 2;
        getContentPane().add(crustPanel,gridConstraints);
        
        // toppings panel layout 
        toppingsPanel.setLayout(new GridBagLayout());
        toppingsPanel.setBorder(BorderFactory.createTitledBorder("Toppings")); 
        
        // add contros to toppings panel
        cheeseCheckBox.setText("Extra Cheese");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridheight = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(cheeseCheckBox, gridConstraints);
        
        mushroomsCheckBox.setText("Mushrooms");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(mushroomsCheckBox, gridConstraints);
        
        olivesCheckBox.setText("Olives");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(olivesCheckBox, gridConstraints);
        
        onionsCheckBox.setText("Onions");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(onionsCheckBox, gridConstraints);
        
        peppersCheckBox.setText("Green Peppers");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(peppersCheckBox, gridConstraints);
        
        tomatoesCheckBox.setText("Tomatoes");
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        toppingsPanel.add(tomatoesCheckBox, gridConstraints); 
        
        //add toppings panel to frame
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 2;
        getContentPane().add(toppingsPanel, gridConstraints);
        
        //set dining panel layout 
        diningPanel.setLayout(new GridBagLayout());
        //sizePanel.setBorder(BorderFactory.createTitledBorder("Size "));
        
        //add controls to dining panel
        eatInButton.setText("Eat In");
        eatInButton.setSelected(true);
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 0;
        gridConstraints.gridwidth = 1;
        gridConstraints.anchor = GridBagConstraints.WEST;
        diningButtonGroup.add(eatInButton);
        diningPanel.add(eatInButton, gridConstraints);
        eatInButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                diningRadioButtonActionPerformed(e);
            } 
        });
        
        eatOutButton.setText("Eat Out");
        gridConstraints.gridx = 0;
        gridConstraints.gridy = 1;
        gridConstraints.anchor = GridBagConstraints.EAST;
        diningButtonGroup.add(eatOutButton);
        diningPanel.add(eatOutButton, gridConstraints);
        eatOutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                diningRadioButtonActionPerformed(e);
            } 
        });
        
        //add dining panel to frame
        gridConstraints.gridx = 1;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight = 2;
        gridConstraints.anchor = GridBagConstraints.WEST;
        getContentPane().add(diningPanel, gridConstraints);
        
        //add buttons in frame      
        orderButton.setText("Order");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 1;
        gridConstraints.gridheight = 1;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add(orderButton, gridConstraints);
        orderButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                orderButtonActionPerformed(e);
            }       
        });
        
        historyButton.setText("history");
        gridConstraints.gridx = 2;
        gridConstraints.gridy = 2;
        gridConstraints.anchor = GridBagConstraints.CENTER;
        getContentPane().add(historyButton, gridConstraints);
        historyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                historyButtonActionPerformed(e);
            }       
        });
        
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
    
    private void diningRadioButtonActionPerformed(ActionEvent e) {
    }
    
    private void orderButtonActionPerformed(ActionEvent e) {       
    }
    
    private void historyButtonActionPerformed(ActionEvent e) {      
    }
    
    private void exitForm(WindowEvent e){
    System.exit(0);
    }
    
    
    
}
