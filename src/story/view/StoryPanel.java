package story.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.SpringLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.*;

import story.model.StoryUser;
import story.controller.StoryController;

import java.awt.Font;

public class StoryPanel extends JPanel

{
	private int numberOfEntered;
/**
 * implements the controller so it can run
 */
	private StoryController baseController;
/**
 * creates the buttons that the program will use
 */
	
/**
 * creates the text field the user can type in
 */
	
	private ArrayList<String> randomKnowledge;
/**
 * creates the area the user can chat in	
 */
	private JTextArea chatArea;
/**
 * creates a pane for the previous chats to inhabit
 */
	private JScrollPane chatPane;
/**
 * creates the way everything will behave in the frame
 */
	private SpringLayout baseLayout;
/**	 
 * creates the 3 labels on the layout
 */
	private JLabel lblCrapBot;
/**
 * creates the button, label, chat box objects
 * @param baseController
 */
	public StoryPanel(StoryController baseController)

	{

		this.baseController = baseController;

		
		chatArea = new JTextArea(5, 25);
		chatPane = new JScrollPane(chatArea);

		randomKnowledge = new ArrayList<String>();
		baseLayout = new SpringLayout();
		
		
		lblCrapBot = new JLabel("Le Story");
		
		
		
		
		numberOfEntered = 0;

		setupPanel();

		setupLayout();

//		setupListeners();
		setupScrollPane();
		

	}
/**
 * sets the parameters for how the chat pane will work
 */
	private void setupScrollPane()
	{
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		chatArea.setEditable(false);
	}
/**
 * adds all of the buttons, labels, chat boxes to the panel to be used
 */
	private void setupPanel()

	{

		setBackground(Color.YELLOW);

		setLayout(baseLayout);

		
		this.add(chatPane);
		
		
		
		
		this.add(lblCrapBot);
		
		

		
	}
/**
 * puts all of the buttons, chat boxes, labels, everything from the GUI in the right places
 */
	private void setupLayout()

	{
		baseLayout.putConstraint(SpringLayout.WEST, chatPane, 60, SpringLayout.WEST, this);
		
		baseLayout.putConstraint(SpringLayout.NORTH, chatPane, 75, SpringLayout.NORTH, this);
		
		
		
		
		
		
		
		baseLayout.putConstraint(SpringLayout.NORTH, lblCrapBot, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, lblCrapBot, 107, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, lblCrapBot, -6, SpringLayout.NORTH, chatPane);
		
		lblCrapBot.setFont(new Font("Jing Jing", Font.BOLD, 34));
		
		
		
		
		

	}
}
	