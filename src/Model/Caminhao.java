package Model;

import Model.Automovel;

public class Caminhao extends Automovel{
  private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
  
    public Caminhao(String placa, String descricao, String marca,int eixos, int ano) {
        super(placa, descricao, marca, ano);
        this.eixos=eixos;
    }

    @Override
    public void imprimeInformacoes(){
        System.out.println("Placa: "+this.getPlaca()+","+this.getDescricao()+" ,"+" Marca: "+this.getMarca()+" ,"+" Quantidade de Eixos: "+this.getEixos()+" ,"+" Ano do carro: "+this.getAno()+"\n");
    }

    }
