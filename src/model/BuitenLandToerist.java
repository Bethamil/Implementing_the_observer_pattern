package model;

public class BuitenLandToerist extends Toerist {
    public BuitenLandToerist(HuisjeVrijNL huisjeVrijNL) {
        this.huisjeVrijNL = huisjeVrijNL;
        this.huisjeVrijNL.attach(this);
    }

    @Override
    public void update() {
        System.out.println("These houses have become available: " + huisjeVrijNL.getHuizen());
    }
}
