package model;

public class BinnenlandToerist extends Toerist {
    public BinnenlandToerist(HuisjeVrijNL huisjeVrijNL) {
        this.huisjeVrijNL = huisjeVrijNL;
        this.huisjeVrijNL.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Deze huisjes zijn vrij gekomen: " + huisjeVrijNL.getHuizen());
    }
}
