package project1.thanghuyhoang.hust.com.facerecognition.screen.base

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.util.Log

abstract class BaseActivity<ViewModel : BaseViewModel, ViewBinding : ViewDataBinding> : AppCompatActivity() {
    lateinit var viewModel: ViewModel
    lateinit var viewBinding: ViewBinding
    abstract val layoutRes: Int
    abstract val viewModelId: Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        viewBinding = DataBindingUtil.setContentView(this, layoutRes)
        viewBinding.apply {
            setVariable(viewModelId, viewModel)
            setLifecycleOwner(this@BaseActivity)
        }
        initComponent()
    }

    abstract fun initViewModel()

    abstract fun initComponent()
    fun addFragment(container: Int, fragment: Fragment, tag: String, isAddBackstack: Boolean) {
        Log.d("kiemtra", "chayroine $tag")
        (supportFragmentManager.beginTransaction()).apply {
            add(container, fragment)
            if (isAddBackstack) addToBackStack(tag)

        }.commit()
    }

    fun replaceFragment(container: Int, fragment: Fragment, tag: String, isAddBackstack: Boolean) {
        (supportFragmentManager.beginTransaction()).apply {
            replace(container, fragment)
            if (isAddBackstack) addToBackStack(tag)

        }.commit()
    }
}