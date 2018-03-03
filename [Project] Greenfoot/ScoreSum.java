import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class ScoreSum extends Actor
{
   
    public void act() 
    {
        showScore();
    }    
    
    public void showScore()
    {
        setImage(new GreenfootImage(""+Score.score,62,Color.WHITE,new Color(0,0,0,0)));
        //System.out.println(Score.score);
        
    }
    
}
