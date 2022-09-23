package lab1;

import java.util.ArrayList;

import static java.lang.Math.sqrt;
/**
 * Luke sequence element class.
 * */
public class Lukesnum {

    /**
    * Sequence number.
    * */
    private int num = 0;

    /**
     * Definition number.
     * */
    private long defin = 0;


    /**
     * Constructor.
     * @param x     sequence number
     * */
    public Lukesnum(int x, long def)
    {
        this.num = x;
        this.defin = def;
    }


    /**
     * Geter num.
     * @return int     sequence number
     */
    public int getNum()
    {
        return num;
    }

    /**
     * Geter definition.
     * @return long     definition
     * */
    public long getDefin()
    {
        return defin;
    }

    /**
     * Square check
     *
     * @return true if number is square
     */
    public boolean square_check()
    {
        return  ((int) sqrt(defin) == sqrt(defin));
    }
}
