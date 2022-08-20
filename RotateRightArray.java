package Solutions;

public class RotateRightArray
{
	//189. Rotate Array
	    
	    public void reverse(int[] nums, int start, int end)
	    {
	        while(start < end)
	        {
	            int temp = nums[end];
	            nums[end] = nums[start];
	            nums[start] = temp;
	            start++;end--;
	        }
	    }
	    public void rotate(int[] nums, int k)
	    {
	        int len = nums.length;
	        if(k > len) k = k % len;
	        int count = len - k;
	        
	        reverse(nums, 0, count - 1);
	        reverse(nums, count, len - 1);        
	        reverse(nums, 0, len - 1);
	        
	        
	    }
	

	// 4 3 2 1 5 6 7
	// 7 6 5 1 2 3 4
	// 5 6 7 1 2 3 4
	

}
