public class BombaCombustivel {
    private String tipoDeCombustivel;
    private double valorPorLitro;
    private double quantidadeDeCombustivel;

    public BombaCombustivel(String tipoDeCombustivel, double valorPorLitro, double quantidadeDeCombustivel){
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public String getTipoDeCombustivel(){
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String combustivel){
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public double getValorPorLitro(){
        return valorPorLitro;
    }

    public void setValorPorLitro(double combustivel){
        this.valorPorLitro = valorPorLitro;
    }

    public double getQuantidadeDeCombustivel(){
        return quantidadeDeCombustivel;
    }

    public void setQuantidadeDeCombustivel(double qtd){
        this.quantidadeDeCombustivel = quantidadeDeCombustivel;
    }

    public double abastecerPorValor(double porValor){
        this.quantidadeDeCombustivel -= porValor * this.valorPorLitro;
        return porValor / this.valorPorLitro;
    }

    public double abastecerPorLitro(double porLitro){
        this.quantidadeDeCombustivel -= porLitro;
        return porLitro * this.getValorPorLitro();
    }
}
