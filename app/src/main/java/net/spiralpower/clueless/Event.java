package net.spiralpower.clueless;

import java.util.Set;

/**
 * Created by Jordan on 11/1/2014.
 */
public class Event
{

    public static final int EVENT_ASKED = 0x01;
    public static final int EVENT_DENIED = 0x02;
    public static final int EVENT_IMPLIED = 0x03;
    public static final int EVENT_SHOWED = 0x04;
    public static final int EVENT_DEDUCED = 0x05;

    private int EventType;
    private Set<Card> EventTrio;
    private Card EventResult;

    public Event(int newEventType)
    {

        this.EventType = newEventType;

    }

}
