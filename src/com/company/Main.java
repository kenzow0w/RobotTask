package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = (int) (Math.random()*(10-1)+1);
        int y = (int) (Math.random()*(10-1)+1);

        Point point =  new Point(x, y);
        Robot robot = new Robot(3, 5, Direction.RIGHT);
        robot.getHome(robot);
        robot.getToTarget(point, robot);


    }
}
