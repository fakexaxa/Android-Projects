package com.example.recyclerviewpractice.util

import com.example.recyclerviewpractice.model.FoodItem
import kotlin.random.Random

val mockFoodItemList = listOf(
    FoodItem(id = randomInt, name = "Milk", description = "Turf fed cows.", price = randomDouble),
    FoodItem(id = randomInt, name = "Rice", description = "Jasmine rice.", price = randomDouble),
    FoodItem(id = randomInt, name = "Curry", description = "Yellow Curry.", price = randomDouble),
    FoodItem(
        id = randomInt,
        name = "Broth",
        description = "Beyond broth we love animals.",
        price = randomDouble
    ),
    FoodItem(
        id = randomInt,
        name = "Bell Peppers",
        description = "I guess they are shaped as a bell.",
        price = randomDouble
    ),
    FoodItem(
        id = randomInt,
        name = "Onion",
        description = "Reg Yellow Green.",
        price = randomDouble
    ),
    FoodItem(id = randomInt, name = "Oreo", description = "Original.", price = randomDouble),
    FoodItem(id = randomInt, name = "Cheese", description = "Goat cheese.", price = randomDouble),
    FoodItem(id = randomInt, name = "Water", description = "Deer Park.", price = randomDouble),
    FoodItem(id = randomInt, name = "Mango", description = "Tropical.", price = randomDouble),
    FoodItem(id = randomInt, name = "Cookies", description = "Shortbread.", price = randomDouble),
    FoodItem(id = randomInt, name = "Peas", description = "Not beans.", price = randomDouble),
    FoodItem(
        id = randomInt,
        name = "Kale",
        description = "Spinach's cousin or something like that.",
        price = randomDouble
    ),
    FoodItem(id = randomInt, name = "Cabbage", description = "Superfood.", price = randomDouble),
    FoodItem(id = randomInt, name = "Pinto Beans", description = "oragnic.", price = randomDouble),
    FoodItem(
        id = randomInt,
        name = "Oregano",
        description = "Not sure what this is.",
        price = randomDouble
    ),
)

private val randomInt get() = Random.nextInt(10000)
private val randomDouble get() = Random.nextDouble(1.0, 40.0)