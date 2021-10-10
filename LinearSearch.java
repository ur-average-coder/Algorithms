public class LinearSearch {
    public static void main(String args[]) {

        int[] myArray = {33, 45, 7, 48, 56, 88};
        int[] otherArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

        System.out.println("Search the first array");
        System.out.println(linearSearch(myArray, 48));
        System.out.println(linearSearch(myArray, 22));

        System.out.println();

        System.out.println("Search the other array");
        System.out.println(linearSearch(otherArray, 14));
        System.out.println(linearSearch(otherArray, 51));
        System.out.println(linearSearch(otherArray, 1));
    }

    public static boolean linearSearch(int[] array, int x){
        for(int i = 0; i<array.length; i++){
            if(array[i] != x ){
                //System.out.println("Found " + array[i] + " instead");
            } else {
                return true;
            }
        }
        return false;

    }
}
