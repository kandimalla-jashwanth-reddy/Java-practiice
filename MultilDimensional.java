//package Reddy.Assessments;
//
//public class MultilDimensional {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[][]= {
//				{1, 8, 4},
//				{9, 7, 2},
//				{7, 6, 4}
//				};
//		int sum=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum +=arr[i][j];
//			}
//	}
//		System.out.println(sum);
//	}
//}



//package Reddy.Assessments;
//
//public class MultilDimensional {
//
//	public static void main(String[] args) {
//		int sum=0;
//		int finalSum=0;
//		int arr[][]= {
//				{1, 2, 1},
//				{9, 7, 2},
//				{7, 6, 4}
//	    };
//		int arr1[][]= {
//				{1, 6, 1},
//				{0, 7, 3},
//				{1, 6, 4}
//		};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				sum =arr[i][j]+arr1[i][j];
//				System.out.print(sum+" ");
//			}
//			System.out.println();
//			
//		}
//	}
//}



//package Reddy.Assessments;
//
//public class MultilDimensional {
//
//	public static void main(String[] args) {
//		int arr1=0;
//		int arr[][]= {{2,3,5},
//					{0,1,3},
//					{1,2,4}};
//		for(int i=0;i<arr.length;i++) {
//			for (int j=0;j<arr[1].length;j++) {
//				arr1=arr[i][j]*arr[i][j];
//				System.out.print(arr1+" ");
//			}
//		System.out.println();
//		}
//		}
//	}



//package Reddy.Assessments;
//
//public class MultilDimensional {
//
//	public static void main(String[] args) {
//		
//		int arr1=0;
//		int arr[][]= {  {1,8,4},
//						{9,7,2},
//						{7,6,4}
//		};
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr[i].length;j++) {
//				
//				int temp=arr[i][j];
//				arr[i][j]=arr[j][i];
//				arr[j][i]=temp;
//			}
//		}
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr[i].length;j++) {
//				
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
//	}
//	
//	}


