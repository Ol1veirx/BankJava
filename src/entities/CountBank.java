package entities;

public class CountBank {
    private int numeroDaConta;
    private String nomeTitular;
    private double valorDeposito;

    //CONSTRUTORES
    public CountBank (int numeroDaConta, String nomeTitular, double depositoInicial){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
        ValorDeposito(depositoInicial);
    }

    public CountBank(int numeroDaConta, String nomeTitular){
        this.numeroDaConta = numeroDaConta;
        this.nomeTitular = nomeTitular;
    }

    //GETTERS E SETTERS
    public int getNumeroDaConta(){
        return numeroDaConta;
    }

    public String getNomeTitular(){
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular){
        this.nomeTitular = nomeTitular;
    }


    public double getValorDeposito(){
        return valorDeposito;
    }

    //Metodos
    public void ValorDeposito(double valorDeposito){
        this.valorDeposito += valorDeposito;
    }

    public void ValorSacado(double valorSaque) {
        valorDeposito -= valorSaque + 5;
    }

    public String toString(){
        return ("Conta: "
                + numeroDaConta
                + ", "
                + "Cliente: "
                + nomeTitular
                + ", "
                + "Balanço: R$"
                + valorDeposito
        );
    }


}
