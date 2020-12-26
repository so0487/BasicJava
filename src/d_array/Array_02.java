package d_array;

import java.util.Arrays;

public class Array_02 {
	public static void main(String[] args) {
	/*
	 1. 정렬
	 	- 어떤 데이터를 빠르고 쉽게 찾기 위해 일정한 순서대로 데이터들을 가지런히 나열하는 작업이다. 
	 	- 버블정렬, 선택정렬, 삽입정렬
	 */	
		
	/*
	 2. 버블정렬(bubble sort)
	 	- 인접한 데이터간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
	 	- 회전이 진행됨에 따라 가장 큰 값을 뒤로 보낸다.
	 */	
		int[] bubble = {5,2,3,1,4};
		//1번
//		if(bubble[0]>bubble[1]){
//			int tmp=bubble[0];
//			bubble[0] = bubble[1];
//			bubble[1] = tmp;
//		}
//		for(int i = 0;i<bubble.length;i++){
//			System.out.print(bubble[i]+" ");
//		}
//		System.out.println();
//		
//		//2번
//		if(bubble[1]>bubble[2]){
//			int tmp=bubble[1];
//			bubble[1] = bubble[2];
//			bubble[2] = tmp;
//		}
//		for(int i = 0;i<bubble.length;i++){
//			System.out.print(bubble[i]+" ");
//		}
//		System.out.println();
//		
//		//3번
//		if(bubble[2]>bubble[3]){
//			int tmp=bubble[2];
//			bubble[2] = bubble[3];
//			bubble[3] = tmp;
//		}
//		for(int i = 0;i<bubble.length;i++){
//			System.out.print(bubble[i]+" ");
//		}
//		System.out.println();
//		
//		//4번
//		if(bubble[3]>bubble[4]){
//			int tmp=bubble[3];
//			bubble[3] = bubble[4];
//			bubble[4] = tmp;
//		}
//		for(int i = 0;i<bubble.length;i++){
//			System.out.print(bubble[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println("================");
		
		//for로 변경
		for(int j=0; j<bubble.length-1;j++){
			System.out.println(j+1+"회전");
			for(int s=0;s<bubble.length-1;s++){
				if(bubble[s]>bubble[s+1]){
					int tmp = bubble[s];
					bubble[s] = bubble[s+1];
					bubble[s+1]=tmp;
				}
				for(int i=0;i<bubble.length;i++){
					System.out.print(bubble[i]+" ");
				}
				System.out.println();
			}
		}
		
		/*
		 3. 선택정렬(select sort)
		 	- 정렬의 대상에서 최솟값을 찾아서 맨 앞의 내용과 교체하는 방식이다.
		 */
		int[] select  = new int[]{5,2,3,1,4};
		
		//1. 기준방 : 0  최소값 찾기
//		int min = select[0];
//		int minBang=0;
//		for(int i=0;i<select.length;i++){
//			if(min>select[i]){
//				min = select[i];
//				minBang = i;
//			}
//		}
//		System.out.println(minBang);
//		
//		int tmp = select[0];
//		select[0] = select[minBang];
//		select[minBang] = tmp;
//		
//		System.out.println(Arrays.toString(select));
//		
//		//2회전
//		int min2 = select[1];
//		int minBang2=1;
//		for(int i=1+1;i+1<select.length;i++){
//			if(min>select[i]){
//				min = select[i];
//				minBang = i;
//			}
//		}
//		
//		int tmp2 = select[1];
//		select[1] = select[minBang];
//		select[minBang] = tmp;
//		
//		System.out.println(Arrays.toString(select));
		
		
		//for문 사용
		System.out.println("===================================");
		for(int j=0;j<select.length-1;j++){
			int min = select[j];
			int minBang=j;
			for(int i=1+j;i<select.length;i++){
				if(min>select[i]){
					min = select[i];
					minBang = i;
				}
			}
			int tmp = select[j];
			select[j] = select[minBang];
			select[minBang] = tmp;
		
			System.out.println(Arrays.toString(select));
		}
	}
}
