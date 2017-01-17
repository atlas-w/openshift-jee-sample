import javax.ejb.Remote;

@Remote
public interface Converter {
	double to(double src);
	double from(double src);
}