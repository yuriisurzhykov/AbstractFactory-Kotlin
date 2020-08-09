
fun main() {
    val client = Client(MercedesFactory()) // Передаем в клиент фабрику Mercedes
    client.ride(Client.CarType.COUPE) // Указываем какой тип машины завести
}

//Клиентом может быть что угодно. По сути это упарвляющий класс, который работает с фабрикой,
// создает конкретные модели, и выполняет действия, которые нужны пользователю
class Client constructor(private val factory: AbstractFactory) {
    //Здесь создадим перечисление для того,
    // чтобы пользователь сам указал, какой тип транспорта ему нужен
    enum class CarType {
        COUPE,
        SEDAN
    }

    // Здесь описана логика того, как автомобиль должен ездить
    fun ride(type: CarType) {
        when(type) {
            CarType.COUPE -> factory.createCoupe().startEngine()
            CarType.SEDAN -> factory.createSedan().startEngine()
        }
    }
}