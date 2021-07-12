package com.abdul.bajajfinserv.collections

class MutableLists {
}

fun main() {
    val moreItems = listOf("pasta","momos","vada pav")
    val entries = mutableListOf<String>()//why giving parameter string necessary
    println("add noodles: ${entries.add("noodles")}")
    println("add spaghetti: ${entries.add("spaghetti")}")
    println("adding a list: ${entries.addAll(moreItems)}")
    //entries.add(10)
    println("Remove spaghetti: ${entries.remove("spaghetti")}")
    println("Remove rice: ${entries.remove("rice")}")
    println("Remove rice: ${entries.removeAt(0)}")
    println("Remove all/ clear list: ${entries.clear()}")



    println("Entries: $entries")
    println("empty? : ${entries.isEmpty()}")

}