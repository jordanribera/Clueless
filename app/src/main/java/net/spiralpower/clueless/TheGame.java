package net.spiralpower.clueless;

/**
 * Created by jordan on 11/1/14.
 */
public class TheGame {
    private static TheGame ourInstance = new TheGame();

    public static TheGame getInstance() {
        return ourInstance;
    }



    private TheGame()
    {



    }
}
