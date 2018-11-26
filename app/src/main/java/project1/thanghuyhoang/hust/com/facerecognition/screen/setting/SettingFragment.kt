package project1.thanghuyhoang.hust.com.facerecognition.screen.setting

import android.arch.lifecycle.ViewModelProviders
import project1.thanghuyhoang.hust.com.facerecognition.BR
import project1.thanghuyhoang.hust.com.facerecognition.R
import project1.thanghuyhoang.hust.com.facerecognition.databinding.FragmentSettingBinding
import project1.thanghuyhoang.hust.com.facerecognition.screen.base.BaseFragment

class SettingFragment : BaseFragment<SettingViewModel, FragmentSettingBinding>() {
    companion object {
        const val TAG = "SettingFragment"
        fun newInstance() = SettingFragment()
    }

    override val layoutRes: Int = R.layout.fragment_setting
    override val viewModelVariable: Int = BR.viewModel
    override fun initComponent() {
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(SettingViewModel::class.java)
    }
}