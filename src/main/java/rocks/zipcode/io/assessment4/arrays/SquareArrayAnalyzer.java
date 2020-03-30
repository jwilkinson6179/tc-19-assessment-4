package rocks.zipcode.io.assessment4.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    /**
     * Given two shuffled arrays `inputArray`, and `squareValues`,
     * ensure each `element` of `inputArray` has a corresponding `value` in `squaredValues`
     * such that `element == value*value`
     *
     * @param inputArray    an array of integers
     * @param squaredValues an array of integers
     * @return true if each `inputArray[i]` has a corresponding `squaredValues[j]` such that `squaredValues[j] == inputArray[i] * inputArray[i]`
     */
    public static Boolean compare(Integer[] inputArray, Integer[] squaredValues)
    {
        Integer countSquares = 0;

        for(Integer i = 0; i < inputArray.length; i++)
        {
            for(Integer k = 0; k < squaredValues.length; k++)
            {
                if( (inputArray[i] * inputArray[i]) == squaredValues[k])
                {
                    // Set to -1 to prove checked -- squared ints can't be negs
                    squaredValues[k] = -1;
                    countSquares++;
                }
            }
        }

        if(countSquares == squaredValues.length)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
