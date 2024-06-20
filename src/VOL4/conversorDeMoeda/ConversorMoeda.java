package VOL4.conversorDeMoeda;

import java.util.Scanner;

public class ConversorMoeda implements ConversaoFinanceira {

    Scanner leitura = new Scanner(System.in);

    public void converter(){

        System.out.println("Qual a quantidade de dolar que possui?");
        double quantidade = Double.parseDouble(leitura.nextLine());

        converterDolarParaReal(quantidade);
    }

    @Override
    public double converterDolarParaReal(double dolar) {

        System.out.println("Qual a cotação do dolar atual?");
        double cotacao = Double.parseDouble(leitura.nextLine());

        System.out.println("Dolar: $ " + dolar);
        System.out.println("Real: R$ "  + dolar * cotacao);

        return dolar * cotacao;
    }


}
