class Solution {
    public boolean isHappy(int n) {
       while (n >= 10 || n == 7) {
			int sum = 0;
			while (n > 0) {
				sum += (n % 10) * (n % 10);
				n /= 10;
			}
			n = sum;
		}
		return n == 1;
    }
}