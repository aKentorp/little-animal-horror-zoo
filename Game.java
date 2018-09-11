import java.util.Scanner;

public class Game{
   public static void main (String[] args){
   
      Scanner scan = new Scanner(System.in);
      
      Character rabbit = new Character();
      Character snake = new Character();
      
      rabbit.setPosition(0,0);
      snake.setPosition(5,5);
      
      rabbit.setXY();
      snake.setXY();  
      
      snake.aI = true;
      
      for(int y = 9; y >= 0; y--){
         for(int x = 0; x <= 9; x++){
            if (rabbit.x == x && rabbit.y == y){
               System.out.print("[@]");
            }
            else if(snake.x == x & snake.y == y){
               System.out.print("[S]");
            }
            else{
               System.out.print("[ ]");
            }   
         }
         System.out.println();
      }
      
            
      
      //Gets input and updates rabbits position
      
      Boolean on = false;
      
      //midlertidige x og y til at chekke om location er out of bounds
      int tempX;
      int tempY;
      
      int tempXs;
      int tempYs;
      
      //move scanner for bevægelsesretning
      char move = 'i';
      
      while (on == false){
         move = scan.next().charAt(0);
         
         System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
         
         snake.aiMove();
         
         if (move == 'q'){
            break;}
         else if (move == 'y'){rabbit.uLeft();}
         else if (move == 'u'){rabbit.up();}
         else if (move == 'i'){rabbit.uRight();}
         else if (move == 'h'){rabbit.left();}
         else if (move == 'k'){rabbit.right();}
         else if (move == 'b'){rabbit.dLeft();}
         else if (move == 'n'){rabbit.down();}
         else if (move == 'm'){rabbit.dRight();}
         else{}
         
         //Limits rabbit movement
         tempX = rabbit.x;
         tempY = rabbit.y;
         
         tempXs = snake.x;
         tempYs = snake.y;
         
         rabbit.setXY();
         snake.setXY();
         
         if(rabbit.x < 0 || rabbit.x > 9 || rabbit.y < 0 || rabbit.y > 9){
            rabbit.setPosition(tempX, tempY);
            rabbit.setXY();
         }
         else{ }
         
         if(snake.x < 0 || snake.x > 9 || snake.y < 0 || snake.y > 9){
            snake.setPosition(tempXs, tempYs);
            snake.setXY();
         }
         else{ }
         
         
      
         for(int y = 9; y >= 0; y--){
            if ((snake.x == rabbit.x)&&(snake.y == rabbit.y)){
                  System.out.println("You caught the SNAKE!!!!");
                  return; 
                  }
            for(int x = 0; x <= 9; x++){
               if (rabbit.x == x && rabbit.y == y){
                  System.out.print("[@]");
               }
               else if(snake.x == x & snake.y == y){
                  System.out.print("[S]");
               }
               else{
                  System.out.print("[ ]");
               }   
            }
            System.out.println(); 
            
           
         }  
         
         
      }   
   }
}
