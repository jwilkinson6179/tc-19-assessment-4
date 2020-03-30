package rocks.zipcode.io.assessment4.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize)
    {
        StringBuilder result = new StringBuilder();

        result.append(str.substring(0, indexToCapitalize));
        result.append(str.substring(indexToCapitalize, indexToCapitalize + 1).toUpperCase());
        result.append(str.substring(indexToCapitalize + 1));

        return result.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString)
    {
        return (characterToCheckFor.equals(baseString.charAt(indexOfString)));
    }

    public static String[] getAllSubStrings(String string)
    {
        ArrayList<String> substrings = new ArrayList<>();

        for(Integer i = 0; i < string.length(); i++)
        {
            for(Integer k = i + 1; k <= string.length(); k++)
            {
                String currentSub = string.substring(i, k);
                if(!substrings.contains(currentSub))
                {
                    substrings.add(currentSub);
                }
            }
        }
        String[] array = substrings.toArray(new String[0]);

        return array;
    }

    public static Integer getNumberOfSubStrings(String input)
    {
        return getAllSubStrings(input).length;
    }

    public static String[] pushToArrayOfStrings(String addedString, String[] stringOfArrays)
    {
        String[] output = new String[stringOfArrays.length + 1];

        for(Integer i = 0; i < stringOfArrays.length; i++)
        {
            output[i] = stringOfArrays[i];
        }

        output[ stringOfArrays.length] = addedString;

        return output;
    }
}