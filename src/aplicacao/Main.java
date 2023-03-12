package aplicacao;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Double n1,n2,n3,media;
        String primeiroNumero,segundoNumero,terceiroNumero;

        primeiroNumero = JOptionPane.showInputDialog("Entre com a primeira nota da Aluno: ");
        segundoNumero = JOptionPane.showInputDialog("Entre com a segunda nota do Aluno: ");
        terceiroNumero = JOptionPane.showInputDialog("Entre com a terceira nota do Aluno: ");

        n1 = Double.parseDouble(primeiroNumero);
        n2 = Double.parseDouble(segundoNumero);
        n3 = Double.parseDouble(terceiroNumero);

        media = (n1+n2+n3)/3;

        JOptionPane.showMessageDialog(null,"A media é do Aluno é : " + media, "Resultado da média.",JOptionPane.PLAIN_MESSAGE );
        System.exit(0);

    }
}
