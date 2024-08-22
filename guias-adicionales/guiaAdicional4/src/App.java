public class App {

    public static void main(String[] args) {

    }

}

//  10. Nos contratan para hacer un programa que lleve el control de las
//ventas de un local. Para esto es necesario modelar la clase Cliente, que
//posee un atributo id como identificador del cliente, el mismo debe ser un
//valor entero autoincremental que se genera automáticamente al crear un
//Cliente. El Cliente también posee un nombre, un email y un porcentaje de
//descuento.
//Por otro lado vamos a tener el objeto Factura que representa una venta del
//local, cada Factura posee un identificador de las mismas características que
//el usado en Cliente. A su vez cada factura posee un monto total, una fecha
//y el Cliente que generó la compra. Para la fecha de la venta se le va a
//asignar la fecha y hora al momento de creación del objeto Factura. El tipo
//Factura debe contar con un método que calcule el monto final luego de
//aplicarle el descuento que posee el cliente.
//      a. Investigue la clase LocalDate y sus métodos estáticos para la generación de la fecha.
//      b. Cree un objeto de tipo Cliente, imprima sus detalles por pantalla.
//      Para esto haga uso de un método que facilite la impresión del mismo.
//      Cliente[id=?, nombre=?, email=?, descuento=?]
//      c. Cree un objeto de tipo Factura que posea al Cliente anteriormente
//      creado. Una vez hecho esto, imprima por pantalla el monto total de
//      esta Factura y el monto total luego de aplicarle el descuento.
//      d. Cree un método que facilite la impresión del objeto de tipo Factura y
//      que siga el siguiente formato.
//      Factura[id=?, fecha=?, monto=?, montoDesc=?, Cliente[id=?, nombre=?, email=?, descuento=?]]
