package Model;

import Model.Automovel;

public class Motorista extends Automovel  {
   private String nome;
   private int telefone;
   private int numeroCnh;
   private String categoriaCnh;
   private String multaDescricao;
   private int pontos;
   private double valor;
   
      public Motorista(String placa,String descricao,String marca, int ano,
              String nome,int telefone,int numeroCnh,String categoriaCnh,String multaDescricao,int pontos,double valor) {
        super(placa, descricao, marca, ano);
        this.nome=nome;
        this.telefone=telefone;
        this.numeroCnh=numeroCnh;
        this.categoriaCnh=categoriaCnh;
        this.multaDescricao=multaDescricao;
        this.pontos=pontos;
        this.valor=valor;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public int getNumeroCnh() {
        return numeroCnh;
    }

    public void setNumeroCnh(int numeroCnh) {
        this.numeroCnh = numeroCnh;
    }

    public String getCategoriaCnh() {
        return categoriaCnh;
    }

    public void setCategoriaCnh(String categoriaCnh) {
        this.categoriaCnh = categoriaCnh;
    }
    
    public String getMultaDescricao() {
        return multaDescricao;
    }

    public void setMultaDescricao(String multaDescricao) {
        this.multaDescricao = multaDescricao;
    }

   @Override
    public void imprimeInformacoes(){
        System.out.println("Placa do Carro: "+this.getPlaca()+" Veiculo: "+this.getDescricao()+" Marca do veiculo: "
                +this.getMarca()+" Ano do veiculo: "+this.getAno()+"\nNome do Motorista: "+this.getNome()+" contato: "+
                this.getTelefone()+" Numero da Cnh: "+this.getNumeroCnh()+" Categoria da Cnh: "+this.getCategoriaCnh()+
                "\n"+this.getMultaDescricao()+" Pontos de multa: "+this.getPontos()+" Valor da multa: "+this.getValor()+
                "\n");            
        }
}

