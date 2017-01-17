import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

@Stateless
public class ConverterBean implements Converter {

	@Override
	public double to(double src) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double from(double src) {
		// TODO Auto-generated method stub
		return 0;
	}

	@PostConstruct
	public void init() {
		System.err.println("init");
	}
	
	@PreDestroy
	public void cleanup() {
		System.err.println("cleanup");
	}
}
