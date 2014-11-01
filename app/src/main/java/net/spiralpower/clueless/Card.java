package net.spiralpower.clueless;

/**
 * Created by Jordan on 11/1/2014.
 */
public abstract class Card
{

    public static final int SUSPECT_CARD = 0x01;
    public static final int WEAPON_CARD = 0x02;
    public static final int ROOM_CARD = 0x03;

    private String Name;
    private String Description;
    private String Icon; //string?
    private int Type;

    public void setName(String newName){ this.Name = newName; }
    public void setDescription(String newDescription){ this.Description = newDescription; }
    public void setIcon(String newIcon){ this.Icon = newIcon; }
    public void setType(int newType){ this.Type = newType; }
    public void setType(String newType)
    {

        if (newType.toLowerCase().equals("suspect")){ this.Type = Card.SUSPECT_CARD; }
        if (newType.toLowerCase().equals("weapon")){ this.Type = Card.WEAPON_CARD; }
        if (newType.toLowerCase().equals("room")){ this.Type = Card.ROOM_CARD; }

    }

    public String getName(){ return this.Name; }
    public String getDescription(){ return this.Description; }
    public String getIcon(){ return this.Icon; }
    public int getType(){ return this.Type; }

}
