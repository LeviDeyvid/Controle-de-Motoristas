package Model;

import Model.Automovel;

public class Moto extends Automovel {
private boolean bauleto;

    public Moto(String placa, String descricao, String marca, int ano) {
        super(placa, descricao, marca, ano);
        this.bauleto=true;
    }

    public boolean isBauleto() {
        return bauleto;
    }

    public void setBauleto(boolean bauleto) {
        this.bauleto = bauleto;
    }

    @Override
    public void imprimeInformacoes(){
        System.out.println("Placa: "+this.getPlaca()+","+this.getDescricao()+" ,"+" Marca: "+this.getMarca()+" ,"+" Bauleto 45L: "+this.isBauleto()+" ,"+" Ano do carro: "+this.getAno()+"\n");
         {
            
        }
    }
    @Override
    public String toString(){
        return this.getPlaca()+this.getDescricao()+this.getMarca()+this.getAno();
    }
}
