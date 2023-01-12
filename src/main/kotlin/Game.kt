class Game {
    val array = arrayOf(arrayOf("elephant","dog","hippo","lion","cat","fox"), arrayOf("apple","banana","peach","watermelon","orange"),
        arrayOf("korea","japan","china","unitedstates","brazil","russia","unitedkingdom")
    )
    fun Game_start(){
        println("주제를 선택해주세요")
        println("1: 동물, 2: 과일, 3: 나라이름")
        var input = readLine()?.toInt()?.minus(1)
        var range = array.get(input!!).size
        var answer = array[input!!].get((0..range-1).random())
//        println(answer)
        var blenk = ""
        for (i in (1..answer?.length!! step(1))){
            blenk += "_"
        }
        var blenks = StringBuilder(blenk)
        var count = blenks.length +3
        while(true){
            if(count <=0){
                println("GAME OVER")
                break
            }
            println("남은 횟수 "+count)
            println(blenks.toString())
            if(blenks.indexOf("_")==-1){
                println(answer)
                println("축하합니다 단어를 맞추셧습니다.")
                break
            }
            println("알파벳 한글자만 입력해주세요!")
            var result = readLine()?.single()
            count--
            for(i in (0..answer?.length?.minus(1)!! step(1))){
                if(answer[i].equals(result)) {
                    blenks.also { it.setCharAt(i, result!!) }
                }
            }
            if(blenks.indexOf("_")==-1){
                println("축하합니다 ")
                break
            }

        }
    }
}
