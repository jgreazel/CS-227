package test;

import java.util.ArrayList;
import java.util.Arrays;

import api.Move;
import hw3.GameUtil;

public class ShiftArrayRedo {
	GameUtil takeout = new GameUtil();
	
	public static void main(String[] args) {
		int[] arr = {3,1,2,0,4};
		System.out.println(shiftArray(arr) + Arrays.toString(arr));
	}
	
	public static ArrayList<Move> shiftArray(int[] arr) {
		ArrayList<Move> result = new ArrayList<Move>();
		for(int i=0;i<arr.length-1;i++) {
			if(mergeValues(arr[i],arr[i+1]) !=0 || arr[i] == 0) {
				if(mergeValues(arr[i], arr[i+1]) !=0){
					result.add(new Move(i+1,i,i,arr[i+1],arr[i],mergeValues(arr[i], arr[i+1])));
					arr[i]=mergeValues(arr[i],arr[i+1]);
					for(int j=i+2;j<arr.length;j++) {
						if(arr[j]!=0) {
							result.add(new Move(j,j-1,arr[j]));
						}
						arr[j-1]=arr[j];
					}
					arr[arr.length-1]=0;
					return result;
				}
				if(arr[i]==0) {
					for(int k=0;k<arr.length-1;k++) {
						if(arr[k]==0) {
							if(arr[k+1]!=0) {
								result.add(new Move(k+1,k,arr[k+1]));
								arr[k]=arr[k+1];
								arr[k+1]=0;
							}
						}
					}
				}
				arr[arr.length-1]=0;
				return result;
			}
		}
		return result;
	}
	
	public static int mergeValues(int a, int b) {
		if (a > 0 && b > 0 && (a + b == 3) || (a >= 3 && b == a)) {
			return a + b;
		} else {
			return 0;
		}
	}
}
