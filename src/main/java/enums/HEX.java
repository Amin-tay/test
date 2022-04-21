package Enums;

public enum HEX {
    DESERT (0,0,0,-0.33,1),
    MEADOW(2,0,0,-0.33,1),
    HILL(0,2,0,+0.25,2),
    MOUNTAIN(0,0,0,0,-1),
    OCEAN(0,0,0,0,-1),
    PLAIN(1,1,0,-0.33,1),
    SNOW (0,0,0,-0.33,1),
    TUNDRA(1,0,0,-0.33,1);



    private int food;
    private int production;
    private int gold;
    private double battleEfficacy;
    private int MP;

    HEX(int food, int production, int gold, double battleEfficacy, int MP) {
        this.food = food;
        this.production = production;
        this.gold = gold;
        this.battleEfficacy = battleEfficacy;
        this.MP = MP;

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

}
