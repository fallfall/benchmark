package com.alibaba.benchmark.grpc;


import com.alibaba.benchmark.Client;
import com.alibaba.benchmark.grpc.service.ComplexDO;
import com.alibaba.benchmark.grpc.service.GreeterGrpc;
import com.alibaba.benchmark.service.EchoService;
import com.alibaba.benchmark.service.ResourceService;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * @author linqiuping
 */
public class EchoServiceClient implements EchoService, ResourceService {
    private static final Logger logger = Logger.getLogger(Client.class.getName());

    private final ManagedChannel channel;

    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    public EchoServiceClient() {
        String host = System.getProperty("server.host", "localhost");
        int port = Integer.valueOf(System.getProperty("server.port", "8080"));
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext(true)
                .build();
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }


    @Override
    public void destroy() {
        try {
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public com.alibaba.benchmark.bean.ComplexDO echoComplexDO(com.alibaba.benchmark.bean.ComplexDO complexDO) {
        ComplexDO.Builder ComplexDOOrBuilder=ComplexDO.newBuilder();
        ComplexDOOrBuilder.setIp("666.666.666.666");
        ComplexDO reponse = blockingStub.echoComplexDO(ComplexDOOrBuilder.build());
        return com.alibaba.benchmark.bean.ComplexDO.getComplexDO();
    }
}
