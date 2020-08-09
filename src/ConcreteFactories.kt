// А здесь уже идет конкретная реализация создания конкретного продукта,
// В данном случае это фабрика Toyota
open class ToyotaFactory: AbstractFactory {
    override fun createCoupe(): Coupe {
        return ToyotaCoupe()
    }

    override fun createSedan(): Sedan {
        return ToyotaSedan()
    }
}

//А это фабрика Mercedes
open class MercedesFactory:AbstractFactory {
    override fun createCoupe(): Coupe {
        return MercedesCoupe()
    }

    override fun createSedan(): Sedan {
        return MercedesSedan()
    }
}