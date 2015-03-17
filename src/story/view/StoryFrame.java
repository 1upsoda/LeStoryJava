package story.view;

import javax.swing.JFrame;

import story.controller.StoryController;
import javax.swing.JLabel;
import javax.swing.SpringLayout;

// Referenced classes of package string.view:

//            ChatbotPanel

public class StoryFrame extends JFrame

{

	private StoryPanel basePanel;
/**
 * puts the panel in the frame for th GUI
 * @param baseController
 */
	public StoryFrame(StoryController baseController)

	{

		basePanel = new StoryPanel(baseController);
		SpringLayout springLayout = (SpringLayout) basePanel.getLayout();

		setupFrame();

	}
/**
 * builds the frame of the window that holds the gui panel
 */
	private void setupFrame()

	{

		setContentPane(basePanel);

		setLocation(5, 6);

		setSize(400, 400);

		setResizable(false);

		setVisible(true);

	}
}
