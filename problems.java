public class problems {

    // Trapped Water
    // public static int trappedRainwater(int height[]){
    //     int n = height.length;
    //     //calculate left max boundary
    //     int leftMax[] = new int[n];
    //     leftMax[0] = height[0];
    //     for(int i=1; i<n; i++){
    //         leftMax[i] = Math.max(height[i], leftMax[i-1]);
    //     }    
    //     // calculate right max boundary
    //     int rightMax[] = new int[n];
    //     rightMax[n-1] = height[n-1];
    //     for(int i=n-2; i>=0; i--) {
    //         rightMax[i] = Math.max(height[i], rightMax[i+1]);
    //     } 

    //     int trappedWater = 0;
    //     for(int i=0; i<n; i++){
    //         //waterlevel = min(leftmax bound, rightmax bound)
    //         int waterLevel = Math.min(leftMax[i], rightMax[i]);

    //         //trapped water = waterLevel - height[i]
    //         trappedWater += waterLevel - height[i];
    //     }
    //     return trappedWater;
    // }

// ----------------------------------------------------------------------------------------
       // Buy And Sell Stocks
//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++){
//             if(buyPrice < prices[i]){
//                 int profit = prices[i] - buyPrice;
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         } 
//         return maxProfit;
// }

// ----------------------------------------------------------------------------------------
    public static void containDuplicate(int arr[]) {
    boolean hasDuplicate = false;

    for(int i = 0; i < arr.length; i++) {
        for(int j = i + 1; j < arr.length; j++) {
            if(arr[i] == arr[j]) {
                hasDuplicate = true;
                break; // duplicate found, stop inner loop
            }
        }
        if(hasDuplicate) break; // stop outer loop too
    }

    System.out.println(hasDuplicate ? "True" : "False");
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4};
    containDuplicate(arr);  // Output: False
}




// ----------------------------------------------------------------------------------------
    // Buy And Sell Stocks
    // int prices[] = {7, 1, 5, 3, 6, 4};
    // System.out.println(buyAndSellStocks(prices));


// ----------------------------------------------------------------------------------------
    // Trapped Water : 
    //     int height[] = {4,2,0,6,3,2,5};
    //     System.out.println(trappedRainwater(height));
    // }
}
