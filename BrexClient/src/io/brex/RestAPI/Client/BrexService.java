package io.brex.RestAPI.Client;

import io.brex.RestAPI.Client.Tools.BrexConfig;
import io.brex.RestAPI.Client.Tools.ClientFactory;

public abstract class BrexService {
	
        protected ClientFactory _cf;
//
//        protected BrexService(string confLoc)
//        {
//            _cf = new ClientFactory(BrexConfig.retrieve(confLoc));
//        }
//
        protected BrexService(BrexConfig config)
        {
            _cf = new ClientFactory(config);
        }

        protected BrexService()
        {
            _cf = new ClientFactory();  // use default values
        }
    }
