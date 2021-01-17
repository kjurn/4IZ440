package JTriple.countries;

import berlin.reiche.jtriple.rdf.*;

import java.util.ArrayList;
import java.util.List;

@RdfType("http://www.geonames.org/ontology#Country")
public class Countries {

    @RdfIdentifier
    private String name;

    @RdfProperty("http://telegraphis.net/ontology/geography/geography#isoShortName")
    private List<String> isoShortName = new ArrayList<>();

//    @RdfProperty("http://www.geonames.org/ontology#population")
    @Transient
    private int population;

    private Continent continent;

    @RdfProperty("http://telegraphis.net/ontology/geography/geography#capital")
    @RdfIdentifier
    private String capital;


    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

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

    public void setIsoShortName(List<String> isoShortName) {
        this.isoShortName = isoShortName;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
