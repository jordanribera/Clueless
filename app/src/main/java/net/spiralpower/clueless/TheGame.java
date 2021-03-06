package net.spiralpower.clueless;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jordan on 11/1/14.
 */
public class TheGame
{

    private static TheGame ourInstance = new TheGame();

    public CardSet GameCards;
    public Set<Player> GamePlayers;



    public static TheGame getInstance() {
        return ourInstance;
    }



    private TheGame()
    {

        this.GameCards = new CardSet();
        this.fillCards();

        this.GamePlayers = new HashSet<Player>();
        this.fillPlayers();

    }

    private void fillCards()
    {

        //add suspects
        this.GameCards.addCard(new Suspect("Col. Mustard", "Colonel Mustard", "mustard"));
        this.GameCards.addCard(new Suspect("Prof. Plum", "Professor Plum", "plum"));
        this.GameCards.addCard(new Suspect("Mr. Green", "Mister Green", "green"));
        this.GameCards.addCard(new Suspect("Mrs. Peacock", "Mistress Peacock", "peacock"));
        this.GameCards.addCard(new Suspect("Ms. Scarlet", "Miss Scarlet", "scarlet"));
        this.GameCards.addCard(new Suspect("Mrs. White", "Mistress White", "white"));

        //add weapons
        this.GameCards.addCard(new Weapon("Knife", "A sharp knife.", "knife"));
        this.GameCards.addCard(new Weapon("Candlestick", "A heavy metal candlestick.", "candlestick"));
        this.GameCards.addCard(new Weapon("Revolver", "A revolving pistol.", "revolver"));
        this.GameCards.addCard(new Weapon("Rope", "A sturdy length of rope.", "rope"));
        this.GameCards.addCard(new Weapon("Lead Pipe", "A thick lead plumbing pipe.", "pipe"));
        this.GameCards.addCard(new Weapon("Wrench", "A mechanic's wrench.", "wrench"));

        //add rooms
        this.GameCards.addCard(new Room("Hall", "The hall.", "hall"));
        this.GameCards.addCard(new Room("Lounge", "The lounge.", "lounge"));
        this.GameCards.addCard(new Room("Dining Room", "The dining room.", "dining_room"));
        this.GameCards.addCard(new Room("Kitchen", "The kitchen.", "kitchen"));
        this.GameCards.addCard(new Room("Ballroom", "The ballroom.", "ballroom"));
        this.GameCards.addCard(new Room("Conservatory", "The conservatory.", "conservatory"));
        this.GameCards.addCard(new Room("Billiard Room", "The billiard room.", "billiard_room"));
        this.GameCards.addCard(new Room("Library", "The library.", "library"));
        this.GameCards.addCard(new Room("Study", "The study.", "study"));

    }

    private void fillPlayers()
    {

        this.GamePlayers.add(new Player("Albert"));
        this.GamePlayers.add(new Player("Beatrice"));
        this.GamePlayers.add(new Player("Charles"));
        this.GamePlayers.add(new Player("Daniel"));

    }
}
