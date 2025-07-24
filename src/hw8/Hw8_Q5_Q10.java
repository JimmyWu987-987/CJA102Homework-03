package hw8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*• 請設計一個Train類別，並包含以下屬性：
- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
- 目的地 dest，型別為String - 票價 price，型別為double

• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
需使用的集合裡
- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
- (1254, “區間”, “屏東”, “基隆”, 700)
- (118, “自強”, “高雄”, “台北”, 500)
- (1288, “區間”, “新竹”, “基隆”, 400)
- (122, “自強”, “台中”, “花蓮”, 600)
- (1222, “區間”, “樹林”, 七堵, 300)
- (1254, “區間”, “屏東”, “基隆”, 700)
*/

public class Hw8_Q5_Q10 {

	private static final List<Train> trainList = new ArrayList<Train>();
	static {
		trainList.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
		trainList.add(new Train(118, "自強", "高雄", "台北", 500));
		trainList.add(new Train(1288, "區間", "新竹", "基隆", 400));
		trainList.add(new Train(122, "自強", "台中", "花蓮", 600));
		trainList.add(new Train(1222, "區間", "樹林", "七堵", 300));
		trainList.add(new Train(1254, "區間", "屏東", "基隆", 700));
	}

	public static void main(String[] args) {
		NotRepeatedElement tempTrainList = new NotRepeatedElement(trainList);
		tempTrainList.print();

	}


//	• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//	• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//	• (以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

	static class GetElements {

		Iterator<Train> it;
		Set<Train> dateFor;
		Set<Train> dateForEach;

		public GetElements() {
		}

		public GetElements(Set<Train> trainlist) {
			setIterator(trainlist);
			setFor(trainlist);
			setForEach(trainlist);
		}

		public void setIterator(Set<Train> trainlist) {
			this.it = trainlist.iterator();
		}

		public Iterator<Train> getIterator() {
			return this.it;
		}

		public void printIterator() {
			System.out.println("------使用Iterator------");
			while (this.it.hasNext()) {
				Train tempTrain = this.it.next();
				System.out.print(tempTrain.getNumber() + ", ");
				System.out.print(tempTrain.getType() + ", ");
				System.out.print(tempTrain.getStart() + ", ");
				System.out.print(tempTrain.getDest() + ", ");
				System.out.print(tempTrain.getPrice() + "\n");
			}
		}

		public void setFor(Set<Train> trainlist) {
			this.dateFor = trainlist;
		}

		public Object getFor() {
			return this.dateFor;
		}

//		public void printFor() {
//			System.out.println("------使用for------");
//			for (int i = 0; i < dateFor.size(); i++) {
//				System.out.print(dateFor.next().getNumber() + ", ");
//				System.out.print(dateFor.get(i).getType() + ", ");
//				System.out.print(dateFor.get(i).getStart() + ", ");
//				System.out.print(dateFor.get(i).getDest() + ", ");
//				System.out.print(dateFor.get(i).getPrice() + "\n");
//			}
//
//		}

		public void setForEach(Set<Train> trainlist) {
			this.dateForEach = trainlist;
		}

		public Set<Train> getForEach() {
			return this.dateForEach;
		}

		public void printForEach() {
			System.out.println("------使用for.each------");
			for (Train tempList : this.dateForEach) {
				System.out.print(tempList.getNumber() + ", ");
				System.out.print(tempList.getType() + ", ");
				System.out.print(tempList.getStart() + ", ");
				System.out.print(tempList.getDest() + ", ");
				System.out.print(tempList.getPrice() + "\n");
			}
		}

	}
	
//	• 請寫一隻程式，能印出不重複的Train物件
	static class NotRepeatedElement {

		Set<Train> notRepeatedData = new HashSet<Train>();
		
		public NotRepeatedElement() {

		}

		public NotRepeatedElement(List<Train> inputList) {
			setNotRepeatedElement(inputList);
		}

		public void setNotRepeatedElement(List<Train> inputList) {
			Iterator<Train> it = inputList.iterator();

			while (it.hasNext()) {
				try {
					notRepeatedData.add(it.next());
				} catch (ClassCastException e) {
					System.out.println("移除非Number物件。");
				}
			}
		}

		public Set<Train> getNotRepeatedElement() {
			return this.notRepeatedData;
		}

		public void print() {
			GetElements ge = new GetElements(notRepeatedData);
			ge.printForEach();
			ge.printIterator();

//			System.out.println("------以下為集合內Number物件------");
//			Iterator<Train> it = notRepeatedData.iterator();
//			while (it.hasNext()) {
//				Train tempTrain = it.next();
//				System.out.print(tempTrain.getNumber() + ", ");
//				System.out.print(tempTrain.getType() + ", ");
//				System.out.print(tempTrain.getStart() + ", ");
//				System.out.print(tempTrain.getDest() + ", ");
//				System.out.print(tempTrain.getPrice() + "\n");
//			}
		}
	}
}
