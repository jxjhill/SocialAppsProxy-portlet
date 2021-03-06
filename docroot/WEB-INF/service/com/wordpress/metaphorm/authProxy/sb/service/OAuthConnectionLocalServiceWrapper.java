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

package com.wordpress.metaphorm.authProxy.sb.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link OAuthConnectionLocalService}.
 * </p>
 *
 * @author    stiansigvartsen
 * @see       OAuthConnectionLocalService
 * @generated
 */
public class OAuthConnectionLocalServiceWrapper
	implements OAuthConnectionLocalService,
		ServiceWrapper<OAuthConnectionLocalService> {
	public OAuthConnectionLocalServiceWrapper(
		OAuthConnectionLocalService oAuthConnectionLocalService) {
		_oAuthConnectionLocalService = oAuthConnectionLocalService;
	}

	/**
	* Adds the o auth connection to the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthConnection the o auth connection
	* @return the o auth connection that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection addOAuthConnection(
		com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection oAuthConnection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.addOAuthConnection(oAuthConnection);
	}

	/**
	* Creates a new o auth connection with the primary key. Does not add the o auth connection to the database.
	*
	* @param connectionId the primary key for the new o auth connection
	* @return the new o auth connection
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection createOAuthConnection(
		long connectionId) {
		return _oAuthConnectionLocalService.createOAuthConnection(connectionId);
	}

	/**
	* Deletes the o auth connection with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param connectionId the primary key of the o auth connection
	* @return the o auth connection that was removed
	* @throws PortalException if a o auth connection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection deleteOAuthConnection(
		long connectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.deleteOAuthConnection(connectionId);
	}

	/**
	* Deletes the o auth connection from the database. Also notifies the appropriate model listeners.
	*
	* @param oAuthConnection the o auth connection
	* @return the o auth connection that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection deleteOAuthConnection(
		com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection oAuthConnection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.deleteOAuthConnection(oAuthConnection);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _oAuthConnectionLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.dynamicQuery(dynamicQuery, start,
			end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection fetchOAuthConnection(
		long connectionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.fetchOAuthConnection(connectionId);
	}

	/**
	* Returns the o auth connection with the primary key.
	*
	* @param connectionId the primary key of the o auth connection
	* @return the o auth connection
	* @throws PortalException if a o auth connection with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection getOAuthConnection(
		long connectionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getOAuthConnection(connectionId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the o auth connections.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of o auth connections
	* @param end the upper bound of the range of o auth connections (not inclusive)
	* @return the range of o auth connections
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection> getOAuthConnections(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getOAuthConnections(start, end);
	}

	/**
	* Returns the number of o auth connections.
	*
	* @return the number of o auth connections
	* @throws SystemException if a system exception occurred
	*/
	public int getOAuthConnectionsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getOAuthConnectionsCount();
	}

	/**
	* Updates the o auth connection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oAuthConnection the o auth connection
	* @return the o auth connection that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection updateOAuthConnection(
		com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection oAuthConnection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.updateOAuthConnection(oAuthConnection);
	}

	/**
	* Updates the o auth connection in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param oAuthConnection the o auth connection
	* @param merge whether to merge the o auth connection with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the o auth connection that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection updateOAuthConnection(
		com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection oAuthConnection,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.updateOAuthConnection(oAuthConnection,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _oAuthConnectionLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_oAuthConnectionLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _oAuthConnectionLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection addOAuthConnection(
		long companyId, long groupId, long userId, java.lang.String realm)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.addOAuthConnection(companyId,
			groupId, userId, realm);
	}

	public int getOAuthConnectionsCount(long companyId, long groupId,
		long userId, int oAuthPhase)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getOAuthConnectionsCount(companyId,
			groupId, userId, oAuthPhase);
	}

	public java.util.List<com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection> getOAuthConnections(
		long companyId, long groupId, long userId, int oAuthPhase, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _oAuthConnectionLocalService.getOAuthConnections(companyId,
			groupId, userId, oAuthPhase, start, end);
	}

	public com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection findByRealm(
		long companyId, long groupId, long userId, java.lang.String realm)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wordpress.metaphorm.authProxy.sb.NoSuchOAuthConnectionException {
		return _oAuthConnectionLocalService.findByRealm(companyId, groupId,
			userId, realm);
	}

	public java.util.List<com.wordpress.metaphorm.authProxy.sb.model.OAuthConnection> findByUser(
		long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.wordpress.metaphorm.authProxy.sb.NoSuchOAuthConnectionException {
		return _oAuthConnectionLocalService.findByUser(companyId, groupId,
			userId);
	}

	public void deleteAllConnections(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_oAuthConnectionLocalService.deleteAllConnections(serviceContext);
	}

	public void deleteAllConnections(long companyId, long groupId, long userId) {
		_oAuthConnectionLocalService.deleteAllConnections(companyId, groupId,
			userId);
	}

	public void deleteAllConnections()
		throws com.liferay.portal.kernel.exception.SystemException {
		_oAuthConnectionLocalService.deleteAllConnections();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public OAuthConnectionLocalService getWrappedOAuthConnectionLocalService() {
		return _oAuthConnectionLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedOAuthConnectionLocalService(
		OAuthConnectionLocalService oAuthConnectionLocalService) {
		_oAuthConnectionLocalService = oAuthConnectionLocalService;
	}

	public OAuthConnectionLocalService getWrappedService() {
		return _oAuthConnectionLocalService;
	}

	public void setWrappedService(
		OAuthConnectionLocalService oAuthConnectionLocalService) {
		_oAuthConnectionLocalService = oAuthConnectionLocalService;
	}

	private OAuthConnectionLocalService _oAuthConnectionLocalService;
}