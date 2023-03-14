package health.medunited.emp.jaxrs;

public enum PinType {
    MRPIN_AMTS("MRPIN.AMTS"), AMTS_PIN("AMTS-PIN");

    private String id;

    private PinType(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
