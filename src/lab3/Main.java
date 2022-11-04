package lab3;

import lab3.Controller.Menu;
import lab3.droids.Droid_list;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
            Droid_list List_Droid = new Droid_list();
            Menu menu = new Menu(List_Droid);
    }

}
