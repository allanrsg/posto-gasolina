//Desenvolvido por Allan Gomes
//Canoas, 11 de Março de 2020

import java.util.Scanner;

public class Posto {
    public static void main(String[] args) {
        mostraMenu();
    }

    static Scanner sc = new Scanner(System.in);
    static String nome = "Ulbra";
    static BombaCombustivel bomba1 = new BombaCombustivel("gasolina", 4.5, 56);
    static BombaCombustivel bomba2 = new BombaCombustivel("gasolina", 4.5, 500);

    public static BombaCombustivel escolheBomba(){
        if (bomba1.getQuantidadeDeCombustivel() >= bomba2.getQuantidadeDeCombustivel()){
            return bomba1;
        }else{
            return bomba2;
        }
    }

    public static void mostraMenu(){
        int op=0;

        do {
            System.out.println("\nBem vindo ao posto " + nome + ": Escolha sua opção para abastecimento");

            if (bomba1.getTipoDeCombustivel() != "gasolina" && bomba2.getTipoDeCombustivel() != "gasolina"){
                System.out.println("\nAVISO: Não há bombas com gasolina! \n");
            }

            System.out.println("\n1 - Abastecimento por valor (R$)");
            System.out.println("2 - Abastecimento por quantidade de litros");
            System.out.println("3 - Sair");
            System.out.println("\nInsira a opção desejada: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    System.out.println("Insira o valor que deseja abastecer: ");
                    double valor = sc.nextDouble();
                    if (valor < 0){
                        System.out.println("\nERRO! Não é possível informar valor negativo");
                    }
                    else {
                        if (escolheBomba().getQuantidadeDeCombustivel() - (valor / escolheBomba().getValorPorLitro()) >= 0) {
                            System.out.printf("\nTotal de litros abastecidos: %.2f%n", escolheBomba().abastecerPorValor(valor));
                        }
                        else {
                            System.out.println("ERRO! Abastecendo a quantidade informada, a bomba ficará negativa.");
                        }
                    }
                break;
                case 2:
                    System.out.println("Insira a quantidade de litros que deseja abastecer");
                    double litros = sc.nextDouble();
                    if (litros < 0){
                        System.out.println("\nERRO! Não é possível informar quantiadade negativa: ");
                    }
                    else {
                        if (escolheBomba().getQuantidadeDeCombustivel() - litros >= 0) {
                            System.out.printf("\nTotal a pagar R$%.2f%n", escolheBomba().abastecerPorLitro(litros));
                        }
                        else{
                            System.out.println("ERRO! Abastecendo a quantidade informada, a bomba ficará negativa.");
                        }
                    }
                break;
                case 3:
                    System.out.println("\nVocê encerrou o programa!");
                    System.out.println("Agradecemos a preferência!");
                break;
                default:
                    System.out.println("Você inseriu uma opção incorreta!");
                break;
            }
        }while (op!=3);
    }
}
