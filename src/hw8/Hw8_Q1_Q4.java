package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*• 請建立一個Collection物件並將以下資料加入：
Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、
“Kitty”、Integer(100)、Object物件、“Snoopy”、BigInteger(“1000”)
*/

public class Hw8_Q1_Q4 {

	private static final List<Object> LIST = new ArrayList<Object>();
	static {
		LIST.add(Integer.valueOf(100));
		LIST.add(Double.valueOf(3.14));
		LIST.add(Long.valueOf(21L));
		LIST.add(Short.valueOf("100"));
		LIST.add(Double.valueOf(5.1));
		LIST.add("Kitty");
		LIST.add(Integer.valueOf(100));
		LIST.add(new Object());
		LIST.add("Snoopy");
		LIST.add(new BigInteger("1000"));
	}

	public static void main(String[] args) {
		GetElements ge = new GetElements(LIST);
		// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
		ge.printIterator();
		ge.printFor();
		ge.printForEach();

		System.out.println("-------------------");
		// 移除不是java.lang.Number相關的物件
		numOnlyElement noe = new numOnlyElement(LIST);
		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		noe.print();
		
	}

	// 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
	static class GetElements {

		Iterator<Object> it;
		List<Object> dateFor;
		List<Object> dateForEach;

		public GetElements() {
		}

		public GetElements(List<Object> list) {
			setIterator(list);
	
			setFor(list);
			setForEach(list);
		}

		public void setIterator(List<Object> list) {
			this.it = list.iterator();
		}

		public Iterator<Object> getIterator() {
			return this.it;
		}

		public void printIterator() {
			System.out.println("------使用Iterator------");
			while (this.it.hasNext()) {
				System.out.println(this.it.next());
			}
		}

		public void setFor(List<Object> list) {
			this.dateFor = list;
		}

		public Object getFor() {
			return this.dateFor;
		}

		public void printFor() {
			System.out.println("------使用for------");
			for (int i = 0; i < dateFor.size(); i++) {
				System.out.println(dateFor.get(i));
			}

		}

		public void setForEach(List<Object> list) {
			this.dateForEach = list;
		}

		public List<Object> getForEach() {
			return this.dateForEach;
		}

		public void printForEach() {
			System.out.println("------使用for.each------");
			for (Object tempList : this.dateForEach) {
				System.out.println(tempList);
			}
		}

	}

	// 移除不是java.lang.Number相關的物件
	static class numOnlyElement {

		List<Number> numOnlyData = new ArrayList<Number>();
		
		public numOnlyElement() {
			
		}
		
		public numOnlyElement(List<Object> inputList) {
			setNumOnlyElement(inputList);
		}

		public void setNumOnlyElement(List<Object> inputList) {
			Iterator<Object> it = inputList.iterator();
			
			while (it.hasNext()) {
				try {
						numOnlyData.add((Number)it.next());
					}
				 catch (ClassCastException e) {
					System.out.println("移除非Number物件。");
				}
			}
		}

		public List<Number> getNumOnlyElement() {
			return this.numOnlyData;
		}

		// 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		public void print() {
			System.out.println("------以下為集合內Number物件------");
			for (int i = 0; i < numOnlyData.size(); i++) {
				System.out.println(numOnlyData.get(i));
			}
		}
	}

}
