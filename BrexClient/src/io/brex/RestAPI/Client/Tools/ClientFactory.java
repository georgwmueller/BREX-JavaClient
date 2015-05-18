package io.brex.RestAPI.Client.Tools;

import io.brex.RestAPI.Client.Model.Announcement;
import io.brex.RestAPI.Client.Model.Company;
import io.brex.RestAPI.Client.Model.Product;
import io.brex.RestAPI.Client.Model.ProductDelivery;
import io.brex.RestAPI.Client.Model.ProductOrder;
import io.brex.RestAPI.Client.Model.ProductOrderNotifier;

import java.util.function.Function;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
//import javax.ws.rs.core.MediaType;
//import org.glassfish.jersey.jackson.*;

public class ClientFactory {

	protected BrexConfig _config;
	protected Client _client;
	protected WebTarget _target;
	protected Function<String, Builder> _builderFunction;
	
	public Getter<?>[] Getter;
	
	public ClientFactory() { this( new BrexConfig() );}
	
	public ClientFactory(BrexConfig config) 
	{ 
		_config = config;
		_client = ClientBuilder.newClient();
		_client.register( io.brex.RestAPI.Client.Tools.GsonProvider.class ); // register(JacksonFeature.class).
		// .register(GzipInterceptor.class)
		_target = _client.target( _config.BaseAddressStr + _config.Prefix );
		
		_builderFunction = s -> { return _target
				.path(s)
				.request(_config.MediaType)
				.header("USER_KEY",_config.User_Key); }; // .acceptEncoding("gzip")
		
		Getter = new Getter[] 
				{
					  new Getter<Company>  (_builderFunction, new Company())	// 0
					, new Getter<Company[]>(_builderFunction, new Company[]{})	// 1
					, new Getter<Product>  (_builderFunction, new Product())	// 2
					, new Getter<Product[]>(_builderFunction, new Product[]{})	// 3
					, new Getter<ProductOrder>  (_builderFunction, new ProductOrder())		// 4
					, new Getter<ProductOrder[]>(_builderFunction, new ProductOrder[]{})	// 5
					, new Getter<ProductDelivery>  (_builderFunction, new ProductDelivery())	// 6
					, new Getter<ProductDelivery[]>(_builderFunction, new ProductDelivery[]{})	// 7
					, new Getter<Announcement>  (_builderFunction, new Announcement())			// 8
					, new Getter<Announcement[]>(_builderFunction, new Announcement[]{})		// 9
					, new Getter<ProductOrderNotifier>  (_builderFunction, new ProductOrderNotifier())		// 10
					, new Getter<ProductOrderNotifier[]>(_builderFunction, new ProductOrderNotifier[]{})	// 11				
				};
	}
}
