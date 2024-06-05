package VOL2.ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria contaBruce = new ContaBancaria();

        contaBruce.setTitular("Bruce Wayne");
        contaBruce.setNumeroConta(23122005);

        contaBruce.exibeConta();

        contaBruce.depositaDinheiro(1000);
        contaBruce.sacarDinheiro(1050);


    }
}
