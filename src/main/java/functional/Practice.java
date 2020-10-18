package functional;

import Generics.CarComponent;
import Generics.EngineType;
import Generics.GearBoxType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Practice {

    public static void main(String[] args) {



        /*
        TASK 31

         */


        Supplier<Integer> integerSupplier=()->{
            Random random=new Random();
            return random.nextInt(EngineType.values().length);

        };
//        Supplier<Integer> integerSupplier=()->new Random().nextInt(EngineType.values().length-1);

//
//
        System.out.println(engineGenerator(integerSupplier));

        System.out.println(engineGenerator(()->new Random().nextInt(EngineType.values().length)));



        /*

        Task 32

         */

        Consumer<List<EngineType>> engineTypesPrinter= System.out::println;
        Consumer<List<GearBoxType>> gearBoxTypesPrinter=(gearBoxTypeList)-> System.out.println(gearBoxTypeList);

        List<EngineType> engineTypeList=new ArrayList<>();
        engineTypeList.add(EngineType.DIESEL);
        engineTypeList.add(EngineType.ELECTRIC);
        engineTypeList.add(EngineType.LPG);
        processEngineType(engineTypesPrinter,engineTypeList);


        List<GearBoxType> gearBoxTypeList=new ArrayList<>();
        gearBoxTypeList.add(GearBoxType.AUTOMATIC);
        gearBoxTypeList.add(GearBoxType.CVT);
        gearBoxTypeList.add(GearBoxType.MANUAL);


        processCarComponents(gearBoxTypesPrinter,gearBoxTypeList);


        Consumer<List<? extends Enum<? extends CarComponent>>> enumValuesConsumer=(enumValues)-> System.out.println(enumValues);


    }




    public static EngineType engineGenerator(Supplier<Integer>integerSupplier){
        int engineTypeIndex=integerSupplier.get();
        for(EngineType engineType :EngineType.values()){
            if(engineType.ordinal()==engineTypeIndex){
                return engineType;
            }
        }
        throw new IllegalStateException("This line is not reacheable");

    }


    public static void processEngineType(Consumer<List<EngineType>> engineTypesConsumer,List<EngineType> engineTypes){

        engineTypesConsumer.accept(engineTypes);

    }

    public static<E extends Enum<E>> void processCarComponents(Consumer<List<E>> enumValuesConsumer,List<E>enumValues){

        enumValuesConsumer.accept(enumValues);
    }


}
