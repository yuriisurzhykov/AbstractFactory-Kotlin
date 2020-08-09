//Абстрактная фабрика это интерфейс,
// в котором описаны методы для создания продуктов
interface AbstractFactory {
    fun createCoupe(): Coupe //Создание купе
    fun createSedan(): Sedan // Создание седана
}