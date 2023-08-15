package ra.demospringmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import ra.demospringmvc.model.Todo;
import ra.demospringmvc.service.TodoService;

import java.util.List;

@Controller
@RequestMapping("/TodoController")
public class TodoController {
    @Autowired
    private TodoService todoService;
    @GetMapping("")
    public String list(Model model){
        // lay du lieu
        List<Todo> todoList = todoService.findAll();
        model.addAttribute("list",todoList);
        return "/todo/list";
    }
    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") int id, Model model){
        // lay ra theo duong dan
        Todo todoEdit = todoService.findById(id);
        model.addAttribute("todo",todoEdit);
        return "todo/edit";
    }

    @PostMapping("edit")
    public String update(@ModelAttribute("todo")Todo todo){
        todoService.save(todo);
        return "redirect:/TodoController";
    }
    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") int id) {
        todoService.delete(id);
        return "redirect:/TodoController";
    }
    @GetMapping("add")
    public String addForm(Model model){
////        // dieu huong den trang todo/add
//        ModelAndView modelAndView = new ModelAndView("todo/add");
//        modelAndView.addAllObjects()
//        return modelAndView;
        Todo todo = new Todo();
        model.addAttribute("addList",todo);
        return "/todo/add";
    }
    @PostMapping("add")
    public String add(@ModelAttribute("addList")Todo todo) {
        todoService.save(todo);
        return "redirect:/TodoController";
    }



}
