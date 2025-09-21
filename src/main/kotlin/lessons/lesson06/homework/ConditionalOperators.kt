package org.example.lessons.lesson06.homework

class ConditionalOperators {
    // Задание 1: Определение сезона
    fun determineSeason(month: Int) {
        if (month !in 1..12) {
            println("Ошибка: месяц $month не существует")
            return
        }

        val season = when (month) {
            in 3..5 -> "Весна"
            in 6..8 -> "Лето"
            in 9..11 -> "Осень"
            else -> "Зима"
        }
        println("Месяц $month: $season")
    }

    // Задание 2: Расчет возраста питомца
    fun calculateDogAge(dogAge: Int) {
        if (dogAge < 0) {
            println("Ошибка: возраст не может быть отрицательным")
            return
        }

        val humanAge = if (dogAge <= 2) {
            dogAge * 10.5
        } else {
            21.0 + (dogAge - 2) * 4
        }
        println("Возраст собаки: $dogAge лет, человеческий возраст: $humanAge лет")
    }

    // Задание 3: Определение способа перемещения
    fun determineTransportation(distance: Double) {
        if (distance < 0) {
            println("Ошибка: расстояние не может быть отрицательным")
            return
        }

        val transport = when {
            distance <= 1 -> "пешком"
            distance <= 5 -> "велосипед"
            else -> "автотранспорт"
        }
        println("Расстояние: ${distance}km - рекомендуется: $transport")
    }

    // Задание 4: Расчет бонусных баллов
    fun calculateBonusPoints(purchaseAmount: Int) {
        if (purchaseAmount < 0) {
            println("Ошибка: сумма покупки не может быть отрицательной")
            return
        }

        val bonusRate = if (purchaseAmount <= 1000) 2 else 3
        val bonusPoints = (purchaseAmount / 100) * bonusRate
        println("Сумма покупки: $purchaseAmount руб. - бонусных баллов: $bonusPoints")
    }

    // Задание 5: Определение типа документа
    fun determineDocumentType(extension: String) {
        if (extension.isEmpty()) {
            println("Ошибка: расширение файла не может быть пустым")
            return
        }

        val docType = when (extension.lowercase()) {
            "txt", "doc", "docx", "pdf" -> "Текстовый документ"
            "jpg", "jpeg", "png", "gif" -> "Изображение"
            "xls", "xlsx", "csv" -> "Таблица"
            else -> "Неизвестный тип"
        }
        println("Расширение .$extension: $docType")
    }

    // Задание 6: Конвертация температуры
    fun convertTemperature(temperature: Double, unit: Char) {
        val result = when (unit.uppercaseChar()) {
            'C' -> {
                val fahrenheit = temperature * 9 / 5 + 32
                print("$temperature°C = ")
                print("$fahrenheit")
                print("F")
            }
            'F' -> {
                val celsius = (temperature - 32) * 5 / 9
                print("$temperature°F = ")
                print("$celsius")
                print("C")
            }
            else -> {
                print("Ошибка: неизвестная единица измерения '$unit'")
            }
        }
        println()
    }

    // Задание 7: Подбор одежды по погоде
    fun recommendClothing(temperature: Int) {
        val recommendation = when {
            temperature < -30 || temperature > 35 -> "Не выходите из дома!"
            temperature < 10 -> "куртка и шапка"
            temperature <= 18 -> "ветровка"
            else -> "футболка и шорты"
        }
        println("Температура: ${temperature}°C - рекомендация: $recommendation")
    }

    // Задание 8: Выбор фильма по возрасту
    fun selectMovieCategory(age: Int) {
        if (age < 0) {
            println("Ошибка: возраст не может быть отрицательным")
            return
        }

        val categories = mutableListOf<String>()

        if (age <= 9) categories.add("детские")
        if (age in 10..18) categories.add("подростковые")
        if (age >= 18) categories.add("18+")

        if (categories.isEmpty()) {
            println("Возраст $age: нет доступных категорий")
        } else {
            println("Возраст $age: доступные категории - ${categories.joinToString(", ")}")
        }
    }
}