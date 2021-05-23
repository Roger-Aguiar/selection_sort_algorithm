package Classes;

import Interfaces.IRandomNumber;

public class RandomNumber implements IRandomNumber
{
    private int arrayLength;
    private int maxNumber;

    public RandomNumber(int length, int maxNumberInArray)
    {
        arrayLength = length;
        maxNumber = maxNumberInArray;
    }

    @Override
    public int [] generateRandomNumber() 
    {     
        int [] array = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++)
        {
            array[i] = (int)(Math.random() * maxNumber);
        }   
        return array; 
    }
    
}
