package org.carrot.carrothttp.filter;

import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Activate
public class MyFilter implements Filter {
    public static final Logger log = LoggerFactory.getLogger(MyFilter.class);

    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        Result rs = null;
        try {
            String clientIp = RpcContext.getContext().getRemoteHost();
            rs = invoker.invoke(invocation);
            log.info("远程地址ip"+clientIp);
            System.out.println("远程地址ip"+clientIp);
        }catch (Exception e) {
            // TODO: handle exception
        }
        return rs;
    }
}
