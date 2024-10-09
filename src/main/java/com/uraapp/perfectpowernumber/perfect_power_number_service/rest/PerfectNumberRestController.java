package com.uraapp.perfectpowernumber.perfect_power_number_service.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PerfectNumberRestController {

    @GetMapping("/perfect-number")
    public PerfectPower getPerfectPower(@RequestParam("number") String number) {
        try{
            int n = Integer.valueOf(number);
            for (int i = 2; ; i++) {
                int root = (int) Math.round(Math.pow(n, 1.0 / i));
                if (root < 2) return null;
                if (Math.pow(root, i) == n) return new PerfectPower(n, root, i);
            }
        } catch(Exception e) {
            return null;
        }
    }
}
