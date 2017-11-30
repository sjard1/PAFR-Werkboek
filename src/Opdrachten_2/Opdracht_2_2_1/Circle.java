package Opdrachten_2.Opdracht_2_2_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public class Circle extends Shape {

    public Circle(int newx, int newy, int newwidth) {
        super(newx, newy, newwidth);
    }

    @Override
    protected void draw() {

        System.out.println("Drawing a Circle at:(" + this.newx + ", " + newy +
                "), width " + this.newwidth);
    }

    @Override
    protected void rMoveTo(int x, int y) {

    }
}
