package Controllers;

public class BalanceController extends BasicController {

    public double visualizarSaldo() {

        return conta.getSaldo();

    }
}
