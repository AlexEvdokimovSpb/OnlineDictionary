package gb.myhomework.onlinedictionary.presenter

import gb.myhomework.onlinedictionary.view.base.View
import gb.myhomework.onlinedictionary.model.data.AppState

interface Presenter<T : AppState, V : View> {

    fun attachView(view: V)
    fun detachView(view: V)
    fun getData(word: String, isOnline: Boolean)
}
