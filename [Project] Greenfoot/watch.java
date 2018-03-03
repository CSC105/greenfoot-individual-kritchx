import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class watch extends Actor
{
    
    public void act() 
    {
        setLocation(getX() -3, getY());
        if(getX()== 0) { 
        getWorld().removeObject(this);
        
    }    

}

public watch()
   {
        GreenfootImage image = getImage();
        image.scale(50, 54);
        setImage(image);
    }
 
  
    }  


