/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.wordpress.metaphorm.authProxy.sb.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection;
import com.wordpress.metaphorm.authProxy.sb.service.OAuthConnectionLocalServiceUtil;

/**
 * The extended model base implementation for the OAuthConnection service. Represents a row in the &quot;OAuthProxy_OAuthConnection&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link OAuthConnectionImpl}.
 * </p>
 *
 * @author stiansigvartsen
 * @see OAuthConnectionImpl
 * @see com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection
 * @generated
 */
public abstract class OAuthConnectionBaseImpl extends OAuthConnectionModelImpl
	implements OAuthConnection {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a o auth connection model instance should use the {@link OAuthConnection} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			OAuthConnectionLocalServiceUtil.addOAuthConnection(this);
		}
		else {
			OAuthConnectionLocalServiceUtil.updateOAuthConnection(this);
		}
	}
}