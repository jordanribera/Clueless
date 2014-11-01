package net.spiralpower.clueless;

/**
 * Created by Jordan on 11/1/2014.
 */
public class Weapon extends Card
{

    public Weapon(String newName, String newDescription, String newIcon)
    {

        this.setName(newName);
        this.setDescription(newDescription);
        this.setIcon(newIcon);
        this.setType(Card.WEAPON_CARD);

    }

}
