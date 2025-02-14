class Telefono(var estado : Boolean) : DispositivoElectronico,EncendidoApagado {
    override fun reiniciar() {
        estado = false
    }

    override fun encender() {
        estado = true
    }

    override fun apagar() {
        estado = false
    }
}