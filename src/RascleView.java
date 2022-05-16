import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;


public class RascleView extends JFrame{
	
	public RascleView(){
		int windowRows = 2;
		this.setTitle("Rascle");
		this.setSize(600,150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(windowRows,1));

		WordPanel wordPanel = new WordPanel();
		this.add(wordPanel);

		JPanel buttonPanel = new JPanel();
	
		JButton submitButton = new JButton();
        submitButton.setText("Submit");
        buttonPanel.add(submitButton);

		JButton undoButton = new JButton();
        undoButton.setText("Undo");
		undoButton.setEnabled(false);
		buttonPanel.add(undoButton);

		this.add(buttonPanel);

    }
	
	public static void main(String[] args) {
		RascleView gui = new RascleView();
		gui.setVisible(true);
	}

}

