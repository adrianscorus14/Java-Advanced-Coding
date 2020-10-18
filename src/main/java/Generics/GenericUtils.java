package Generics;

public class GenericUtils {
    public static EngineType mapToEngineType(String engineTypeDescription ){

        for(EngineType currentType:EngineType.values()){
            if(currentType.getDescription().equalsIgnoreCase(engineTypeDescription)){
                return currentType;
            }
        }

        //return null
        throw new IllegalArgumentException(String.format("Cannot  match given description %s to an type",engineTypeDescription));

    }


    public static GearBoxType mapToGearBoxType(String gearBoxTypeDescrition ){

        for(GearBoxType currentType:GearBoxType.values()){
            if(currentType.getDescription().equalsIgnoreCase(gearBoxTypeDescrition)){
                return currentType;
            }
        }

        return null;
        //throw new IllegalArgumentException(String.format("Cannot  match given description %s to an type",gearBoxTypeDescrition));

    }

    public static <E  extends Enum <E>&CarComponent> E mapToEnumType(String description,Class<E>enumType){

        for(E type:enumType.getEnumConstants()){
            if(type.getDescription().equalsIgnoreCase(description)){
                return type;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(mapToEngineType("diesel"));
        //System.out.println(mapToEnumType());
    }
}
