
	public enum Element2 {
    HELIUM("He", "Gas"),
    MAGNESIUM("Mg", "Solid");
    private String chemicalSymbol;
    private String nature;
    private Element2(String newChemicalSymbol, String newNature) {
        chemicalSymbol = newChemicalSymbol;
        nature = newNature;
    }
    public String chemicalSymbol() {return chemicalSymbol;}
    public String nature() {return nature;}
}