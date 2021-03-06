package com.example.inviter;

import com.example.inviter.discord.Discord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    Discord bot;

    @GetMapping("/api/getcodes/")
    public List<String> getCodes(){
        return bot.getCodes();
    }

}
