package Runner;

import javafx.geometry.Rectangle2D;

public class LifeCount extends StaticThing{


    private Integer Nboflives;

    public LifeCount(double l, double h, String path) {
        super(l, h, path);
        this.Nboflives=5;

    }

    public Integer getNboflives() {
        return Nboflives;
    }

    public void lifelost(){
       this.Nboflives-=1;
       this.img.setViewport(new Rectangle2D(0,7+(5-this.Nboflives)*79,499,118));
    }
}
