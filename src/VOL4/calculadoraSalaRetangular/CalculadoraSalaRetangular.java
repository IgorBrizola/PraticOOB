package VOL4.calculadoraSalaRetangular;

import java.util.Scanner;

public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private Double largura;

    private Double altura;

    Scanner leitura = new Scanner(System.in);

    public void saberMedidas(){

        System.out.println("Qual é a altura da sala?");
        altura = leitura.nextDouble();

        System.out.println("Qual é a largura da sala?");
        largura = leitura.nextDouble();

        System.out.println("A area da sala é: " + calcularArea() + "metros");

        System.out.println("O perimetro da sala é: " + calcularPerimetro()  + "metros");

    }

    @Override
    public double calcularArea() {
        return getAltura() * getLargura();
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (getAltura() + getLargura());
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }
}
