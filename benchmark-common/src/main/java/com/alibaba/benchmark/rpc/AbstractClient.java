package com.alibaba.benchmark.rpc;

import com.alibaba.benchmark.bean.ComplexDO;
import com.alibaba.benchmark.service.EchoService;

/**
 * @author linqiuping
 */
public abstract class AbstractClient {

    protected abstract EchoService getEchoService();

    public ComplexDO echoComplexDO() throws Exception {
        return getEchoService().echoComplexDO(ComplexDO.getComplexDO());
    }

}

