class Solution {
    public int[] sortedSquares(int[] a) {
        int res[]  = new int [a.length];
        int i ,r ,l;
        i = res.length - 1;
        l = 0 ;
        r = a.length -1;
        while (l <= r){
            if (Math.abs(a[l]) >= Math.abs(a[r])){
                res[i] = a[l] *a[l] ;
                i-- ;
                l ++ ;
            }
            else {
                res[i] = a[r] *a[r] ;
                i-- ;
                r-- ;

            }

        }
        return res ;
        
    }
}