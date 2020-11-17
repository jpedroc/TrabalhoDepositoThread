public class Deposito {
    private Long quantidadeCaixas;

    public Deposito() {
        this.quantidadeCaixas = 0l;
    }

    public void retirar() {
        this.quantidadeCaixas -= 1l;
    }

    public void colocar() {
        this.quantidadeCaixas += 1l;
    }

    public Long getQuantidadeCaixas() {
        return quantidadeCaixas;
    }
}
