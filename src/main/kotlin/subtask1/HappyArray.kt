package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val resultArray = sadArray.toMutableList()

        var pointOfExit = false
        for (i in 1 until sadArray.size - 1) {
            if (resultArray[i - 1] + resultArray[i + 1] < resultArray[i]) {
                pointOfExit = true
                resultArray.removeAt(i)
                break
            }
        }
        if(pointOfExit){
            return convertToHappy(resultArray.toIntArray())
        }
        return resultArray.toIntArray()
    }


}
