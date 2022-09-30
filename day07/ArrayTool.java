import java.util.Arrays;

class ArrayTool{
    public static void main(String[] args){
        int[] arr1 = new int[]{1,5,2,7};
        int[] arr2 = new int[]{1,2,6,2};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        System.out.println(Arrays.toString(arr1));

        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        int index = Arrays.binarySearch(arr2, 6);
        System.out.println(index); //如果返回负数，则说明没找到
    }
}