import java.awt.Point;
import java.util.Random;


public class Character{

   Point point = new Point();
   
   boolean aI = false;
   int x;     
   int y;
   

   //debug, show position
   public void showPos(){
      System.out.println(point.getLocation());
   }
   //Sets starting position of character
   public void setPosition(int x, int y){
      point.setLocation(x,y);
   }
   
   //Sets x and y as integers
   public void setXY(){
      x = (int)(point.getX());     
      y = (int)(point.getY());   
   }
 
   
   //movement configurations
   public void up(){
      point.translate(0,1);
   }  
   public void down(){
      point.translate(0,-1);
   }  
   public void left(){
      point.translate(-1,0);
   }
   public void right(){
      point.translate(1,0);
   }
   public void uLeft(){
      point.translate(-1,1);
   }  
   public void uRight(){
      point.translate(1,1);
   }
   public void dLeft(){
      point.translate(-1,-1);
   }
   public void dRight(){
      point.translate(1,-1);
   } 
   
   
   //ai settings
   
   Random ran = new Random();
   int to;
   
   
   public void aiMove(){
      if (this.aI == true){
         to = ran.nextInt(8);
         if (to == 0){
            this.uLeft();
         }
         else if(to == 1){
            this.up();
         }
         else if(to == 2){
            this.uRight();
         }
         else if(to == 3){
            this.left();
         }
         else if(to == 4){
            this.right();
         }
         else if(to == 5){
            this.dLeft();
         }
         else if(to == 6){
            this.down();
         }
         else if(to == 7){
            this.dRight();
         }
      
      
      
      
      
      }
   
   }
   
   
}
