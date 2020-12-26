package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner_01 {
	public static void main(String[] args) {
		
		Button b= new Button();
		ActionListener a1 = new EventHandler();
		b.addActionListener(a1);
	}
}



class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("1번 버튼 눌림");
		
	}
	
}