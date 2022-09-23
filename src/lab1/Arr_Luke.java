package lab1;

/**
 *An array of Luke numbers
 */
public class Arr_Luke {
    private int lenght_arr;
    private Lukesnum[] arr;

    /**
     * Constructor.
     * @param lenght_arr
     * */
    public Arr_Luke(int lenght_arr) {
        this.lenght_arr = lenght_arr;
        arr = new Lukesnum[lenght_arr];
        arr[0] = new Lukesnum(1, 1);
        arr[1] = new Lukesnum(2, 3);
        for (int i = 2; i < lenght_arr; i++)
        {
            arr[i] = new Lukesnum(i+1, arr[i-2].getDefin() + arr[i-1].getDefin());
        }
    }

    /**
     * Geter lenght_arr.
     * @return long     lenght_arr
     */
    public int getLenght_arr()
    {
        return lenght_arr;
    }

    /**
     * Geter elem.
     * @param k  int index
     * @return int     elem with index k
     */
    public Lukesnum getelemluke(int k)
    {
        return arr[k-1];
    }


}
