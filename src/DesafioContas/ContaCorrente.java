package DesafioContas;

public class ContaCorrente extends Conta {

    public double rendimentoMensal() {
        double rendimentoMensal = 1000.00;
        System.out.println("Rendimento mensal Conta Corrente: " + rendimentoMensal * 0.03);

        return rendimentoMensal;
    }

}
