import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class FlamingoWorld extends World
{

    private int count2 = 0, count3 = 0, count4 = 0, count5 = 0, random = 0;
    public int count = 0;
    static GreenfootSound BgSound = new GreenfootSound("BGsound.mp3");

    public FlamingoWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 450, 1, false);

        //Counter1.score = 0;
        Score.score = 0;
        BgSound.playLoop();

        

        Flamingo pink = new Flamingo();
        addObject(pink, 460, 330);

        
        Tank tankja = new Tank();
        addObject(tankja, -50, 291);
        //add score
        addObject(new Score(),400,30);
        /* SandClock sc = new SandClock();
        addObject(sc, 269, 36); */

        Background image0 = new Background();
        Background image1 = new Background();
        addObject(image0, 400, 225);
        addObject(image1, 400 + 800, 225);

        setPaintOrder(Score.class,Flamingo.class, Tank.class,Grenade.class, ground.class, Money.class, watch.class,watch2.class, Background.class);

    }

    public void act() {

        //Greenfoot.setWorld(new GameOver());   
        
        count++;
        count2++;
        count3++;
        count4++;
        count5++;

        
        
        if(count == 300) { 
            Grenade boom = new Grenade();
            addObject(boom, getWidth() + 220, 355);
            count = Greenfoot.getRandomNumber(200); 
            
            
        }

        if(count2 == 1200) { 

            count2++;    
            ground gd5 = new ground();
            ground gd6 = new ground();
            addObject(gd5, getWidth(), 222);
            addObject(gd6, getWidth() + 400, 222); 
            count2 = 0 ;

        }

        if(count3 == 1400) { 

            count3++;    
            watch w1 = new watch();
            addObject(w1, getWidth() + 80, 125); 
            count3 = 0 ;

        }

        if(count4 == 2500) { 

            count4++;    
            watch2 w2 = new watch2();
            addObject(w2, getWidth() - 100, 125); 
            count4 = 0 ;

        }

        if(count5 == 1000) { 

            count5++;    
            Money mon = new Money();
            addObject(mon, getWidth() + 130, 355); 
            count5 = 0 ;

        }

    }
}
