package day1

import println
import readInput

fun main() {
    fun part1(input: List<String>): Int {
        var dial = 50
        return input.count { line ->
            val direction = if (line[0] == 'R') 1 else -1
            val amount = line.drop(1).toInt() * direction
            dial += amount
            dial %= 100
            dial == 0
        }
    }

    fun part2(input: List<String>): Int {
        var dial = 50
        var count = 0
        input.forEach { line ->
            val direction = if (line[0] == 'R') 1 else -1
            val amount = line.drop(1).toInt()
            repeat(amount) {
                dial += direction
                dial %= 100
                if (dial == 0) count++
            }
        }
        return count
    }

        val input = readInput("day1/Day01")
        part1(input).println()
        part2(input).println()

    }
