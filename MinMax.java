import java.util.Arrays;
class MinMax{
    public static void main(String[] args) {
        int arr[]={5,7,2,9,1,3,6};
        int n=0;
        for(int i:arr){
            n++;
        }
        // sorting method
        // Arrays.sort(arr);
        // int min=arr[0],max=arr[n-1];

        // linear search
        int min=arr[0],max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min)
                min=arr[i];
            else if(arr[i]>max)
                max=arr[i];
            else{}
        }


        System.out.println("Minimum: "+min+"\nMaximum: "+max);
    }
}