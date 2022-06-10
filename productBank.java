package aplication.entites;

/**
 *
 * @author danie
 */
public class productBank {

    private String nome;
    private int conta;
    private double valorInicial;

    public productBank(String nome, int conta, double valorInicial) {
        this.nome = nome;
        this.conta = conta;
        this.valorInicial = valorInicial;
    }

    public productBank(String nome, int conta) {
        this.nome = nome;
        this.conta = conta;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getDepositoInicial() {
        return valorInicial;
    }

    public void setDepositoInicial(double depositoInicial) {
        this.valorInicial = depositoInicial;
    }

    public void removid(double valorInicial, double deposito) {
        this.valorInicial += deposito;

    }

    public void saque(double valorInicial, double saque) {
        this.valorInicial -= saque + 5;

    }

    public String toString() {
        return "Agencia: "
                + conta
                + " Titular: "
                + nome
                + " Saldo: $ "
                + String.format("%.2f: ", valorInicial);
    }

}
