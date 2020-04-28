package enums;

public enum VerificationProperties {
	
	UP("up"),
    DOWN("down"),
    LEFT("left"),
    RIGHT("right");

    private String property;

    VerificationProperties(String property) {
        this.property = property;
    }

    public String getDirection() {
        return property;
    }


}
