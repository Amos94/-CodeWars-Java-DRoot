

public class DRoot {
  public static int digital_root(int n) {
	
	  int dRoot = -1;
	  
	  int newNo = n;
	  
	  //newNo = cutAndAdd(n);
	  
	  while(newNo >= 10) {
		  //newNo = cutAndAdd(n);
		  
		  int sum = 0;
		  
		  while(newNo > 0) {
			  sum = sum + (newNo % 10);
			  newNo = newNo/10;
		  }
		  
		  newNo = sum;
	  }
	  
	  dRoot = newNo;
	  
	  return dRoot;
  }
  
//  public static int cutAndAdd(int k) {
//	  int sum = 0;
//	  
//	  while(k >= 0) {
//		  sum += k%10;
//		  k = k/10;
//	  }
//	  
//	  return sum;
//  }
//  
//  public static void main(String args[]) {
//	  int a = 123;
//	  
//	  DRoot test = new DRoot();
//	  System.out.println(test.digital_root(a));
//	  
//  }
}