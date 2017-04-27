import java.util.HashSet;
import java.util.Set;

// This insert elements in random order
// This inserts duplicate elements also. To avoid this, override 'hashcode' method and'equals' method

/* In hashcode method, it returns the hashcode of the value, but every value has different hascode hence
 * they are treated differently but there value is same, so if we return the value in the that method
 * then it will check whether that value is already present, instead of hashcode */


public class hashSetDemo {
	
	public static void main(String[] args) {
		Set<MyClass> set = new HashSet<MyClass>();
		
		set.add(new MyClass(40));
		set.add(new MyClass(30));
		set.add(new MyClass(70));
		set.add(new MyClass(60));
		set.add(new MyClass(30));
		set.add(new MyClass(20));
		set.add(new MyClass(50));
		set.add(new MyClass(30));
		
		System.out.println(set);
		
	}
	
}

class MyClass {
	Integer i;
	
	public MyClass(Integer i) {
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
		MyClass myClass = (MyClass) obj;
		
		if(this.i == myClass.i) {
			return true;
		}
		else
			return false;
	}
}