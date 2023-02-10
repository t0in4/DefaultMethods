package example2;

interface Jumpable {
    void jump();
    void turnLeftJump();
    void turnRightJump();
    default void turnAround() {
        turnLeftJump();
        turnLeftJump();
    }

}
