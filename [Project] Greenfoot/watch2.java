import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class watch2 extends Actor
{
    
    public void act() 
    {
        setLocation(getX() -3, getY());
        if(getX()== 0) { 
        getWorld().removeObject(this);
    }    

}

public watch2()
   {
        GreenfootImage image = getImage();
        image.scale(60, 60);
        setImage(image);
    }
    
 
}
