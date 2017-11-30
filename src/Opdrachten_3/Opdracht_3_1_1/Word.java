package Opdrachten_3.Opdracht_3_1_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public class Word implements Formaat {
    String text;

    @Override
    public void printInFormaat() {
        System.out.println("word: " + this.text);
    }

    @Override
    public void setText(String text) {
        this.text = text;
    }
}
