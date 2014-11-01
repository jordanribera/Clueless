package net.spiralpower.clueless;

/**
 * Created by Jordan on 11/1/2014.
 */
public class Room extends Card
{

    public Room(String newName, String newDescription, String newIcon)
    {

        this.setName(newName);
        this.setDescription(newDescription);
        this.setIcon(newIcon);
        this.setType(Card.ROOM_CARD);

    }

}
