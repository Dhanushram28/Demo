package My.pack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calc.*
import net.objecthunter.exp4j.ExpressionBuilder

class CalcActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)
        val bundle: Bundle?=intent.extras
        val msg=bundle!!.getString("Rand_Calc")

        btn_1.setOnClickListener {
            evaluateExpression("1", clear = true)
        }
        btn_2.setOnClickListener {
            evaluateExpression("2", clear = true)
        }
        btn_3.setOnClickListener {
            evaluateExpression("3", clear = true)
        }
        btn_4.setOnClickListener {
            evaluateExpression("4", clear = true)
        }
        btn_5.setOnClickListener {
            evaluateExpression("5", clear = true)
        }
        btn_6.setOnClickListener {
            evaluateExpression("6", clear = true)
        }
        btn_7.setOnClickListener {
            evaluateExpression("7", clear = true)
        }
        btn_8.setOnClickListener {
            evaluateExpression("8", clear = true)
        }
        btn_9.setOnClickListener {
            evaluateExpression("9", clear = true)
        }
        btn_0.setOnClickListener {
            evaluateExpression("0", clear = true)
        }
        btn_dot.setOnClickListener {
            evaluateExpression(".", clear = true)
        }
        btn_div.setOnClickListener {
            evaluateExpression("/", clear = true)
        }
        btn_mul.setOnClickListener {
            evaluateExpression("*", clear = true)
        }
        btn_plus.setOnClickListener {
            evaluateExpression("+", clear = true)
        }
        btn_minus.setOnClickListener {
            evaluateExpression("-", clear = true)
        }
        btn_mod.setOnClickListener {
            evaluateExpression("%", clear = true)
        }
        btn_ob.setOnClickListener {
            evaluateExpression("(", clear = true)
        }
        btn_cb.setOnClickListener {
            evaluateExpression(")", clear = true)
        }
        btn_equal.setOnClickListener {
            val text = Expression.text.toString()
            val expression = ExpressionBuilder(text).build()

            val result = expression.evaluate()
            val longResult = result.toLong()
            if (result == longResult.toDouble()) {
                Expression.text = longResult.toString()
            } else {
                Expression.text = result.toString()
            }
        }
        btn_back.setOnClickListener {
            Expression.text = ""
            Result.text = ""
        }
    }

    fun evaluateExpression(string: String, clear: Boolean) {
        if(clear) {
            Result.text = ""
            Expression.append(string)
        } else {
            Expression.append(Result.text)
            Expression.append(string)
            Result.text = ""
        }
    }
}