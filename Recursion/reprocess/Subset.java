/*
Generate Subsets
*/

class Subset{
	public static void main(String as[]){
		showSubsets(as[0], "", 0);
	}

	static void showSubsets(String s, String cur, int i){
		if(i==s.length()){
			System.out.println(cur);
			return;
		}
		showSubsets(s,cur,i+1);
		showSubsets(s,cur+s.charAt(i), i+1);
	}
}

//wtf is happening..
