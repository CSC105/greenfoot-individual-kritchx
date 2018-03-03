import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Grenade extends Actor
{

    public void act() 
    {
        
        setLocation(getX() -3, getY());
        if(getX()== 0) { 
        getWorld().removeObject(this);
        
        

        }
        
        
    }   
    public void Grenade()
    {
        
        GreenfootImage image = getImage();
        image.scale(20, 40);
        setImage(image);
        
    }
}
