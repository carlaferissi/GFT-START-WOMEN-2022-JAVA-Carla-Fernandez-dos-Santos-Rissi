package DesafioContas;

public class ContaPoupanca extends Conta {

    public double rendimentoMensal() {
        double rendimentoMensal = 1000.00;
        System.out.println("Rendimento mensal Conta Poupança: " + rendimentoMensal * 0.05);

        return rendimentoMensal;
    }

}
