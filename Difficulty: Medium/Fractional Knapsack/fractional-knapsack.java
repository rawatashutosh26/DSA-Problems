import java.util.*;

class Solution {
    static class Item {
        int value, weight;
        double ratio;
        Item(int v, int w){
            value = v;
            weight = w;
            ratio = (double) v / w;
        }
    }
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        int n = val.length;
        Item[] items = new Item[n];
        for(int i = 0; i < n; i++){
            items[i] = new Item(val[i], wt[i]);
        }
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double x = 0.0;
        int y = capacity;
        for(Item i : items){
            if(y == 0){
                break;
            }
            if(i.weight <= y){
                x += i.value;
                y -= i.weight;
            }else{
                x += i.ratio * y;
                y = 0;
            }
        }
        return Math.round(x * 1_000_000d) / 1_000_000d;
    }
}
