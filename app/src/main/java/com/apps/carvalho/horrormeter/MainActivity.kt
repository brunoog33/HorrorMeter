package com.apps.carvalho.horrormeter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var mSanidadeInvestigador = "0"
    private var mVidaInvestigador = "0"
    private var mVidaMonstro = "0"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initLayouts()
    }

    private fun initLayouts() {

        val mImgMaisSanidadeInvestigador = findViewById<ImageView>(R.id.imgViewSanidadeMais)
        val mImgMenosSanidadeInvestigador = findViewById<ImageView>(R.id.imgViewSanidadeMenos)

        val mImgMaisVidaInvestigador = findViewById<ImageView>(R.id.imgViewVidaMais)
        val mImgMenosVidaInvestigador = findViewById<ImageView>(R.id.imgViewVidaMenos)

        val mImgMaisVidaMonstro = findViewById<ImageView>(R.id.imgViewMonstroMais)
        val mImgMenosVidaMonstro = findViewById<ImageView>(R.id.imgViewMonstroMenos)

        val mTextSanidadeInvestigador = findViewById<TextView>(R.id.txSanidadeInvestigador)
        val mTextVidaInvestigador = findViewById<TextView>(R.id.txVidaInvestigador)
        val mTextVidaMonstro = findViewById<TextView>(R.id.txMonstroVida)

        mImgMaisSanidadeInvestigador.setOnClickListener {
            var sanidade = Integer.parseInt(mSanidadeInvestigador)
            sanidade++
            mSanidadeInvestigador = sanidade.toString()
            mTextSanidadeInvestigador.text = mSanidadeInvestigador
        }

        mImgMenosSanidadeInvestigador.setOnClickListener {
            var sanidade = Integer.parseInt(mSanidadeInvestigador)
            sanidade--
            if (sanidade >= 0) {
                mSanidadeInvestigador = sanidade.toString()
                mTextSanidadeInvestigador.text = mSanidadeInvestigador
            } else {
                mSanidadeInvestigador = "0"
                mTextSanidadeInvestigador.text = mSanidadeInvestigador
            }
        }


        mImgMaisVidaInvestigador.setOnClickListener {
            var vida = Integer.parseInt(mVidaInvestigador)
            vida++
            mVidaInvestigador = vida.toString()
            mTextVidaInvestigador.text = mVidaInvestigador
        }

        mImgMenosVidaInvestigador.setOnClickListener {
            var vida = Integer.parseInt(mVidaInvestigador)
            vida--
            if (vida >= 0) {
                mVidaInvestigador = vida.toString()
                mTextVidaInvestigador.text = mVidaInvestigador
            } else {
                mVidaInvestigador = "0"
                mTextVidaInvestigador.text = mVidaInvestigador
            }
        }

        mImgMaisVidaMonstro.setOnClickListener {
            var vida = Integer.parseInt(mVidaMonstro)
            vida++
            mVidaMonstro = vida.toString()
            mTextVidaMonstro.text = mVidaMonstro
        }

        mImgMenosVidaMonstro.setOnClickListener {
            var vida = Integer.parseInt(mVidaMonstro)
            vida--
            if (vida >= 0) {
                mVidaMonstro = vida.toString()
                mTextVidaMonstro.text = mVidaMonstro
            } else {
                mVidaMonstro = "0"
                mTextVidaMonstro.text = mVidaMonstro
            }
        }

    }
}
