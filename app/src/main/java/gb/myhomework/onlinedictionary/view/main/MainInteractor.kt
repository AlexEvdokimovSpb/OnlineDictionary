package gb.myhomework.onlinedictionary.view.main

import gb.myhomework.onlinedictionary.model.data.AppState
import gb.myhomework.onlinedictionary.model.data.DataModel
import gb.myhomework.onlinedictionary.model.repository.Repository
import gb.myhomework.onlinedictionary.presenter.Interactor
import io.reactivex.Observable

class MainInteractor(
    private val remoteRepository: Repository<List<DataModel>>,
    private val localRepository: Repository<List<DataModel>>
) : Interactor<AppState> {

    override fun getData(word: String, fromRemoteSource: Boolean): Observable<AppState> {
        return if (fromRemoteSource) {
            remoteRepository.getData(word).map { AppState.Success(it) }
        } else {
            localRepository.getData(word).map { AppState.Success(it) }
        }
    }
}
