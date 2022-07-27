package model;

public class FrieseToerist extends Wachter {
    public FrieseToerist(HuisjeVrijNL huisjeVrijNL) {
        this.huisjeVrijNL = huisjeVrijNL;
        this.huisjeVrijNL.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Dizze huzen binne frijlitten: " + huisjeVrijNL.getHuizen());
    }
}
