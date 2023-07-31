package com.example.guru2_team13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// 레시피 리사이클러뷰 연결
class ImageAdapter : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {
    private val items = ArrayList<Recipe>()

     // 뷰홀더가 새로 만들어질 때 호출
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.activity_recipe_view, parent, false)

        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.setItem(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun addItem(item: Recipe) {
        items.add(item)
    }

    fun clearItems() {
        items.clear()
        notifyDataSetChanged()
    }

    fun setItems(items: ArrayList<Recipe>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun getItems(position: Int, item: Recipe) {
        items[position] = item
    }

    fun setItem(position: Int, item: Recipe) {
        items[position] = item
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val recipeName: TextView = itemView.findViewById(R.id.recipeName)
        private val recipeImage: ImageButton = itemView.findViewById(R.id.recipeButton)

        init {
            recipeImage.setOnClickListener {
                val position = adapterPosition
                if(position != RecyclerView.NO_POSITION) {
                    val item = items[position]
                    openDetailActivity(item)
                }
            }
        }
        fun setItem(item: Recipe) {
            // 레시피 이름 적용
            recipeName.text = item.name

            // 이미지 리소스 식별자 가져오기
            val imageResId = itemView.resources.getIdentifier(
                item.imageSrc, "drawable", itemView.context.packageName
            )

            if (imageResId != 0) {
                // 이미지 리소스 식별자가 유효하면 이미지 설정
                recipeImage.setImageResource(imageResId)
            } else {
                // 유효하지 않은 이미지 리소스라면 기본 이미지 설정 또는 오류 처리

            }

            recipeImage.id = item.btnId

        }

        private fun openDetailActivity(item: Recipe) {
            if (recipeImage.id == 11) {
                val intent = Intent(itemView.context, BoardDetail::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 22) {
                val intent = Intent(itemView.context, BoardDetail2::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 33) {
                val intent = Intent(itemView.context, BoardDetail3::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 44) {
                val intent = Intent(itemView.context, BoardDetail4::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 55) {
                val intent = Intent(itemView.context, BoardDetail5::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 66) {
                val intent = Intent(itemView.context, BoardDetail6::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 77) {
                val intent = Intent(itemView.context, BoardDetail7::class.java)
                itemView.context.startActivity(intent)
            }
            if (recipeImage.id == 88) {
                val intent = Intent(itemView.context, BoardDetail8::class.java)
                itemView.context.startActivity(intent)
            }
        }
    }
}
