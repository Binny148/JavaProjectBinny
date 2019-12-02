package JavaPractice;

public class secondLargestNumber {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10,12,13};
        System.out.println(secMaxNum(arr));
    }

    public static int secMaxNum(int[] arr){
        int max=0;
        int secMaxNum=0;
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                secMaxNum=max;
                max=arr[i];
            }else if(secMaxNum<arr[i] && arr[i]<max){
                secMaxNum=arr[i];
            }
        }
        return secMaxNum;
    }
}
