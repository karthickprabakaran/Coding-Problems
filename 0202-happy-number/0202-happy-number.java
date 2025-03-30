
class Solution {
    public boolean isHappy(int n) {
        Set<Integer> usedIntegers = new HashSet<>();
        
        while (n != 1 && !usedIntegers.contains(n)) {
            usedIntegers.add(n);
            int sum = 0;

            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit; // No need for Math.pow
                n = n / 10;
            }

            n = sum;
        }

        return n == 1;
    }
}