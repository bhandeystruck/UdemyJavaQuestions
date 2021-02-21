package wallArea;

public class wall {


    private double width;
    private double height;

   wall(double width, double height){
       if (width < 0){
           setWidth(0);
       }
       else if (height < 0){
           setHeight(0);
       }
       else {
           setWidth(width);
           setHeight(height);
       }
   }


    public void setHeight(double height) {
       if (height < 0){
           height = 0;
       }
        this.height = height;
    }

    public void setWidth(double width) {
       if (width<0){
           width = 0;
       }
       this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public static void getArea(wall wall){
       int area = (int)(wall.height * wall.width) ;
        System.out.println(area);
    }
}
