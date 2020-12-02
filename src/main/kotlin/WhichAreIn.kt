fun inArray(array1: Array<String>, array2: Array<String>): Array<String> = array1
        .filter { it1 -> array2.filter { it1 in it }.any() }
        .sorted()
        .distinct()
        .toTypedArray()