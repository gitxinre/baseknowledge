package ws.cxf.server;

import javax.jws.WebService;

/**
 * @author Administrator
 */
@WebService
public interface PersonService {
	
	String getPersonById(String userId);

}
