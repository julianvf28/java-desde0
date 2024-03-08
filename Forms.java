import javax.swing.*;
import java.awt.event.*;

public class Forms extends JFrame implements ActionListener {

	private JButton boton1, boton2, boton3, botonExit;
	private JLabel label1, label2;

	public Forms() {

		setLayout(null);

		boton1 = new JButton("Botón 1");
		boton1.setBounds(10,100,90,30);
		add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton("Botón 2");
		boton2.setBounds(110,100,90,30);
		add(boton2);
		boton2.addActionListener(this);

		boton3 = new JButton("Botón 3");
		boton3.setBounds(210,100,90,30);
		add(boton3);
		boton3.addActionListener(this);

		botonExit = new JButton("Salir");
		botonExit.setBounds(320,100,90,30);
		add(botonExit);
		botonExit.addActionListener(this);

		label1 = new JLabel("etiqueta 1 : esperando acción");
		label1.setBounds(10,10,350,30); 
		add(label1);

		label2 = new JLabel("segunda etiqueta: esperando segunda acción");
		label2.setBounds(10,25,350,30);
		add(label2);
	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource()==boton1){
			label1.setText("se ke dio click a botón 1");
		}

		if (e.getSource()==boton2){
			label2.setText("El botón 2 fue precionado");
		}

		if (e.getSource()==boton3){
			label1.setText("Etiqueta 1 reseteada");
			label2.setText("Etiqueta 2 reseteada");
		}

		if( e.getSource()==botonExit ){
			System.exit(0);
		}

	}

	public static void main( String args[] ) {
		Forms forms1 = new Forms();
		forms1.setBounds(0,0,480,620);
		forms1.setVisible(true);
		forms1.setResizable(false);
		forms1.setLocationRelativeTo(null);
	}

}