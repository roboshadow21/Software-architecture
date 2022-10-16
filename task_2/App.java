package Homework.task_2;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс, запускающий исполнение программы
 * В динамический список добавляются объекты классов Generator
 * В цикле рандомно генерируются целые числа в диапазоне длины списка и присваиваются переменной idx,
 * Метод generatorList возвращает объект из списка по индексу
 * Из объекта вызывается метод openReward
 */
public class App {

    public static void main(String[] args) {

        int idx;
        Random random = new Random();
        ArrayList<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new SwordGenerator());
        generatorList.add(new ArmorGenerator());
        generatorList.add(new ManaGenerator());
        generatorList.add(new HealthGenerator());
        generatorList.add(new BowGenerator());
        for (int i = 0; i<10; i++) {
            int length = generatorList.size() - 1;
            idx = random.nextInt(0, length);
            ItemGenerator itemGenerator = generatorList.get(idx);
            itemGenerator.openReward();
        }
    }
}
