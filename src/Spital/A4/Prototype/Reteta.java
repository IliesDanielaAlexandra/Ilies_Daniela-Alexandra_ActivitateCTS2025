package Spital.A4.Prototype;

public class Reteta implements IReteta{
     private String nume;
     private int nrIngrediente;
     private String ingredientPrincipal;
     private double cantitateIngredientPrincipal;

     public Reteta(){}

    public Reteta(String nume, int nrIngrediente, String ingredientPrincipal, double cantitateIngredientPrincipal) {
        this.nume = nume;
        this.nrIngrediente = nrIngrediente;
        this.ingredientPrincipal = ingredientPrincipal;
        this.cantitateIngredientPrincipal = cantitateIngredientPrincipal;
    }

    @Override
    public IReteta copiere() {
        Reteta reteta= new Reteta();
        reteta.nume=this.nume;
        reteta.nrIngrediente=this.nrIngrediente;
        reteta.ingredientPrincipal=this.ingredientPrincipal;
        reteta.cantitateIngredientPrincipal=this.cantitateIngredientPrincipal;
        return reteta;

    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", nrIngrediente=" + nrIngrediente +
                ", ingredientPrincipal='" + ingredientPrincipal + '\'' +
                ", cantitateIngredientPrincipal=" + cantitateIngredientPrincipal +
                '}';
    }
}
