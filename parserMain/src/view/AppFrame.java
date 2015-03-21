package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map.Entry;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import textParser.TextParser;
import json.GameEvent;
import json.JsonParser;

import java.awt.Font;

public class AppFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private GameEvent gameEvent;
	private JsonParser jsonParser;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_1_n;
	private JTextField textField_2_n;
	private JTextField textField_3_n;
	private JTextField textField_4_n;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppFrame frame = new AppFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppFrame() {
		jsonParser = new JsonParser();
		gameEvent = new GameEvent();

		
		setTitle("Event Manager 2000");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel, BorderLayout.NORTH);

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(textField);
		textField.setColumns(60);

		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel_1.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		contentPane.add(panel_1, BorderLayout.SOUTH);

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("FUCK OFF");
			}
		});
		btnSave.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSave.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(btnSave);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);

		JLabel lblEventname = new JLabel("event_name:");
		lblEventname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventname.setBounds(10, 41, 178, 14);
		panel_4.add(lblEventname);

		TextParser textParser = new TextParser();
		final Properties fromTextFile = textParser
				.getFileProperties("src/parserBitch.property");
		
		textField_1 = new JTextField();
		
		ArrayList<String> textField_1_suggestions = new ArrayList<String>();
		for (String name : fromTextFile.stringPropertyNames()){
			textField_1_suggestions.add(fromTextFile.get(name) + " -- " + name);
		}
		
		createSuggestor(this, textField_1, textField_1_suggestions);
		textField_1.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateNeighbour();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateNeighbour();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateNeighbour();
			}
			
			public void updateNeighbour(){
				String json = "";
				for(Entry<Object,Object> e : fromTextFile.entrySet()){
//					System.out.println(e.getKey());
					System.out.println(e.getKey()+ " " + e.getValue() + " " + textField_1.getText());
					if(textField_1.getText().equals((String)e.getValue())){
						json = (String) e.getKey();
						System.out.println("yes you are TRU");
						break;
					}
				}
				if(!textField_1_n.getText().contains(json)){
					textField_1_n.setText(json);
					System.out.println("setting JSON");
				}
			}

		});
		textField_1.setBounds(198, 35, 281, 20);
		panel_4.add(textField_1);
		textField_1.setColumns(80);

		JLabel lblEventdescription = new JLabel("event_description:");
		lblEventdescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventdescription.setBounds(10, 69, 178, 14);
		panel_4.add(lblEventdescription);

		textField_2 = new JTextField();
		textField_2.setColumns(80);
		textField_2.setBounds(198, 63, 281, 20);
		panel_4.add(textField_2);

		JLabel lblCustomeventtype = new JLabel("custom_event_type:");
		lblCustomeventtype.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomeventtype.setBounds(10, 97, 178, 14);
		panel_4.add(lblCustomeventtype);

		textField_3 = new JTextField();
		textField_3.setColumns(80);
		textField_3.setBounds(198, 91, 281, 20);
		panel_4.add(textField_3);

		JLabel lblCustomeventtitle = new JLabel("custom_event_title:");
		lblCustomeventtitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomeventtitle.setBounds(10, 125, 178, 14);
		panel_4.add(lblCustomeventtitle);

		textField_4 = new JTextField();
		textField_4.setColumns(80);
		textField_4.setBounds(198, 119, 281, 20);
		panel_4.add(textField_4);

		JLabel lblGame = new JLabel("GAME");
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGame.setForeground(Color.DARK_GRAY);
		lblGame.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGame.setBounds(198, 11, 153, 14);
		panel_4.add(lblGame);

		JLabel lblJson = new JLabel("JSON");
		lblJson.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJson.setForeground(Color.DARK_GRAY);
		lblJson.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblJson.setBounds(496, 11, 153, 14);
		panel_4.add(lblJson);

		textField_1_n = new JTextField();
		
		ArrayList<String> textField_1_n_suggestions = new ArrayList<String>();
		for (String name : fromTextFile.stringPropertyNames()){
			textField_1_n_suggestions.add(name + " -- " + fromTextFile.get(name));
		}
		
		createSuggestor(this, textField_1_n, textField_1_n_suggestions);
		textField_1_n.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				updateNeighbour();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				updateNeighbour();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				updateNeighbour();
			}
			
			public void updateNeighbour(){
				String game = fromTextFile.getProperty(textField_1_n.getText());
				if(!textField_1.getText().equals(game)){
					textField_1.setText(game);
					System.out.println("Setting game");
				}
			}

		});
		textField_1_n.setColumns(80);
		textField_1_n.setBounds(496, 35, 276, 20);
		panel_4.add(textField_1_n);

		textField_2_n = new JTextField();
		textField_2_n.setColumns(80);
		textField_2_n.setBounds(496, 63, 276, 20);
		panel_4.add(textField_2_n);

		textField_3_n = new JTextField();
		textField_3_n.setColumns(80);
		textField_3_n.setBounds(496, 91, 276, 20);
		panel_4.add(textField_3_n);

		textField_4_n = new JTextField();
		textField_4_n.setColumns(80);
		textField_4_n.setBounds(496, 119, 276, 20);
		panel_4.add(textField_4_n);

		JButton btnLoad = new JButton("Load");
		// btnLoad.setActionCommand("CompieJson");
		btnLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gameEvent = jsonParser.decodeJsonToEvent(textField.getText());
				textField_1.setText(gameEvent.getEvent_name());
				textField_2.setText(gameEvent.getEvent_description());
				textField_3.setText(gameEvent.getCustom_event_type());
				textField_4.setText(gameEvent.getCustom_event_title());
			}

		});
		panel.add(btnLoad);
	}

	public JTextField createSuggestor(final JFrame frame, JTextField f, final ArrayList<String> suggestions) {
		AutoSuggestor autoSuggestor = new AutoSuggestor(f, frame, null,
				Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
			@Override
			boolean wordTyped(String typedWord) {
				ArrayList<String> words = new ArrayList<String>();
				
				setDictionary(suggestions);

				return super.wordTyped(typedWord);// now call super to check for
													// any matches against
													// newest dictionary
			}
		};
		return f;
	}
}
