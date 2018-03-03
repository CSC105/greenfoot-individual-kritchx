import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flamingo extends Actor
{
    private GreenfootImage[] fla = new GreenfootImage[36];

    private int speed = 3, move = 0, forward = 0, vSpeed = 0, GroundLevel = 330 ;
    private double tSpeed = 0;

    
    public void act() { 

        checkKeys();
        OnGround();
        Autorun();
        Touch();

    }
    public Flamingo() 
    {

        for(int i = 0 ; i < fla.length ; i++) { 
            fla[i] = new GreenfootImage("Flamingo" + (i+1) + ".png");
            fla[i].scale(70, 113);
        }
        setImage(fla[move]);

    }

    private void checkKeys() {

        if(Greenfoot.isKeyDown("right")) { 
            if(getX()<764) {
                moveRight();
            }
        }

        if(Greenfoot.isKeyDown("left")) { 
            if(getX()>150) {
                moveLeft();
            }
        }

    }
    public void OnGround() { 
        boolean CheckGround = (getY() == GroundLevel);
        if(!CheckGround) { 
            fall();
        }

        else if ("space".equals(Greenfoot.getKey())) { 
            Jump();

        }
    }

    public void moveRight() { 
        if (move == 0) move = 1;

        move = (move + 1) % fla.length;
        setImage(fla[move]);
        setLocation (getX() + 5, getY()); 
        move = move + 1;

    }

    public void moveLeft() { 
        if (move == 0) move = 1;

        move = (move + 1) % fla.length;
        setImage(fla[move]);
        setLocation (getX() - 6, getY());
        move = move + 1;
    }

    public void Jump() { 
        Greenfoot.playSound("jump.mp3");
        vSpeed = -20;
        setLocation(getX() + 2, getY() + vSpeed);

        
    }

    
    public void fall() { 
        vSpeed++;
        setLocation(getX(), getY() + vSpeed);

        if(getY() >= GroundLevel) { 
            setLocation(getX(), GroundLevel);
            Greenfoot.getKey();
        }

    }

    public void Autorun() {
        move = ( move + 1 ) % fla.length;
        setImage(fla[(int)move] );

        /* if(move != 0) { 
        tSpeed = tSpeed - 0.1;    
        setLocation (getX() - (int)(-tSpeed/50), getY());

        } */

    }

    public void Touch() 
    {

        if(isTouching(Money.class)== true) 
        { 
            Greenfoot.playSound("collect1.mp3");
            removeTouching(Money.class);
        }

        if(isTouching(watch2.class)== true) 
        { 
            Greenfoot.playSound("watch.mp3");
            removeTouching(watch2.class);
        }

        if(isTouching(watch.class)== true) 
        { 
            Greenfoot.playSound("watch.mp3");
            removeTouching(watch.class);
        }

        if(isTouching(Grenade.class) == true) 
        { 
            Greenfoot.setWorld(new GameOver());
            FlamingoWorld.BgSound.stop();

        }

        if(isTouching(Tank.class) == true) 
        { 
            Greenfoot.setWorld(new GameOver());
            FlamingoWorld.BgSound.stop();

        }
        
        if(isTouching(ground.class) == true) 
        { 
            setLocation(getX(), 158);
            
            if ("space".equals(Greenfoot.getKey())) { 
            Jump();
            }
            else { 
                Greenfoot.getKey();
            }
        }

        }
        
    }



