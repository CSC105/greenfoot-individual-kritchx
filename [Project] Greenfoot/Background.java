import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Background extends Actor
{
    private GreenfootImage image;
    public Background() { 
        image = new GreenfootImage("image1.png");
        setImage(image);
    
    }
    public void act() 
    {
        setLocation(getX()-2, getY());
        if(getX() < -400) setLocation(400 + 800 - (-getX()-400), 225);
    }    
}
