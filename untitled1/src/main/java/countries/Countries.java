package countries;

import berlin.reiche.jtriple.rdf.RdfIdentifier;
import berlin.reiche.jtriple.rdf.RdfProperty;
import berlin.reiche.jtriple.rdf.RdfType;

import java.util.ArrayList;
import java.util.List;

@RdfType("http://www.geonames.org/ontology#Country")
public class Countries {

    @RdfIdentifier
    private String name;

    @RdfProperty("http://telegraphis.net/ontology/geography/geography#isoShortName")
    private List<String> isoShortName = new ArrayList<>();

    @RdfProperty("http://www.geonames.org/ontology#population")
    private int population;

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    private Continent continent;



    public String getName() {
        return name;
    }

    public List<String> getIsoShortName() {
        return isoShortName;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsoShortName(String isoShortName) {
        this.isoShortName.add(isoShortName);
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
