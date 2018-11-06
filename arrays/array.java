/* Basic array structure
Uses a for loop to print out the contents of an array.
*/

class array
{
    public static void main (String[] args)
    {
      // declare an array of integers
      int[] arr;

      // allocate memory for 5 integers
      arr = new int[5];
   
      // initialize the first elements of the array
      arr[0] = 10;
 
      // initalize second element of array
      arr[1] = 20;
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;

      // access elements of specific array
      for (int i = 0; i < arr.length; i++) 
          System.out.println("Element at index " + i + " : " + arr[i]);
    }     
}
