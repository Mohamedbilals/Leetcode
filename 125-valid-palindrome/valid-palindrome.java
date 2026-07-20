class Solution {
    public boolean isPalindrome(String s) {
        String noAlpha=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reverse=new StringBuilder(noAlpha).reverse().toString();
                return noAlpha.equals(reverse);
    }
}
