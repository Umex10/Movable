package at.fhj.msd;

public class MovablePoint extends Punkt implements Movable {

    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);

        if (xSpeed < 0 || ySpeed < 0) {
            throw new IllegalArgumentException("Speed must be above 0");
        }

        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    //? Override toString()
    @Override
    public String toString() {
        return String.format("(%d, %d) speed=(%d, %d)", this.x, this.y, this.xSpeed, this.ySpeed);
    }

    //? Override move-Methods from abstract class Movable
    @Override
    public void moveUp() {
        this.y += this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += this.xSpeed;
    }

}
