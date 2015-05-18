package io.brex.RestAPI.Client.Tools;

//import java.util.List;
import java.util.function.Function;

//import io.brex.RestAPI.Client.Model.Product;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
//import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;

public class Getter<T> {

	protected Class<?> _class;
	protected Function<String, Builder> _builderFun;

	public Getter(Function<String, Builder> bf, Class<?> cla) {
		_class = cla;
		_builderFun = bf;
	}
	
	public Getter(Function<String, Builder> bf, T sample) { this(bf,  sample.getClass()); }

/*		
		public  T get( Client c, String target) {
			
			return (T) c.target("https://api.brex.io/")
			.path("api/v1/product/availability/ADDAAHFAT/77A5AD48BBB33E5E3A397FFC920C3885")
					.request(MediaType.APPLICATION_JSON_TYPE)
					.header("USER_KEY", "<key>")
					.get( new GenericType<T>(){} );
		}
		*/
		public  T get( Client c, String path) {
			
			return (T) c.target("https://api.brex.io/")
			.path(path)
					.request(MediaType.APPLICATION_JSON_TYPE)
					.header("USER_KEY", "<key>")
					.get( _class );
		}
		
		public  T get( WebTarget t, String path) {
			
			return (T) t.path(path)
					.request(MediaType.APPLICATION_JSON_TYPE)
					.header("USER_KEY", "<key>")
					.get( _class );
		}
		
		public  T get( String path) {
			return (T) _builderFun.apply(path).get( _class );
		}
		
		public  T get( String pattern, String... args) {
			return (T) get( String.format(pattern,  args));
		}

		public  T post(Form form, String path) {
			return (T) _builderFun.apply(path).post(
					Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE)
						,  _class );
		}
		
		public  T post(Form form, String pattern, String... args) {
			return (T) post(form, String.format(pattern,  args));
		}


}
