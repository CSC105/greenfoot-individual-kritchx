import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Tank extends Actor
{
 private GreenfootImage[] tanks = new GreenfootImage[16];
 private double move = 0;
 private double tSpeed = 0;
 
 public void act() { 
        Autorun();
        
        if(Greenfoot.isKeyDown("d")){
           setLocation(-20, 291); 
        }
         if(Greenfoot.isKeyDown("a")){
             setLocation(-50, 291);
        }
    }
 public Tank() 
    {

        for(int i = 0 ; i < tanks.length ; i++) { 
            tanks[i] = new GreenfootImage("images/tank" + (i+1) + ".png");
            tanks[i].scale(400, 400);
        }
        setImage(tanks[(int)move]);
        
        
        
    }
    
public void Autorun() {
    move = ( move + 1 ) % tanks.length;
    setImage(tanks[(int)move] );

   
}
}
    


