package org.poseidon.service;

import org.raniaia.poseidon.Container;
import org.raniaia.poseidon.components.db.JdbcSupport;

/**
 * @author tiansheng
 * @version 1.0.0
 * @date 2019/11/27 17:33
 * @since 1.8
 */
public class UserService {

    private JdbcSupport jdbc = Container.getContainer().get("jdbc");

    public static void main(String[] args) {

        /*

            SELECT
            	a.*,
            	b.contract_name AS contract_order_currencyname,
            	b.contract_currencytype AS contract_order_currencytype,
            	c.contract_pl_closeprice AS contract_order_closeprice,
            	c.contract_pl_profit AS contract_order_profit,
            FROM
            	shiqi_contract_order a
            	LEFT JOIN shiqi_contract b ON b.contract_key = a.contract_order_currencykey
            	LEFT JOIN shiqi_contract_pl c ON c.contract_pl_ordernumber = a.contract_order_id
            WHERE
            	a.contract_order_account = ?
            	AND a.contract_order_status > 1
            ORDER BY
            	a.contract_order_createtime DESC
            	LIMIT ?,?;

         */

        String username = "keyboard";

    }

}