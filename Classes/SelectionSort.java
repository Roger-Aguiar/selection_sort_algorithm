package Classes;

import Interfaces.ISelectionSort;

public class SelectionSort implements ISelectionSort
{
    int [] sortedArray;

    public SelectionSort(int [] array)
    {
        sortedArray = array;
    }

    @Override
    public int [] SortArrayAscending() 
    {          
        for(int i = 0; i < sortedArray.length - 1; i++)
        {
            int indexMinorElement = GetIndexMinorNumber(i);

            if(indexMinorElement != 0)
            {
                if(sortedArray[indexMinorElement] < sortedArray[i])
                {
                    int aux = sortedArray[i];
                    sortedArray[i] = sortedArray[indexMinorElement];
                    sortedArray[indexMinorElement] = aux;
                }
            }                              
        }      
        return sortedArray;
    }

    private int GetIndexMinorNumber(int index)
    {
        int minor = sortedArray[index];
        int indexMinor = 0;

        for(int i = index + 1; i < sortedArray.length; i++)
        {
            if(sortedArray[i] < minor)
            {
                minor = sortedArray[i];
                indexMinor = i;
            }
        }
        
        return indexMinor;
    }   
}
