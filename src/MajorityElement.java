import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {5,1,4,1,1,4,4,5,5,0,4,6};
        bruteforce(arr);
        sorting(arr);
        optimal(arr);
    }

    public static void  bruteforce(int[] n){   //o(n^2) and o(1)
        int max =0;
        int index=0;
        for(int a:n){
            int count=0;
            for(int b:n){
                if(a==b){
                    count++;
                }
            }
            if(count>=max){
                index=a;
                max=count;

            }
        }
        System.out.println(index);
    }

    public static void sorting(int[] n){
        Arrays.sort(n);
        int count=0;
        int maxcount=0;
        int majority=n[0];
        for(int i=0; i<n.length-1;i++){
            if(n[i]==n[i+1]){
                count++;
                if(count>maxcount){
                    majority=n[i];
                    maxcount=count;
                }
            }else{
                count=0;

            }
        }
        System.out.println(majority);
    }

    public static void optimal(int[] n){

        int count=0;
        int major = n[0];
        for(int a:n){
            if(count==0){
                count++;
                major=a;
            }else if(major==a){
                count++;
            }else{
                count--;
            }
        }
        System.out.println(major);

    }
}
