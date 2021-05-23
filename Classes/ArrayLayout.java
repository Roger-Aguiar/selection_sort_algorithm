package Classes;

import Interfaces.IArrayLayout;

public class ArrayLayout implements IArrayLayout 
{
    private int [] newArray;

    public ArrayLayout(int [] array)
    {
        newArray = array;
    }

    @Override
    public String getArrayLayout() 
    {
        String arrayOutput = "";
        
        for (int element : newArray) 
        {
            arrayOutput += element + "  ";            
        }

        arrayOutput += "\n";

        return arrayOutput;        
    }
    
}
