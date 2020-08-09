//Реализуем кнткретнын модели машин
open class ToyotaCoupe: Coupe {
    override fun startEngine() {
        println("Started ToyotaCoupe engine")
    }

    override fun openTheRoof() {
        println("Opened the roof on ToyotaCoupe")
    }
}
// Точно так же создаем конкретную модель седена
open class ToyotaSedan: Sedan {
    //Здесь идет реализация методов, описанных в интерфейсе
    override fun startEngine() {
        println("Started ToyotaSedan engine")
    }

    override fun openTrunk() {
        println("Opened ToyotaSedan trunk")
    }
}

open class MercedesCoupe: Coupe {
    override fun startEngine() {
        println("Started MercedesCoupe engine")
    }

    override fun openTheRoof() {
        println("Opened the roof on MercedesCoupe")
    }
}

open class MercedesSedan: Sedan {
    override fun startEngine() {
        println("Started MercedesSedan engine")
    }

    override fun openTrunk() {
        println("Opened MercedesSedan trunk")
    }
}