package Opdrachten_2.Opdracht_2_2_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public abstract class Shape {

    int newx, newy, newwidth;

    public Shape(int newx, int newy, int newwidth){
        this.newx = newx;
        this.newy = newy;
        this.newwidth = newwidth;
    }

    protected abstract void draw();

    protected abstract void rMoveTo(int x, int y);
}
