package gb.myhomework.onlinedictionary.view.base

import gb.myhomework.onlinedictionary.model.data.AppState

interface View {
    fun renderData(appState: AppState)
}
