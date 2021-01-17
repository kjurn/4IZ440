import berlin.reiche.jtriple.Binding;
import com.hp.hpl.jena.rdf.model.Model;
import countries.Countries;
import org.junit.Test;

public class JTripleCountriesTest {
    public static final String DEFAULT_NAMESPACE = "http://telegraphis.net/data/";

    Countries czech = new Countries();


    @Test
    public void testCountries() {
        czech.setName("cz");
        czech.setIsoShortName("CZECH REPUBLIC\"@en");
        czech.setIsoShortName("TCHÈQUE, RÉPUBLIQUE\"@fr");
//        cz.setContinent(Continent.EU);
        czech.setPopulation(10220000);

        Binding binding = new Binding(DEFAULT_NAMESPACE);
        Model model = binding.getModel();
        model.setNsPrefix("countries", DEFAULT_NAMESPACE);

        binding.bind(czech);
        model.write(System.out, "N-TRIPLE");
    }
}
