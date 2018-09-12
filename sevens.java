import java.util.*;
import java.io.*;

public class Sevens
{
    Deck cards;
    ArrayList<Card> inPlay;
    
    public Sevens()
    {
        inPlay = new ArrayList<Card>();
        cards = new Deck();
        cards.shuffle();
    }

    public void dealCards(Player play)
    {
        ArrayList<Card> dealt = new ArrayList<Card>();
        cards.shuffle();
        for(int i=0;i<12;i++)
        {
            dealt.add(cards.deal());
        }
        play.takeHand(dealt);
    }

    public void move(Player play)
    {
        if

    }

    /*
    Rules for the game of Sevens.

    1. The first card dealt is the 7 of Spades
    2. Each player gets a turn, and must either play...
        -a card adjacent to a card in play currently
        -another 7 card, while they still exist
        -pass, if no other moves are available
    3. Game ends when one player is out of cards
    */
}