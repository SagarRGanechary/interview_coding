public class ArrayMethods {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        // length of the array

        System.out.println(arr.length);
        // set element
        arr[2] = 30;
        System.out.println("set array : "+arr[2] );

        //traver the array
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
