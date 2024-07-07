class Solution {
    public int pivotInteger(int n) {
        int a[] = new int[n+1];
        int b[] = new int[n+1];
        int p = 0;
        for(int i = 0 ; i < a.length ; i++){          
            p = p + i;
            a[i] = p;           
        }
        int q = 0;
        for(int i = b.length-1 ; i >= 0; i-- ){
            q = q + i;
            b[i] = q;
        }
        for(int  i  = 0 ; i< a.length ; i++ ){
            if(a[i] == b[i]){
                return i;
            }
        }
        return -1;

            
    }
}
































// class Solution {
//     public int pivotInteger(int n) {
//         int a = 0;
//         int x;
//         for(int i = 1; i < x ; i++ ){
//              a = i + a;
            
//         }
//         int b = 0;
//         for(int i = x ; i < n ; i++){
//              b = b + x;
           
//         }
//         if(a == b){
//             return x;
//         }
//         else {
//             return -1;
//                   }
        
//     }
// }



// n = 8 // numbers
// x = 6 // pivot integer
// 1,2,3,4,5,6  = 21
