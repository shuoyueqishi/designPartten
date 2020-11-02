package builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder=builder;
    }
    public void construct() {
        builder.makeTitle("DESIGN PATTERN STUDY");
        builder.makeString("I Study This After Work Every Day.");
        builder.makeItems(new String[] {
                "Simple Factory",
                "Factory Method",
                "Abstract Factory"
        });
        builder.makeString("Factory pattern in very practicable");
        builder.makeItems(new String[] {
                "Iterator",
                "Singleton",
                "Template"
        });
        builder.close();
    }
}
