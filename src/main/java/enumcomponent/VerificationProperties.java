package enumcomponent;

public enum VerificationProperties {
	
	DISPLAYED("displayed"),
	SELECTED("selected");
	
	
	private String property;

    VerificationProperties(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }


}
