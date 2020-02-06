package org.laniakeamly.poseidon.framework.model;

import org.laniakeamly.poseidon.framework.limit.Model;

/**
 * 检查一些类是否遵守标准
 * @author TianSheng
 * @version 1.0.0
 * @date 2019/11/27 15:56
 * @since 1.8
 */
public class SecurityManager {

    public static boolean existModel(Class<?> target){
        return target.isAnnotationPresent(Model.class);
    }

}
