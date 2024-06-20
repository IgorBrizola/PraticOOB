package VOL4.conversorTemperatura;

import java.util.Scanner;

public class ConversorTemperaturaPadrao implements ConversorTemperatura  {


    Scanner leitura = new Scanner(System.in);

    public void saberTemperaturaC() {
        System.out.println("Qual temperatura deseja saber de C° para F° ?");
        double f = leitura.nextDouble();
        System.out.println("A temperatura em F° é de: " + celsiusParaFahrenheit(f));
    }

    public void saberTemperaturaF() {
        System.out.println("Qual temperatura deseja saber de F° para C° ?");
        double c = leitura.nextDouble();
        System.out.println("A temperatura em C° é de: " +  fahrenheitParaCelsius(c));

    }

    @Override
    public double celsiusParaFahrenheit(double c) {
        return 9 * c / 5 + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double f) {
        return 5*(f-32)/9;
    }
}
