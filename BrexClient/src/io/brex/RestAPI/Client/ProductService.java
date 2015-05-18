package io.brex.RestAPI.Client;

import javax.ws.rs.core.Form;

import io.brex.RestAPI.Client.Model.Product;
import io.brex.RestAPI.Client.Model.ProductDelivery;
import io.brex.RestAPI.Client.Model.ProductOrder;
import io.brex.RestAPI.Client.Model.ProductOrderNotifier;
import io.brex.RestAPI.Client.Tools.BrexConfig;

public class ProductService extends BrexService implements IProductService
{
	
	public ProductService(BrexConfig config)  { super(config); }

	public ProductService() { super(); }
	
    public Product productAvailability( String sku, String subjectId) 
    {
    	return getProduct("product/availability/%s/%s", sku, subjectId);
    }
    
    public ProductOrder productBuyVanilla(String sku, String subjectId)
    {
        return getProductOrder((Form)null, "product/order/%s/%s", sku, subjectId);
    }
    
    public ProductOrder productBuyFlavoured(String sku, String option, String subjectId)
    {
        return getProductOrder((Form)null, "product/order/%s/%s/%s", sku, option, subjectId);
    }
    
    public ProductDelivery orderRetrieve(String orderId)
    {
        return getProductDelivery("product/%s", orderId);
    }

	public Product[] productSearch(String subject) {
		return getProducts("product/search/%s", subject);
	}

	public ProductOrder orderStatus(String orderId) {
		return getProductOrder("product/status/%s", orderId);
	}

	public ProductOrderNotifier createNotifier(String orderId, String uri) {
		return getProductOrderNotifier((Form)null, "product/notifier/%s/get/%s", orderId,  uri.replace('/', '~') );
	}

	public ProductOrderNotifier getNotifier(String notifierId) {
		return getProductOrderNotifier("product/notifier/%s", notifierId);
	}

    protected Product getProduct(String pattern, String... subs)
    {
        return (Product) _cf.Getter[2].get( pattern, subs );
    }

    protected Product[] getProducts(String pattern, String... subs)
    {
        return (Product[]) _cf.Getter[3].get( pattern, subs );
    }
    
    protected ProductOrder getProductOrder(String pattern, String... params) 
    {
    	return (ProductOrder) _cf.Getter[4].get(pattern, params);	
    }
 
    protected ProductOrder getProductOrder(Form form, String pattern, String... params) 
    {
    	return (ProductOrder) _cf.Getter[4].post(form, pattern, params);	
    }
    
    protected ProductDelivery getProductDelivery(String pattern, String... params)
    {
        return (ProductDelivery) _cf.Getter[6].get( pattern, params);
    }

    protected ProductOrderNotifier getProductOrderNotifier(String pattern, String... params)
    {
        return (ProductOrderNotifier) _cf.Getter[10].get( pattern, params);
    }
    
    protected ProductOrderNotifier getProductOrderNotifier(Form form, String pattern, String... params)
    {
        return (ProductOrderNotifier) _cf.Getter[10].post(form, pattern, params);
    }
}
