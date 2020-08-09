/*Создадим общий интерфейс машины*/
interface Car {
    fun startEngine()
}

//Выделим тип машины седан
interface Sedan: Car {
    fun openTrunk()
}

//И также выделим тип купе
interface Coupe: Car {
    fun openTheRoof()
}