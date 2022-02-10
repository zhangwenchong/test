package com.example.testdemo.kotlintest

import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.testdemo.R

/**
 * @author zhangwen
 * @date 2022/2/8
 *
 */
public class MyKotlinActivity : AppCompatActivity() {
    var b: String = "abc" // 可以设置为空
    private val TAG: String = "MyKotlinActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_test)
        val test: String? = getTest("11");
        val testnull: String? = getTest(null);
        //?表示test可以为null 但是如果是null的情况下 getTest 返回null  否则 返回长度

        Log.e("test", "getTest: $test")
        Log.e(TAG, "onCreate: " + (0.4 - 0.2F))

    }

    /**
     *
     */
    private fun getTest(s: String?): String? {

        return s?.length.toString()
    }


}