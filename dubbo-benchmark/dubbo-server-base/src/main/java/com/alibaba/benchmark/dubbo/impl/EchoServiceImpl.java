package com.alibaba.benchmark.dubbo.impl;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

/**
 * @author guanghao on 2019/1/1.
 */
public class EchoServiceImpl implements EchoService {

    @Override
    public ComplexDO echoComplexDO(ComplexDO object) {
        return object;
    }
}
