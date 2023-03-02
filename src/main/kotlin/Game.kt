import sun.security.ec.point.ProjectivePoint.Mutable

class Game {
    val array = arrayOf(arrayOf("cow","fox","pig","dog","bat"), arrayOf("mouse","monkey","tiger","hyena","raccoon","panda","eagle"),
        arrayOf("rhinoceros","crocodile","elephant","jaguar","dolphin","sheep","penguin")
    )
    fun <T> shuffle(list: MutableList<T>) {
        list.shuffle()
    }
    fun Game_start(){
        var count = 0
        println("주제는 동물입니다")
        println("1:1단계, 2:2단계, 3:3단계")
        var input = readLine()?.toInt()?.minus(1)
        if(input == 0){
            count = 10
        }else if(input == 1){
            count = 7
        }else{
            count = 5
        }
        var range = array.get(input!!).size
        var answer = array[input!!].get((0..range-1).random())
//        println(answer)
        var list : MutableList<Char> = answer.toMutableList()

        shuffle(list)
        while(true){
            if(count <= 0){
                println("GAME OVER")
                break
            }
            println(list)
            println("남은 횟수 "+count)
            println("동물 이름을 입력해주세요!")
            var result = readLine()
            if(answer.equals(result)){
                println(answer)
                println("축하합니다 단어를 맞추셧습니다.")
                break
            }
            count--
        }
    }
}
