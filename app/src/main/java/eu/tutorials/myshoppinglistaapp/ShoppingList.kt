package eu.tutorials.myshoppinglistaapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class ShoppingItem(
    val id:Int,
    var name:String,
    var quantity:Int,
    var isEditing:Boolean=false
)

@Composable
fun ShoppingListApp(){
    var sItems by remember{ mutableStateOf(listOf<ShoppingItem>()) }
    // We are setting up a variable sItems
    // It will maintain the state of list of items we have
    // The list items will be Shopping item type objects(complex type)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ){
        Button(
            onClick = {},
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ){
            Text(text = "Add Item")
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize().padding(16.dp)
        ){
            items(sItems){

            }
        }
    }
}