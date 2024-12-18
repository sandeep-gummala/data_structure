class LinearSearch{
    boolean search(int arr[],int n){
         int size=arr.length;
         for(int i=0;i<size;i++){
            if(arr[i]==n){
                return true;
            }
         }
         return false;
    }
    public static void main(String[] args) {
        int [] arr={8,3,7,47,1};
        int n=1;
        LinearSearch s= new LinearSearch();
        if(s.search(arr,n)){
            System.out.println("Key Found");
        }
        else{
            System.out.println("Key not found");
        }
    }
}
