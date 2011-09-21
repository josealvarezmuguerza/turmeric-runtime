/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.common.impl.binding.jaxb.nv;

import org.ebayopensource.turmeric.runtime.binding.BindingConstants;
import org.ebayopensource.turmeric.runtime.binding.impl.jaxb.nv.NVDeserializerFactory;
import org.ebayopensource.turmeric.runtime.common.binding.DeserializerFactory;
import org.ebayopensource.turmeric.runtime.common.impl.binding.jaxb.BaseDeserializerFactory;


public class JAXBNVDeserializerFactory extends BaseDeserializerFactory
		implements DeserializerFactory {

	public JAXBNVDeserializerFactory() {
		m_factory = new NVDeserializerFactory();
	}

	@Override
	public String getPayloadType() {
		return BindingConstants.PAYLOAD_NV;
	}
}
