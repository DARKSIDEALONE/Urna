package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println(".......URNA.......");
        System.out.println("(13) LULA MOLUSCO");
        System.out.println("(17) BOLSON NELSON");
        System.out.println("(23) CILOUCA GOMES");
        System.out.println(".......URNA.......");
        System.out.println("Digite (-1) pra sair...");

        int voto = sc.nextInt();
        int votosLulaMolusco = 0;
        int votosBolsonNelson = 0;
        int votosCiloucaGomes = 0;
        int votoTotal = 0;

        while (voto >= 0) {
            if (voto == 13) {
                votosLulaMolusco++;
                System.out.println("O seu voto foi computado para o candidato LULA MOLUSCO ");
            } else if (voto == 17) {
                votosBolsonNelson++;
                System.out.println("O seu voto foi computado para o candidato BOLSON NELSON ");
            } else if (voto == 23) {
                votosCiloucaGomes++;
                System.out.println("O seu voto foi computado para o candidato CILOUCA GOMES ");
            } else {
                System.out.println("Candidato incorreto ");
            }
        if (voto == 13 || voto == 17 || voto == 23) {
            votoTotal++;
            }
            System.out.println("Vote novamente: ");
            voto = sc.nextInt();
        }
        System.out.println(">>>>>>RESULTADO<<<<<<");
        System.out.println("TOTAL = " + votoTotal + " = 100%");
        double porcLulaMolusco = (100*votosLulaMolusco) / votoTotal;
        System.out.println("LULA MOLUSCO = " + porcLulaMolusco + "%");
        double porcBolsonNelso = (100*votosBolsonNelson) / votoTotal;
        System.out.println("BOLSON NELSON = " + porcBolsonNelso + "%");
        double porcCiloucaGomes = (100*votosCiloucaGomes) / votoTotal;
        System.out.println("CILOUCA GOMES = " + porcCiloucaGomes + "%");
        System.out.println(">>>>>>RESULTADO<<<<<<");

sc.close();
    }

}
