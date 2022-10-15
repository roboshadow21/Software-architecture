package Homework.task_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс, запускающий исполнение программы
 */
public class App {

    public static void main(String[] args) {

        Random random = ThreadLocalRandom.current();
        ArrayList<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        for (int i = 0; i<10; i++) {
            int idx = Math.abs(random.nextInt() % 2)==0?0:1;
            ItemGenerator itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();
        }
    }
}
