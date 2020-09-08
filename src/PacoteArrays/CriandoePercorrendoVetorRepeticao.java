package PacoteArrays;

import javax.swing.*;

public class CriandoePercorrendoVetorRepeticao {

    public static void main(String[] args) {
       
        //Declaração de criação do vetor
        double numeros[] = new double[5];

        //Percorrendo o vetor e inserindo os valores em cada posição
        for (int i = 0; i < 5; i++) {
            String aux = JOptionPane.showInputDialog(null, "Insira numeros: ");
            numeros[i] = Double.parseDouble(aux);
        }

        //Percorrendo o vetor e imprimindo os valores
        for (int i = 0; i < 5; i++) {
            System.out.println("Valores do vetor: "+ numeros[i]+" na posição: "+i);
        }
    }

}
