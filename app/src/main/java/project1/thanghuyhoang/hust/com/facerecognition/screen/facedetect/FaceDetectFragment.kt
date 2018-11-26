package project1.thanghuyhoang.hust.com.facerecognition.screen.facedetect

import android.arch.lifecycle.ViewModelProviders
import project1.thanghuyhoang.hust.com.facerecognition.BR
import project1.thanghuyhoang.hust.com.facerecognition.R
import project1.thanghuyhoang.hust.com.facerecognition.databinding.FragmentFaceDetectBinding
import project1.thanghuyhoang.hust.com.facerecognition.screen.base.BaseFragment

class FaceDetectFragment : BaseFragment<FaceDetectViewModel, FragmentFaceDetectBinding>() {
    companion object {
        const val TAG = "FaceDetectFragment"
        fun newInstance() = FaceDetectFragment()
    }

    override val layoutRes = R.layout.fragment_face_detect
    override val viewModelVariable: Int = BR.viewModel
    override fun initComponent() {
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(FaceDetectViewModel::class.java)
    }
}