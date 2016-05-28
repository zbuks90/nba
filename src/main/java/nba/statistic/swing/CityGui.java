package nba.statistic.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import dao.CityDao;
import nba.statistic.entity.City;

public class CityGui extends JFrame {
	
	private static final long serialVersionUID = 4442929949892550939L;
	
	private JButton buttonOK;
	private JTextField cityName;

	public CityGui() {
		super("City Form");
		setVisible(true);
		setSize(350, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		getContentPane().setLayout(new FlowLayout());
		
		buttonOK=new JButton("OK");
		buttonOK.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				City c=new City();
				c.setName(cityName.getText());
				CityDao.saveCity(c);
			}
		});
		getContentPane().add(buttonOK);
		
		cityName=new JTextField("bfanfabf");
		getContentPane().add(cityName);
		
		getContentPane().validate();
		
	}
	
	//todo getAllCityies . ubaciti rucno u bazi 10 gradova
	
	public static void main(String[] args) {
		new CityGui();
	}

}
