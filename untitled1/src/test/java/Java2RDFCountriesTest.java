import info.marcobrandizi.rdfutils.commonsrdf.CommonsRDFUtils;
import info.marcobrandizi.rdfutils.namespaces.NamespaceUtils;
import java2rdf.mapping.MapperFactory;
import java2rdf.model.Country;
import org.apache.commons.rdf.api.Graph;
import org.apache.commons.rdf.jena.JenaRDF;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.junit.Test;

public class Java2RDFCountriesTest  {

    @Test
    public void testMapping () throws Exception {

        Country czech = new Country("Czech");
        czech.setCapital("Prague");
        czech.setPopulation(10220000);
        czech.setID("CZ");
        czech.setName("Czech Republic\"@en");
        czech.setFeatureClass("<http://www.geonames.org/ontology#A>");
        czech.setIsoAlpha2("CZ");
        czech.setIsoAlpha3("CZE");
        czech.setIsoNumeric("203");
        czech.setCapital("http://telegraphis.net/data/capitals/CZ/Prague#Prague");
        czech.setCurrency("http://telegraphis.net/data/currencies/CZK#CZK");

        JenaRDF rdf = (JenaRDF) CommonsRDFUtils.COMMUTILS.getRDF();

        Model model = ModelFactory.createDefaultModel();

        Graph graph = rdf.asGraph(model);

        // Our factory
        MapperFactory mf = new MapperFactory(graph);
        model.setNsPrefixes (NamespaceUtils.getNamespaces());

        // Here we go, starting from the top, a set of graph roots (or even all objects you have)
        mf.map(czech);

        // Again, this Jena-specific, since commons-rdf doesn't abstract things like I/O or SPARQL.
        model.write (System.out, "TURTLE");
    }

}