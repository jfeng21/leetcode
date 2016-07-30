class TrappingRainWater_42{
   public int trap(int[] height){
    int secHeight = 0;
    int left = 0;
    int right = height.length - 1;
    int area = 0;
    
    while(left < right){
       if(height[left] < height[right]){
         secHeight = Math.max(height[left], secHeight);
         area += secHeight - heigth[left];
         left++;
       }else{
          secHeight = Math.max(height[right], secHeight);
          area += secHeight - height[right];
          right--;
       }
    }
    
    return area;
   }


}
