package br.com.senaitagua.sa1.app3;

import javax.swing.JOptionPane;

import br.com.senaitagua.sa1.bo.CalculaBO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdcadeiras = 17;
		int qtdavioes;
		
		qtdavioes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de aviões"));
		
		if(qtdavioes <= 0){
			JOptionPane.showMessageDialog(null, "Quantidade incorreta");
		}
		else if (qtdavioes > 100) {
			JOptionPane.showMessageDialog(null, "Quantidade incorreta");
		}
		
		else {
		CalculaBO cbo = new CalculaBO();
		
		int valort = cbo.Multiplica(qtdcadeiras,qtdavioes);
		
		JOptionPane.showMessageDialog(null, "O quantidade de cadeiras nos aviões é "+ valort + " cadeiras");
		}

	}

}
