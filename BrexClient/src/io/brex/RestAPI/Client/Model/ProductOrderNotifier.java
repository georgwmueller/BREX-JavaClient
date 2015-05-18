package io.brex.RestAPI.Client.Model;

public class ProductOrderNotifier {
    public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getProductOrderIdentity() {
		return productOrderIdentity;
	}
	public void setProductOrderIdentity(String productOrderIdentity) {
		this.productOrderIdentity = productOrderIdentity;
	}
	public String getNotifierType() {
		return notifierType;
	}
	public void setNotifierType(String notifierType) {
		this.notifierType = notifierType;
	}
	public String getCallback() {
		return callback;
	}
	public void setCallback(String callback) {
		this.callback = callback;
	}
	public long getLastCallTime() {
		return lastCallTime;
	}
	public void setLastCallTime(long lastCallTime) {
		this.lastCallTime = lastCallTime;
	}
	public int getLastResponseCode() {
		return lastResponseCode;
	}
	public void setLastResponseCode(int lastResponseCode) {
		this.lastResponseCode = lastResponseCode;
	}
	public String identity, productOrderIdentity, notifierType, callback;
    public long lastCallTime;
    public int lastResponseCode;
}
