class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h =  new HashSet<>();
        while (n > 0&& n!= 1){
            if(h.contains(n)){
                return false;
            }
            h.add(n);
            n = sum(n);
        }
        return true ;
        
    }
    public static int sum(int n ){
        int sum = 0 ;
        while(n > 0 ){
            int digit = n% 10;
            sum += digit* digit;
            n/= 10;
        }
        return sum ;
    }
}