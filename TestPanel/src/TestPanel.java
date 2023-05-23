import javax.swing.*;
import java.awt.*;
class NorthPanel extends JPanel
{
	public NorthPanel()
	{
		setBackground(Color.LIGHT_GRAY);
		setLayout(new FlowLayout());
		add(new JButton("Open"));
		add(new JButton("Read"));
		add(new JButton("Close"));
		
	}
}
class CenterPanel extends JPanel
{
	public CenterPanel()
	{
		setLayout(null);
		JLabel la = new JLabel("Hello Java!");
		la.setLocation(100,50);
		la.setSize(100,20);
		
		add(la);
	}
}
public class TestPanel extends JFrame
{
	TestPanel()
	{
		setTitle("Open Challenge 8");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		NorthPanel NP= new NorthPanel();
		CenterPanel CP= new CenterPanel();
		
		add(NP,BorderLayout.NORTH);
		add(CP,BorderLayout.CENTER);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new TestPanel();
	}
}
