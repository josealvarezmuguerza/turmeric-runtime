/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/

package fr.virtuoz.gen;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Future;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.Response;
import fr.virtuoz.AsyncBotService;
import fr.virtuoz.TalkXml;
import fr.virtuoz.TalkXmlResponse;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceException;
import org.ebayopensource.turmeric.runtime.common.exceptions.ServiceRuntimeException;
import org.ebayopensource.turmeric.runtime.common.registration.ClassLoaderRegistry;
import org.ebayopensource.turmeric.runtime.common.types.Cookie;
import org.ebayopensource.turmeric.runtime.common.types.SOAHeaders;
import org.ebayopensource.turmeric.runtime.sif.service.Service;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceFactory;
import org.ebayopensource.turmeric.runtime.sif.service.ServiceInvokerOptions;


/**
 * Note : Generated file, any changes will be lost upon regeneration.
 * This class is not thread safe
 * 
 */
public class BaseBotServiceConsumer {

    private URL m_serviceLocation = null;
    private boolean m_useDefaultClientConfig;
    private final static String SVC_ADMIN_NAME = "BotService";
    private String m_clientName = "BotService";
    private String m_environment;
    private AsyncBotService m_proxy = null;
    private String m_authToken = null;
    private Cookie[] m_cookies;
    private Service m_service = null;

    public BaseBotServiceConsumer() {
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located in the 
     * "client" bundle, so that a ClassLoader of this Shared Consumer can be used.
     * 
     * @param clientName
     * @throws ServiceException
     * 
     */
    public BaseBotServiceConsumer(String clientName)
        throws ServiceException
    {
        this(clientName, null);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located in the 
     * "client" bundle, so that a ClassLoader of this Shared Consumer can be used.
     * 
     * @param clientName
     * @param environment
     * @throws ServiceException
     * 
     */
    public BaseBotServiceConsumer(String clientName, String environment)
        throws ServiceException
    {
        this(clientName, environment, null, false);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located 
     * in some application bundle. Shared Consumer then will call ClassLoaderRegistry 
     * to register a ClassLoader of an application bundle.
     * 
     * @param clientName
     * @param caller
     * @param useDefaultClientConfig
     * @throws ServiceException
     * 
     */
    public BaseBotServiceConsumer(String clientName, Class caller, boolean useDefaultClientConfig)
        throws ServiceException
    {
        this(clientName, null, caller, useDefaultClientConfig);
    }

    /**
     * This constructor should be used, when a ClientConfig.xml is located 
     * in some application bundle. Shared Consumer then will call ClassLoaderRegistry 
     * to register a ClassLoader of an application bundle.
     * 
     * @param clientName
     * @param environment
     * @param caller
     * @param useDefaultClientConfig
     * @throws ServiceException
     * 
     */
    public BaseBotServiceConsumer(String clientName, String environment, Class caller, boolean useDefaultClientConfig)
        throws ServiceException
    {
        if (clientName == null) {
            throw new ServiceException("clientName can not be null");
        }
        m_clientName = clientName;
        if (environment!= null) {
            m_environment = environment;
        }
        m_useDefaultClientConfig = useDefaultClientConfig;
        ClassLoaderRegistry.instanceOf().registerServiceClient(m_clientName, m_environment, SVC_ADMIN_NAME, (BaseBotServiceConsumer.class), caller, m_useDefaultClientConfig);
    }

    /**
     * Use this method to initialize ConsumerApp after creating a Consumer instance
     * 
     */
    public void init()
        throws ServiceException
    {
        getService();
    }

    protected void setServiceLocation(String serviceLocation)
        throws MalformedURLException
    {
        m_serviceLocation = new URL(serviceLocation);
        if (m_service!= null) {
            m_service.setServiceLocation(m_serviceLocation);
        }
    }

    private void setUserProvidedSecurityCredentials(Service service) {
        if (m_authToken!= null) {
            service.setSessionTransportHeader(SOAHeaders.AUTH_TOKEN, m_authToken);
        }
        if (m_cookies!= null) {
            for (int i = 0; (i<m_cookies.length); i ++) {
                service.setCookie(m_cookies[i]);
            }
        }
    }

    /**
     * Use this method to set User Credentials (Token) 
     * 
     */
    protected void setAuthToken(String authToken) {
        m_authToken = authToken;
    }

    /**
     * Use this method to set User Credentials (Cookie)
     * 
     */
    protected void setCookies(Cookie[] cookies) {
        m_cookies = cookies;
    }

    /**
     * Use this method to get the Invoker Options on the Service and set them to user-preferences
     * 
     */
    public ServiceInvokerOptions getServiceInvokerOptions()
        throws ServiceException
    {
        m_service = getService();
        return m_service.getInvokerOptions();
    }

    protected AsyncBotService getProxy()
        throws ServiceException
    {
        m_service = getService();
        m_proxy = m_service.getProxy();
        return m_proxy;
    }

    /**
     * Method returns an instance of Service which has been initilized for this Consumer
     * 
     */
    public Service getService()
        throws ServiceException
    {
        if (m_service == null) {
            m_service = ServiceFactory.create(SVC_ADMIN_NAME, m_environment, m_clientName, m_serviceLocation, false, m_useDefaultClientConfig);
        }
        setUserProvidedSecurityCredentials(m_service);
        return m_service;
    }

    public Future<?> talkXmlAsync(TalkXml param0, AsyncHandler<TalkXmlResponse> param1) {
        Future<?> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.talkXmlAsync(param0, param1);
        return result;
    }

    public Response<TalkXmlResponse> talkXmlAsync(TalkXml param0) {
        Response<TalkXmlResponse> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.talkXmlAsync(param0);
        return result;
    }

    public List<Response<?>> poll(boolean param0, boolean param1)
        throws InterruptedException
    {
        List<Response<?>> result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.poll(param0, param1);
        return result;
    }

    public TalkXmlResponse talkXml(TalkXml param0) {
        TalkXmlResponse result = null;
        try {
            m_proxy = getProxy();
        } catch (ServiceException serviceException) {
            throw ServiceRuntimeException.wrap(serviceException);
        }
        result = m_proxy.talkXml(param0);
        return result;
    }

}
