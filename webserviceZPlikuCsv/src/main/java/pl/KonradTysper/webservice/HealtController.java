package pl.KonradTysper.webservice;

import com.google.gson.Gson;
import jdk.jfr.ContentType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealtController {
    @GetMapping("health")
    public ResponseEntity<String> checkHealth(){//UPROSZCZENIE zamiast zwracać stringa zwracamy Aplication status
//        return new ResponseEntity<>(HttpStatus.OK);

        Gson gson = new Gson();//UPROSZCZENIE USUWAMY
        AplicationStatus status = new AplicationStatus(1);//USUWAMY
        String statusjason = gson.toJson(status);//uSUWAMY

        return ResponseEntity//PONIZEJ USUWAMY A TU.ok(new Aplikationstatus 1)
                .status(HttpStatus.OK)
                .header("Content-Type","application/json;charset=UTF-8")
                .body(statusjason);
//

    }
}
