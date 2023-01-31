# Atividade Aula Java SENAI 
## sa01aplicacao3


Este programa tem a finalidade de resolver a terceira atividade da lista de exercicios


3 - (vai multiplicar a quantidade de assentos pela quantidade de aviões, considere que cada avião possui 17 assentos)

Prints da tela
Ao executar: 

![Print 1](https://user-images.githubusercontent.com/86980974/215863601-300f95b8-1e32-4fac-a3ed-9866bf73af3a.PNG)


Resultado


![print2](https://user-images.githubusercontent.com/86980974/215863630-befa4cc6-0d70-4141-be16-12675b037114.PNG)


----------------------------------------------------------------------------------

Código da classe principal

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
    
----------------------------------------------------------------------------------

Código da classe CalculaBO

package br.com.senaitagua.sa1.bo;

public class CalculaBO {
	
	public int Multiplica(int qtdcadeiras, int qtdavioes) {
		return qtdcadeiras*qtdavioes;
		

}
}
