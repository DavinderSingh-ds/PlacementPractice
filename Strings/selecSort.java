public class selecSort {
    public static void main(String[] args) {
        int arr[] = {12,2,3,45,65,7,8,98,0};
        for(int i=0;i<arr.length;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
