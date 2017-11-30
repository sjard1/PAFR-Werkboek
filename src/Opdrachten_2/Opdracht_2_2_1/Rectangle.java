package Opdrachten_2.Opdracht_2_2_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public class Rectangle extends Shape {
    int newheight;
    public Rectangle(int newx, int newy, int newwidth, int newheight ) {
        super(newx, newy, newwidth);
        this.newheight = newheight;
    }

    int getWidth() { return this.newwidth; }
    int getHeight() { return this.newheight; }


    @Override
    protected void draw() {
            System.out.println("Drawing a Rectangle at:(" + this.newx + ", " + newy +
                    "), width " + getWidth() + ", height " + getHeight());
    }

    @Override
    protected void rMoveTo(int x, int y) {
        this.newx = x;
        this.newy = y;
    }
}
