import java.util.Arrays;

class Main {
  public static void main(String[] args) {
   int [] []  arr =new int [7] [9];
  
   for (int i=0; i<arr.length; i++){
     for (int j=0; j<arr[i].length; j++){
      
       arr[i][j]= 1+(int)(Math.random()*25);
     
    
  }
}

    int maxValue = arr[0][0];
    int maxColumn=-1;
    int maxRow=-1;
    
   for (int i=0; i<arr.length; i++){
     for (int j=0; j<arr[i].length; j++){
    
    if (arr[i][j]>maxValue){
      maxValue=arr[i][j];
      maxRow=i;
      maxColumn = j;
     
    }
    
  }
} 
     System.out.println(Arrays.deepToString(arr)); 
    System.out.println("The largest value in this array is " + maxValue + " and it is in index "+ "arr[" + maxRow + "][" +maxColumn + "]" );
  }
}