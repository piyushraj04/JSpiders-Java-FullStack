package jsp.springcore;

import java.util.Map;

public class Shop {
	String name;
	String gstNo;
	String location;
	Map<Integer,String>products;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Map<Integer, String> getProducts() {
		return products;
	}
	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Shop [name=" + name + ", gstNo=" + gstNo + ", location=" + location + ", products=" + products + "]";
	}
	

}
