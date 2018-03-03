import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Start extends World
{
    private GreenfootImage[] start = new GreenfootImage[2];
    private int move = 0;
    int chancePic = 0;
    
     GreenfootImage start1 = new GreenfootImage("start1.png");
     GreenfootImage start2 = new GreenfootImage("start2.png");
     GreenfootSound BgSound = new GreenfootSound("StartSound.mp3");
     

    public Start()
    {    
        
        super(800, 450, 1);
        BgSound.playLoop();
        

    }
    
    public void act() { 

        checkKeys();
        chancePic++;
        if(chancePic == 10){
            //GreenfootImage img = new GreenfootImage("start2.png");
          setBackground("start2.png");  
        
        }
        if(chancePic == 20){
            //GreenfootImage img = new GreenfootImage("start2.png");
         setBackground("start1.png");  
         chancePic = 0;
        }
        

    }
    
    private void checkKeys() {
        
        if(Greenfoot.isKeyDown("space")) { 
        Greenfoot.setWorld(new FlamingoWorld());
        BgSound.stop();
            }
        }
        

}

