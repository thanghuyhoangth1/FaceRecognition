package project1.thanghuyhoang.hust.com.facerecognition.screen.facerecognition

import android.arch.lifecycle.ViewModelProviders
import project1.thanghuyhoang.hust.com.facerecognition.BR
import project1.thanghuyhoang.hust.com.facerecognition.R
import project1.thanghuyhoang.hust.com.facerecognition.databinding.FragmentFaceRecognitionBinding
import project1.thanghuyhoang.hust.com.facerecognition.screen.base.BaseFragment
import project1.thanghuyhoang.hust.com.facerecognition.screen.facedetect.FaceDetectFragment

class FaceRecognitionFragment : BaseFragment<FaceRecognitionViewModel, FragmentFaceRecognitionBinding>() {
    companion object {
        const val TAG = "FaceRecognitionFragment"
        fun newInstance() = FaceRecognitionFragment()
    }

    override val layoutRes: Int = R.layout.fragment_face_recognition
    override val viewModelVariable: Int = BR.viewModel
    override fun initComponent() {
    }

    override fun initViewModel() {
        viewModel = ViewModelProviders.of(this).get(FaceRecognitionViewModel::class.java)
    }
}