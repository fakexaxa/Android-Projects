
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.feature_search.model.OmdbRepo
import com.example.feature_search.model.response.MediaItem
import com.example.feature_search.model.response.SearchResponse
import com.example.feature_search.util.ViewState
import com.example.feature_search.viewmodel.SearchViewModel
import io.mockk.coEvery
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.test.TestCoroutineDispatcher
import kotlinx.coroutines.test.setMain

@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class SearchViewModelTest{


    private lateinit var omdbRepo: OmdbRepo
    private lateinit var viewModel: SearchViewModel

    @get:Rule
    val instantTaskExecutionRule: InstantTaskExecutorRule = InstantTaskExecutorRule()
    val dispatcher = TestCoroutineDispatcher()


    @Before
    fun setUp() {
        omdbRepo = mockk()
        viewModel = SearchViewModel(omdbRepo)
        Dispatchers.setMain(dispatcher)
    }

    @Test
    fun myTest()= runBlocking {
        // given
        val sample = MediaItem("matrix","2022","123","type","poster")
        val mockData = SearchResponse(listOf(sample),"1","response")

        coEvery { omdbRepo.searchByQuery("matrix") }returns Result.success(mockData)

        //when
        viewModel.searchForMediaItems("matrix")

        // then
        assert(ViewState.Success(Result.success(mockData).getOrNull()!!.search)==
            viewModel.viewState.value)

    }
}
