import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Score extends Actor
{
    public static int score;
    
    public void act() 
    {
        // Add your action code here.
        showScore();
        increaseScore();
    }    

    public void showScore()
    {
        setImage(new GreenfootImage(""+score,30,Color.WHITE,new Color(0,0,0,0)));
    }

    public void increaseScore()
    {
        score++;
    }
}
