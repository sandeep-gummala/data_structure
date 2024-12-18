class InsertionSort{
    static void sorting(int arr[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr={9,2,5,1,16};
        int n=arr.length;
        sorting(arr, n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
}
