package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

@RestController
@Controller
public class ControllerApi {
    @Autowired
    private Service service;
    @GetMapping(value = {"/",""})
    public ModelAndView getData(){
        return  new ModelAndView("index", "list",service.getAllData() );
    }

    @PostMapping(value = {"/",""})
    public Model Save(@RequestBody Model model){
        return service.AddModel(model);
    }
    @GetMapping(value = {"/{id}"})
    public ModelAndView show(@PathVariable String id){
        Model model =service.FindById(id);
        ArrayList m = Max(model.toList());
        Response response=new Response(
                model.getAngry(),
                model.getHappy(),
                model.getNeutral(),
                model.getSad(),
                model.getSurpries(),
                model.getImage(),
                90,
                (Double) m.get(0),
                (String) m.get(1)


        );
        return new ModelAndView("show","model",response);
    }

    private ArrayList Max(ArrayList<Double> list) {
        double max=0;
        int j=0;
        String type="";
        for (int i =0;i<list.size();i++){
            if (list.get(i)>max){
                max=list.get(i);
                j=i;
            }
        }
        if (j==0){type="Angry";}
        else if (j==1){type="Happy";}
        else if (j==2){type="Neutral";}
        else if (j==3){type="Sad"; }
        else if (j==4){type="Surpries";}
        ArrayList pair =new ArrayList();
        pair.add(max);
        pair.add(type);
        return pair;
    }
}
