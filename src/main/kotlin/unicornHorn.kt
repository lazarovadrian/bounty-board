package org.example


const val TAVERNA = "Рог Единорога"
const val HERO_NAME = "Madrigal"
const val INNKEEPER_NAME = "Cooper"

fun main(){
    val hasSteed = false
    val money = 50
    val menu = mapOf("Beer" to 3,"Juice" to 3.4, "Boom" to 2, "Vodka" to 7)
    val tavernaName = TAVERNA
    val heroName = HERO_NAME
    val innkeeperName = INNKEEPER_NAME

    println("Герой $heroName прибыл в таверну «$tavernaName». Трактирщик $innkeeperName спрашивает:")
    println("$innkeeperName: Вам нужна конюшня?")
    println("Нет, — отвечает тот, — у меня нет боевого коня: $hasSteed. Но у меня есть $money монет, и я хочу выпить")
    println("Замечательно! — говорит трактирщик $innkeeperName. — Могу предложить $menu. Что вы желаете?")
    println("Герой $heroName: Vodka пожалуйста, остается монет: ${money - (menu["Vodka"]?.toInt() ?: 7)}")
    println("Отдохнув, герой $heroName готов отправляться на поиски приключений.")
    println("Герой $heroName обнаружил волшебное зеркало, которое показывает его имя ${heroName.reversed()} наоборот")
}