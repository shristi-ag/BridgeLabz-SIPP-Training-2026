package Backtracking;

import java.util.*;

public class NQueens {

    public static List<List<String>> placeSensors(int n){

        List<List<String>> result=new ArrayList<>();

        int[] queenCol=new int[n];

        backtrack(n,0,queenCol,result);

        return result;
    }

    private static void backtrack(int n,
                                  int row,
                                  int[] queenCol,
                                  List<List<String>> result){

        if(row==n){

            result.add(buildBoard(n,queenCol));
            return;
        }

        for(int col=0;col<n;col++){

            if(isSafe(row,col,queenCol)){

                queenCol[row]=col;

                backtrack(n,row+1,queenCol,result);
            }
        }
    }

    private static boolean isSafe(int row,int col,int[] queenCol){

        for(int i=0;i<row;i++){

            if(queenCol[i]==col)
                return false;

            if(Math.abs(queenCol[i]-col)==Math.abs(i-row))
                return false;
        }

        return true;
    }

    private static List<String> buildBoard(int n,int[] queenCol){

        List<String> board=new ArrayList<>();

        for(int i=0;i<n;i++){

            StringBuilder sb=new StringBuilder();

            for(int j=0;j<n;j++){

                if(queenCol[i]==j)
                    sb.append("Q");
                else
                    sb.append(".");
            }

            board.add(sb.toString());
        }

        return board;
    }

    public static void main(String[] args){

        List<List<String>> ans=placeSensors(4);

        for(List<String> board:ans){

            for(String row:board)
                System.out.println(row);

            System.out.println();
        }
    }
}