package Model;

public class Automovel {
    private String placa;
    private String descricao;
    private String marca;
    private int ano;
    
    public Automovel(String placa,String descricao,String marca,int ano){
        this.placa=placa;
        this.descricao=descricao;
        this.marca=marca;
        this.ano=ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String Placa) {
        this.placa = Placa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
   
        public void imprimeInformacoes(){
            System.out.println("Placa: "+this.getPlaca()+","+this.getDescricao()+" ,"+" Marca: "+this.getMarca()+" ,"+" Ano do carro: "+this.getAno()+"\n");
            
}    
        
        }

