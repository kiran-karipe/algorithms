package algorithms;

public class EquallyStrong {
	boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
	    if((yourLeft  == friendsLeft) && (yourRight == friendsRight)) {
	        return true;
	    } else if((yourLeft == friendsRight) && (yourRight == friendsLeft)) {
	    	return true;
	    }
	    else {
	        return false;
	    }
	}
}
