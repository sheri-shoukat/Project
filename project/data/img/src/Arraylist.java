import java.io.*;
import java.util.ArrayList*;
 
class ArrayList {
    public static void main(String[] args)
    {
        
        int n = 10;

        ArrayList<Integer> arraylist
            = new ArrayList<Integer>(n);
 
        
        for (int i = 1; i <= n; i++)
            arraylist.add(i);
 
        System.out.println(arraylist);
 
        // Remove element at index 3
        arraylist.remove(3);
 
        System.out.println(arraylist);
 
        for (int i = 0; i < arraylist.size(); i++)
            System.out.print(arraylist.get(i) + " ");
    }
}
