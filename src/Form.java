
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Form extends JFrame{
    public Form(){
        super("Password Generator");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);// center the window
        addComponents();
        
    }
    
    private void addComponents(){
        JLabel nameLabel = new JLabel("Password Generator");
        nameLabel.setFont(new Font("Arial",Font.BOLD| Font.ITALIC,32));
        nameLabel.setForeground(new Color(0, 120, 215));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(nameLabel);





    }
}
