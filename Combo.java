public class Combo {
    private String descricao;
    private double preco;
    private Sobremesa sobremesa = new Sobremesa();
    private Bebida bebida = new Bebida();
    private Burguer burguer = new Burguer();
    
    public String CriarCombo(int tipo){
        if (tipo == 1) {
            this.descricao = "Combo Plus";
            this.preco = 1.5;
            this.burguer.setGramas(300);
            this.bebida.setML(150);
            this.sobremesa.setTamanho("médio");
        }

        else if (tipo == 2) {
            this.descricao = "Combo Max";
            this.preco = 3.5;
            this.burguer.setGramas(450);
            this.bebida.setML(450);
            this.sobremesa.setTamanho("grande");
        }
        return ("O combo escolhido foi: " + this.descricao + " (R$ "+this.preco+") - Hamburguer " + this.burguer.getGramas() + "g, bebida " + this.bebida.getML() + "ml e sobremesa de tamanho " + this.sobremesa.getTamanho() +".");
    }
}