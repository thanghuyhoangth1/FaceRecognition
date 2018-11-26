package project1.thanghuyhoang.hust.com.facerecognition.screen.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

abstract class BaseFragment<ViewModel : BaseViewModel, ViewBinding : ViewDataBinding> : Fragment() {
    lateinit var viewModel: ViewModel
    abstract val layoutRes: Int
    lateinit var viewBinding: ViewBinding
    abstract val viewModelVariable: Int
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        initViewModel()
        viewBinding = DataBindingUtil.inflate(inflater, layoutRes, container, false)
        viewBinding.apply {
            setVariable(viewModelVariable, viewModel)
            setLifecycleOwner(this@BaseFragment)
        }
        initComponent()
        return viewBinding.root
    }

    abstract fun initComponent()

    abstract fun initViewModel()
    fun addFragment(container: Int, fragment: Fragment, tag: String, isAddBackstack: Boolean) {
        (fragmentManager?.beginTransaction())?.apply {
            add(container, fragment)
            if (isAddBackstack) addToBackStack(tag)

        }?.commit()
    }

    fun replaceFragment(container: Int, fragment: Fragment, tag: String, isAddBackstack: Boolean) {
        (fragmentManager?.beginTransaction())?.apply {
            replace(container, fragment)
            if (isAddBackstack) addToBackStack(tag)

        }?.commit()
    }
}