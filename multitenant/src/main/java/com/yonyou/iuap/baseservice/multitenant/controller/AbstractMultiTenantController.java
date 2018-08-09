package com.yonyou.iuap.baseservice.multitenant.controller;


import com.yonyou.iuap.baseservice.controller.GenericController;
import com.yonyou.iuap.baseservice.multitenant.entity.MultiTenant;
import com.yonyou.iuap.baseservice.multitenant.service.AbstractMultiTenantService;


/**
 * 说明：多租户基础Controller：提供单表增删改查。
 * @author jhb
 * 2018年8月8日
 */
public abstract   class AbstractMultiTenantController<T extends MultiTenant> extends GenericController<T> {

    private AbstractMultiTenantService multiTenantService;

    public void setMultiTenantService(AbstractMultiTenantService multiTenantService) {
        this.multiTenantService = multiTenantService;
        super.setService(multiTenantService);
    }



}