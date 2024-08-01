package practise

fun main() {
    val dishes = listOf(
        Dish("french fries", true, 530, Type.OTHER),
        Dish("pork", false, 800, Type.MEAT),
        Dish("beef", false, 700, Type.MEAT),
        Dish("chicken", false, 400, Type.MEAT),
        Dish("rice", true, 350, Type.OTHER),
        Dish("season fruit", true, 120, Type.OTHER),
        Dish("pizza", true, 550, Type.OTHER),
        Dish("prawns", false, 400, Type.FISH),
        Dish("salmon", false, 450, Type.FISH)
    )

    // Обычная
    val simple = dishes.groupBy { it.type }
//    println(simple)

    /*
    Дальнейшие операции со сгруппированными элементами
     */

    // Фильтрация
    val filtering = dishes.groupingBy { it.type }.fold(listOf<Dish>()) { acc, e -> if (e.calories > 500) acc + e else acc }
//    println(filtering)

    /*
    Многоуровневая группировка
     */
//    dishes.groupingBy { it.type }.aggregate { key, _, element, first ->
//        when {
//            element.calories <= 400 -> "DIET"
//            element.calories <= 700 -> "NORMAL"
//            else -> "FAT"
//        }
//    }
}


data class Dish(
    val name: String,
    val vegetarian: Boolean,
    val calories: Int,
    val type: Type
) : Comparable<Dish> {
    override fun compareTo(other: Dish): Int {
        return name.compareTo(other.name)
    }

    override fun toString(): String {
        return name
    }
}

enum class Type {
    MEAT,
    FISH,
    OTHER
}


