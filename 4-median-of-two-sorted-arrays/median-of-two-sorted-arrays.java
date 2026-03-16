import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
     int m= nums1.length;
     int n=nums2.length;
     int arr[]=new int[m+n];
     int k=0;
     for(int i=0;i<m;i++){
        arr[k++]=nums1[i];
     }
      for(int j=0;j<n;j++){
        arr[k++]=nums2[j];
     }
     Arrays.sort(arr);
      int size=arr.length;
     if(size%2==1){
        return arr[size/2];
     }
     else{
        return (arr[size/2-1]+arr[size/2])/2.0;
     }
  }
}