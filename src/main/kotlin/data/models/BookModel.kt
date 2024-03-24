package data.models

/**
 * Data structure for book.
 * @property bookName, [String] the name of the book
 * @property authorName, [String] the name of the author
 * @property publishYear, [Int] the year of book published
 * @property bookId, [Int] the auto generated id of book
 */
data class BookModel(
    val bookName: String,
    val authorName: String,
    val publishYear: Int,
    val bookId: Int
)
