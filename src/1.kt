fun main()
{
    try
    {
    print("Введите первый член геометрической прогрессии: ")
    val a_1 = readln().toDouble()
    print("Введите знаменатель геометрической прогерссии: ")
    val q = readln().toDouble()
    when
    {
        q <= 0 -> println("Знаменатель должен быть больше нуля")
        else ->
        {
            print("Введите первый номер: ")
            val k = readln().toInt()
            print("Введите второй номер: ")
            val p = readln().toInt()
            when
            {
                k > p -> println("Первый номер не может быть больше второго")
                k <= 0 || p <= 0 -> println("Номер не может быть меньше или равен нулю")
                else ->
                {
                    val n1 = a_1 * Math.pow(q, (k - 1.0))
                    val n2 = a_1 * Math.pow(q, (p - 1.0))
                    println("Первый член = " + n1 + " Второй член = " + n2)
                    println("Сумма членов от K до P: " + Math.round(n1 * (Math.pow(q, n2) - 1)/(q - 1)))
                }
            }
        }
    }
    }
    catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}