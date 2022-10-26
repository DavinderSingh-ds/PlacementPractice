public class freqEachElemArray {
    public static void main(String[] args) {
        int arr[] = {12,12,2,2,3,4,5,6,67,12,12};
        int freq = arr[0];
        int count = 1;
        for(int i=1;i<arr.length;i++){
            if(freq == arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
