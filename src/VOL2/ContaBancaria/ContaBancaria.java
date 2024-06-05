package VOL2.ContaBancaria;

public class ContaBancaria {
    private int numeroConta;
    private double saldo = 1000;
    private String titular;


    void exibeConta(){
        System.out.println("Titular Da Conta: " + titular);
        System.out.println("Saldo Da Conta: " + saldo);
        System.out.println("Numero Da Conta: " + numeroConta);
    }

    public void depositaDinheiro(double valor) {
         saldo += valor;
        System.out.println("""
                    Deposito efetuado com sucesso!
                      Saldo atualizado: """ + saldo);
    }

    public void sacarDinheiro(double valor) {

        if (valor <= saldo){
            saldo -= valor;
            System.out.println("""
                    Saque efetuado com sucesso!
                      Saldo atualizado: """ + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
