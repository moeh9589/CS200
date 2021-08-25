public class StdDra {
       public static void main(String[] args) {
         StdDraw.setCanvasSize(1200,1200);
           StdDraw.setPenRadius(0.08);
           StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
           int degrees = 60;
           int degreestwo = 360;
           while(true) {
             StdDraw.clear();
             StdDraw.text(.5,.7, "Internet Explorer Loading");
             StdDraw.arc(.5,.5,.1,degrees,degreestwo);
             degrees = (degrees + 1) % 360;
             degreestwo = (degreestwo + 1) % 360;
             StdDraw.show();
             StdDraw.pause(300);
           }
             
           
       }
   } 
/*         StdDraw.circle(.5,.5,.3);
           StdDraw.arc(.8,.55,.2,120,258);
           StdDraw.setPenColor(StdDraw.BLUE);
           StdDraw.line(.6,.55,.63,.52);
           StdDraw.line(.58,.52,.6,.55);
           StdDraw.text(.5,.5, "This is a baseball");
*/