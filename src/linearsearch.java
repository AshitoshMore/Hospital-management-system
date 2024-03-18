import java.util.Arrays;

public class linearsearch {
    static int linersearch(int []arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int element:arr){

            if(element==target){
               return element;
            }

        }
        return -1;

    }
    static boolean searchcharAt(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static int minarray(int []arr){
        int ans=arr[0];
        for(int i=0;i<arr.length;i++){
            if(ans>arr[i]){
                ans=arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int num[]={1,2,3,4,5,6,7,8,9};
        System.out.println(minarray(num));
        //int target=5;
        //int ans=linersearch(num,target);
        //System.out.println(ans);
        String name="Ashitosh";
        char target='s';
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(searchcharAt(name,target));

    }
}
