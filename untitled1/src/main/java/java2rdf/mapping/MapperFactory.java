package java2rdf.mapping;

import info.marcobrandizi.rdfutils.namespaces.NamespaceUtils;
import java2rdf.model.Country;
import org.apache.commons.rdf.api.Graph;
import uk.ac.ebi.fg.java2rdf.mapping.RdfMapperFactory;

public class MapperFactory extends RdfMapperFactory
{
    static
    {
        // You'll typically do this on a static block, to prepare your own namespaces. The class already manages common
        // ones. We plan to support the equivalent utility in OWLAPI or Jena in future.
        //
        NamespaceUtils.registerNs ( "gn",		"http://www.geonames.org/ontology#" );
        NamespaceUtils.registerNs ( "geographis",		"http://telegraphis.net/ontology/geography/geography#" );
        NamespaceUtils.registerNs ( "code",		"http://telegraphis.net/ontology/measurement/code#" );
        NamespaceUtils.registerNs ( "measurement",		"http://telegraphis.net/ontology/measurement/measurement#" );
        NamespaceUtils.registerNs ( "quantity",		"http://www.telegraphis.net/ontology/measurement/quantity#" );
        NamespaceUtils.registerNs ( "metric",		"http://www.telegraphis.net/ontology/measurement/metric#" );
        NamespaceUtils.registerNs ( "country",		"http://telegraphis.net/data/countries/" );
    }

    public MapperFactory(Graph graph )
    {
        super (graph);
        this.setMapper(Country.class, new CountryMapper());
    }
}
