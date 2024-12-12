package in.kkpit.binding;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Product {
	
	@NotNull(message="Id required")
	private Integer pId;
	
	
//	
//	@Size(min=3,max=15,message="minimum 3 maximum 15 Required")
	@NotNull(message="name required")
	private String pName;
	
//	@NotNull(message="Price Required")
	private Double Price;
	
	
//	private Integer Qty;
	public void setpId(Integer pId) {
		this.pId=pId;
	}
	public Integer getpId() {
		return pId;
	}
	
	public void setpName(String pName) {
		this.pName=pName;
	}
	public String getpName() {
		return pName;
	}
	
	public void setPrice(Double Price) {
		this.Price=Price;
	}
	public Double getPrice() {
		return Price;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", Price=" + Price + "]";
	}

}
