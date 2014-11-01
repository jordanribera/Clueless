package net.spiralpower.clueless;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by jordan on 11/1/14.
 */
public class CardSet
{

    private Set<Card> AllCardsSet;

    private Set<Room> RoomsSet;
    private Set<Suspect> SuspectsSet;
    private Set<Weapon> WeaponsSet;

    public CardSet()
    {

        this.AllCardsSet = new HashSet<Card>();
        this.RoomsSet = new HashSet<Room>();
        this.SuspectsSet = new HashSet<Suspect>();
        this.WeaponsSet = new HashSet<Weapon>();

    }

    public void addCard(Card newCard)
    {

        AllCardsSet.add(newCard);
        if(newCard.getType() == Card.ROOM_CARD) RoomsSet.add((Room)newCard);
        if(newCard.getType() == Card.SUSPECT_CARD) SuspectsSet.add((Suspect)newCard);
        if(newCard.getType() == Card.WEAPON_CARD) WeaponsSet.add((Weapon)newCard);

    }

    public Set<Card> getCards()
    {

        return this.AllCardsSet;

    }

    public Set<Room> getRooms()
    {

        return this.RoomsSet;

    }

    public Set<Suspect> getSuspects()
    {

        return this.SuspectsSet;

    }

    public Set<Weapon> getWeapons()
    {

        return this.WeaponsSet;

    }

}
