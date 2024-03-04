class Solution 
{
    public String reverseWords(String s) 
    {
    /*    int i = s.length() - 1;
        String ans = "";
        
        while(i >= 0)
        {
            while(i >= 0 && s.charAt(i) == ' ') //exclude the lastest extra spaces
            {
                i--;
            }
            
            int j = i;
            if(i < 0)
            {
                break;
            }
            
            while(i >= 0 && s.charAt(i) != ' ')
            {
                i--;
            }
            
            if(ans.isEmpty())
            {
                ans = ans.concat(s.substring(i+1, j+1));
            }
            else
            {
                ans = ans.concat(" " + s.substring(i+1, j+1));
            }
        }
        
        return ans;
    } */
        
    //Approach 2
        
    String words [] = s.split(" +");
    StringBuilder sb = new StringBuilder();
    
    for(int i = words.length-1; i >=0; i--)
    {
        sb.append(words[i]);
        sb.append(" ");
    }
    
    return sb.toString().trim();
    }
}