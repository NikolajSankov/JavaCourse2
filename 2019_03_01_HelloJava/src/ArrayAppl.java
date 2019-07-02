import telran.person.data.ArrayTools;

public class ArrayAppl {
     
    public static void main(String[] args) {
         
        int arr[]= {1,4,8,10,12,17};
        ArrayTools.printArray(arr);
        int arr2[]= {34,45,23,41,123,42,341,24,1234,123,12};
        ArrayTools.printArray(arr2);
         
        int len1=arr.length;
        System.out.println(len1);
        int len2=arr2.length;
        System.out.println(len2);
         
        int arr3[] = new int[15]; 
        ArrayTools.fillArray(arr3, -10, 10);
        ArrayTools.printArray(arr3);
         
         
 
    }
 
}