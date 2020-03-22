package testpackage;

import java.util.HashMap;
import java.util.Iterator;

public class Map {

    /**
     * Метод подсчета одинаковых элементов в HashMap, поиск производится по фамилии и имени
     *
     * @param lastName - фамилия для проверки
     * @param firstName - имя для проверки
     * @return int - количество одинаковых элементов в HashMap
     */
    public static int countElementsInMap(String lastName, String firstName) {

        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Дмитров", "Алексей");
        map.put("Ерохин", "Сергей ");
        map.put("Ярмолов", "Алексей");
        map.put("Карасев ", "Дмитрий");
        map.put(" Ерохин", "Сергей");
        map.put("Андреев ", "Андрей ");
        map.put("Смирнов", "Владимир");
        map.put("Ерохин ", "Сергей");
        map.put("Андреев", "Андрей");

        int count = 0;
        for (HashMap.Entry<String, String> hashMap : map.entrySet()) {
            if(hashMap.getKey().trim().equals(lastName) && hashMap.getValue().trim().equals(firstName)) count++;
        }
        return count;
        // Передать фамилию и имя человека в метод
        // Найти и вернуть наибольшее количество совпадений имени и фамилии
    }


    /**
     * Метод удаления определенного элемента из HashMap
     *
     * @param map   - HashMap с наполненными данными
     * @param value - значение, поиск по которому будет производится
     * @return - HashMap уже с удаленным элементом
     */
    public static HashMap<String, String> deleteValueFromMap(HashMap<String, String> map, String value) {
        /**
        for (HashMap.Entry<String, String> ent : map.entrySet()) {
            if (ent.getValue().equals(value)) {
                map.remove(ent.getKey());
            }
        }
         */
        Iterator<java.util.Map.Entry<String, String>> it;
        java.util.Map.Entry<String, String> entry;

        for (it = map.entrySet().iterator(); it.hasNext();)
        {
            entry = it.next();
            if (entry.getValue().equals(value)) {
                    it.remove();
            }
        }
        return map;
        }
        // Необходимо наполнить HashMap<String, String> и удалить значение оттуда.
        // Вернуть корректный HashMap, с удаленным элементом
}
