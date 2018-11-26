package project1.thanghuyhoang.hust.com.facerecognition.screen.main

import android.arch.lifecycle.ViewModelProviders
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_main.*
import project1.thanghuyhoang.hust.com.facerecognition.BR
import project1.thanghuyhoang.hust.com.facerecognition.R
import project1.thanghuyhoang.hust.com.facerecognition.databinding.ActivityMainBinding
import project1.thanghuyhoang.hust.com.facerecognition.screen.base.BaseActivity
import project1.thanghuyhoang.hust.com.facerecognition.screen.facedetect.FaceDetectFragment
import project1.thanghuyhoang.hust.com.facerecognition.screen.facerecognition.FaceRecognitionFragment
import project1.thanghuyhoang.hust.com.facerecognition.screen.setting.SettingFragment

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>(),
    BottomNavigationView.OnNavigationItemSelectedListener {
    override val layoutRes: Int = R.layout.activity_main
    override val viewModelId = BR.viewModel
    override fun initComponent() {
        setSupportActionBar(toolbar)
        addFragment(R.id.container, FaceRecognitionFragment.newInstance(), FaceRecognitionFragment.TAG, false)
        bottom_navigation.setOnNavigationItemSelectedListener(this)
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.item_face_detect -> addFragment(
                R.id.container,
                FaceDetectFragment.newInstance(),
                FaceDetectFragment.TAG,
                false
            )
            R.id.item_face_recognition -> addFragment(
                R.id.container,
                FaceRecognitionFragment.newInstance(),
                FaceRecognitionFragment.TAG,
                false
            )
            R.id.item_setting -> addFragment(
                R.id.container,
                SettingFragment.newInstance(),
                SettingFragment.TAG,
                false
            )
        }
        return true
    }
}
