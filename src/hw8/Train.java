package hw8;

import java.util.Objects;

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

public class Train {

	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;

	public Train() {
	};
	
	public Train(int number,String type,String start,String dest,double price) {
		setNumber(number);
		setType(type);
		setStart(start);
		setDest(dest);
		setPrice(price);
	};

	public void setNumber(int number) {
		this.number = number;
	}
	public int getNumber() {
		return number;
	}
	
	public void setType(String type) {
		this.type=type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public void  setStart(String start) {
		this.start = start;
	}
	
	public String getStart() {
		return this.start;
	}
	
	public void setDest(String dest) {
		this.dest= dest;
	}
	
	public String getDest() {
		return dest;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}
	
	public double getPrice () {
		return price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return number == other.number && Objects.equals(type, other.type);
	} 
	
	
}
