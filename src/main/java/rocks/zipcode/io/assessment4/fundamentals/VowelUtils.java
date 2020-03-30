package rocks.zipcode.io.assessment4.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils
{
    public static Boolean hasVowels(String word)
    {
        word = word.toLowerCase();
        return word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u");
    }


    public static Integer getIndexOfFirstVowel(String word)
    {
        char[] wordAsArray = word.toCharArray();

        for(Integer i = 0; i < wordAsArray.length; i++)
        {
            if(isVowel(wordAsArray[i]))
            {
                return i;
            }
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word)
    {
        return isVowel(word.charAt(0));
    }

    public static Boolean isVowel(Character character)
    {
        return character.equals('a') || character.equals('e') || character.equals('i') || character.equals('o') ||
                character.equals('u') || character.equals('A') || character.equals('E') || character.equals('I') ||
                character.equals('O') || character.equals('U');
    }
}
