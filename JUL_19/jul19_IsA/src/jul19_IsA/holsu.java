package jul19_IsA;

import java.util.Random;

public class holsu extends Random {
	int n = nextInt(500);
	public holsu() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean chk() {
		if((n%2!=0)) {
			return true;
		}else return false;
	}
}
