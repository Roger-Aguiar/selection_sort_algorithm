import Classes.SelectionSort;
import Interfaces.ISelectionSort;

public class SelectionSortTest
{
    public static void main(String[] args) 
    {
        int [] initialArray = {31, 41, 59, 26, 41, 58};
        
        ISelectionSort sort = new SelectionSort(initialArray); 
        
        int [] sortetArray = sort.SortArray();
    }
}