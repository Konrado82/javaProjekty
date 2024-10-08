package pl.KonradTysper.spring_web_jpa;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserControler {

    private final UserRepository userRepository;


    public UserControler(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping("users")
    public ResponseEntity<Iterable<User>> getAllUsers(){
        Iterable<User> users = userRepository.findAll();

        return ResponseEntity.ok(users);
    }
    @GetMapping("users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id){
        return userRepository.findById(id)
                .map(body -> ResponseEntity.ok(body))
                .orElseGet(()-> ResponseEntity.notFound().build() );
    }

    @PostMapping("users")
    public ResponseEntity<User>adduser(@RequestBody User user){
        User savedUser = userRepository.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();


        return ResponseEntity.created(location).body(savedUser);
    }
    @PutMapping("users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Integer id, @RequestBody User user){
        return userRepository.findById(id)
                .map(existingUser->{
                    existingUser.setLogin(user.getLogin());
                    existingUser.setDisplayName(user.getDisplayName());
                    existingUser.setYearOfBirth(user.getYearOfBirth());

                    return userRepository.save(existingUser);
                })
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build() );

    }
    @PatchMapping("users/{id}")
    public ResponseEntity<User> updatePatch(@PathVariable Integer id,@RequestBody User user){
        return userRepository.findById(id)
                .map(existingUser->{
                    if (user.getLogin()!= null) existingUser.setLogin(user.getLogin());
                    if (user.getDisplayName()!= null) existingUser.setDisplayName(user.getDisplayName());
                    if (user.getYearOfBirth()!= null) existingUser.setYearOfBirth(user.getYearOfBirth());

                    return userRepository.save(existingUser);
                })
                .map(ResponseEntity::ok)
                .orElseGet(()-> ResponseEntity.notFound().build() );

    }
    @DeleteMapping("users/{id}")
    public ResponseEntity<Void>deleteUser(@PathVariable Integer id){
        if (!userRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        userRepository.deleteById(id);

        return ResponseEntity.noContent().build();

    }





}


