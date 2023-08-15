package ra.demospringmvc.service;

import org.springframework.stereotype.Service;
import ra.demospringmvc.model.Todo;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private List<Todo> todoList;

    public TodoService() {
        todoList = new ArrayList<>();
        todoList.add(new Todo(1,"di lam", false));
        todoList.add(new Todo(2,"di choi", false));
        todoList.add(new Todo(3,"di ngu", true));
    }
    public List<Todo> findAll(){
        return todoList;
    }
    public void save(Todo todo){
        if (todo.getId()==0){
            // them moi
            todoList.add(todo);
        }else {
            todoList.set(todoList.indexOf(findById(todo.getId())),todo );
        }
    }
    public Todo findById(int id){
        for (Todo t:todoList
             ) {
            if (t.getId()==id){
                return  t;
            }
        }
        return null;
    }
    public void delete(int id){
        todoList.remove(findById(id));
    }
    public int getNewId(int id){
        int idMax = 0;
        for (Todo t:todoList
             ) {
            if (idMax<t.getId()){
                return idMax;
            }
        }
        return idMax+1;
    }}
