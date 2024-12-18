
import java.util.Arrays;

class BinarySearch{
    void search(int arr[],int n){
        Arrays.sort(arr);
        int mid,min=0,max=arr.length;
        while(min<max){
            mid=(min+max)/2;
            if(arr[mid]==n){
                System.out.println("key found");
                break;
            }
            else if(arr[mid]>n){
                max=mid-1;
            }
            else if(arr[mid]<n){
                min=mid+1;
            }
            else{
                System.out.println("key not found");
            }
        }
    }
    public static void main(String[] args) {
        int []arr={3,6,8,3,910,12};
        int n=8;
        BinarySearch obj =new BinarySearch();
        obj.search(arr, n);
    }
}
