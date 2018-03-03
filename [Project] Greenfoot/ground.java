import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ground extends Actor
{

    public void act() 
    {
        setLocation(getX() -3, getY());
        if(getX()== 0) { 
        getWorld().removeObject(this);

        }
    }    
    
        public ground()
    {
        
        GreenfootImage image = getImage();
        image.scale(100, 20);
        setImage(image);
    }
}
