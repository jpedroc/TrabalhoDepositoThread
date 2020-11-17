public class ProjetoDeposito {
    public static void main(String[] Args) {
        Deposito deposito = new Deposito();
        Produtor prod1 = new Produtor(deposito, 1l);
        Produtor prod2 = new Produtor(deposito, 2l);
        Produtor prod3 = new Produtor(deposito, 3l);
        Consumidor cons1 = new Consumidor(deposito, 4l);
        Consumidor cons2 = new Consumidor(deposito, 5l);

        prod1.start();
        prod2.start();
        prod3.start();
        cons1.start();
        cons2.start();
    }
}
