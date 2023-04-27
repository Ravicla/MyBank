package com.ravicla.mybank.web.controller;

import com.ravicla.mybank.domain.Share;
import com.ravicla.mybank.domain.service.ShareService;
import com.ravicla.mybank.util.JsonUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shares")
public class ShareController {
    private static final Logger log = LoggerFactory.getLogger(ShareController.class);

    @Autowired
    private ShareService shareService;
    @Autowired
    private JsonUtil jsonUtil;

    @GetMapping("/all")
    @ApiOperation("Get all shares")
    @ApiResponse(code = 200, message = "OK")
    public ResponseEntity <List<Share>> getAll(){
        return new ResponseEntity<>(shareService.getAll(), HttpStatus.OK);
    }


    @GetMapping("/{id}")
    @ApiOperation("Search a share with an ID")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Share not found"),
    })
    public ResponseEntity<Share>getShare(@ApiParam(value = "The id of the user", required = true, example = "2") @PathVariable("id") int shareId){
        return shareService.getShare(shareId)
                .map(share -> new ResponseEntity<>(share, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


    @PostMapping("/save")
    public ResponseEntity<Share>save(@RequestBody Share share){
        log.info("IN: " + jsonUtil.toJson(share));
        return new ResponseEntity<>(shareService.save(share), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Share> update (@RequestBody Share share){
        log.info("IN: " + jsonUtil.toJson(share));
        return new ResponseEntity<>(shareService.save(share), HttpStatus.CREATED);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable("id") int shareId){
        log.info("IN: " + jsonUtil.toJson(shareId));
        if(shareService.delete(shareId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
