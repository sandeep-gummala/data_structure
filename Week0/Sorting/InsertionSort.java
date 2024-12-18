class InsertionSort{
    static void sorting(int arr[],int n){
        for(int i=1;i<n-1;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&key<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
            
        }
    }
    public static void main(String[] args) {
        int []arr={9,2,5,1,16};
        int n=arr.length;
        long start_time=System.nanoTime();
        sorting(arr, n);
        long end_time=System.nanoTime();
        long overall=end_time-start_time;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(overall);
    }
}
