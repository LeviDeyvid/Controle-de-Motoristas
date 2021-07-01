package View;

import Model.Multa;
import Model.Motorista;
import Model.Moto;
import Model.Caminhao;
import Model.Automovel;
import java.util.Scanner;

public class Veiculo {
    public static void main(String[] args) {
        		
	Scanner leia = new Scanner(System.in);
       int menu;
       do{
        System.out.println("=-=-=-=-=-=-=-=  Selecione uma opção. =-=-=-=-=-=-=-=-");
        System.out.println("Digite [1] - Para exibir todas as multas.                          ");
        System.out.println("Digite [2] - Para exibir todos os carros da empresa.         ");
        System.out.println("Digite [3] - Para exibir todos os Motorista da empresa.     ");
        System.out.println("Digite [0] - Para sair");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-");
        menu = leia.nextInt();
        switch (menu) {
            case 1:
                System.out.println("\n-----------------Todas as Multas-----------------");
                Multa multa =  new Multa("Info da multa: avançar sinal vermelho","Gravissima",7,293.00);
                multa.multas();
                Multa multa1 = new Multa("Info da multa: Estacionar veiculo na faixa de pedestre","Leve",3,88.00);
                multa1.multas();
                Multa multa2 = new Multa("Info da multa: parar na faixa de pedestre","Leve",3,88.00);
                multa2.multas();
                Multa multa3 = new Multa("Info da multa: Estacionar em local inapropriado","Grave",5,190.00);
                multa3.multas();
                Multa multa4 = new Multa("Info da multa: Não usar cinto de segurança","Grave",5,190.00);
                multa4.multas();
                Multa multa5 = new Multa("Info da multa: Retorno em local proibido","Gravissima",7,293.00);
                multa5.multas();
                Multa multa6 = new Multa("Info da multa: Excesso de velocidade","media",4,130.00);
                multa6.multas();
                Multa multa7 = new Multa("Info da multa: Transitar em local/horario nao permitido","Media",4,130.00);
                multa7.multas();
                Multa multa8 = new Multa("Info da multa: Transitar em faixa de onibus","Grave",5,190.00);
                multa8.multas();
                Multa multa9 = new Multa("Info da multa: Buzinar em local proibido","Leve",3,88.00);
                multa9.multas();
                break;
            case 2:
                System.out.println("\n=-=-=-=-=-Todos os veiculos da empresa-=-=-=-=-=-=");
                Automovel automovel = new Automovel("EME6565","Hb20","Hyundai",2018);
                automovel.imprimeInformacoes();
                Automovel automovel1 = new Automovel("ABG9632","Hb20","Hyundai",2018);
                automovel1.imprimeInformacoes();
                Automovel automovel2 = new Automovel("HGF9874","Polo","Volkswagen",2017);
                automovel2.imprimeInformacoes();
                Automovel automovel3 = new Automovel("JKH3210","Polo","Volkswagen",2017);
                automovel3.imprimeInformacoes();
                Moto moto1 = new Moto("FTY5588","CG 150 TITAN","Honda",2017);
                moto1.imprimeInformacoes();
                Moto moto2 = new Moto("RPQ9078","CG 150 TITAN","Honda",2017);
                moto2.imprimeInformacoes();
                Moto moto3 = new Moto("OBE9632","CG 150 TITAN","Honda",2018);
                moto3.imprimeInformacoes();
                Caminhao caminhao1 = new Caminhao("TRE9745","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2,2019);
                caminhao1.imprimeInformacoes();
                Caminhao caminhao2 = new Caminhao("qwn9710","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2,2019);
                caminhao2.imprimeInformacoes();
                Caminhao caminhao3 = new Caminhao("MKL5961","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2,2020);
                caminhao3.imprimeInformacoes();
                break;
            case 3:
                System.out.println("\n-=-=-=-=-=-Informações de motoristas-=-=-=-=-=-=");
                Motorista motorista = new Motorista("Eme6565","Hb20","Hyundai",2018,"Levi Deyvid",9845466,
                        725855,"B","Info multa: Excesso de velocidade,",4,130.00);
                motorista.imprimeInformacoes();
                
                Motorista motorista1 = new Motorista("TRE9745","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2019,
                "Joao Lucas",9871258,55587740,"D","Info da multa: Retorno em local proibido",7,293.00);
                motorista1.imprimeInformacoes();
                
                Motorista motorista2 = new Motorista("HFG9874","Polo","VOLKSWAGEN",2017,
                "Carlos Augusto",98964418,585587041,"B","Info da multa: Não usar cinto de segurança",5,190.00);
                motorista2.imprimeInformacoes();
                
                Motorista motorista3 = new Motorista("FTY5588","CG 150 TITAN","Honda",2017,
                "Jose Oliveira",98711658,785127640,"A","Info da multa: Buzinar em local proibido",3,88.00);
                motorista3.imprimeInformacoes();
                
                Motorista motorista4 = new Motorista("ABG9632","Hb20","Hyundai",2018,
                "Ricardo Silva",95984710,697054851,"A,B","Info da multa: Transitar em faixa de onibus",5,190.00);
                motorista4.imprimeInformacoes();
                
                Motorista motorista5 = new Motorista("JKH3210","Polo","VOLKSWAGEN",2017,
                "Alef Santos",99844120,487915530,"B","Info da multa: Estacionar em local inapropriado",5,190.00);
                motorista5.imprimeInformacoes();
                
                Motorista motorista6 = new Motorista("RPQ9078","CG 150 TITAN","Honda",2017,
                "Antonio Ferreira",9896680,668844450,"A","Info da multa: Transitar em horario/local nao permitido",4,130.00);
                motorista6.imprimeInformacoes();
                
                Motorista motorista7 = new Motorista("QWN9710","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2019,
                "Marcos Oliveira",99687110,869887740,"D","Info da multa: Parar na faixa de pedestre",3,88.00);
                motorista7.imprimeInformacoes();
                
                Motorista motorista8 = new Motorista("MKL5961","CONSTELLATION VOLKSWAGEN","VOLKSWAGEN",2020,
                "Paulo Henrique",98712581,596607985,"D","Info da multa: Estacionar na faixa de pedestre",3,88.00);
                motorista8.imprimeInformacoes();
                
                Motorista motorista9 = new Motorista("OBE9632","CG 150 TITAN","Honda",2018,
                "Jhonathan ribeiro",989821066,158796200,"A","Info da multa: Avançar sinal vermelho",7,293.00);
                motorista9.imprimeInformacoes();
                break;
                
            default:
        }
    }while(menu != 0);
        System.out.println("Saindo..");
}
}