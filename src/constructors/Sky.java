package constructors;

public class Sky {
    /*
    Creat a constructor that takes both color and visibleStatrs and set them accordingly
    */
    public Sky(String colorCode){
        this.color= colorCode;
    }
    String color;
    int visibleStarts;
    public void info(){
        System.out.println("\nColor: " + color);
        System.out.println("Visible stars: " + this.visibleStarts);
    }

    public static void main(String[] args){
        Sky refSky = new Sky("Blue");
        System.out.println(refSky.color);
        Sky s2 = new Sky("Yellow", 7);
        s2.info();
        refSky.info();
    }

    /*
    Creat a constructor that takes both color and visibleStatrs and set them accordingly
    */
    public Sky(String color, int visibleStarts){
        this.color = color;
        this.visibleStarts = visibleStarts;

    }

}
