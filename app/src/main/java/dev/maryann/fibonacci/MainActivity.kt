package dev.maryann.fibonacci
import android.os.Bundle
import android.widget.Adapter
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.maryann.fibonacci.NamesRecyclerViewAdapter
import dev.maryann.fibonacci.databinding.ActivityMainBinding

class MainActivity  : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        numberList()





    }
    fun numberList(){
        var end=100
        var num1=0
        var num2=1

        var numbList= mutableListOf<Int>()
//        print("First $end terms: ")

        for (i in 1..end) {
            numbList.add(num1)
//            print("$num2 + ")

            val sum = num1+num2
            num1 =num2
            num2= sum
            var fibonacciAdapter=NamesRecyclerViewAdapter(numbList)
            binding.rvfibonacci.layoutManager=LinearLayoutManager(this)
            binding.rvfibonacci.adapter=fibonacciAdapter

        }

    }
    }




