package me.robbin.mvvmscaffold.demo

import android.content.Intent
import me.robbin.mvvmscaffold.base.activity.BaseDBActivity
import me.robbin.mvvmscaffold.base.viewmodel.NoViewModel
import me.robbin.mvvmscaffold.demo.databinding.ActivityMainBinding
import me.robbin.mvvmscaffold.ext.viewmodel.getAppVM

class MainActivity : BaseDBActivity<NoViewModel, ActivityMainBinding>() {

    private val appViewModel by lazy { getAppVM<TestViewModel>() }

    override val layoutRes: Int
        get() = R.layout.activity_main

    override fun initVariable() {
        mBinding.viewmodel = appViewModel
    }

    override fun createObserver() {
        mBinding.btn.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
    }

}