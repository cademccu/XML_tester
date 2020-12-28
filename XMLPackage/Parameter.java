package XMLPackage;
 
public class Parameter {
 
    private String name;
    private String value;
    private String access;
    private String accessNRCS;
    private String accessNRCSdev;
 
    public Parameter(String name, String value, String access, String accessNRCS, String accessNRCSdev) {
         this.name = name;
         this.value = value;
         this.access = access;
         this.accessNRCS = accessNRCS;
         this.accessNRCSdev = accessNRCSdev;
    }

    /**
     * Constructor that uses just the basics. Use above constructor for more robust tests. */
    public Parameter(String name, String value, String access) {
         this.name = name;
         this.value = value;
         this.access = access;
    }
    @Override
    public String toString() {
         return "<" + name + ", " + value + ", " + access + ">";
    }
 
}
