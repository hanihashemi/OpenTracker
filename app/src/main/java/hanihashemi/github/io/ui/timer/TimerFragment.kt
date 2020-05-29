package hanihashemi.github.io.ui.timer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import hanihashemi.github.io.R

class TimerFragment : Fragment() {
    private lateinit var timerViewModel: TimerViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        timerViewModel =
            ViewModelProviders.of(this).get(TimerViewModel::class.java)
        return inflater.inflate(R.layout.fragment_timer, container, false)
    }
}