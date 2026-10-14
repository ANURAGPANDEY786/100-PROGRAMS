// package Digits;

// public class ReplaceZero {
//     public static void main(String[] args) {
//         int n=1007;
//        int ans=0;
//         while(n>0){
//             int num=n%10;
//             if(num==0) ans=ans*10+5;
//             else ans=ans*10+num;
//             n=n/10;
//         }
//         int finalAns = 0;
//         while (ans > 0) {
//             finalAns = finalAns * 10 + ans % 10;
//             ans = ans / 10;
//         }

//         System.out.println(finalAns);

//     }
    
// }
package Digits;

public class ReplaceZero {
    public static void main(String[] args) {
        int n = 1007;
        int ans = 0;
        int place = 1;   // track digit position

        while (n > 0) {
            int digit = n % 10;
            if (digit == 0) digit = 5;   // replace 0 with 5
            ans = ans + digit * place;   // build number directly
            place = place * 10;          // move to next place
            n = n / 10;
        }

        System.out.println(ans);
    }
}
