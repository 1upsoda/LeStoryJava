package story.controller;

import story.view.StoryFrame;
import story.view.StoryPanel;
import story.model.StoryUser;

import story.view.StoryFrame;



public class StoryController
{

	private StoryFrame baseFrame;
	public void start()
	{
			StoryPanel myPanel = (StoryPanel) baseFrame.getContentPane();
//			String startMessage;
//			myPanel.displayTextToUser(startMessage);
//			
		
	}
	public StoryFrame getBaseFrame() 
	{
		return baseFrame;
	}
/**
 * sets up the base frame
 * @param baseFrame
 */
	public void setBaseFrame(StoryFrame baseFrame) 
	{
		this.baseFrame = baseFrame;
	
	}
	public StoryController()

	{

		baseFrame = new StoryFrame(this);
	}
}
