package com.example.eweek04a.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.eweek04a.model.TodoItemFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val todoList = remember {
        //mutableStateListOf<Item>()
        TodoItemFactory.makeTodoList()
    }
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        TodoListTitle()
        Spacer(modifier = Modifier.height(8.dp))
        Column (modifier = Modifier.weight(1f)){
            TodoList(todoList)
        }
        TodoItemInput(todoList)
    }

}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}