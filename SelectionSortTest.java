import Classes.ArrayLayout;
import Classes.RandomNumber;
import Classes.SelectionSort;
import Interfaces.IArrayLayout;
import Interfaces.IRandomNumber;
import Interfaces.ISelectionSort;

public class SelectionSortTest
{
    public static void main(String[] args) 
    {
        IRandomNumber newNumber = new RandomNumber(20, 100);
        int [] myArray = newNumber.generateRandomNumber();

        IArrayLayout arrayLayout = new ArrayLayout(myArray);
        System.out.println(arrayLayout.getArrayLayout());

        ISelectionSort sort = new SelectionSort(myArray); 
        
        int [] sortetArray = sort.SortArrayAscending();

        IArrayLayout finalArray = new ArrayLayout(sortetArray);
        System.out.println(finalArray.getArrayLayout());
    }
}