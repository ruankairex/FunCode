package nums;

//找出數列中可以插入1的空位，1的前後必須是0
public class CanPlaceFlowers {
	public static void main(String[] args) {
		int[] flowerbed = {1,0,0,0,1};
		int n = 2;
		Boolean ans = canPlaceFlowers2(flowerbed,n);
		System.out.println(ans);
	}
	
	// 我的第一個做法
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
		int goodPlace = 0;
        for(int i=0; i<flowerbed.length; i++){
            if(i==0) {
            	if(flowerbed[i]==0 && flowerbed[i+1]==0) {
            		goodPlace+=1;
            		flowerbed[i]=1;
            	}
            	continue;
            }
            if(i==flowerbed.length-1) {
            	if(flowerbed[i]==0 && flowerbed[i-1]==0) {
            		goodPlace+=1;
            		flowerbed[i]=1;
            	}
            	break;
            }
            if(flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i-1]==0) {
            	goodPlace+=1;
            	flowerbed[i]=1;
            	continue;
            }     
        }
        return n>goodPlace?false:true;
	}
	
	
	//
	public static boolean canPlaceFlowers2(int[] flowerbed, int n) {
	    int goodPlace = 0;

	    for(int i=0; i<flowerbed.length; i++) {
	    	if(flowerbed[i]==0) {
	    		if((i==0 || (flowerbed[i-1]==0)) && ((i==flowerbed.length-1)|| (flowerbed[i+1]==0))) {
		    		goodPlace+=1;
		    		flowerbed[i]=1;
		    	}
	    	}
	    	
	    }

	    return n > goodPlace ? false : true;
	}
}
