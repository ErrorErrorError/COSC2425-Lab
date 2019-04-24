package asg7;
/**  implementation of the view of two different stack implementations
 *   modeled with a stack engine
 *  that models/uses two stacks and allows a few operations on those stacks
 *  @author: LJBaker
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class StackQueueViewImpl extends JPanel implements ActionListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	JButton pushButton;
	JButton popButton;
	JButton clearStackButton;
	JButton showRearButton;
	JButton addButton;
	JButton removeButton;
	JButton fullButton;
	JButton peekButton;
	JButton showFrontButton;
	JButton clearQueueButton;
	JButton maxSizeButton;
	JButton emptyButton;

	JPanel stackButtonPanel ;
	JPanel queueButtonPanel;
	StackPanel stackPanel;
	QueuePanel queuePanel;
	StackEngine stackEngine;
	QueueEngine queueEngine;

	ChangeListener stackEngineListener;
	ChangeListener queueEngineListener;

	// default constructor, receives the stack engine model it is displaying and controlling
	public StackQueueViewImpl(StackEngine aStackEngine, QueueEngine aQueueEngine)
	{
		super();
		this.setPreferredSize(new Dimension(StackQueueFrame.FRAME_WIDTH-20, StackQueueFrame.FRAME_HEIGHT - 100));
		this.setLayout(new BorderLayout());
		this.stackEngine = aStackEngine;
		this.queueEngine = aQueueEngine;
		//create a "listener" for the stack engine, so if that engine changes, it can respond
		stackEngineListener = new ChangeListener()
		{
			public void stateChanged(ChangeEvent e){
				update();
			}

		};
		this.stackEngine.addChangeListener(stackEngineListener); // add listener to stackEngine for notification
		queueEngineListener = new ChangeListener()
		{
			public void stateChanged(ChangeEvent e){
				update();
			}

		};
		//create a "listener" for the queue engine, so if that engine changes, we can respond
		this.queueEngine.addChangeListener(queueEngineListener);
		init();
	}
	// initializes the view - all the widgets and listeners, sets up the view
	private void init()
	{
		this.pushButton = new JButton("Push");
		this.popButton = new JButton("Pop");
		this.showRearButton = new JButton("Show Rear");
		this.addButton = new JButton("Add to Queue");
		this.removeButton = new JButton("Remove from Queue");
		this.peekButton = new JButton("Peek at Stack");
		this.showFrontButton = new JButton("Show Front");
		this.clearStackButton = new JButton("Clear Stack");
		this.clearQueueButton = new JButton("Clear Queue");
		this.maxSizeButton = new JButton("Max Size (Both)");

		this.fullButton = new JButton("Check Full (Both)");
		this.emptyButton = new JButton("Check Empty (Both)");
		this.stackPanel = new StackPanel(stackEngine);  // create a Stack Panel (view) and send it the engine it is "modeling"
		this.queuePanel = new QueuePanel(queueEngine);  // create a Queue Panel (view) and send it the engine it is "modeling"

		stackButtonPanel = new JPanel();		  // used to hold all stack operation buttons
		stackButtonPanel.setLayout(new GridLayout(2,4));  // 1 row of 6 (change as more or less buttons are used)
		stackButtonPanel.add(pushButton);			// now add buttons to the panel
		stackButtonPanel.add(popButton);
		stackButtonPanel.add(fullButton);
		stackButtonPanel.add(peekButton);
		stackButtonPanel.add(clearStackButton);
		stackButtonPanel.add(maxSizeButton);
		stackButtonPanel.add(emptyButton);

		queueButtonPanel = new JPanel();			// used to hold all queue operation buttons - currently 3 but more should be added
		queueButtonPanel.setLayout(new GridLayout(2,4));
		queueButtonPanel.add(addButton);
		queueButtonPanel.add(removeButton);
		queueButtonPanel.add(showFrontButton);
        queueButtonPanel.add(showRearButton);
        queueButtonPanel.add(clearQueueButton);


		this.add(stackButtonPanel, BorderLayout.NORTH);  // this is the controller panel, add the stack button panel to the top across
		this.add(queuePanel,  BorderLayout.EAST);		  // add remaining components to this controller panel
		this.add(stackPanel, BorderLayout.WEST);
		this.add(queueButtonPanel,  BorderLayout.SOUTH);  // add queue button panel to the bottom

		pushButton.addActionListener(this);
		popButton.addActionListener(this);
		showRearButton.addActionListener(this);
		addButton.addActionListener(this);
		removeButton.addActionListener(this);
		fullButton.addActionListener(this);
		peekButton.addActionListener(this);
		showFrontButton.addActionListener(this);
		clearStackButton.addActionListener(this);
		clearQueueButton.addActionListener(this);
		maxSizeButton.addActionListener(this);
		emptyButton.addActionListener(this);
	}
	//method called when an ChangeEvent is fired in the model
	// updates data on the view which will reflect any changes made to the model
	private void update()
	{
		// repaint all models (engines)
		repaint();
	}

	// HANDLES all button actions, listeners for each button
	public void actionPerformed(ActionEvent e) {

		if(e.getSource().equals(pushButton))
		{
			String item = JOptionPane.showInputDialog(this, "Enter value to push", "");
			if(item != null&& item.length() != 0)
				stackEngine.push(item);
		}
		else if (e.getSource().equals(popButton))
		{
			stackEngine.pop();  // note we popped the engine and it recovers the value popped
		}

		else if (e.getSource().equals(addButton))
		{
			String item = JOptionPane.showInputDialog(this, "Enter value to add to queue:", "");
			if(item != null && item.length() != 0)
			     queueEngine.add(item);
		}
		else if (e.getSource().equals(removeButton))
		{
			queueEngine.remove();  // note we remove
		}
		else if (e.getSource().equals(showRearButton))
		{
			queueEngine.showRear();
		}
		else if (e.getSource().equals(fullButton))
		{
			queueEngine.testFull();
			stackEngine.testFull();
		}
		else if(e.getSource().equals(peekButton))
		{
			stackEngine.peek();
		}
		else if(e.getSource().equals(showFrontButton))
		{

			queueEngine.showFront();

		}
		else if(e.getSource().equals(clearStackButton))
		{
			stackEngine.clear();
		}
		else if(e.getSource().equals(clearQueueButton))
        {
            queueEngine.clear();
        }
		else if(e.getSource().equals(maxSizeButton))
        {
            stackEngine.showMaxSize();
            queueEngine.showMaxSize();
        }
		else if(e.getSource().equals(emptyButton))
        {
            stackEngine.testEmpty();
            queueEngine.testEmpty();
        }

		//stackArea.setText(actionText);
	}

} // end of StackQueueViewImpl class


