import berlin.reiche.jtriple.Binding;
import com.hp.hpl.jena.rdf.model.Model;
import JTriple.countries.*;
import org.junit.Test;

public class JTripleCountriesTest {
    public static final String DEFAULT_NAMESPACE = "http://telegraphis.net/data/";
    Countries czech = new Countries();


    @Test
    public void testCountries() {
        czech.setName("Czech Republic");
        czech.setIsoShortName("CZECH REPUBLIC\"@en");
        czech.setIsoShortName("TCHÈQUE, RÉPUBLIQUE\"@fr");
//        cz.setContinent(Continent.EU);
        czech.setPopulation(10220000);
        czech.setCapital("Prague");

        Binding binding = new Binding(DEFAULT_NAMESPACE);
        Model model = binding.getModel();
        model.setNsPrefix("countries", DEFAULT_NAMESPACE);

        binding.bind(czech);
        model.write(System.out, "N-TRIPLES");
    }
}
