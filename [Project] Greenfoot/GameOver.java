import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class GameOver extends World
{
    static GreenfootSound BgSound = new GreenfootSound("bomb.mp3");
    
    public GameOver()
    {    
       
       super(800, 450, 1); 
       addObject(new ScoreSum(),499,234);
       Greenfoot.playSound("bomb.mp3");
       
    }
    
    public void checkOver() { 
        
     if(Greenfoot.isKeyDown("enter")) { 
    Greenfoot.setWorld(new FlamingoWorld());
    }
    if(Greenfoot.isKeyDown("escape")) { 
    Greenfoot.setWorld(new Start());
    }
    
    }
    
    public void act(){
    
   checkOver();
    
    } 
}
