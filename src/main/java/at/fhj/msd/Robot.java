package at.fhj.msd;

public class Robot extends Punkt implements Movable {

    protected static int count = 1;
    protected int id;
    protected int stepSize;

    public Robot(int x, int y, int stepSize) {

        super(x, y);
        this.stepSize = stepSize;
        this.id = count++;
        

    }

    @Override
    public String toString() {
        return String.format("robot#<%d>(%d,%d)", this.id, this.x, this.y);
    }

    @Override
    public void moveUp() {

        this.y += this.stepSize;
    }

    @Override
    public void moveDown() {

        this.y -= this.stepSize;
    }

    @Override
    public void moveRight() {
        this.x += this.stepSize;
    }

    @Override
    public void moveLeft() {

        this.x -= this.stepSize;
    }

}
