class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int temp = x;
        int rem = 0;
        if(x < 0)
        {
            return false;
        }

        while(x > 0)
        {
            int num = x % 10;
            rem = (rem * 10) + num;
            x = x / 10;
        }

        if(temp == rem)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}