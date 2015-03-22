package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import textParser.TextParser;
import json.GameEvent;
import json.JsonParser;

import java.awt.Font;
import javax.swing.JScrollBar;

public class AppFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_eventName;
	private GameEvent gameEvent;
	private JsonParser jsonParser;
	private JTextField textField_eventDescription;
	private JTextField textField_eventType;
	private JTextField textField_eventTitle;
	private JTextField textField_longDescription;
	private JTextField textField_eventIcon;
	private JTextField textField_eventActionId;
	private JTextField eventActionData;
	private JTextField textField_requiredItems;
	private JTextField textField_eventTags;
	private JTextField textField_eventMinGoal;
	private JTextField textField_minGoalDescription;
	private JTextField textField_eventPriority;
	private JTextField textField_versionsList;
	private JTextField textField_isVip;
	private JTextField textField_countriesFilter;
	private JTextField textField_max_1;
	private JTextField textField_max_2;
	private JTextField textField_max_3;
	private JTextField textField_max_4;
	private JTextField textField_max_5;
	private JTextField textField_reward_1;
	private JTextField textField_reward_2;
	private JTextField textField_reward_3;
	private JTextField textField_reward_4;
	private JTextField textField_reward_5;
	private JTextField textField_amount_1;
	private JTextField textField_amount_2;
	private JTextField textField_amount_3;
	private JTextField textField_amount_4;
	private JTextField textField_amount_5;
	private JTextField textField_min_1;
	private JTextField textField_min_5;
	private JTextField textField_min_2;
	private JTextField textField_min_3;
	private JTextField textField_min_4;
	private JTextField textField_tournamentType;
	private JTextField textField_tournamentDelivery;
	private JTextField textField_leaderboardOrder;
	private JTextField textField_leaderboardType;
	private JTextField textField_leaderboardGroupsize;
//	private JTextField textField_1_n;
//	private JTextField textField_2_n;
//	private JTextField textField_3_n;
//	private JTextField textField_4_n;
	

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
		
		setTitle("Event Manager 9000");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 700);
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

		createSaveButton(panel_1);

		JPanel panel_4 = new JPanel();
		contentPane.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(null);

		createGameHeder(panel_4);
		

		JLabel lblCustomeventtitle = new JLabel("custom_event_title:");
		lblCustomeventtitle.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomeventtitle.setBounds(10, 126, 202, 14);
		panel_4.add(lblCustomeventtitle);

		textField_eventTitle = new JTextField();
		textField_eventTitle.setColumns(80);
		textField_eventTitle.setBounds(222, 120, 289, 20);
		
		ArrayList<String> textField_4_suggestions = new ArrayList<String>();
		
		TextParser textParser = new TextParser();
		final Properties fromTextFile = textParser
				.getFileProperties("src/parserBitch.property");
		
		for (String name : fromTextFile.stringPropertyNames()){
			textField_4_suggestions.add(name + GameEvent.KEY_VALUE_SEPARATOR + fromTextFile.get(name));
		}
		
		createSuggestor(this, textField_eventTitle, textField_4_suggestions);
		panel_4.add(textField_eventTitle);

		JLabel lblCustomeventtype = new JLabel("custom_event_type:");
		lblCustomeventtype.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCustomeventtype.setBounds(10, 98, 202, 14);
		panel_4.add(lblCustomeventtype);

		textField_eventType = new JTextField();
		textField_eventType.setColumns(80);
		textField_eventType.setBounds(222, 92, 289, 20);
		
	ArrayList<String> textField_3_suggestions = new ArrayList<String>();
		
		for (String name : fromTextFile.stringPropertyNames()){
			textField_3_suggestions.add(name + GameEvent.KEY_VALUE_SEPARATOR + fromTextFile.get(name));
		}
		
		createSuggestor(this, textField_eventType, textField_3_suggestions);
		
		panel_4.add(textField_eventType);

		JLabel lblEventdescription = new JLabel("event_description:");
		lblEventdescription.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventdescription.setBounds(10, 70, 202, 14);
		panel_4.add(lblEventdescription);

		textField_eventDescription = new JTextField();
		textField_eventDescription.setColumns(80);
		textField_eventDescription.setBounds(222, 64, 289, 20);
		
		ArrayList<String> textField_2_suggestions = new ArrayList<String>();
		
		for (String name : fromTextFile.stringPropertyNames()){
			textField_2_suggestions.add(name + GameEvent.KEY_VALUE_SEPARATOR + fromTextFile.get(name));
		}
		
		createSuggestor(this, textField_eventDescription, textField_2_suggestions);
		
		panel_4.add(textField_eventDescription);

		JLabel lblEventname = new JLabel("event_name:");
		lblEventname.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventname.setBounds(10, 42, 202, 14);
		panel_4.add(lblEventname);

		textField_eventName = new JTextField();
		
		ArrayList<String> textField_1_suggestions = new ArrayList<String>();
		for (String name : fromTextFile.stringPropertyNames()){
			textField_1_suggestions.add(name + GameEvent.KEY_VALUE_SEPARATOR + fromTextFile.get(name));
		}
		
		createSuggestor(this, textField_eventName, textField_1_suggestions);
		textField_eventName.setBounds(222, 36, 289, 20);
		panel_4.add(textField_eventName);
		textField_eventName.setColumns(80);
		
		textField_longDescription = new JTextField();
		textField_longDescription.setColumns(80);
		textField_longDescription.setBounds(222, 151, 289, 20);
		panel_4.add(textField_longDescription);
		
		JLabel lblEventDesc = new JLabel("custom_event_long_description:");
		lblEventDesc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventDesc.setBounds(10, 157, 202, 14);
		panel_4.add(lblEventDesc);
		
		JLabel lblEventIconId = new JLabel("custom_event_icon_id:");
		lblEventIconId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventIconId.setBounds(10, 188, 202, 14);
		panel_4.add(lblEventIconId);
		
		textField_eventIcon = new JTextField();
		textField_eventIcon.setColumns(80);
		textField_eventIcon.setBounds(222, 182, 289, 20);
		panel_4.add(textField_eventIcon);
		
		JLabel lblEventActionId = new JLabel("custom_event_action_id:");
		lblEventActionId.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventActionId.setBounds(10, 219, 202, 14);
		panel_4.add(lblEventActionId);
		
		textField_eventActionId = new JTextField();
		textField_eventActionId.setColumns(80);
		textField_eventActionId.setBounds(222, 213, 289, 20);
		panel_4.add(textField_eventActionId);
		
		JLabel lblEventActionData = new JLabel("custom_event_action_data:");
		lblEventActionData.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventActionData.setBounds(10, 250, 202, 14);
		panel_4.add(lblEventActionData);
		
		eventActionData = new JTextField();
		eventActionData.setColumns(80);
		eventActionData.setBounds(222, 244, 289, 20);
		panel_4.add(eventActionData);
		
		JLabel lblEventRequiredItems = new JLabel("custom_event_requared_items:");
		lblEventRequiredItems.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEventRequiredItems.setBounds(10, 281, 202, 14);
		panel_4.add(lblEventRequiredItems);
		
		textField_requiredItems = new JTextField();
		textField_requiredItems.setColumns(80);
		textField_requiredItems.setBounds(222, 275, 289, 20);
		panel_4.add(textField_requiredItems);
		
		JLabel label = new JLabel("custom_event_tags");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(10, 312, 202, 14);
		panel_4.add(label);
		
		textField_eventTags = new JTextField();
		textField_eventTags.setColumns(80);
		textField_eventTags.setBounds(222, 306, 289, 20);
		panel_4.add(textField_eventTags);
		
		JLabel label_1 = new JLabel("custom_event_min_goals");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(10, 343, 202, 14);
		panel_4.add(label_1);
		
		textField_eventMinGoal = new JTextField();
		textField_eventMinGoal.setColumns(80);
		textField_eventMinGoal.setBounds(222, 337, 289, 20);
		panel_4.add(textField_eventMinGoal);
		
		JLabel label_2 = new JLabel("custom_event_min_goals_description");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(10, 374, 202, 14);
		panel_4.add(label_2);
		
		textField_minGoalDescription = new JTextField();
		textField_minGoalDescription.setColumns(80);
		textField_minGoalDescription.setBounds(222, 368, 289, 20);
		panel_4.add(textField_minGoalDescription);
		
		JLabel label_3 = new JLabel("custom_event_priority");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(10, 405, 202, 14);
		panel_4.add(label_3);
		
		textField_eventPriority = new JTextField();
		textField_eventPriority.setColumns(80);
		textField_eventPriority.setBounds(222, 399, 289, 20);
		panel_4.add(textField_eventPriority);
		
		JLabel label_4 = new JLabel("custom_event_versions_list");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(10, 436, 202, 14);
		panel_4.add(label_4);
		
		textField_versionsList = new JTextField();
		textField_versionsList.setColumns(80);
		textField_versionsList.setBounds(222, 430, 289, 20);
		panel_4.add(textField_versionsList);
		
		textField_isVip = new JTextField();
		textField_isVip.setColumns(80);
		textField_isVip.setBounds(222, 461, 289, 20);
		panel_4.add(textField_isVip);
		
		JLabel label_6 = new JLabel("custom_event_is_vip");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(10, 464, 202, 14);
		panel_4.add(label_6);
		
		textField_countriesFilter = new JTextField();
		textField_countriesFilter.setColumns(80);
		textField_countriesFilter.setBounds(222, 492, 289, 20);
		panel_4.add(textField_countriesFilter);
		
		JLabel label_7 = new JLabel("countries_filter");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(10, 495, 202, 14);
		panel_4.add(label_7);
		
		JLabel label_8 = new JLabel("leaderboard gifts");
		label_8.setHorizontalAlignment(SwingConstants.RIGHT);
		label_8.setBounds(717, 42, 202, 14);
		panel_4.add(label_8);
		
		textField_max_1 = new JTextField();
		textField_max_1.setColumns(80);
		textField_max_1.setBounds(733, 61, 37, 20);
		panel_4.add(textField_max_1);
		
		textField_max_2 = new JTextField();
		textField_max_2.setColumns(80);
		textField_max_2.setBounds(733, 92, 37, 20);
		panel_4.add(textField_max_2);
		
		textField_max_3 = new JTextField();
		textField_max_3.setColumns(80);
		textField_max_3.setBounds(733, 120, 37, 20);
		panel_4.add(textField_max_3);
		
		textField_max_4 = new JTextField();
		textField_max_4.setColumns(80);
		textField_max_4.setBounds(733, 151, 37, 20);
		panel_4.add(textField_max_4);
		
		textField_max_5 = new JTextField();
		textField_max_5.setColumns(80);
		textField_max_5.setBounds(733, 182, 37, 20);
		panel_4.add(textField_max_5);
		
		textField_reward_1 = new JTextField();
		textField_reward_1.setColumns(80);
		textField_reward_1.setBounds(780, 61, 219, 20);
		panel_4.add(textField_reward_1);
		
		textField_reward_2 = new JTextField();
		textField_reward_2.setColumns(80);
		textField_reward_2.setBounds(780, 92, 219, 20);
		panel_4.add(textField_reward_2);
		
		textField_reward_3 = new JTextField();
		textField_reward_3.setColumns(80);
		textField_reward_3.setBounds(780, 120, 219, 20);
		panel_4.add(textField_reward_3);
		
		textField_reward_4 = new JTextField();
		textField_reward_4.setColumns(80);
		textField_reward_4.setBounds(780, 151, 219, 20);
		panel_4.add(textField_reward_4);
		
		textField_reward_5 = new JTextField();
		textField_reward_5.setColumns(80);
		textField_reward_5.setBounds(780, 182, 219, 20);
		panel_4.add(textField_reward_5);
		
		textField_amount_1 = new JTextField();
		textField_amount_1.setColumns(80);
		textField_amount_1.setBounds(1009, 61, 37, 20);
		panel_4.add(textField_amount_1);
		
		textField_amount_2 = new JTextField();
		textField_amount_2.setColumns(80);
		textField_amount_2.setBounds(1009, 92, 37, 20);
		panel_4.add(textField_amount_2);
		
		textField_amount_3 = new JTextField();
		textField_amount_3.setColumns(80);
		textField_amount_3.setBounds(1009, 120, 37, 20);
		panel_4.add(textField_amount_3);
		
		textField_amount_4 = new JTextField();
		textField_amount_4.setColumns(80);
		textField_amount_4.setBounds(1009, 151, 37, 20);
		panel_4.add(textField_amount_4);
		
		textField_amount_5 = new JTextField();
		textField_amount_5.setColumns(80);
		textField_amount_5.setBounds(1009, 182, 37, 20);
		panel_4.add(textField_amount_5);
		
		textField_min_1 = new JTextField();
		textField_min_1.setColumns(80);
		textField_min_1.setBounds(686, 61, 37, 20);
		panel_4.add(textField_min_1);
		
		textField_min_5 = new JTextField();
		textField_min_5.setColumns(80);
		textField_min_5.setBounds(686, 182, 37, 20);
		panel_4.add(textField_min_5);
		
		textField_min_2 = new JTextField();
		textField_min_2.setColumns(80);
		textField_min_2.setBounds(686, 92, 37, 20);
		panel_4.add(textField_min_2);
		
		textField_min_3 = new JTextField();
		textField_min_3.setColumns(80);
		textField_min_3.setBounds(686, 120, 37, 20);
		panel_4.add(textField_min_3);
		
		textField_min_4 = new JTextField();
		textField_min_4.setColumns(80);
		textField_min_4.setBounds(686, 151, 37, 20);
		panel_4.add(textField_min_4);
		
		JLabel label_9 = new JLabel("tournament_type");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setBounds(545, 219, 202, 14);
		panel_4.add(label_9);
		
		textField_tournamentType = new JTextField();
		textField_tournamentType.setColumns(80);
		textField_tournamentType.setBounds(757, 213, 289, 20);
		panel_4.add(textField_tournamentType);
		
		textField_tournamentDelivery = new JTextField();
		textField_tournamentDelivery.setColumns(80);
		textField_tournamentDelivery.setBounds(757, 244, 289, 20);
		panel_4.add(textField_tournamentDelivery);
		
		JLabel label_10 = new JLabel("tournament_delivery");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setBounds(545, 250, 202, 14);
		panel_4.add(label_10);
		
		JLabel label_11 = new JLabel("leaderboard_order");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setBounds(545, 281, 202, 14);
		panel_4.add(label_11);
		
		textField_leaderboardOrder = new JTextField();
		textField_leaderboardOrder.setColumns(80);
		textField_leaderboardOrder.setBounds(757, 275, 289, 20);
		panel_4.add(textField_leaderboardOrder);
		
		textField_leaderboardType = new JTextField();
		textField_leaderboardType.setColumns(80);
		textField_leaderboardType.setBounds(757, 306, 289, 20);
		panel_4.add(textField_leaderboardType);
		
		JLabel label_12 = new JLabel("leaderboard_type");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setBounds(545, 312, 202, 14);
		panel_4.add(label_12);
		
		textField_leaderboardGroupsize = new JTextField();
		textField_leaderboardGroupsize.setColumns(80);
		textField_leaderboardGroupsize.setBounds(757, 337, 289, 20);
		panel_4.add(textField_leaderboardGroupsize);
		
		JLabel label_13 = new JLabel("leaderboard_group_size");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setBounds(545, 343, 202, 14);
		panel_4.add(label_13);
	}

	public JTextField createSuggestor(final JFrame frame, JTextField f, final ArrayList<String> suggestions) {
		AutoSuggestor autoSuggestor = new AutoSuggestor(f, frame, null,
				Color.WHITE.brighter(), Color.BLUE, Color.RED, 0.75f) {
			@Override
			boolean wordTyped(String typedWord) {
				setDictionary(suggestions);
				return super.wordTyped(typedWord);// now call super to check for
													// any matches against
													// newest dictionary
			}
		};
		return f;
	}
	
	private void createLoadButton(JPanel panel) {
		JButton btnLoad = new JButton("Load");
		// btnLoad.setActionCommand("CompieJson");
		btnLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				gameEvent = jsonParser.decodeJsonToEvent(textField.getText());
				textField_eventName.setText(gameEvent.getEvent_name());
				textField_eventDescription.setText(gameEvent.getEvent_description());
				textField_eventType.setText(gameEvent.getCustom_event_type());
				textField_eventTitle.setText(gameEvent.getCustom_event_title());
			}

		});
		panel.add(btnLoad);
	}


	private void createGameHeder(JPanel panel_4) {
		JLabel lblGame = new JLabel("GAME");
		lblGame.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblGame.setForeground(Color.DARK_GRAY);
		lblGame.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGame.setBounds(198, 11, 153, 14);
		panel_4.add(lblGame);
	}
	
	private void createSaveButton(JPanel panel_1) {
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("FUCK OFF");
				GameEvent event = new GameEvent();
				event.setEvent_name(textField_eventName.getText());
				event.setEvent_description(textField_eventDescription.getText());
				event.setCustom_event_type(textField_eventType.getText());
				event.setCustom_event_title(textField_eventTitle.getText());
				System.out.println(jsonParser.encodeJson(event));
			}
		});
		btnSave.setHorizontalAlignment(SwingConstants.RIGHT);
		btnSave.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_1.add(btnSave);
	}
}
