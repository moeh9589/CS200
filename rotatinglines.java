public class rotatinglines {
  public static void main(String[] args) {
    // canvas setup
    StdDraw.setCanvasSize(1000,1000);
    StdDraw.setXscale(-1000,1000);
    StdDraw.setYscale(-1000,1000);
    StdDraw.setPenRadius(.02);
    StdDraw.setPenColor(StdDraw.BLACK);
    int i = 0;
    double a = 0;
    double b = 0 ;
    int angle = -45;
    StdDraw.circle(.5,.5,.2);
    while(i < 100){
      //random points on screen
      for (int j = 0; j <= 10; j++){
     // StdDraw.clear();
      StdDraw.circle(0,0,600);
      StdDraw.line(0,0,a,b);
      b = ((int)(400*Math.cos(angle*Math.PI/180)))-((int)(400* Math.sin(angle*Math.PI/180)));
      a = ((int)(400*Math.sin(angle*Math.PI/180)))+((int)(400* Math.cos(angle*Math.PI/180)));
 
      angle++;
        if (angle>45){
       break; 
      }
      }
      //screeen buffer
      StdDraw.show();
      StdDraw.pause(60);
      i++;
    }
  }
}