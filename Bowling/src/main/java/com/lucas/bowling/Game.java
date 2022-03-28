package com.lucas.bowling;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private static final Integer STRIKE_POINTS = 10;
    private static final Integer FRAMES = 10;

    private final List<Integer> pinsKnockedDown = new ArrayList<>();

    public void roll(Integer num){
        pinsKnockedDown.add(num);
    }

    public Integer score(){
        int totalPoints = 0;
        int rolls = 0;
        for(int frame = 0; frame < FRAMES; frame++){
            if(isNotIndexOut(rolls)) {
                if (isStrike(rolls)) {
                    totalPoints += getStrikePoints(rolls);
                } else if (isSpare(rolls)) {
                    totalPoints += getSparePoints(rolls);
                } else {
                    totalPoints += getPointsOfthisFrame(rolls);
                }
                rolls += 2;
            }
        }
        return totalPoints;
    }

    private Integer getPointsOfthisFrame(Integer roll){
        if (isNotIndexOut(roll + 1)){
            return pinsKnockedDown.get(roll) + pinsKnockedDown.get(roll + 1);
        }
        return pinsKnockedDown.get(roll);
    }

    private Integer getSparePoints(Integer roll){
        return STRIKE_POINTS + pinsKnockedDown.get(roll + 2);
    }

    private Integer getStrikePoints(Integer roll){
        Integer points = STRIKE_POINTS;
        if (isNotIndexOut(roll + 1)){
            points += pinsKnockedDown.get(roll + 1);
        }
        if (isNotIndexOut(roll + 2)){
            points += pinsKnockedDown.get(roll + 2);
        }
        return points;
    }

    private Boolean isSpare(Integer roll){
        if(isNotIndexOut(roll + 1)){
            return (pinsKnockedDown.get(roll) + pinsKnockedDown.get(roll + 1)) == STRIKE_POINTS;
        }
        return false;
    }

    private Boolean isStrike(Integer roll){
        return pinsKnockedDown.get(roll).equals(STRIKE_POINTS);
    }

    private Boolean isNotIndexOut(Integer rolls){
        return rolls < pinsKnockedDown.size();
    }
}
