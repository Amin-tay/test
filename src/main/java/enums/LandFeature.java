package Enums;

public enum LandFeature {
    VALLEY(2, 0, 0, -0.33, 1, new HEX[]{HEX.DESERT, HEX.HILL, HEX.MEADOW, HEX.PLAIN}),
    JUNGLE(1, 1, 0, 0.25, 2, new HEX[]{HEX.DESERT, HEX.HILL, HEX.MEADOW, HEX.PLAIN}),
    ICE(0, 0, 0, 0, -1, new HEX[]{HEX.TUNDRA}),
    MASSIVE_FOREST(1, -1, 0, 0.25, 2, new HEX[]{HEX.HILL, HEX.PLAIN, HEX.MEADOW}),
    LAGOON(-1, 0, 0, -0.33, 2, null),
    OASIS(3, 0, 1, -0.33, 1, null);

    private int food;
    private int production;
    private int gold;
    private double battleEfficacy;
    private int MP;
    private HEX[] canBeFindOn;

    LandFeature(int food, int production, int gold, double battleEfficacy, int MP, HEX[] canBeFindOn) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficacy = battleEfficacy;
        this.MP = MP;
        this.canBeFindOn = canBeFindOn;

    }

    public int getFood() {
        return food;
    }

    public int getProduction() {
        return production;
    }

    public int getGold() {
        return gold;
    }

    public double getBattleEfficacy() {
        return battleEfficacy;
    }

    public int getMP() {
        return MP;
    }

    public HEX[] getCanBeFindOn() {
        return canBeFindOn;
    }
}
