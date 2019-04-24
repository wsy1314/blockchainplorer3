package io.wsy.blockchainexplorer.controller;


import com.alibaba.fastjson.JSONObject;
import io.wsy.blockchainexplorer.dao.TransactionMapper;
import io.wsy.blockchainexplorer.dto.ImportStateDTO;
import io.wsy.blockchainexplorer.po.Transaction;
import io.wsy.blockchainexplorer.service.MiscService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/misc")
@EnableAutoConfiguration
public class MiscController {

    @Autowired
    private MiscService miscService;

    @Autowired
    private TransactionMapper transactionMapper;

    @GetMapping("/search")
    public Object search(@RequestParam String keyword){
        return null;
    }


    @GetMapping("/importFronHeight")
    public void importFronHeight(@RequestParam Integer blockHeight,
                                    @RequestParam(required = false,defaultValue = "false") Boolean isClean){
   miscService.importFromHeight(blockHeight,isClean);
    }

    @GetMapping("/importFromHash")
    public void importFromHash(@RequestParam String blockhash,
                                 @RequestParam(required = false,defaultValue = "false") Boolean isClean) throws Throwable {
   miscService.importFromHash(blockhash,isClean);
    }

    @GetMapping("/getImportState")
    public ImportStateDTO getImportState(){
      return  null;
    }



}
