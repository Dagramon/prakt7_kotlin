fun main()
{
    try {
        print("Введите трёхзначное число: ")
        val number = readln().toInt()
        val givennumber = Math.abs(number).toString()
        var numberresult:String = ""
        when
        {
            Math.abs(number) >= 100 && Math.abs(number) <= 999 ->
            {
                for (i in 2 downTo 0)
                {
                    numberresult += givennumber[i]
                }
                when
                {
                    number > 0 ->
                    {
                        println(numberresult.toInt())
                    }
                    else ->
                    {
                        println("-" + numberresult.toInt())
                    }
                }
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