package com.fngame.farm.etypes;

/**
 * Created by zhuzhengqing on 2017/12/18.
 */
public enum EBuildingType {
    NPC,
    CROP,
    PROP,
    TREE,
    ANIMAL_HOUSE,
    ANIMAL,
    FACTORY,
    ROCK;
    public int ID() {
        switch (this) {
            case NPC:
                return 1;
            case CROP:
                return 2;
            case PROP:
                return 3;
            case TREE:
                return 4;
            case ANIMAL_HOUSE:
                return 5;
            case ANIMAL:
                return 6;
            case FACTORY:
                return 7;
            case ROCK:
                return 8;

        }
        return 0;
    }
}
