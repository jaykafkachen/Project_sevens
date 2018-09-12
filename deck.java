import java.util.*;
import java.io.*;

public class Deck
{
    private ArrayList<Card> cards;
    private String[] arr = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
    private final ArrayList<String> cardvalues = new ArrayList<String>(Arrays.asList(arr));
    private String[] arr2 = {"Spades", "Hearts", "Clubs", "Diamonds"}
    private final ArrayList<String> faces = new ArrayList<String>(Arrays.asList(arr2));
    private final int DECKSIZE = 52;
    private int numLeft = 52;

    public Deck()
    {
        cards = new ArrayList<Card>();

        for(String fc:faces)
        {
            for(int i=0;i<12;i++)
            {
                cards.add(new Card(cardvalues.get(i), fc));
            }
        }
    }

    public void shuffle()
    {
        ArrayList<Card> tempCards =  new ArrayList<Card>();
        Random rn = new Random();
        int numLeft = cards.size();
        int place = rand.nextInt(numLeft);
        for(int i=0;i<numLeft;i++)
        {
            while(tempCards.get(place)!=null)
            place = rand.nextInt(numLeft);
            tempCards.set(place,cards.get(i));
        }
        cards = tempCards;
    }

    public Card deal()
    {
        return cards.remove(0);
        numLeft--;
    }
}