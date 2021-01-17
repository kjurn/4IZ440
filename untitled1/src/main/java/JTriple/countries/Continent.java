package JTriple.countries;

import berlin.reiche.jtriple.rdf.RdfType;

@RdfType("http://telegraphis.net/data/continents/")
public enum Continent {
    EU("EUROPE"),
    AS("ASIA"),
    AF("AFRICA"),
    AU("AUSTRALIA"),
    NA("NORTH_AMERICA"),
    SA("SOUTH_AMERICA"),
    AN("ANTARCTICA");

    String name;

    Continent(String name) {
        this.name = name;
    }


}
