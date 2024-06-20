package VOL4.tabuadaMultiplicacao;

import java.util.Scanner;

public class TabuadaMultiplicacao implements Tabuada{

    Scanner leitura = new Scanner(System.in);
    int resultado;

    public void tabuada(){
        System.out.println("Qual tabuada você deseja?");
        int numero = leitura.nextInt();
        mostrarTabuada(numero);
    }

    @Override
    public void mostrarTabuada(int numero) {
        int contadora = 1;
       while (contadora <= 10) {
            resultado = numero * contadora;
           System.out.println(numero + " x " + contadora + " = " + resultado);
           contadora++;
       }
    }
}
