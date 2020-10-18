package Generics;

public enum GearBoxType implements CarComponent{
    AUTOMATIC("AUTOMATIC"),
    MANUAL("manual"),
    ROBOTIZED("ROBOTIZED"),
    CVT("cvt");
    private final String description;


    GearBoxType(String description){
        this.description=description;
    }

    public String getDescription() {
        return description;
    }
}
