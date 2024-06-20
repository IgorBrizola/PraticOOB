package VOL3.conta;

public class ContaBancaria {


    private String pessoa;
    protected  int saldo;


    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void depositar(int valor) {
        saldo += valor;
        System.out.println("Deposito feito com sucesso!");
        System.out.println("Saldo Atualizado: $" + saldo);
    }

    public int sacar(int valor){
        if (saldo <= valor){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Saque efetuado com sucesso! Saldo atualizado: ");
        return saldo;
    }

    public void consultarSaldo(){
        System.out.println("Saldo Atual: " + saldo);
    }


}
