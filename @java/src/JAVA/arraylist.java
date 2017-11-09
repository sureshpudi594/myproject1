package JAVA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class arraylist {
//Array list
	public static void main(String[] args) {
		ArrayList<Object> a=new ArrayList<>();
		a.add(1);
		a.add("suresh");
System.out.println(a.get(1));
///Array object type declaration
Object[] b={a,1,5,"sursh"};
int l=b.length;
System.out.println(l);
//Array string  with size 2
String[]s=new String[2];
s[0]="Suresh";
s[1]="mahesh";
System.out.println(s.length);

ArrayList<Object> al=new ArrayList<Object>();
System.out.println(al.size());
al.add(1);
boolean c=al.contains(1);
System.out.println(c);
al.remove(0);
System.out.println(al);

LinkedList<Object> ll=new LinkedList<>();
ll.addFirst("suresh");
ll.add("mah");
ll.add(null);
boolean bb=ll.contains("suresh");
System.out.println(bb);
int q=ll.size();
System.out.println(q);
System.out.println(ll);
//vector
Vector<Object>v=new Vector<>();
System.out.println(v.capacity());
v.addElement(1);
v.add("surya");
System.out.println(v);
//stack
Stack< Object>st=new Stack<>();
st.add(0, "Suresh");
st.add("surya");
st.push("suyra");
st.pop();
st.peek();
System.out.println(st);
ArrayList<String>aa=new ArrayList<>();
aa.add("su");
aa.add("re");
aa.add(2, "sh");

Iterator<String>itr=aa.iterator();
while(itr.hasNext()){
	System.out.println(itr.next());

itr.remove();
}

	}

}
