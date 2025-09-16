package org.example.lessons.lesson04.homework

val v1: Int = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"
// Ошибка: FALSE должно быть с маленькой буквы - false
// val v6 = FALSE
val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f
// Ошибка: обратные кавычки используются для идентификаторов, а не для чисел
// val v20 = `1.414`
val v21: String = "Artificial Intelligence"
// Ошибка: несовместимые типы в массиве (Char и String)
// val v22 = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"
// Ошибка: FALSE должно быть с маленькой буквы - false
// val v30 = FALSE
val v31: Double = 0.007
// Ошибка: используются "умные" кавычки вместо обычных
// val v32 = “🤯”
val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)
// Ошибка: используются одинарные кавычки вместо двойных для строки
// val v34 = ‘65535’
val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f
// Ошибка: TRUE должно быть с маленькой буквы - true
// val v44 = TRUE

// 1. Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
private val mediumLetter: Char = 'A' // Пример значения

// 2. Хранить количество ложек сахара, которые я кладу в одну чашку чая.
var sugarSpoonsPerCup: Int = 2
    set(value) {
        // Валидация: нельзя отрицательное количество сахара
        field = if (value >= 0) value else throw IllegalArgumentException("Количество ложек не может быть отрицательным")
    }

// 3. Хранить список расходов на доставку еды
private val foodDeliveryExpenses: List<Double> = listOf(350.0, 280.5, 420.75)

// 4. Хранить длину очереди в столовой до миллиардной доли сантиметра.
var cafeteriaQueueLength: Double = 0.0

// 5. Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
var isBugRenamedToFeature: Boolean = false

// 6. Хранить количество свистков чайника за день.
var dailyKettleWhistleCount: Int = 0

// 7. Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
var totalCatKeyPresses: Long = 0L

// 8. Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
val historicalStarCountingAttempts: Long by lazy {
    // Имитация сложных вычислений исторических данных
    performComplexHistoricalCalculations()
}

// 9. Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
var airMassAfterCatAttack: Double = 0.000000123

// 10. Хранить словарь «название стартапа → сумму потерь инвесторов».
private val startupInvestorLosses: Map<String, Double> = mapOf(
    "BlockchainCats" to 5000000.0,
    "QuantumToaster" to 2500000.75
)

// 11. Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
val fixedItselfTicketMessage: String = "починилось само"

// 12. Хранить список тем для митингов, которые на самом деле никому не нужны.
var uselessMeetingTopics: List<String> = listOf(
    "Синхронизация междисциплинарных парадигм",
    "Оптимизация квантовых решений"
)

private fun performComplexHistoricalCalculations(): Long {
    // Сложные вычисления исторических данных
    Thread.sleep(1000) // Имитация долгих вычислений
    return 9223372036854775807L
}