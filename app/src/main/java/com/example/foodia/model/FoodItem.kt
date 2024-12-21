package com.example.foodia.model

import androidx.compose.runtime.Immutable

@Immutable
data class FoodItem(
    val id: Long,
    val name: String,
    val imageUrl: String,
    val price: Long,
    val tagline: String = "",
    val tags: Set<String> = emptySet()
)

val foodItems = listOf(
    FoodItem(
        id = 2L,
        name = "Pizza",
        tagline = "A Slice of Heaven!",
        imageUrl = "https://images.unsplash.com/photo-1593560708920-61dd98c46a4e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8N3x8cGl6emF8ZW58MHx8MHx8fDA%3D",
        price = 299
    ),
    FoodItem(
        id = 3L,
        name = "Pasta",
        tagline = "Indulge in Pasta Paradise!",
        imageUrl = "https://images.unsplash.com/photo-1563379926898-05f4575a45d8?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHBhc3RhfGVufDB8fDB8fHww",
        price = 350
    ),
    FoodItem(
        id = 4L,
        name = "Beef",
        tagline = "Savor the Richness!",
        imageUrl = "https://images.unsplash.com/photo-1594041680534-e8c8cdebd659?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHN0ZWFrfGVufDB8fDB8fHww",
        price = 500
    ),
    FoodItem(
        id = 5L,
        name = "Bread",
        tagline = "Baked to Perfection!",
        imageUrl = "https://images.unsplash.com/photo-1598373182133-52452f7691ef?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTJ8fGJyZWFkfGVufDB8fDB8fHww",
        price = 499
    ),
    FoodItem(
        id = 6L,
        name = "French Fries",
        tagline = "Crispy and Irresistible!",
        imageUrl = "https://images.unsplash.com/photo-1518013431117-eb1465fa5752?q=80&w=1470&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D",
        price = 299
    ),
    FoodItem(
        id = 7L,
        name = "Biryani",
        tagline = "A Flavor Explosion!",
        imageUrl = "https://images.unsplash.com/photo-1563379091339-03b21ab4a4f8?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NHx8YmlyeWFuaXxlbnwwfHwwfHx8MA%3D%3D",
        price = 1299
    ),
    FoodItem(
        id = 8L,
        name = "Shawarma",
        tagline = "A Middle Eastern Delight!",
        imageUrl = "https://cdn.pixabay.com/photo/2019/03/02/14/26/shawarma-4029889_960_720.jpg",
        price = 300
    ),
    FoodItem(
        id = 9L,
        name = "Sandwich",
        tagline = "Layers of Flavor!",
        imageUrl = "https://cdn.pixabay.com/photo/2016/03/05/20/02/sandwich-1238615_960_720.jpg",
        price = 549
    ),
    FoodItem(
        id = 10L,
        name = "Pancake",
        tagline = "Morning Bliss on a Plate!",
        imageUrl = "https://cdn.pixabay.com/photo/2017/03/13/13/39/pancakes-2139844_960_720.jpg",
        price = 200
    ),
    FoodItem(
        id = 11L,
        name = "Sushi",
        tagline = "Exquisite Japanese Delicacy!",
        imageUrl = "https://cdn.pixabay.com/photo/2021/01/01/15/31/sushi-balls-5878892_960_720.jpg",
        price = 450
    ),
    FoodItem(
        id = 12L,
        name = "Burrito",
        tagline = "A Taste of Mexico!",
        imageUrl = "https://cdn.pixabay.com/photo/2017/06/29/20/09/mexican-2456038_960_720.jpg",
        price = 250
    ),
    FoodItem(
        id = 13L,
        name = "Curry",
        tagline = "Spice up Your Life!",
        imageUrl = "https://cdn.pixabay.com/photo/2016/10/13/05/16/thai-curry-1736806_960_720.jpg",
        price = 350
    ),
    FoodItem(
        id = 14L,
        name = "Fried Chicken",
        tagline = "Crunchy Goodness!",
        imageUrl = "https://images.unsplash.com/photo-1637273484026-11d51fb64024?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Nnx8Y2hpY2tlbiUyMHdpbmdzfGVufDB8fDB8fHww",
        price = 400
    ),
    FoodItem(
        id = 15L,
        name = "Chips",
        tagline = "Crunchy Snack Time!",
        imageUrl = "https://t3.ftcdn.net/jpg/01/96/14/08/360_F_196140867_fyw8rYdh2q3dEZb5POmk21fPLBJ3Mkhs.jpg",
        price = 100
    ),
    FoodItem(
        id = 16L,
        name = "Pretzels",
        tagline = "Twist and Crunch!",
        imageUrl = "https://images.stockcake.com/public/3/8/c/38cbd9da-bf68-4a01-a3b4-8bb0c44458b1_large/fresh-baked-pretzels-stockcake.jpg",
        price = 140
    ),
    FoodItem(
        id = 17L,
        name = "Smoothies",
        tagline = "Refreshing and Nutritious!",
        imageUrl = "https://media.istockphoto.com/id/173501950/photo/fruit-smoothies.jpg?s=612x612&w=0&k=20&c=gV46AXr2qDO66Zfi5FN0jY8Qn41k6PkS-M85zEVej8E=",
        price = 190
    ),
    FoodItem(
        id = 18L,
        name = "Popcorn",
        tagline = "Movie Night Essential!",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTyNWow2zocjT8moFkMvZzp9IqSOvgLmYvjLw&s",
        price = 50
    ),
    FoodItem(
        id = 19L,
        name = "Almonds",
        tagline = "Healthy Snacking!",
        imageUrl = "https://media.istockphoto.com/id/171292794/photo/almond.jpg?s=612x612&w=0&k=20&c=CTw_CkbEuxCrHKn5D0y7Z0YR6Cp__zVsPvwl3OaPzvA=",
        price = 270
    ),
    FoodItem(
        id = 20L,
        name = "Cheese",
        tagline = "Say Cheese!",
        imageUrl = "https://t3.ftcdn.net/jpg/01/05/20/86/360_F_105208633_PVoniR6NcAGGhCDVz7WCwGRI23U6JHlZ.jpg",
        price = 300
    ),
    FoodItem(
        id = 21L,
        name = "Apples",
        tagline = "An Apple a Day...",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRjyvewZeCW0-OwrHOhenFL8sQuMxZ71tuSGQ&s",
        price = 150
    ),
    FoodItem(
        id = 22L,
        name = "Apple sauce",
        tagline = "Smooth and Delicious!",
        imageUrl = "https://media.istockphoto.com/id/475714223/photo/healthy-organic-applesauce-with-cinnamon.jpg?s=612x612&w=0&k=20&c=ZVJh8dxStnjKT7NJ1eoALkUyMBMfwntHKHJu1hrGhcQ=",
        price = 120
    ),
    FoodItem(
        id = 23L,
        name = "Apple chips",
        tagline = "Crispy Apple Goodness!",
        imageUrl = "https://www.thecreativebite.com/wp-content/uploads/2020/10/Oven-Baked-Apple-Chips-image.jpg",
        price = 90
    ),
    FoodItem(
        id = 24L,
        name = "Apple juice",
        tagline = "Pure Refreshment!",
        imageUrl = "https://img.freepik.com/free-photo/front-view-fresh-apple-juice-with-fresh-apples-dark-color-drink-photo-cocktail-fruit_140725-92836.jpg?semt=ais_hybrid",
        price = 150
    ),
    FoodItem(
        id = 25L,
        name = "Apple pie",
        tagline = "Warm and Comforting!",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTlJwZ4LiH6Mmx9nkr2LLFJ79p4xBZuXoJyQg&s",
        price = 270
    ),
    FoodItem(
        id = 26L,
        name = "Grapes",
        tagline = "Naturally Sweet!",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQSVWTo_5KaCy_f0If7LxyVftskd-0ixa4fUQ&s",
        price = 250
    ),
    FoodItem(
        id = 27L,
        name = "Kiwi",
        tagline = "Tangy and Tropical!",
        imageUrl = "https://media.istockphoto.com/id/537403487/photo/kiwi.jpg?s=612x612&w=0&k=20&c=NC7ogHNUxPDFL3SkcTMOe1vrr6p_5p34n7saoI-jhac=",
        price = 200
    ),
    FoodItem(
        id = 28L,
        name = "Mango",
        tagline = "Juicy Mango Madness!",
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSeG3QH9Si5qFwiqmiYDwjjQPkkO5HOn1SFUQ&s",
        price = 100
    )
)
