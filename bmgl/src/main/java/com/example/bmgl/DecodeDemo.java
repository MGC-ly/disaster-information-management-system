package com.example.bmgl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DecodeDemo {

    //地址信息码解码函数
    Map<String,Object> addressDecode(String addresscode){
        Map<String, Object> address= new HashMap<String, Object>();
        //String addressstring = decodelocation.decodelocation(addresscode);


        address.put("地址",addresscode);
        return address;
    }

    //时间码解码函数
    Map<String,Object> timeDecode(String timecode){
        Map<String, Object> time= new HashMap<String, Object>();
        String timeStr=timecode.substring(0,4)+"年"+timecode.substring(4,6)+"月"+timecode.substring(6,8)+"日"+timecode.substring(8,10)+"时"+timecode.substring(10,12)+"分"+timecode.substring(12,14)+"秒";
        time.put("时间",timeStr);
        return time;
    }

    //来源码解码函数
    Map<String,Object> sourceDecode(String sourcecode){
        Map<String, Object> source= new HashMap<String, Object>();
        int sourcecode_int=Integer.parseInt(sourcecode);
        String sourceStr=new String();
        String sourceStr_small=new String();
        int sourcecode_big_int=sourcecode_int/100;
        switch (sourcecode_big_int){
            case 1:
                switch (sourcecode_int){
                    case 100:
                        sourceStr_small="前方地震应急指挥部";
                        break;
                    case 101:
                        sourceStr_small="后方地震应急指挥部";
                        break;
                    case 120:
                        sourceStr_small="应急指挥技术系统";
                        break;
                    case 121:
                        sourceStr_small="社会服务工程应急救援系统";
                        break;
                    case 140:
                        sourceStr_small="危险区预评估工作组";
                        break;
                    case 141:
                        sourceStr_small="地震应急指挥技术协调组";
                        break;
                    case 142:
                        sourceStr_small="震后政府信息支持工作项目组";
                        break;
                    case 180:
                        sourceStr_small="灾情快速上报接收处理系统";
                        break;
                    case 181:
                        sourceStr_small="地方地震局应急信息服务相关技术系统";
                        break;
                    case 199:
                        sourceStr_small="其他";
                        break;
                }
                sourceStr="业务报送数据:"+sourceStr_small;
                break;

            case 2:
                switch (sourcecode_int){
                    case 200:
                        sourceStr_small="互联网感知";
                        break;
                    case 201:
                        sourceStr_small="通信网感知";
                        break;
                    case 202:
                        sourceStr_small="舆情网感知";
                        break;
                    case 203:
                        sourceStr_small="电力系统感知";
                        break;
                    case 204:
                        sourceStr_small="交通系统感知";
                        break;
                    case 205:
                        sourceStr_small="其他";
                        break;
                }
                sourceStr="泛在感知数据:"+sourceStr_small;
                break;

            case 3:
                sourceStr="其他数据";
                break;

        }

        source.put("来源",sourceStr);
        return source;
    }

    //载体码解码函数
    Map<String,Object> carrierDecode(String carriercode){
        Map<String, Object> carrier= new HashMap<String, Object>();
        int carriercode_int=Integer.parseInt(carriercode);
        String carrierStr=new String();
        switch(carriercode_int){
            case 0:
                carrierStr="文字";
                break;
            case 1:
                carrierStr="图像";
                break;
            case 2:
                carrierStr="音频";
                break;
            case 3:
                carrierStr="视频";
                break;
            case 4:
                carrierStr="其他";
                break;
        }
        carrier.put("载体形式",carrierStr);
        return carrier;
    }


    //灾情编码解码函数
    Map<String,Object> categoryDecode(String categorycode) {
        Map<String, Object> category = new HashMap<String, Object>();
        int categorycode_int = Integer.parseInt(categorycode);
        String categoryStr = new String();
        switch (categorycode_int) {
            case 101:
                categoryStr = "震情信息";
                break;
            case 201:
                categoryStr = "死亡";
                break;
            case 202:
                categoryStr = "受伤";
                break;
            case 203:
                categoryStr = "失踪";
                break;
            case 301:
                categoryStr = "土木";
                break;
            case 302:
                categoryStr = "砖木";
                break;
            case 303:
                categoryStr = "砖混";
                break;
            case 304:
                categoryStr = "框架";
                break;
            case 305:
                categoryStr = "其他";
                break;
            case 401:
                categoryStr = "交通";
                break;
            case 402:
                categoryStr = "供水";
                break;
            case 403:
                categoryStr = "输油";
                break;
            case 404:
                categoryStr = "燃气";
                break;
            case 405:
                categoryStr = "电力";
                break;
            case 406:
                categoryStr = "通信";
                break;
            case 407:
                categoryStr = "水利";
                break;
            case 501:
                categoryStr = "崩塌";
                break;
            case 502:
                categoryStr = "滑坡";
                break;
            case 503:
                categoryStr = "泥石流";
                break;
            case 504:
                categoryStr = "岩溶塌陷";
                break;
            case 505:
                categoryStr = "地裂缝";
                break;
            case 506:
                categoryStr = "地面沉降";
                break;
            case 507:
                categoryStr = "其他灾害";
                break;

        }
        category.put("灾情信息分类", categoryStr);
        return category;
    }

    //载体码解码函数
    Map<String,Object> labelDecode(String category_big_Code,String labelCode){
        Map<String, Object> label= new HashMap<String, Object>();
        int category_big_Code_int=Integer.parseInt(category_big_Code);
        int labelCode_int=Integer.parseInt(labelCode);
        String labelStr=new String();
        switch(category_big_Code_int){
            case 1:
                switch (labelCode_int){
                    case 001:
                        labelStr="地理位置";
                        break;
                    case 002:
                        labelStr="时间";
                        break;
                    case 003:
                        labelStr="震级";
                        break;
                    case 004:
                        labelStr="震源深度";
                        break;
                    case 005:
                        labelStr="烈度";
                        break;
                }
                break;

            case 2:
                switch (labelCode_int){
                    case 001:
                        labelStr="受灾人数";
                        break;
                    case 002:
                        labelStr="受灾程度";
                        break;
                }
                break;

            case 3:
                switch (labelCode_int){
                    case 001:
                        labelStr="一般损坏面积";
                        break;
                    case 002:
                        labelStr="严重损坏面积";
                        break;
                    case 003:
                        labelStr="受灾程度";
                        break;
                }
                break;

            case 4:
                switch (labelCode_int){
                    case 001:
                        labelStr="受灾设施数";
                        break;
                    case 002:
                        labelStr="受灾范围";
                        break;
                    case 003:
                        labelStr="受灾程度";
                        break;
                }
                break;

            case 5:
                switch (labelCode_int){
                    case 001:
                        labelStr="灾害损失";
                        break;
                    case 002:
                        labelStr="灾害范围";
                        break;
                    case 003:
                        labelStr="受灾程度";
                        break;
                }
                break;
        }
        label.put("灾情指标",labelStr);
        return label;
    }


    List<Map<String,Object>> decode(String code) {
        //创建列表，存储最终数据
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        //地址信息解码
        String addressCode=code.substring(0,12);
        Map<String, Object> address = addressDecode(addressCode);
        list.add(address);

       //时间信息解码
        String timeCode=code.substring(12,26);
        Map<String, Object> time = timeDecode(timeCode);
        list.add(time);

        //数据来源信息解码
        String sourceCode=code.substring(26,29);
        Map<String, Object> source = sourceDecode(sourceCode);
        list.add(source);

        //载体信息解码
        String carrierCode=code.substring(29,30);
        Map<String, Object> carrier = carrierDecode(carrierCode);
        list.add(carrier);

        //灾情信息分类解码
        String categoryCode=code.substring(30,33);
        Map<String, Object> category = categoryDecode(categoryCode);
        list.add(category);

        //灾情指标解码
        String category_big_Code=code.substring(30,31);
        String labelCode=code.substring(33,36);
        Map<String, Object> label = labelDecode(category_big_Code,labelCode);
        list.add(label);

//        System.out.println(list);
        return list;
    }

}
