package org.springframework.security.config;

import org.springframework.beans.factory.xml.BeanDefinitionDecorator;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.beans.factory.config.BeanDefinitionHolder;

import org.w3c.dom.Node;


/**
 * Adds the decorated {@link org.springframework.security.providers.AuthenticationProvider} to the ProviderManager's
 * list.
 *
 * @author Luke Taylor
 * @version $Id$
 */
public class CustomAuthenticationProviderBeanDefinitionDecorator implements BeanDefinitionDecorator {
    public BeanDefinitionHolder decorate(Node node, BeanDefinitionHolder holder, ParserContext parserContext) {
        ConfigUtils.getRegisteredProviders(parserContext).add(holder.getBeanDefinition());

        return holder;
    }
}