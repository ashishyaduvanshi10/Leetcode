class Solution {
    public int[] sortArray(int[] nums) {
        int left=0;
        int right=nums.length-1;
        if(left>=right)return nums;
        mergeSort(nums,left,right);
        return nums;
    }
    public static void mergeSort(int []nums,int left,int right){
        if(left>=right)return;
        int mid=left+(right-left)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid+1,right);
        merge(nums,left,mid,right);
    }
    public static void merge(int []nums,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int []leftarr=new int [n1];
        int []rightarr=new int[n2];
        for(int i=0;i<n1;i++){
            leftarr[i]=nums[left+i];
        }
        for(int j=0;j<n2;j++){
            rightarr[j]=nums[mid+j+1];
        }
        int i=0;
        int j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftarr[i]<=rightarr[j]){
                nums[k]=leftarr[i];
                i++;
            }
            else{
                nums[k]=rightarr[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            nums[k]=leftarr[i];
            i++;
            k++;
        }
        while(j<n2){
            nums[k]=rightarr[j];
            j++;
            k++;
        }
    }
}