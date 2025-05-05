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
        this.acceleration = acceleration;
        this.deceleration = deceleration;
    }

    @Override
    public String toString() {
        return String.format("<%s>(%d, %d) speed=(<%d>)", this.type, this.x, this.y, this.speed);
    }

    @Override
    public void moveUp() {
       this.speed += acceleration;
       this.y  += this.speed;
    }

    @Override
    public void moveDown() {
        this.speed -= acceleration;
        this.y  += this.speed;
    }

    @Override
    public void moveLeft() {
        this.x += this.speed * 0.9;
    }

    @Override
    public void moveRight() {
        this.x -= this.speed * 0.9;
    }
    
}
