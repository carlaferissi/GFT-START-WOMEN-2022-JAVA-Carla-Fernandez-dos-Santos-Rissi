import DesafioContas.Conta;
import DesafioContas.ContaCorrente;
import DesafioContas.ContaPoupanca;
import DesafioSerVivo.Vegetal;

public class Main {

    public static void main(String[] args) {

        Conta corrente = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();

        poupanca.rendimentoMensal(0.05);
        corrente.rendimentoMensal(0.03);
    }

}
