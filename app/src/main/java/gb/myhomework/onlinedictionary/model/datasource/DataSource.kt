package gb.myhomework.onlinedictionary.model.datasourse

import io.reactivex.Observable

interface DataSource<T> {

    fun getData(word: String): Observable<T>
}
