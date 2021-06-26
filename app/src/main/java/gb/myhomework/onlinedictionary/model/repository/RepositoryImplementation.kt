package gb.myhomework.onlinedictionary.model.repository

import gb.myhomework.onlinedictionary.model.data.DataModel
import gb.myhomework.onlinedictionary.model.datasourse.DataSource
import io.reactivex.Observable

class RepositoryImplementation(private val dataSource: DataSource<List<DataModel>>) :
    Repository<List<DataModel>> {

    override fun getData(word: String): Observable<List<DataModel>> {
        return dataSource.getData(word)
    }
}
