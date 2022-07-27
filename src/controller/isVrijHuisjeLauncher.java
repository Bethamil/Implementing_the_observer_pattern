package controller;

import model.*;

/**
 * @author Emiel Bloem
 * <p>
 * Implementing the Observer Pattern
 */
public class isVrijHuisjeLauncher {
    public static void main(String[] args) {
        HuisjeVrijNL huisjeVrijNL = new HuisjeVrijNL();

        new BinnenlandToerist(huisjeVrijNL);
        new BuitenLandToerist(huisjeVrijNL);
        new FrieseToerist(huisjeVrijNL);

        System.out.println("__________________________________\nEerste huisje toegevoegd\n__________________________________");
        huisjeVrijNL.setHuizen(new Huis("Saskia"));
        System.out.println("__________________________________\nMeerdere huisjes toegevoegd\n__________________________________");
        huisjeVrijNL.setHuizen(new Huis("Brinkzicht"));
        huisjeVrijNL.setHuizen(new Huis("Mariahoeve"));
        huisjeVrijNL.setHuizen(new Huis("Knibbelknabbelhuisje"));
        huisjeVrijNL.setHuizen(new Huis("huuske"));


    }
}
