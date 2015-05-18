package io.brex.RestAPI.Client;

import io.brex.RestAPI.Client.Model.*;

public interface IProductService {
	//  https://api.brex.io/docs/v1-product.json
    Product[] productSearch(String subject);
    Product productAvailability(String sku, String subjectId);
    ProductOrder productBuyVanilla(String sku, String subjectId);
    ProductOrder productBuyFlavoured(String sku, String option, String subjectId);
    ProductOrder orderStatus(String orderId);
    ProductDelivery orderRetrieve(String orderId);
    ProductOrderNotifier createNotifier(String orderId, String uri);
    ProductOrderNotifier getNotifier(String notifierId); 
}
