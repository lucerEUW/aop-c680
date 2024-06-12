package uebung9;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class NoteBookGUI extends JFrame {

	private JLabel wochentagLabel;
	private JLabel termineLabel;
	private JButton anzeigeButton;
	private JButton speicherButton;
	private JButton clearButton;
	private JButton beendenButton;
	private JTextArea textArea;
	private JComboBox comboBox;
	
	private String[] tage = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Sonnabend","Sonntag"};
	
	public NoteBookGUI(NoteBookData d) {
		this.setLayout(null);
		this.setTitle("NoteBook - GUI");
		this.setSize(400, 300);
		this.setLocation(300, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.gray);
		
		wochentagLabel = new JLabel("Wochentag:");
		wochentagLabel.setBounds(20, 5, 110, 30);
		this.add(wochentagLabel);
		
		termineLabel = new JLabel("Termine:");
		termineLabel.setBounds(160, 5, 110, 30);
		this.add(termineLabel);
		
		textArea = new JTextArea("");
		textArea.setBounds(160, 30, 200, 200);
		this.add(textArea);
		
		comboBox = new JComboBox<String>(tage);
		comboBox.setBounds(20, 30, 110, 30);
		this.add(comboBox);	
		
		anzeigeButton = new JButton("Anzeigen");
		anzeigeButton.setBounds(20, 100, 110, 20);
		this.add(anzeigeButton);
		
		speicherButton = new JButton("Speichern");
		speicherButton.setBounds(20, 130, 110, 20);
		this.add(speicherButton);
		
		clearButton = new JButton("Clear");
		clearButton.setBounds(20, 160, 110, 20);
		this.add(clearButton);

		beendenButton = new JButton("Beenden");
		beendenButton.setBounds(20, 190, 110, 20);
		this.add(beendenButton);
		
		beendenButton.addActionListener(e -> {System.out.println("gedrückt");});
	}
}
