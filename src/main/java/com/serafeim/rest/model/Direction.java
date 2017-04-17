package com.serafeim.rest.model;


import org.apache.commons.lang3.StringUtils;

/**
 * TODO
 *
 * @author sekou
 * @since 4/17/2017
 */
public class Direction {

    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    private String direction;

    public Direction(String value){
        checkIfValid(value);
        this.direction = value;
    }

    private void checkIfValid(String value) {
        if(!StringUtils.equalsIgnoreCase(value, RIGHT) && !StringUtils.equalsIgnoreCase(value, LEFT)) {
            throw new RuntimeException("The directions must be right or left");
        }
    }

    /**
     * Returns the direction
     *
     * @return Returns the direction
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Sets the direction
     *
     * @param direction The direction to set
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }
}
