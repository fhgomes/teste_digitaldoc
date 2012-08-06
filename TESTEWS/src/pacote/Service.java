package pacote;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;

@WebService
@SOAPBinding(parameterStyle=ParameterStyle.BARE)
public class Service {

	public Service ()
	{
		System.out.println("constroi");
	}
	
    @WebMethod()
    public String hello() {
    	System.out.println("hello");
        return "Hello World!";
    }
}