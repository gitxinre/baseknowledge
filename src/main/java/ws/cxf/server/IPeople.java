package ws.cxf.server;

import bean.People;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @author Administrator
 */
public interface IPeople {
    @GET
    @Produces(MediaType.APPLICATION_XML)
    @Path("/query")
    People queryPeople();

    @GET//指定请求方式，如果服务端发布的时候指定的是GET（POST），那么客户端访问时必须使用GET（POST）
    @Produces(MediaType.APPLICATION_XML)//指定服务数据类型
    @Path("/queryAll")
    List<People> queryAllPeople();
}
