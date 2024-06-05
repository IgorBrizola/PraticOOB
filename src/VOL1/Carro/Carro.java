package VOL1.Carro;

import java.time.LocalDate;

public class Carro {

    String modelo;
    int anoDeLancamento;
    String cor;
    LocalDate hoje = LocalDate.now();


    void exibeFichaTecnica(){
        System.out.println("Modelo Do Carro: " + modelo);
        System.out.println("Cor Do Carro: " + cor);
        System.out.println("Ano De Lançamento Do Carro: " + anoDeLancamento);
        System.out.println("Idade Do Carro: " + exibeIdade());
    }

    int exibeIdade(){
     return  hoje.getYear() - anoDeLancamento;
    }
}
