public class Lampada {
    private String modelo;
    private int potencia;
    private double preco;
    private int quantidadeEmEstoque;

    public Lampada(String modelo, int potencia, double preco, int quantidadeEmEstoque) {
        this.modelo = modelo;
        this.potencia = potencia;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque(){
        return quantidadeEmEstoque;
    }

    public void setQuantidadeEmEstoque(int quantidadeEmEstoque){
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }
    @Override
    public String toString() {
        return
                "Modelo " + modelo + "\n" +
                " Potencia " + potencia + " W\n "  +
                " Preço: " + preco + "\n" +
                " Quantidade Em Estoque: " + quantidadeEmEstoque;
    }


}
