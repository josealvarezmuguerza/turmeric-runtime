/**
 * 
 */
package org.ebayopensource.turmeric.services.advertisinguniqueidservicev2.susc;

import com.ebay.marketplace.advertising.v1.services.GetVersionResponse;
import com.ebay.marketplace.services.advertisinguniqueidservicev2.advertisinguniqueidservicev2.gen.SharedAdvertisingUniqueIDServiceV2Consumer;
import com.ebay.soaframework.common.exceptions.ServiceException;
import com.ebay.soaframework.common.types.SOAConstants;
import com.ebay.soaframework.sif.service.ServiceInvokerOptions;

/**
 * @author rarekatla
 *
 */
public class AdvertisingUniqueIDServiceV2SharedConsumer extends SharedAdvertisingUniqueIDServiceV2Consumer {


	public AdvertisingUniqueIDServiceV2SharedConsumer(String client,String env) throws ServiceException {
		super(client,env);
	
	}
		
	public GetVersionResponse getServcieVersion(String transport) throws ServiceException {

		ServiceInvokerOptions options = getServiceInvokerOptions();
		if (transport.equalsIgnoreCase("LOCAL")){
			options.setTransportName(SOAConstants.TRANSPORT_LOCAL); 
			}
		else if (transport.equalsIgnoreCase("HTTP10")) {
		  options.setTransportName(SOAConstants.TRANSPORT_HTTP_10);
		} else {
		  options.setTransportName(SOAConstants.TRANSPORT_HTTP_11);
		}
		
		GetVersionResponse res= getVersion();
		return res;
	}
}
