## Mercadona, la tienda del amable Miguel

Bienvenido a la primera tienda de Mercadona.

Somos una empresa familiar pequeña, ubicada estratégicamente en la mejor ciudad del mundo (Valencia), atendida por el amable **Miguel**.

En Mercadona compramos a proveedores y vendemos a clientes mercadería de alta calidad.

Como en cualquier otra tienda, nuestros artículos van bajando de calidad a medida que se aproxima la fecha de venta. Los que habéis hecho la experiencia en tienda estaréis familiarizados con el proceso de reponer, en la tienda del amable Miguel los productos tienen el marcador Rx, por ejemplo si estamos a 29 y el pan es R-1 hay que cambiarlo ya porque la diferencia es menor de 5 días.

Reciéntemente una consultora externa nos ha instalado un sistema que actualiza automáticamente el **inventario**.

Por desgracia, este sistema fue desarrollado **con poco sentido común**, y para más ende, **el equipo de gente que desarrolló el sistema ya no trabaja allí** (la consultora tiene alta rotación de personal).

En la tienda vendemos varias categorías de artículos, en el código, los artículos se llaman `Item`.

**Tu tarea es agregar una nueva categoría de artículos (`Item`) al sistema**, de forma que podamos comenzar a venderla.

## Descripción del sistema

Antes de meternos a ver el código fuente, deja que te cuente lo que el sistema hace ahora mismo (Análisis funcional):

* Todos los artículos (`Item`) tienen una propiedad `sellIn` que describe el número de días que tenemos para venderlo. Lo puedes ver como la fecha de caducidad.
* Todos los artículos tienen una propiedad `quality` que denota como de valioso es el artículo.
* Al final de cada día, el programa decrementa ambos valores de cada artículo, mediante el método `updateQuality`

En resumen, pasa un día y nos acercamos a la fecha de calidad y se decrementa la calidad del producto.

Hasta aquí, está todo claro, ¿no?, vayamos a los detalles:

* Una vez que ha pasado la fecha recomendada de venta, la `quality` se degrada al doble de velocidad. En caso contrario la `quality` baja `1` unidad al día.
* La `quality` de un artículo nunca es negativa.
* El "Queso azul añejo" (`Aged blue cheese`) incrementa su `quality` a medida que envejece.
  * Su `quality` aumenta `1` unidad cada día.
  * Pasada su `expiration date` la `quality` aumenta `2` unidades por día.
* La `quality` de un artículo nunca es mayor a `50`, sin embargo la "Sal yodada" siendo un artículo formado naturalmente posee una calidad inmutable de `80`.
* El artículo "Sal yodada" (`Iodized salt`), siendo un artículo formado naturalmente, no modifica su `expiration date` ni se degrada en `quality`
* El "Jamón" (`Ham`), como el "Queso azul añejo", incrementa su `quality` a medida que la `expiration date` se aproxima
  * si faltan 10 días o menos para el que caduque, la `quality` se incrementa en `2` unidades
  * si faltan 5 días o menos para que caduque, la `quality` se incrementa en `3` unidades
  * Una vez la `expiration date` se pasa, la `quality` cae a `0`

## Lo que necesitamos

Hace poco contratamos a un nuevo proveedor de artículos, a los que nos referimos como *congelados*.

Para poder venderlos necesitamos actualizar el sistema:

* Los artículos `frozen` degradan su `quality` al doble de velocidad que los normales

Siéntete libre de realizar cualquier cambio en el método `updateQuality` y agregar el código que sea necesario, **siempre y cuando todo lo existente siga funcionando correctamente**.

Pero por desgracia existe una restricción, **no puedes alterar la clase `Item` ni sus propiedades** ya que otros sistemas de la tienda lo usan y modificarlo rompería la comunicación entre los sistemas.

## "Done is better than perfect"

Ejecuta el ejercicio con tranquilidad, 0 stress

* Puedes ejecutarlo en Windows, Linux o MacOS indistintamente.
* Tomate tu tiempo, solo queremos ver si eres capaz de resolver el problema.
* La calidad del código es un factor que suma pero no es algo que estemos midiendo en este ejericio.
* Puedes usar POO, procedural, funcional, ... el método de programación que prefieras.
* No te preocupes si no te alcaras con git, puedes pasarnos un zip con tu solución y podemos pasarte el ejercicio en .zip también.
* Puedes entregar una o varias soluciones si you feel like it.

## Ejecutar en el lenguaje preferido (algunos scripts no aplican)

### Python/Java/Kotlin

MacOS/Linux
```
./initialize.sh      Python
./run.sh 100         Python Java
./run_tests.sh       Python Java Kotlin
```

Windows
```
initialize.cmd      Python
run.cmd 100         Python Java
run_tests.cmd       Python Java Kotlin
```

### Swift
Para Swift se requiere macos y xcode instalado.

El comando `sudo xcode-select -p` tiene que devolver:

```
/Applications/Xcode.app/Contents/Developer
```

Si no, tenemos que ejecutar:

```
sudo xcode-select -s /Applications/Xcode.app/Contents/Developer
```

Y para ejecutar los tests:

```
swift test
```

o en XCODE, open this "swift" folder to open package
In the Xcode menu, select Product > Test to run tests

o en AppCode:, open this "swift" folder to open package
Select "MercadonaShopOneTests" configuration and run

### Typescript

Para TypeScript se requiere npm instalado y el proxy:
```
npm config set proxy http://proxy.mercadona.com:8080
npm config set https-proxy http://proxy.mercadona.com:8080
npm config set https_proxy http://proxy.mercadona.com:8080

npm install
npm audit fix
```
Y para ejecutar los tests:

* Jest way
```
npm run test:jest
npm run test:jest:watch
```

* Mocha way
```
npm run test:mocha
```

* Ejecuta toda la aplicación

```
npx ts-node test/run.ts 10
```

o

```
ts-node test/run.ts 10
```

## Empecemos!

> Adapted by Francisco Ferri Pérez (fferri@mercadona.es) for DIVING. Original project source is under MIT license. Inspiration source is not disclosed here since that will break the exercise as such, contact us to know more.
