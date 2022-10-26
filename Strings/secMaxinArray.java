public class secMaxinArray {
    int print2largest(int arr[], int n) {
        int max = arr[0];
        int secMax = -1;     
        for(int i=1;i<n;i++){
            if(max<arr[i]){ 
                secMax = max;
                max = arr[i];
            }else if(secMax < arr[i] && arr[i] != max){
                secMax = arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int arr[] = {12,2,34,45,56,66,76,32,1,87,99,101,101,100};

       secMaxinArray obj = new secMaxinArray();
       int ans = obj.print2largest(arr,arr.length);
        System.out.print(ans);
    }
}