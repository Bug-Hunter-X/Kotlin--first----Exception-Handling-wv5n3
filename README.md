# Kotlin `first()` Exception Handling

This example demonstrates a common issue in Kotlin when using the `first()` function on collections.  The `first()` function retrieves the first element of a collection, but throws a `NoSuchElementException` if the collection is empty. This can lead to unexpected crashes if not handled properly.

The `bug.kt` file shows the problematic code, while `bugSolution.kt` provides a solution using `firstOrNull()` for safe access.

## How to reproduce
1. Run `bug.kt`.
2. Observe the exception when the list is empty. (Modify list to empty to test)
3. Run `bugSolution.kt`. Note that it handles the empty list case gracefully.