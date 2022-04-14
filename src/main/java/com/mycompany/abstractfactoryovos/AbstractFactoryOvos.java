package com.mycompany.abstractfactoryovos;

import java.util.Scanner;

public class AbstractFactoryOvos {

    public static void main(String[] args) {
        FabricaDeOvos ovoNestle = new FabricaNestle();
        FabricaDeOvos ovoGaroto = new FabricaGaroto();
        FabricaDeOvos ovoLacta = new FabricaLacta();

        OvoDePascoa ovo1 = ovoNestle.criarOvo1();
        //ovo1.verInformacoes();

        OvoDePascoa ovo2 = ovoNestle.criarOvo2();
        //ovo2.verInformacoes();

        OvoDePascoa ovo3 = ovoNestle.criarOvo3();
        //ovo3.verInformacoes();

        OvoDePascoa ovo4 = ovoGaroto.criarOvo1();
        //ovo4.verInformacoes();

        OvoDePascoa ovo5 = ovoGaroto.criarOvo2();
        //ovo5.verInformacoes();

        OvoDePascoa ovo6 = ovoGaroto.criarOvo3();
        //ovo6.verInformacoes();

        OvoDePascoa ovo7 = ovoLacta.criarOvo1();
        //ovo7.verInformacoes();

        OvoDePascoa ovo8 = ovoLacta.criarOvo2();
        //ovo8.verInformacoes();

        OvoDePascoa ovo9 = ovoLacta.criarOvo3();
        //ovo9.verInformacoes();

        System.out.println("Escolha a marca do seu ovo...\n"
                + "Digite 1, para selecionar Nestle\n"
                + "Digite 2, para selecionar Garoto\n"
                + "Digite 3, para selecionar Lacta\n");
        Scanner scanner1 = new Scanner(System.in);
        int marcaLida = Integer.parseInt(scanner1.nextLine());

        if (marcaLida == 1) {
            System.out.println("Muito bem, para a marca Nestle temos as opções...\n"
                    + "Digite 1, para selecionar Alpino\n"
                    + "Digite 2, para selecionar Nestle Classic\n"
                    + "Digite 3, para selecionar Kit Kat\n");
            Scanner scanner2 = new Scanner(System.in);
            int ovoLido = Integer.parseInt(scanner2.nextLine());
            if (ovoLido == 1) {
                ovo1.verInformacoes();
                return;
            }
            if (ovoLido == 2) {
                ovo2.verInformacoes();
                return;
            }
            if (ovoLido == 3) {
                ovo3.verInformacoes();
                return;
            } else {
                System.out.println("Erro, campo preenchido de forma invalida!");
            }
        }
        if (marcaLida == 2) {
            System.out.println("Muito bem, para a marca Garoto temos as opções...\n"
                    + "Digite 1, para selecionar Crocante\n"
                    + "Digite 2, para selecionar Talento\n"
                    + "Digite 3, para selecionar Baton\n");
            Scanner scanner2 = new Scanner(System.in);
            int ovoLido = Integer.parseInt(scanner2.nextLine());
            if (ovoLido == 1) {
                ovo4.verInformacoes();
                return;
            }
            if (ovoLido == 2) {
                ovo5.verInformacoes();
                return;
            }
            if (ovoLido == 3) {
                ovo6.verInformacoes();
                return;
            } else {
                System.out.println("Erro, campo preenchido de forma invalida!");
            }
        }
        if (marcaLida == 3) {
            System.out.println("Muito bem, para a marca Lacta temos as opções...\n"
                    + "Digite 1, para selecionar Lacta ao Leite\n"
                    + "Digite 2, para selecionar Oreo\n"
                    + "Digite 3, para selecionar Sonho de Valsa\n");
            Scanner scanner2 = new Scanner(System.in);
            int ovoLido = Integer.parseInt(scanner2.nextLine());
            if (ovoLido == 1) {
                ovo7.verInformacoes();
                return;
            }
            if (ovoLido == 2) {
                ovo8.verInformacoes();
                return;
            }
            if (ovoLido == 3) {
                ovo9.verInformacoes();
                return;

            } else {
                System.out.println("Erro, campo preenchido de forma invalida!");
            }
        }

    }
}
