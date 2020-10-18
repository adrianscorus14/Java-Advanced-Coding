package Generics;

public enum EngineType implements CarComponent{
    DIESEL("Diesel"),
    PETROL("Petrol"),
    LPG("lpg"),
    HYBRID("hybrid"),
    ELECTRIC("Electric");
    private final String description;


     EngineType(String description){
         this.description=description;

    }

    public String getDescription() {
        return description;
    }
}
