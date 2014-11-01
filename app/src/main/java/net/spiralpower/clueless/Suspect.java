package net.spiralpower.clueless;

/**
 * Created by Jordan on 11/1/2014.
 */
public class Suspect extends Card
{

    public Suspect(String newName, String newDescription, String newIcon)
    {

        this.setName(newName);
        this.setDescription(newDescription);
        this.setIcon(newIcon);
        this.setType(Card.SUSPECT_CARD);

    }

}
