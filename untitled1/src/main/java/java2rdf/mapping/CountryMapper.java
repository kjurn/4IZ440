package java2rdf.mapping;

import java2rdf.model.Country;
import uk.ac.ebi.fg.java2rdf.mapping.BeanRdfMapper;
import uk.ac.ebi.fg.java2rdf.mapping.properties.LiteralPropRdfMapper;
import uk.ac.ebi.fg.java2rdf.mapping.rdfgen.RdfUriGenerator;

import java.util.Map;

import static info.marcobrandizi.rdfutils.namespaces.NamespaceUtils.iri;

public class CountryMapper extends BeanRdfMapper<Country> {
    {
        this.setRdfUriGenerator(new RdfUriGenerator<Country>() {
            @Override
            public String getUri(Country country, Map<String, Object> params) {
                return iri("country:" + country.getID());
            }
        });

        this.setRdfClassUri(iri("gn", "Country"));
        this.addPropertyMapper("name", new LiteralPropRdfMapper<Country, String>(iri("gn", "name")));
        this.addPropertyMapper("featureClass", new LiteralPropRdfMapper<Country, String>(iri("gn", "featureClass")));
        this.addPropertyMapper("isoAlpha2", new LiteralPropRdfMapper<Country, String>(iri("geographis", "isoAlpha2")));
        this.addPropertyMapper("isoAlpha3", new LiteralPropRdfMapper<Country, String>(iri("geographis", "isoAlpha3")));
        this.addPropertyMapper("isoNumeric", new LiteralPropRdfMapper<Country, String>(iri("geographis", "isoNumeric")));
        this.addPropertyMapper("population", new LiteralPropRdfMapper<Country, String>(iri("gn", "population")));
        this.addPropertyMapper("capital", new LiteralPropRdfMapper<Country, String>(iri("geographis", "capital")));
        this.addPropertyMapper("currency", new LiteralPropRdfMapper<Country, String>(iri("geographis", "currency")));
    }
}
