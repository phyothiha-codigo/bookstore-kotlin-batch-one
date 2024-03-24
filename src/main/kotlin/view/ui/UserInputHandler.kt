package view.ui

/**
 * To Handle User Input and Communicate with main UI.
 */
class UserInputHandler {

    /**
     * To show menu of bookstore app
     */
    private fun showMenu() {
        println(
            """
            Book Store Menu
            1. Add Book
            2. Display Book
            3. Exit
        """.trimIndent()
        )
    }

    /**
     * Handle user Input
     * Option 1 -> Add Book
     * Option 2 -> Display Books
     * Option 3 -> Exit
     * @param onAddBook, Callback for when user add new book.
     * @param onDisplayBook, Callback for displaying books.
     * @param onExistApp, Callback for exit the app.
     */
    fun handleUserInput(
        onAddBook: (String, String, Int) -> Unit,
        onDisplayBook: () -> Unit,
        onExistApp: () -> Unit
    ) {
        showMenu()

        val userInput = readln().toInt()

        when (userInput) {
            1 -> {
                println("Enter book name: ")
                val bookName = readln()
                println("Enter author name: ")
                val authorName = readln()
                println("Enter published year: ")
                val publishedYear = readln().toInt()

                onAddBook(bookName, authorName, publishedYear)
            }

            2 -> onDisplayBook()

            3 -> onExistApp()
        }
    }
}