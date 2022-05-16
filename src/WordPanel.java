import javax.swing.*;
import java.awt.*;

public class WordPanel extends JPanel{
    JTextField textEntry[];
    JPanel panels[];

    private final static int LETTERS = 5;
    private final static Font font = new Font("SansSerif", Font.BOLD, 20);

    public JTextField[] getTextEntry() {
        return this.textEntry;
    }
    
    public WordPanel(){
      
        this.setSize(new Dimension(600,100));
        this.setLayout(new GridLayout(1,LETTERS));
        textEntry = new JTextField[LETTERS];
        panels = new JPanel[LETTERS];

        for(int i = 0; i < LETTERS; i ++){
            textEntry[i] = new JTextField();
            textEntry[i].setFont(font);
            textEntry[i].setColumns(1);
            
            panels[i] = new JPanel();
            panels[i].add(textEntry[i]);
           
            this.add(panels[i]);
            
        }

    }

}