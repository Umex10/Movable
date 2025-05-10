package at.fhj.msd;

public class Vehicle extends Movable {

    protected String type;
    protected int x;
    protected int y;
    protected int speed = 0;
    protected int acceleration;
    protected int deceleration;

    public Vehicle(String type, int x, int y, int acceleration, int deceleration) {
        this.type = type;
        this.x = x;
        this.y = y;

        if (acceleration < 0 || deceleration < 0) {
            throw new IllegalArgumentException("acceleration and deceleration can't be under 0");
        }
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    @Override
    public String toString() {
        return String.format("<%s>(%d, %d) speed=(<%d>)", this.type, this.x, this.y, this.speed);
    }

    public void setSpeedZero() {
        if (this.speed < 0) {
            this.speed = 0;
        }
    }

    @Override
    public void moveUp() {

        this.speed += acceleration;
        this.y += this.speed;
    }

    @Override
    public void moveDown() {
        this.speed -= deceleration;
        setSpeedZero();
        this.y += this.speed;
    }

    @Override
    public void moveRight() {
        this.x += (int) (this.speed * 0.9);
    }

    @Override
    public void moveLeft() {
        this.x -= (int) (this.speed * 0.9);
    }

}
