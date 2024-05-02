import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class FiboSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	final int f=10;
	//fibo(f);
	//String a="kkbabkk9";
	//facto();
	//System.out.println(palindrome(a));
	//hashSet();
	System.out.println("*************************************");
	//linkedHashSet();
	//treeHashSet();
	//vector();
	//map();
	//stack();
	removeDuplicates();
	}
	
static void fibo(int f) {
	int fibo=0, a=1,b=0;
	while(fibo<=f) {
		System.out.println(fibo);
		fibo=a+b;
		a=b;
		b=fibo;
	}
	
}
static void facto() {
	int facto=1;
	for(int i=1;i<=5;i++) {
		facto=facto*i;
		
		
	}
	System.out.println(facto);
}
static boolean palindrome(String a) {
	StringBuffer b=new StringBuffer(a.toString());
	System.out.println(b.reverse());
	//StringBuffer c=new StringBuffer(b.reverse());
	System.out.println(b);
	
	return a.equals(b.toString());
	
}
static void arrayList() {
	List<Integer> l=new ArrayList<Integer>();
	l.add(13);
	l.add(2);
	l.add(43);
//	for(int i=0;i<l.size();i++) {
//	System.out.println(l.get(i));}
//	System.out.println("using for Iterator");
//	for (Iterator iterator = l.iterator(); iterator.hasNext();) {
//		Integer integer = (Integer) iterator.next();
//		System.out.println(integer);
//	}
	System.out.println("using for each");
	for (Integer integer : l) {
		System.out.println(integer);
	}
	
	//l.remove(2); using index 
	l.contains(433);
	System.out.println(l.contains(22));
	
}
static void hashSet() {
Set<Integer> a=new HashSet<Integer>();
a.add(12);
a.add(2990);
a.add(10);
a.add(42342);

a.add(42342350);
//System.out.println(a);
Iterator<Integer> it=a.iterator();
while (it.hasNext()) {
	
System.out.println(it.next());
	
}
}
static void linkedHashSet() {
	LinkedHashSet<Integer> a=new LinkedHashSet<Integer>();
	a.add(2121);
	a.add(12);
a.add(2990);
a.add(10);
a.add(42342);

a.add(42342350);
//System.out.println(a);
Iterator<Integer> it=a.iterator();
while (it.hasNext()) {
	
System.out.println(it.next());
	
}
}
static void treeHashSet() {
	TreeSet<Integer> a=new TreeSet<Integer>();
	a.add(2121);
	a.add(12);
a.add(2990);
a.add(10);
a.add(42342);

a.add(42342350);
//System.out.println(a);
Iterator<Integer> it=a.iterator();
while (it.hasNext()) {
	
System.out.println(it.next());
	
}
}
static void vector(){
	Vector<Integer> a=new Vector<Integer>();
	a.add(2121);
	a.add(12);
a.add(2990);
a.add(10);
a.add(42342);

a.add(42342350);
//System.out.println(a);
a.remove(1);
Iterator<Integer> it=a.iterator();
while (it.hasNext()) {
	
System.out.println(it.next());
	
}

}
static void map(){
	//Map<Integer, String> a=new HashMap<Integer, String>();
	//HashMap<Integer, String> a=new HashMap<Integer, String>();
	TreeMap<Integer, String> a=new TreeMap<Integer, String>();
	a.put(4,"jai sadguru");
	a.put(11,"jai sadguru");

	a.put(1,"sri");
	a.put(2,"jay jay raguvir samarth");
a.put(3,"sri ram samarth");
//System.out.println(a);
	
System.out.println(a);
//a.remove(4, "jai sadguru");
	for (Map.Entry<Integer, String> entry : a.entrySet()) {
		Integer key = entry.getKey();
		String val = entry.getValue();
		System.out.println(key+" : "+val);
	}

}
static void stack() {
	Stack<Integer> a=new Stack<Integer>();
	a.push(1);
	a.push(2);
	a.push(3);
System.out.println(a);
for (Integer integer : a) {
	
	System.out.println(integer);


}

}
static void removeDuplicates() {
    StringBuilder result = new StringBuilder();
    String input = "fdasrwereafsadaetfdast";
    StringBuilder result1 = new StringBuilder();
    
    int count = 1; // initialize count for first character
    result.append(input.charAt(0));  // initialize prevChar with the first character

    for (int i = 1; i < input.length(); i++) {
    	count=1;
    	for (int j = result.length()-1; j >=0; j--) {
			
		
        if (result.charAt(j) == input.charAt(i)) {
            count++;
        } 
    	}if(count<=2) {
    	result.append(input.charAt(i));
        }}
    System.out.println(result.toString());
	StringBuffer result2=new StringBuffer();

for(int i=0;i<input.length();i++) {
	count=0;
	result2.append(input.charAt(i));
	if(((result1.toString()).contains(result2))){
		break;
	}else
	for (int j =i; j < input.length(); j++) {
		System.out.println(input.charAt(i)+" "+input.charAt(j));
		
		if(input.charAt(i)==input.charAt(j))  {
			count++;
			System.out.println(count);
			
		}
		System.out.println(count);
	}System.out.println(count);
	if(count<=1)
		{
		result1.append(input.charAt(i));
		}else {
			result1.append(input.charAt(i));
			result1.append(count);
		}
	result2.deleteCharAt(0);
		
}System.out.println(result1.toString());
} }  

    


