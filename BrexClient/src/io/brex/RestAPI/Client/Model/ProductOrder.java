package io.brex.RestAPI.Client.Model;
 
public class ProductOrder {
 public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getSubjectValue() {
		return subjectValue;
	}
	public void setSubjectValue(String subjectValue) {
		this.subjectValue = subjectValue;
	}
	public String getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}
	public String getOption() {
		return option;
	}
	public void setOption(String option) {
		this.option = option;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getOrdered() {
		return ordered;
	}
	public void setOrdered(long ordered) {
		this.ordered = ordered;
	}
protected String identity, owner,sku;
 protected float price;
 protected String subjectValue, subjectId, option, status; 
 protected long ordered; // unix timestamp
}
