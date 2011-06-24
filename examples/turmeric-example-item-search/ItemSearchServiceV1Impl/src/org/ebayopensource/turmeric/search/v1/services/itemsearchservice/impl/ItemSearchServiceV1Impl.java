
package org.ebayopensource.turmeric.search.v1.services.itemsearchservice.impl;

import java.util.ArrayList;
import java.util.List;

import org.ebayopensource.turmeric.common.v1.types.CommonErrorData;
import org.ebayopensource.turmeric.common.v1.types.ErrorMessage;
import org.ebayopensource.turmeric.demo.consumer.ItemDataSources;
import org.ebayopensource.turmeric.errorlibrary.search.ErrorConstants;
import org.ebayopensource.turmeric.runtime.common.exceptions.ErrorDataFactory;
import org.ebayopensource.turmeric.runtime.common.pipeline.MessageContextAccessor;
import org.ebayopensource.turmeric.search.v1.services.FindByKeywordsRequest;
import org.ebayopensource.turmeric.search.v1.services.FindByKeywordsResponse;
import org.ebayopensource.turmeric.search.v1.services.GetVersionRequest;
import org.ebayopensource.turmeric.search.v1.services.GetVersionResponse;
import org.ebayopensource.turmeric.search.v1.services.itemsearchservice.ItemSearchServiceV1;
import org.ebayopensource.turmeric.search.v1.types.ItemType;

public class ItemSearchServiceV1Impl
    implements ItemSearchServiceV1
{


    public GetVersionResponse getVersion(GetVersionRequest param0) {
    	GetVersionResponse response = new GetVersionResponse();
    	response.setVersion(MessageContextAccessor.getContext().getServiceVersion());
        return response;
    }

	@Override
	public FindByKeywordsResponse findByKeywords(FindByKeywordsRequest findByKeywordsRequest) {
		List<String> keywords = findByKeywordsRequest.getKeyword();
		FindByKeywordsResponse response = new FindByKeywordsResponse();
		List<ItemType> eBayItems =new ArrayList<ItemType>(0);
		List<ItemType> amazonItems = new ArrayList<ItemType>(0);;
		try {
			try {
				eBayItems.addAll(ItemDataSources.getItemsFromEbay(keywords));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				amazonItems.addAll(ItemDataSources.getItemsFromAmazon(keywords));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("##### Number of items from Amazon: " + amazonItems  != null ? amazonItems.size() : 0);
			System.out.println("##### Number of items from Ebay: " + eBayItems  != null ? eBayItems.size() : 0);
			
			if (eBayItems.isEmpty() && (amazonItems.isEmpty())) {
				CommonErrorData errorData = ErrorDataFactory.createErrorData(ErrorConstants.NOITEMFOUND,ErrorConstants.ERRORDOMAIN);
				ErrorMessage errMsg = new ErrorMessage();
				errMsg.getError().add(errorData);
				response.setErrorMessage(errMsg);
				return response;
			}
			List<ItemType> itemListing = response.getItem();
			itemListing.addAll(eBayItems);
			itemListing.addAll(amazonItems);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}
}
