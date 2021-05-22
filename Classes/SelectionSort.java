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
    public int [] SortArray() 
    {     
        System.out.println(DisplayArray());

        for(int i = 0; i < sortedArray.length - 1; i++)
        {
            int indexMinorElement = GetIndexMinorNumber(i);

            if(sortedArray[indexMinorElement] < sortedArray[i])
            {
                int aux = sortedArray[i];
                sortedArray[i] = sortedArray[indexMinorElement];
                sortedArray[indexMinorElement] = aux;
            }
            System.out.println(DisplayArray());             
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

    @Override
    public String DisplayArray() 
    {
        String arrayOutput = "";
        
        for (int element : sortedArray) 
        {
            arrayOutput += element + "  ";            
        }

        arrayOutput += "\n";

        return arrayOutput;
    }
    
    
}
