public class Consumidor extends Thread{
    Deposito deposito;
    Long delayConsumo;

    public Consumidor(Deposito dep, Long delay) {
        this.deposito = dep;
        this.delayConsumo = delay;
    }

    @Override
    public void run() {
        try {
            while(true) {
                if(this.deposito.getQuantidadeCaixas() > 0){
                    sleep(this.delayConsumo * 1000);
                    this.deposito.retirar();
                    System.out.println("Consumidor: Removendo caixa... Caixas no depóstio: " + this.deposito.getQuantidadeCaixas());
                } else {
                    System.out.println("Consumidor: Aguardando caixas...");
                }
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
