package com.ayushi.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.lang.RuntimeException

class MainActivity : AppCompatActivity() {
    lateinit var tvsec:TextView
    lateinit var tvmain:TextView
    lateinit var btnAC:Button
    lateinit var btnC:Button
    lateinit var btnOpenBracket:Button
    lateinit var btnClosedBracket:Button
    lateinit var btnSin:Button
    lateinit var btnCos:Button
    lateinit var btnTan:Button
    lateinit var btnLog:Button
    lateinit var btnLn:Button
    lateinit var btnFactorial:Button
    lateinit var btnSquare: Button
    lateinit var btnSquareRoot:Button
    lateinit var btnInverse:Button
    lateinit var btnDivide:Button
    lateinit var btn9:Button
    lateinit var btn8:Button
    lateinit var btn7:Button
    lateinit var btn6:Button
    lateinit var btn5:Button
    lateinit var btn4:Button
    lateinit var btn3:Button
    lateinit var btn2:Button
    lateinit var btn1:Button
    lateinit var btn0:Button
    lateinit var btnMultiply:Button
    lateinit var btnSubtract:Button
    lateinit var btnAdd:Button
    lateinit var btnPi:Button
    lateinit var btnDot:Button
    lateinit var btnEqual:Button
    var pi = "3.14159265"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvsec = findViewById(R.id.tvsec)
        tvmain = findViewById(R.id.tvmain)

        btnAC = findViewById(R.id.btnAC)
        btnC = findViewById(R.id.btnC)
        btnOpenBracket = findViewById(R.id.btnOpenBracket)
        btnClosedBracket = findViewById(R.id.btnClosedBracket)
        btnSin = findViewById(R.id.btnSin)
        btnCos = findViewById(R.id.btnCos)
        btnTan = findViewById(R.id.btnTan)
        btnLog = findViewById(R.id.btnLog)
        btnLn = findViewById(R.id.btnLn)
        btnFactorial = findViewById(R.id.btnFactorial)
        btnSquare = findViewById(R.id.btnSquare)
        btnSquareRoot = findViewById(R.id.btnSquareRoot)
        btnInverse = findViewById(R.id.btnInverse)
        btnDivide = findViewById(R.id.btnDivide)
        btn9 = findViewById(R.id.btn9)
        btn8 = findViewById(R.id.btn8)
        btn7 = findViewById(R.id.btn7)
        btn6 = findViewById(R.id.btn6)
        btn5 = findViewById(R.id.btn5)
        btn4 = findViewById(R.id.btn4)
        btn3 = findViewById(R.id.btn3)
        btn2 = findViewById(R.id.btn2)
        btn1 = findViewById(R.id.btn1)
        btn0 = findViewById(R.id.btn0)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnAdd = findViewById(R.id.btnAdd)
        btnPi = findViewById(R.id.btnPi)
        btnDot = findViewById(R.id.btnDot)
        btnEqual = findViewById(R.id.btnEqual)

        btnSquare = findViewById(R.id.btnSquare)
        btnSquare.text = Html.fromHtml("x<sup>2</sup>")

        //on click listeners
        btn0.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "0"
            }
        })
        btn1.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "1"
            }
        })
        btn2.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "2"
            }
        })
        btn3.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "3"
            }
        })
        btn4.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "4"
            }
        })
        btn5.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "5"
            }
        })
        btn6.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "6"
            }
        })
        btn7.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "7"
            }
        })
        btn8.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "8"
            }
        })
        btn9.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "9"
            }
        })
        btnDot.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = tvmain.text.toString() + "."
            }
        })
        btnAC.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                tvmain.text = ""
                tvsec.text = ""
            }
        })
        btnC.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                var value = tvmain.text.toString()
                if(value!=""){
                    value = value.substring(0, value.length - 1)
                    tvmain.text = value
                    tvsec.text = ""
                }
            }
        })
        btnAdd.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text.toString() + "+"
            }
        })
        btnSubtract.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text.toString() + "-"
            }
        })
        btnMultiply.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(value!=""){
                    tvmain.text = "0x"
                }
                tvmain.text = tvmain.text.toString() + "x"
            }
        })
        btnDivide.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(value!=""){
                    tvmain.text = "0÷"
                }
                tvmain.text = tvmain.text.toString() + "÷"
            }
        })
        btnSquareRoot.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                    var value = tvmain.text.toString()
                    if(value!=""){
                        var sqrt_value = Math.sqrt(value.toDouble())
                        tvmain.text = sqrt_value.toString()
                        tvsec.text = "√" + value
                    }else{
                        tvmain.text = tvmain.text.toString() + "√"
                    }
            }
        })
        btnOpenBracket.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text.toString() + "("
            }
        })
        btnClosedBracket.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text.toString() + ")"
            }
        })
        btnPi.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                tvsec.text = value + "pi"
                tvmain.text = tvmain.text.toString() + pi
            }
        })
        btnSin.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvsec.text = btnSin.text
                tvmain.text = tvmain.text .toString() +  "sin"
            }
        })
        btnCos.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvsec.text = btnCos.text
                tvmain.text = tvmain.text .toString() + "cos"
            }
        })
        btnTan.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvsec.text = btnTan.text
                tvmain.text = tvmain.text .toString() + "tan"
            }
        })
        btnFactorial.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(tvmain.text.toString()!=""){
                    var d = value.toInt()
                    var fact = factorial(d)
                    tvmain.text = fact.toString()
                    tvsec.text = d.toString() +"!"
                }
            }
        })
        btnSquare.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(value!=""){
                    var d = value.toDouble()
                    var square = d*d
                    tvmain.text = square.toString()
                    tvsec.text = value + "^2"
                }
            }
        })
        btnEqual.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(value!=""|| value!="sin" || value!="cos" || value!="tan" || value!="log" || value!="ln" || value!="+" || value!="-"
                    || value!="x" || value!="÷" || value!="√" || value!="." ){
                    var result:Double = equal(value)
                    val r = result.toString()
                    tvmain.text = r
                    tvsec.text = value
                }
            }
        })
        btnLog.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text .toString() + "log"
                tvsec.text = tvmain.text
            }
        })
        btnLn.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                tvmain.text = tvmain.text .toString() + "ln"
                tvsec.text = tvmain.text
            }
        })
        btnInverse.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?){
                var value = tvmain.text.toString()
                if(value!=""){
                    var d = value.toDouble()
                    var inv = Math.pow(d,-1.0)
                    tvmain.text = inv.toString()
                    tvsec.text = "1/" + value
                }
            }
        })

        //factorial function
    }

    fun factorial(value: Int): Int{
        return if(value==0 || value==1){
            1
        }else{
            value*factorial(value-1)
        }
    }

    fun equal(str:String): Double {
        return object: Any(){
            var pos = -1
            var ch = 0

            fun nextChar(){
                if(++pos < str.length){
                    ch = str[pos].toInt()
                }else{
                    ch = -1
                }
            }

            fun eat(charToEat: Int): Boolean {
                while (ch==' '.toInt()) nextChar()
                if(ch==charToEat){
                    nextChar()
                    return true
                }
                return false
            }

            fun parseTerm() : Double{
                var x = parseFactor()
                while (true){
                    if (eat('x'.toInt())) x = x*parseFactor()
                    else if (eat('÷'.toInt())) x = x/parseFactor()
                    else return x
                }
            }

            fun parseExpression() : Double{
                var x = parseTerm()
                while (true){
                    if(eat('+'.toInt())) x += parseTerm()
                    else if (eat('-'.toInt())) x-= parseTerm()
                    else return x
                }
            }

            fun parse() : Double{
                nextChar()
                var x = parseExpression()
                if (pos<str.length) throw RuntimeException("Unexpected :" + ch.toChar())
                return x
            }

            fun parseFactor(): Double{
                if(eat('+'.toInt())) return parseFactor()
                if(eat('-'.toInt())) return -parseFactor()

                var x:Double
                val startPos = this.pos

                if(eat('('.toInt())){
                    x = parseExpression()
                    eat(')'.toInt())
                }else if((ch >= '0'.toInt() && ch <= '9'.toInt()) || ch =='.'.toInt()){
                    while ((ch>='0'.toInt() && ch <= '9'.toInt()) || ch =='.'.toInt()) nextChar()
                    x = str.substring(startPos,this.pos).toDouble()

                }else if ((ch>='a'.toInt() && ch<='z'.toInt()) || ch == '√'.toInt()) {
                    while ((ch >= 'a'.toInt() && ch <= 'z'.toInt()) || ch == '√'.toInt()) nextChar()

                    val func = str.substring(startPos, this.pos)
                    x = parseFactor()
                    if(x!='0'.toDouble()){
                        x = if (func == "√") Math.sqrt(x.toDouble())
                        else if (func == "sin") Math.sin(Math.toRadians(x))
                        else if (func == "cos") Math.cos(Math.toRadians(x))
                        else if (func == "tan") Math.tan(Math.toRadians(x))
                        else if (func == "log") Math.log10(x)
                        else if (func == "ln") Math.log(x)
                        else throw RuntimeException("Unknown Exception: $func")
                    }
                }else{
                    throw RuntimeException("Unexpected : "+ch.toChar())
                }
                return x
            }
        }.parse()
    }
}

