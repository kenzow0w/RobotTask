package com.company;

public class Robot {


    int x;
    int y;
    Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;

    }

    public Robot getHome(Robot robot) {
        robot.x = x;
        robot.y = y;
        robot.direction = direction;
        if (x>0)
        {
            direction = Direction.LEFT;
            while(x > 0)
            {
                robot.stepForward(x, direction);
            }
        }
        if (x<0)
        {
            direction = Direction.RIGHT;
            while(x < 0)
            {
                robot.stepForward(x, direction);
            }
        }
        if (y>0)
        {
            direction = Direction.DOWN;
            while(y > 0)
            {
                robot.stepForward(y, direction);
            }
        }
        if (y<0)
        {
            direction = Direction.UP;
            while(y < 0)
            {
                robot.stepForward(y, direction);
            }
        }


        System.out.println("Текущие координаты робота: " + x + ": \n" + y+ ":");
        if (x == 0 || y == 0)
        {
            System.out.println("Робот вернулся в исходные координаты 0, 0");
        }
        return robot;
    }


    public Direction getDirection(Direction direction) {
        // текущее направление взгляда
        this.direction = direction;
        return direction;
    }

    public int getX(int x) {
        // текущая координата X
        return x;
    }

    public int getY(int y) {
        // текущая координата Y
        return y;
    }

    public void turnLeft(Direction direction) {
        // повернуться на 90 градусов против часовой стрелки
        if (direction == Direction.DOWN) {
            this.direction = Direction.RIGHT;
        }
        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        }
        if (direction == Direction.UP) {
            this.direction = Direction.LEFT;
        }
        if (direction == Direction.LEFT) {
            this.direction = Direction.DOWN;
        }
    }

    public void turnRight(Direction direction) {
        // повернуться на 90 градусов по часовой стрелке
        if (direction == Direction.DOWN) {
            this.direction = Direction.LEFT;
        }
        if (direction == Direction.LEFT) {
            this.direction = Direction.UP;
        }
        if (direction == Direction.UP) {
            this.direction = Direction.RIGHT;
        }
        if (direction == Direction.RIGHT) {
            this.direction = Direction.DOWN;
        }
    }

    public void stepForward(int x, Direction direction) {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
        if (direction == Direction.RIGHT) {
            this.x = x + 1;
        } if (direction == Direction.LEFT) {
            this.x = x - 1;
        } if (direction == Direction.UP) {
            this.y = y + 1;
        } if (direction == Direction.DOWN) {
            this.y = y - 1;
        }

    }

    public void getToTarget(Point point, Robot robot)
    {
        int x = point.getX();
        int y = point.getY();
        robot.direction = direction;
        if (x >0)
        {
            direction = Direction.RIGHT;
            while(robot.x < x)
            {
                robot.stepForward(x, direction);
            }
        }
        if (x < 0)
        {
            direction = Direction.LEFT;
            while(robot.x > x)
            {
                robot.stepForward(x, direction);
            }
        }
        if (y > 0)
        {
            direction = Direction.UP;
            while(robot.y > y)
            {
                robot.stepForward(y, direction);
            }
        }
        if (y < 0)
        {
            direction = Direction.DOWN;
            while(robot.y < y)
            {
                robot.stepForward(y, direction);
            }
        }
        System.out.println("Текущие координаты робота: " + x + ": \n" + y+ ":");

    }


}
