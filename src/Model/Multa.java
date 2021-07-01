package Model;

public class Multa {
   private String descricao;
   private String tipoMulta;
   private int pontos;
   private double valor;

   public Multa(String descricao,String tipoMulta,int pontos,double valor){
       this.descricao=descricao;
       this.tipoMulta=tipoMulta;
       this.pontos=pontos;
       this.valor=valor;
      
   }
       public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
       
    public String getTipoMulta() {
        return tipoMulta;
    }

    public int getPontos() {
        return pontos;
    }

    public double getValor() {
        return valor;
    }

    public void setTipoMulta(String tipoMulta) {
        this.tipoMulta = tipoMulta;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void multas(){
            System.out.println("Infrações de transito: "+this.getDescricao()+" tipo de multa: "+this.getTipoMulta()+
                    "\nPontos recebido pela multa: "+this.getPontos()+" Valor da multa: R$"+this.getValor()+
                    "\n");
        }
}
  