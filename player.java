import java.util.*;
import java.io.*;

public class Player
{
    private ArrayList<Card> hand;
    boolean turn; //need to access/change in game code

    public Player()
    {
        turn = false;
    }

    public void takeHand(ArrayList<Card> dealt)
    {
        hand = dealt;
    }

    public ArrayList<Card> getHand()
    {
        return hand;
    }

    public void printHand()
    {
        for(int i=0;i<hand.size();i++)
        {
            System.out.println((i+1)+" - " + hand.get(i).print());
        }
    }

    public Card playCard()
    {
        Scanner console = new Scanner(System.in);
        printHand();
        System.out.print("\nChoose a card number from above: ");
        while(!console.hasNextInt())
        {
            System.out.print("Not a valid card number!\nChoose a card number from above: ");
            console.next();
        }
        turn = false;
        return hand.remove(console.nextInt());
    }

}