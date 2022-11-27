package chapter_3;

import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int []a = {1,3,4,6,9};
        //初始时间
        long startTime = System.nanoTime();

        /*要计算的程序部分*/
        int m = maxProfit(a,6);
        System.out.println(m);
        //结束时间
        long endTime = System.nanoTime();
        //打印
        System.out.println("程序运行时间：" + (endTime - startTime) + "ns");

//        int [][] a =;


//        System.out.println(Arrays.toString(a));
    }
    public static int maxProfit(int[] prices,int difference) {
//       int i=0 , j=1;
//       while(j!=prices.length){
//           if(prices[i]-prices[j]==difference){
//               return 1;
//           } else if (prices[i]-prices[j]<difference) {
//               j++;
//           } else if (prices[i]-prices[j]>difference&&j-i>1) {
//               i++;
//           }else if (prices[i]-prices[j]>difference&&j-i==1) {
//               i++;
//               j++;
//           }
//       }
//       return 0;
        int j=0;
        for (int i = 0; i < prices.length-1; i++) {
            while (j< prices.length-1 && prices[i]-prices[j]>difference) j=j+1;
            if (prices[i]-prices[j]==difference) return 1;
        }
        return 0;


    }

    }

