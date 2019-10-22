// ArrayList is flexible in terms of size


ArrayList<String> list = new ArrayList<string>();
list.add("Tool");
list.add("Hammer");

/* Other useful basic ArrayList Methods */
// 1. Add the given value at the give nindex, shifting subsequenct values right
// add(index.value)

// 2. Removes all elements from the list 
// clear()

// 3. Gets the value at the given index
// get(index)

// 4. REmoves the value at the given index, shifting subsequent values left
// remove(index)

// 5. REplaces the value at the given index with the given value
// set(index, value)

// 6. Returns the current number of elements in the list
// size()

/* ArrayList Searching Methods */
// 7. Returns true if the given value appears in the list
// contains(value)

// 8. Returns the index of the first occurence of the given value in the list (-1 if not found)
// indexOf(value)

// 9. Returns the index of the alst occurence of the given value in the list (-1 if not found)
// lastIndexOf(value)

// for string s contained in list
// Note: You can not modify the list while you are iterating over it
for (String s: list){
  System.out.printIn(s);
}
