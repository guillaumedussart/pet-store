package fr.diginamic.petstore.enumeration;

public enum FishLivEnv {

    /**
     *
     */
    FRESH_WATER("fresh_water",true),
    SEA_WATER("sea_water",false);

    private final String environnement;
    private final boolean seaWater;

    FishLivEnv(String environnement, boolean seaWater) {
        this.environnement = environnement;
        this.seaWater = seaWater;
    }


}
