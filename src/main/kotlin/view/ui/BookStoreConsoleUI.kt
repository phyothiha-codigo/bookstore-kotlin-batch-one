package view.ui

import view.controllers.BookStoreController

/**
 * Main UI of Book Store App
 * @property bookStoreController, [BookStoreController], The controller to communicate the Business logic and UI
 * @property userInputHandler, [UserInputHandler], Controls and send back User Interactions
 */
class BookStoreConsoleUI {

    private val bookStoreController = BookStoreController()
    private val userInputHandler: UserInputHandler = UserInputHandler()

    /**
     * To start the UI
     */
    fun start() {
        userInputHandler.handleUserInput(
            onAddBook = { bookName, authorName, publishedYear ->
                bookStoreController.addBook(
                    bookName = bookName,
                    authorName = authorName,
                    publishYear = publishedYear
                )
                start()
            },
            onDisplayBook = {
                bookStoreController.displayBook()
                start()
            },
            onExistApp = {
                println("Bye!!")
            }
        )
    }
}