public class Produtor extends Thread{
    Deposito deposito;
    Long delayProducao;

    public Produtor(Deposito dep, Long delay) {
        this.deposito = dep;
        this.delayProducao = delay;
    }

    @Override
    public void run() {
        try {
            while(true) {
                sleep(this.delayProducao * 1000);
                this.deposito.colocar();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
