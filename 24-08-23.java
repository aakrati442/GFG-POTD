class Solution
{
    public String multiplyStrings(String s1,String s2)
    {
        //code here.
        BigInteger a = new BigInteger(s1);
        BigInteger b = new BigInteger(s2);
        String str = String.valueOf(a.multiply(b));
        return str;
    }
}
