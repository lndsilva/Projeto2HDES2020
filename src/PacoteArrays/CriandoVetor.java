package PacoteArrays;

public class CriandoVetor {
    public static void main(String[] args) {
        
        //Declarando um vetor
        //int numeros[];
        
        //Criando um vetor ou instanciando
        //numeros = new int[5];
        
        //Declarar e construir o vetor
        
        int numeros[] = new int[5];
        
        String nomes [] = new String[5];
               
        //Criando os vetores e inicializando.        
        String siglaEst [] = {"SP","RJ","TO","MA","PE"};
        boolean flag [] = {true, false};
        
        //Inserir os valores no vetor ou inicializando o vetor
        numeros[0]=150;
        numeros[1]=80;
        numeros[2]=50;
        numeros[3]=90;
        numeros[4]=67;
        
        nomes[0]="Maria";
        nomes[1]="João";
        nomes[2]="Pedro";
        nomes[3]="Paulo";
        nomes[4]="Lucas";
        
        //Imprimir os valores do vetor
        System.out.println("Imprimindo o vetor de números inteiros");
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        
        System.out.println("Imprimindo o vetor de Strings");
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);
        System.out.println(nomes[3]);
        System.out.println(nomes[4]);
        
        System.out.println("Imprimindo o vetor de estados");
        System.out.println(siglaEst[0]);
        System.out.println(siglaEst[1]);
        System.out.println(siglaEst[2]);
        System.out.println(siglaEst[3]);
        System.out.println(siglaEst[4]);
        
        System.out.println("Imprimindo o vetor de flags");
        System.out.println(flag[0]);
        System.out.println(flag[1]);
        
        
    }
    
}
