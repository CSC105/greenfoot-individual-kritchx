import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Money extends Actor
{

    public void act() 
    {
    setLocation(getX() -3, getY());
    
    if(getX()== 0) { 
    getWorld().removeObject(this);
    }    
    
/*    else() 
    { 
    getObjectsAtOffset(int x, int y, Money.class);

} */
    
    
    
    }   
    
    public Money()
   {
        GreenfootImage image = getImage();
        image.scale(45, 45);
        setImage(image);
    }
}
