public class Buy_And_Sell_Stock {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int price : prices){
            if(price < minimum){
                minimum = price;
            }
            int profit = price - minimum;
            if(maxProfit < profit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}



// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Best time to buy and sell stock (121)

// Where in this sum i have take a optimal approach 
// First i will take a minumum variable as Integer.Max_value this means it will take a maximum value of integer as minimum = 21,47483647
// Then i will initialize max profit variable as initially zero
// Then iterate the price upto length of the array First it will check the (proce < minimum price) initially it will be a max value so that 
// minimum value will be = price  after that i will find the profit || profit fomula = actual price - minimum price
// Then i will check the max profit if max profit is less than profit then i will update th
// Then return the maxprofit 

// Time complexity o(n)
// Space complexity o(1)



