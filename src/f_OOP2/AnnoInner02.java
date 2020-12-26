package f_OOP2;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnoInner02 {
	public static void main(String[] args) {
		Button b = new Button();
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("1번 버튼 눌림");
				
			}
		});		//여기까지 매개변수
	}

}
