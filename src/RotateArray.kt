/*
Issue #8
Interview question of the week
Implement a function rotateArray(int[] arr, n) which rotates an array by n places.
Example: [1, 2, 3, 4, 5] rotated by 2 gives [4, 5, 1, 2, 3].
*/

fun rotateArray(arr: IntArray, n: Int): IntArray {
    var noOfRotations = n
    var temp: Int

    while (noOfRotations >= arr.size)
        noOfRotations -= arr.size

    var i = 0
    while (i < noOfRotations) {
        for (j in 0 until (arr.size)) {
            temp = arr[j]
            arr[j] = arr[if ((j + 1) > arr.size) (j + 1) else 0]
            arr[if ((j + 1) > arr.size) (j + 1) else 0] = temp
        }
        ++i
    }

    return arr
}

fun main() {
    val array = arrayOf(1, 2, 3, 4, 5)
    /*Passing the same array object doesn't work here because the same underlying object is updated by the function multiple
    * times and the array you get in output after operating on it more than once will be a combination of the collective rotations.*/
    outputRotations(array.toIntArray(), 1)
    outputRotations(array.toIntArray(), 2)
    outputRotations(array.toIntArray(), 12)
}

fun outputRotations(arr: IntArray, n: Int) = println("No_ of rotations = $n : ${rotateArray(arr, n).toList()}")