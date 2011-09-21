/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.runtime.tests.common.sif.error;

import org.junit.Test;

import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationException;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceInvocationRuntimeException;
import org.ebayopensource.turmeric.runtime.errorlibrary.ErrorDataCollection;
import org.ebayopensource.turmeric.runtime.tests.common.jetty.AbstractWithServerTest;
import org.ebayopensource.turmeric.runtime.tests.common.sif.Test1Driver;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.Test1Constants;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.errors.TestServerErrorTypes;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.services.message.Test1Exception;
import org.ebayopensource.turmeric.runtime.tests.service1.sample.services.message.Test1ServiceException;


/**
 * @author ramandala
 */
public abstract class BaseExceptionLocalTest extends AbstractWithServerTest {
	protected long m_mappingErrorId;
	protected String m_mappingErrorString;
	protected boolean m_mappingErrorHasNoPayload;
	protected Class<?> m_test1ExceptionResponse;
	protected Class<?> m_test1ServiceExceptionResponse;
	protected abstract Test1Driver createDriver() throws Exception;

	protected void println(String text) {
		System.out.println(this.getClass().getSimpleName() + ": " + text);
	}

	@Test
	public void test1Exception() throws Exception {
		Test1Driver driver = createDriver();
		driver.setHeader_Test1Exception(true);
		driver.setTransportHeader(Test1Constants.TR_HDR_TEST1_HARMLESS_EXCEPTION, true);
		driver.setExpectedError(ErrorDataCollection.svc_rt_application_internal_error.getErrorId(), 
			m_test1ExceptionResponse, Test1Exception.class, "Test1Exception: Our test1 exception");
		driver.doCall();
	}

	@Test
	public void test1ServiceException() throws Exception {
		Test1Driver driver = createDriver();
		driver.setHeader_Test1ServiceException(true);
		driver.setExpectedError(TestServerErrorTypes.TEST1_SERVICE_EXCEPTION.getId(),
			m_test1ServiceExceptionResponse, Test1ServiceException.class, "with data my_program_data");
		driver.doCall();
	}

	@Test
	public void errorMapperException() throws Exception {
		Test1Driver driver = createDriver();
		driver.setTransportHeader(Test1Constants.TR_HDR_ERROR_MAPPER_EXCEPTION, true);
		driver.setHeader_Test1Exception(true);
		driver.setExpectedError(m_mappingErrorId,
			ServiceInvocationException.class, ServiceInvocationRuntimeException.class,
			m_mappingErrorString);

		if (m_mappingErrorHasNoPayload) {
			driver.setNoPayloadData(true);
		}

		driver.doCall();
	}

	@Test
	public void testHandlerException() throws Exception {
		Test1Driver driver = createDriver();
		driver.doCall();
	}
}
