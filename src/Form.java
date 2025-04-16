
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Form extends JFrame{
    


    public Form(){
        super("Password Generator");
        setSize(540, 570);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// center the window
        addComponents();
        
    }
    
    private void addComponents(){
        JLabel titleLabel = new JLabel("Password Generator");
        titleLabel.setFont(new Font("Arial",Font.BOLD| Font.ITALIC,32));
        titleLabel.setForeground(new Color(0, 120, 215));
        titleLabel. setBounds(0, 0, 540, 39);
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titleLabel, BorderLayout.NORTH);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel,BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        JTextField passwordField = new JTextField();
        passwordField.setEditable(false);
        passwordField.setFont(new Font("Arial", Font.BOLD, 16));
        passwordField.setHorizontalAlignment(JTextField.CENTER);
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE,50));;
        mainPanel.add(passwordField);
        mainPanel.add(Box.createRigidArea(new Dimension(0,10))); 
        passwordField.setBorder(BorderFactory.createLineBorder(Color.GRAY,1));
        add(mainPanel);
        


       
       /*  JTextArea passOutput = new JTextArea(); 
       /*  passOutput.setEditable(false); // Text nicht verändert
        //passOutput.setFont(new Font ("Dialog", Font.BOLD,32 ));
        JScrollPane scrollPane = new JScrollPane(passOutput);
        //scrollPane.setBounds(25,97 , 479, 78);
        scrollPane.setBorder(BorderFactory.createLineBorder( Color.BLUE)); 
        passOutput.setFont(new Font("Dialog", Font.BOLD, 24));
        scrollPane.setBounds(25, 97, 479, 60); 
        passOutput.setBackground(new Color(240, 240, 240));
        passOutput.setAlignmentX(Component.BOTTOM_ALIGNMENT);
        add(scrollPane);  */
       

    

    

       
        




    }
}
