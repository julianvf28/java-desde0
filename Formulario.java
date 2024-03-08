import javax.swing.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener{
	private JLabel label1;
	private JLabel label2;
	private JButton boton1;

	public Formulario(){
		setLayout(null);
		label1 = new JLabel("Julián Javier Valencia Farfán");
		label1.setBounds(10,40,200,30);
		add(label1);

		label2 = new JLabel("Ingrese su nombre");
		label2.setBounds(10,80,200,30);
		add(label2);

		boton1 = new JButton("Salir");
		boton1.setBounds(10,120,100,30);
		add(boton1);
		boton1.addActionListener(this);

	}

	public static void main(String[] args){
		Formulario formulario1 = new Formulario();
		formulario1.setBounds(0,0,450,300);
		formulario1.setVisible(true);
		formulario1.setLocationRelativeTo(null);
		formulario1.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if( e.getSource()==boton1 ){
			System.exit(0);
		}
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");		
	}
}