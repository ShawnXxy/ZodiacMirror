package com.shawnxxy.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import com.shawnxxy.ZodiacInfoDTO;
import com.shawnxxy.domain.DTO.ZodiacDTO;

public class ZodiacInfoService {

    // get zodiac info
    public List<ZodiacDTO> getZodiac() {
        String result = null;
        List<ZodiacDTO> zodiacDTOList = new ArrayList<>();
        String url = "http://api.chinadatapay.com/grassroots/constellation/307/1";
        Map params = new HashMap();//
        params.put("key", APPKEY);// 应用APPKEY(应用详细页查询)

        try {
            result = net(url, params, "GET");
            JSONObject object = new JSONObject(result);
            if (object.getString("code").equals("10000")) {
                JSONArray JsonResultArray = object.getJSONArray("data");
                for (int i = 0; i < JsonResultArray.length(); i++) {
                    ZodiacDTO zodiacDTO = new ZodiacDTO();
                    zodiacDTO.setZodiacid(JsonResultArray.getJSONObject(i).getString("astroid"));
                    zodiacDTO.setZodiacName(JsonResultArray.getJSONObject(i).getString("astroname"));
                    zodiacDTO.setDate(JsonResultArray.getJSONObject(i).getString("date"));
                    zodiacDTO.setPic(JsonResultArray.getJSONObject(i).getString("pic"));
                    zodiacDTOList.add(zodiacDTO);
                }
                return zodiacDTOList;
            } else {
                ZodiacDTO zodiacDTO = new ZodiacDTO();
                zodiacDTO.setZodiacid(object.getString("code"));
                zodiacDTO.setZodiacName(object.getString("message"));
                zodiacDTOList.add(zodiacDTO);
                return zodiacDTOList;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<ZodiacDTO>();
        }
    };

    // add zodiac info
    public void addZodiac(ZodiacDTO zodiacDTO);

    public ZodiacInfoDTO getZodiacInfo(String zodiacId);

    public String getZodiacInfoWordCloud(String text);
}
