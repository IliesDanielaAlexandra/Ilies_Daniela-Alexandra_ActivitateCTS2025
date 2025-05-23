package EX1MagazineMall.builder;

public class PodeaCustomizata implements IPodea {
    @Override
    public float getDuritate() {
        return 10;
    }

    @Override
    public String toString() {
        return "Podea Customizata la alegere duritate min 10!";
    }
}
