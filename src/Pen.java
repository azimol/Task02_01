import java.awt.*;

/**
 * Created by Marina on 13.12.2015.
 */
public class Pen {

    private Color color;
    private int thickness;

    public Pen(int thickness, Color color) {
        this.thickness = thickness;
        this.color = color;
    }

    public boolean equals(Pen pen){
        if(this.color == pen.color && this.thickness == pen.thickness)
            return true;
        return false;
    }

    public int hashCode(){
        return color.hashCode()^thickness;
    }

    public String toString(){
        return "Color: " + color.getRed() + "/" + color.getGreen() + "/" + color.getBlue() +
                "; Thickness: " + ((Integer)thickness).toString();
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getThickness() {
        return thickness;
    }

    public Color getColor() {
        return color;
    }
}
