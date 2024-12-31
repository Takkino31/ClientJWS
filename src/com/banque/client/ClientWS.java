package com.banque.client;

import java.util.List;

public class ClientWS {
    public static void main(String[] args) {
        BanqueWs stub = new BanqueServiceService().getBanqueWsPort();
        double res = stub.conversionEuroToDh(800);
        System.out.println("La valeur de 800 euros en diram est : "+res);

        Compte cp = stub.getCompte(1L);
        System.out.println(cp.getSolde());
        System.out.println("----------------");
        List<Compte> comptes = stub.getComptes();
        for (Compte c : comptes) {
            System.out.println("Le solde du compte est "+c.getSolde());
            System.out.println("----------------");
        }
    }
}
