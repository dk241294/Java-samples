public class Point {
    private int x;
    private int y;
    Point(){

     }


    Point(int x,int y){
         this.x=x;
         this.y=y;
     }


     public void setX(int x){
         this.x=x;
     }



    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
         return distance(0,0);
    }

    public double distance (Point another){
         return  distance(another.x,another.y );
     }

    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }


}
