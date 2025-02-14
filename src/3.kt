fun main()
{
    try
    {
        print("Введите x: ")
        val x = readln().toDouble()
        print("Введите y: ")
        val y = readln().toDouble()
        print("Введите z: ")
        val z = readln().toDouble()
        when
        {
            (0.5 + Math.pow(Math.sin(y), 2.0)) == 0.0 ->
            {
                println("На ноль делить нельзя")
            }
            (3 + Math.pow(z, 2.0) / 5) == 0.0 ->
            {
                println("На ноль делить нельзя")
            }
            else ->
            {
                println("a = " + Math.round((2 * Math.cos(x - Math.PI / 6)) / (0.5 + Math.pow(Math.sin(y), 2.0))))
                println("b = " + Math.round((1 + (Math.pow(z, 2.0)) / (3 + Math.pow(z, 2.0) / 5))))
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}