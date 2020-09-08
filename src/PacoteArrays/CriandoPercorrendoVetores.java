package PacoteArrays;

public class CriandoPercorrendoVetores {

    public static void main(String args[]) {
        //criando um vetor de nomes

        String[] nomes = new String[5];

        //Inserindo valores no vetor de nomes.
        nomes[0] = "Antônio";
        nomes[1] = "Joanita";
        nomes[2] = "Marieta";
        nomes[3] = "Alexandrina";
        nomes[4] = "Perla";

        //Percorrendo o vetor com estrutura de repetição        
        for (int i = 0; i < 5; i++) {
            System.out.println("Seu nome é " + nomes[i]);
        }
    }

}
