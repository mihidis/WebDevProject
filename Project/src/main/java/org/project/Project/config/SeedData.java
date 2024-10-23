package org.project.Project.config;

import java.util.List;

import org.project.Project.models.Account;
import org.project.Project.models.Post;
import org.project.Project.services.AccountService;
import org.project.Project.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class SeedData implements CommandLineRunner {
    @Autowired
    private PostService postService;

    @Autowired
    private AccountService accountService;

    @Override
    public void run(String... args) throws Exception {

        Account account01 = new Account();
        account01.setEmail("cmihidis@gmail.com");
        account01.setFullName("Christos Michidis");
        account01.setPassword("password");
        account01.setPhone("6973675241");
        
        accountService.save(account01);

        Account account02 = new Account();
        account02.setEmail("gmihidis@gmail.com");
        account02.setFullName("Giannis Michidis");
        account02.setPassword("password");
        account02.setPhone("6973675242");
        
        accountService.save(account02);

        List<Post> posts = postService.getAll();
        if(posts.size()==0){
            Post post01 = new Post();
            post01.setTitle("post01");      
            post01.setBody("Post01 body......");
            post01.setAccount(account01);
            postService.save(post01);

            Post post02 = new Post();
            post02.setTitle("post02");      
            post02.setBody("Post02 body......");
            post02.setAccount(account02);
            postService.save(post02);
        }
    }

}
