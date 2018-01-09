package com.fngame.farm.etypes;

/**
 * Created by qingyu on 2017/12/29 /15:11
 */
public enum EPetSkillType {
    /**
     * Search e pet skill type.寻物
     */
    SEARCH,
    /**
     * Steal e pet skill type.偷窃
     */
    STEAL,
    /**
     * Trick e pet skill type.捣乱
     */
    TRICK;

    /**
     * Id int.
     *
     * @return the int
     */
    public int ID(){
        switch (this){
            case SEARCH: return  1;
            case STEAL:return 2;
            case TRICK:return 3;

        }

        return 0;
    }
}