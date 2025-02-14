fun main()
{
    try {
        print("Введите трёхзначное число: ")
        val number = readln().toInt()
        val givennumber = number.toString()
        var numberresult:String = ""
        when
        {
            number >= 100 && number <= 999 ->
            {
                for (i in 2 downTo 0)
                {
                    numberresult += givennumber[i]
                }
                println(numberresult.toInt())
            }
            else ->
            {
                println("Число должно быть трёхзначным")
            }
        }
    }
    catch (e:Exception)
    {
        println("Неверный тип данных")
    }
}