package pl.KonradTysper.spring_web_jpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
public class PostControler {
    private final PostRepository postRepository;

    public PostControler(PostRepository postRepository) {

        this.postRepository = postRepository;
    }






    @GetMapping("posts")
    public ResponseEntity<Iterable<Post>> getAllPosts() {
        Iterable<Post> posts = postRepository.findAll();

        return ResponseEntity.ok(posts);

    }

    @GetMapping("posts/{id}")
    public ResponseEntity<Post> getPosts(@PathVariable Integer id){
        return postRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build() );

    }

    @PostMapping("posts")
    public ResponseEntity<Post>addposts(@RequestBody Post posts){
        Post savedposts = postRepository.save(posts);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}/")
                .buildAndExpand(savedposts.getId())
                .toUri();


        return ResponseEntity.created(location).body(savedposts);
    }
    @PutMapping("posts/{id}")
    public ResponseEntity<Post> updatePost(@PathVariable Integer id, @RequestBody Post post){
        return postRepository.findById(id)
                .map(existingPost->{
                    existingPost.setBody(post.getBody());


                    return postRepository.save(existingPost);
                })
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build() );

    }
    @DeleteMapping("posts/{id}")
    public ResponseEntity<Void>deletePost(@PathVariable Integer id){
        if (!postRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        postRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }
}


