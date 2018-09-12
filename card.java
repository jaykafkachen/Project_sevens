import java.util.*;
import java.io.*;

public class Card
{
    private String face;
    private String value;
    
    public Card(String val, String fc)
    {
        face = fc;
        value = val;
    }

    public String getFace()
    {
        return face;
    }

    public int getValue()
    {
        return validCards.indexOf(value);
    }

    public void print()
    {
        System.out.print(value + " of " + face);
    }

    public boolean compareFaces(Card a, Card b)
    {
        return a.getFace().equals(b.getFace());
    }

    public int compareValues(Card a, Card b)
    {
        return a.getValue()-b.getValue();
    }
    
    public boolean adjacent(Card current, Card next) //cards of same face and values next to one another
    {
        if(current.compareFaces(current, next)) //if faces equal
        {
            if(Math.abs(compareValues(current, next))==1)
                return true;
        }
        return false;
    }
}