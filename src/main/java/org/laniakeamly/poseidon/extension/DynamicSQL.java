package org.laniakeamly.poseidon.extension;

import org.laniakeamly.poseidon.framework.sql.xml.build.PrecompiledClass;

/**
 * 动态SQL，如果没有配置使用默认.
 * 规则不限制，只需要将你的SQL代码转换成Java代码提交即可
 *
 * dynamic sql if not config use default.
 * rule not limited but need dynamic sql conversion java code.
 *
 * Copyright: Create by TianSheng on 2019/12/28 2:57
 */
public interface DynamicSQL {

    /**
     * 获取预编译对象
     *
     * get precompile object.
     *
     * @param name 根据name获取容器中的值
     *             get container value by name.
     *
     * @return      预编译对象
     *              precompile class.
     */
    PrecompiledClass getValue(String name);

}
