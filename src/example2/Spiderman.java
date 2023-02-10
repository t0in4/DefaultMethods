package example2;

public class Spiderman implements Movable, Jumpable{
    @Override
    public void jump() {

    }

    @Override
    public void stepAhead() {

    }
    @Override
    public void turnLeft() {

    }

    @Override
    public void turnLeftJump() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void turnRightJump() {

    }

    @Override
    public void turnAround() {
        Jumpable.super.turnAround();
    }


}
