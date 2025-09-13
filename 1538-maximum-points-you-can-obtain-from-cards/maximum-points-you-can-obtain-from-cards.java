class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int a = 0;
        for(int i = 0; i < k; i++){
            a += cardPoints[i];
        }
        int b = a;
        int c = 0;
        int x = n-1;
        for(int j = k-1; j>= 0; j--){
            a -= cardPoints[j];
            c += cardPoints[x--];
            b = Math.max(b, a+c);
        }
        return b;
        // int a = 0;
        // int b = 0;
        // while(i < n && j >= 0 && a < k){
        //     if(cardPoints[i] < cardPoints[j]){
        //         b += cardPoints[j];
        //         a++;
        //         j--;
        //     }else if(cardPoints[i] == cardPoints[j]){
        //         if(cardPoints[i+1] < cardPoints[j-1]){
        //             b += cardPoints[j];
        //             a++;
        //             j--;
        //         }else{
        //             b += cardPoints[i];
        //             a++;
        //             i++;
        //         }
        //     }else{
        //        b += cardPoints[i];
        //         a++;
        //         i++; 
        //     }
        // }
        // return b;
    }
}
