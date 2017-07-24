package org.colorcoding.ibas.payments.service.rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import org.colorcoding.ibas.bobas.common.*;
import org.colorcoding.ibas.payments.repository.*;
import org.colorcoding.ibas.payments.bo.payment.*;

/**
* Payments 数据服务JSON
*/
@Path("data")
public class DataService extends BORepositoryPayments {

    //--------------------------------------------------------------------------------------------//
    /**
     * 查询-付款
     * @param criteria 查询
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("fetchPayment")
    public OperationResult<Payment> fetchPayment(Criteria criteria, @QueryParam("token") String token) {
        return super.fetchPayment(criteria, token);
    }

    /**
     * 保存-付款
     * @param bo 对象实例
     * @param token 口令
     * @return 操作结果
     */
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("savePayment")
    public OperationResult<Payment> savePayment(Payment bo, @QueryParam("token") String token) {
        return super.savePayment(bo, token);
    }

    //--------------------------------------------------------------------------------------------//

}
