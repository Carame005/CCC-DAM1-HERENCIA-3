class Coche(
    val nombre: String,
    val modelo: String,
    val color: String,
    override var motorEncendido: Boolean = false,
    override var kmHora: Int = 0
) : DispositivoElectronico, EncendidoApagado, Vehiculo {

    override fun reiniciar() {
        motorEncendido = false
        kmHora = 0
        println("Reiniciado el coche a los parámetros por defecto.")
    }

    override fun encender() {
        motorEncendido = true
        println("El motor está encendido.")
    }

    override fun apagar() {
        motorEncendido = false
        println("El motor está apagado.")
    }

    override fun acelerar(valor: Int) {
        kmHora += valor
        println("Acelerando, velocidad actual: $kmHora km/h.")
    }

    override fun frenar(valor: Int) {
        kmHora = if (kmHora - valor <= 0) 0 else kmHora - valor
        println("Frenando, velocidad actual: $kmHora km/h.")
    }
}