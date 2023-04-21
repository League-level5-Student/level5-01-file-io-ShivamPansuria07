package _03_To_Do_List;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener{
	/*
	 * Create a program with five buttons, add task, view tasks, remove task, save list, and load list.
	 * When add task is clicked:
	 * 		Create a JOptionPane to ask the user for a task and add it to an ArrayList
	 * 
	 * When the view tasks button is clicked:
	 *		show all the tasks in the list
	 * 
	 * When the remove task button is clicked:
	 * 		Create a JOptionPane to prompt the user for which task to remove and take it off of the list.
	 * 
	 * When the save list button is clicked:
	 * 		Save the list to a file
	 * 
	 * When the load list button is clicked:
	 * 		Create a JOptionPane to Prompt the user for the location of the file and load the list from that file
	 * 
	 * When the program starts, it should automatically load the last saved file into the list. 
	 */
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	JButton remove = new JButton();
	JButton load = new JButton();
	ArrayList<String> arr = new ArrayList<String>();
	public static void main(String[] args) {
		ToDoList a = new ToDoList();
		a.setup();
	}
	void setup() {
		
	
		add.setText("add list");
		
		add.addActionListener(this);
		
		view.setText("view list");
		view.addActionListener(this);
		remove.setText("remove list");
		remove.addActionListener(this);
		JButton save = new JButton();
		save.setText("save list");
		save.addActionListener(this);
		load.setText("loat list");
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		panel.add(remove);
		panel.add(save);
		panel.add(load);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(add)) {
			String task = JOptionPane.showInputDialog("Enter a task: ");
			arr.add(task);
		}
		if(arg0.getSource().equals(view)) {
			for (int i = 0; i < arr.size(); i++) {
				System.out.println(arr.get(i));
			}
		}
		if(arg0.getSource().equals(remove)) {
			String remove = JOptionPane.showInputDialog("Which task do you want to remove?");
			for (int i = 0; i < arr.size(); i++) {
				if(arr.get(i)==remove) {
					arr.remove(i);
				}
				
			}
		}
	}
}
