package Runner;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

    /** Classe qui définit les objets statiques notamment :
    * - Background
    * - Nombre de vie restantes
    */

public class StaticThing {
    private double length;
    private double height;
    private String path;
    protected ImageView img;
    private Integer Nboflives;

    public StaticThing(double l,double h,String path){
        this.path=path;
        Image spriteSheet = new Image(path);
        this.img = new ImageView(spriteSheet);
        this.length=l;
        this.height=h;
        img.setFitHeight(h);
        img.setFitWidth(l);
        img.setPreserveRatio(true);
    }


    public ImageView getImg() {
        return img;
    }


    public double getLength() {
        return length;
    }


    public double getHeight() {
        return height;
    }


    public String getPath() {
        return path;
    }


    public Integer getNboflives() {
        return Nboflives;
    }

    



}
