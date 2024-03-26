package empresa;

public class Desktop extends Computador {
    public double acessorios;

    public Desktop(int gbMemoria, int numProcessadores, double acessorios) {
        super(gbMemoria, numProcessadores);
        this.acessorios = acessorios;
    }

    @Override
    double calculaValor() {
        double total = gbMemoria * 200 + numProcessadores * 400 + acessorios;
        return total;
    }
}
