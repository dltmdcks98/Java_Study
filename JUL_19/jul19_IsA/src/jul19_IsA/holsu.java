package jul19_IsA;

import java.util.Random;

public class holsu extends Random {
//	int n = nextInt(500);
	public holsu() {
		// TODO Auto-generated constructor stub
	}
	
//	public boolean chk() {
//		if((n%2!=0)) {
//			return true;
//		}else return false;
//	}
	
	@Override
	public int nextInt(int num) {
		int temp = super.nextInt(num);
		// TODO Auto-generated method stub
		while(true) {
			if(temp%2!=0) {
				break;
			}else {
				temp = super.nextInt(num);
			}
		}
		return temp;
	 
	}
}
