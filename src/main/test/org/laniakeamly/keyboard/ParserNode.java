package org.laniakeamly.keyboard;

import org.junit.Test;
import org.laniakeamly.poseidon.framework.sql.xml.build.ParserMapperNode;
import org.laniakeamly.poseidon.framework.sql.xml.build.PrecompiledClass;

import java.util.Map;

/**
 * Copyright: Create by TianSheng on 2019/12/21 15:08
 */
public class ParserNode {

    @Test
    public void test(){
        ParserMapperNode parserMapperNode = new ParserMapperNode();
        Map<String, PrecompiledClass> stringPrecompiledClassMap = parserMapperNode.readBuilderNode();
        System.out.println();
    }

}
