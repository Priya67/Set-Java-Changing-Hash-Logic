import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSetDemo {
	public static void main(String[] args) {
		Set<demo> set = new TreeSet<demo>();
		
		set.add(new demo(40));
		set.add(new demo(30));
		set.add(new demo(70));
		set.add(new demo(60));
		set.add(new demo(30));
		set.add(new demo(20));
		set.add(new demo(50));
		set.add(new demo(30));
		
		System.out.println(set);
		
	}
	
}

class demo implements Comparable<demo>{
	Integer i;
	
	public demo(Integer i) {
		this.i = i;
	}
	
	@Override
	public String toString() {
		return i+"";
	}
	
	@Override
	public int hashCode() {
		return i;
	}
	
	// Now only unique values will be inserted
	@Override
	public boolean equals(Object obj) {
		demo demoObj = (demo) obj;
		
		if(this.i == demoObj.i) {
			return true;
		}
		else
			return false;
	}

	// It will insert in descending order
	@Override
	public int compareTo(demo demoObj) {
		// TODO Auto-generated method stub
		return demoObj.i - this.i;
	}
	
//	// It will insert in ascending order
//		@Override
//		public int compareTo(demo demoObj) {
//			// TODO Auto-generated method stub
//			return this.i - demoObj.i;
//		}
	
}
