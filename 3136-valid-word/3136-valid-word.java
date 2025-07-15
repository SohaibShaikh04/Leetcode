class Solution 
{
    public boolean isValid(String word) 
    {

       
        if (word.length() < 3)
        {
            return false;
        } 

       
        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (int i = 0; i < word.length(); i++) 
        {
            char c = word.charAt(i);

           
            if (!Character.isLetterOrDigit(c))
            {
                return false;
            } 
            if (Character.isLetter(c)) 
            {
                char lower = (char)(c | 32); 
          
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') 
                {
                    hasVowel = true;
                } 
                else 
                {
                    
                    hasConsonant = true;
                }

                
                if (hasVowel && hasConsonant)
                {
                    continue;
                } 
            }
        }

        return hasVowel && hasConsonant;
    }
}