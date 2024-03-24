package view.controllers

import data.datasource.local.LocalDataSource
import data.models.BookModel

/**
 * Controller class for book store. It supports add books and display books.
 * @property dataSource, [LocalDataSource]
 */
class BookStoreController {
    private val dataSource: LocalDataSource = LocalDataSource

    /**
     * To add the book the book list.
     * @param bookName, [String] the name of the book
     * @param authorName, [String] the name of the author
     * @param publishYear, [Int] the year of the book published
     */
    fun addBook(
        bookName: String,
        authorName: String,
        publishYear: Int
    ) {
        dataSource.add(
            bookName = bookName,
            authorName = authorName,
            publishYear = publishYear
        )
    }

    /**
     * To display books from book list.
     */
    fun displayBook() {
        val bookList = dataSource.getAll()
        if (bookList.isEmpty()) {
            println("There is no book.")
        } else {
            bookList.forEach {
                println(it)
            }
        }
    }
}