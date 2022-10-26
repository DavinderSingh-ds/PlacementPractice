public class freqEveryEleminArra {
    public static void main(String[] args) {
        int arr[] = {12,12,2,2,2,3,34,4,32,5,5,12,12,12};
        int fr[] = new int[arr.length];
        int visited = -1;

        for(int i=0;i<arr.length;i++){
            int count = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)  
                fr[i] = count; 

        }
        for (int i = 0; i < arr.length; i++) {
            if (fr[i] != visited) 
            {
                System.out.println("freq of "+arr[i]+" is "+" "+fr[i]); 
            }        
        }
    }
}
