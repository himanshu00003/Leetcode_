// class Solution {
//     public int canCompleteCircuit(int[] gas, int[] cost) {
//         int totalgas = 0;
//         int totalcost = 0;

//         for(int i = 0 ; i < gas.length ; i++){
//             totalgas += gas[i];
//             totalcost += cost[i];
//         }
//         if(totalgas < totalcost){
//             return -1;
//         }


//         int currentgas = 0;
//         int startingIndex = 0;

//         for(int i = 0 ; i < gas.length ; i++){
//             currentgas = currentgas + (gas[i] - cost[i]);

//         if(currentgas < 0){
//             currentgas = 0;
//             startingIndex = i + 1;
//           }
//         }
//         return startingIndex;
//     }
// }


class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Initialize variables to track total gas and total cost
        int totalGas = 0;
        int totalCost = 0;
        
        // Calculate total gas and total cost by iterating through the arrays
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];   // Accumulate gas[i] to totalGas
            totalCost += cost[i]; // Accumulate cost[i] to totalCost
        }
        
        // Check if it's possible to complete the circuit
        if (totalGas < totalCost) {
            return -1; // If total gas is less than total cost, return -1 (impossible to complete circuit)
        }
        
        // Initialize variables for finding the starting point
        int currentGas = 0;     // Track remaining gas after traveling to the current station
        int startingIndex = 0;  // Track the starting index that allows completing the circuit
        
        // Iterate through the gas and cost arrays to find the starting point
        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i]; // Calculate remaining gas after traveling to station i
            
            // If currentGas drops below zero, reset starting point to i + 1
            if (currentGas < 0) {
                currentGas = 0;          // Reset currentGas to zero
                startingIndex = i + 1;   // Update startingIndex to i + 1 (next station)
            }
        }
        
        return startingIndex; // Return the starting index that allows completing the circuit
    }
}
