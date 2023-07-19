package com.ligq.graduate.util;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;
import java.util.Map;
/**
 * @author LiGengqi
 * @date 2023/4/3 11:12
 */
public class WechatUtil {
    public static String APPID = "wx70cb3b289448079f";
    public static String SECRET = "e404f21d8e37641697612eaefc33e918";

    public static JSONObject getSessionKeyOrOpenId(String code) {
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String, String> requestUrlParam = new HashMap<>();
        // https://mp.weixin.qq.com/wxopen/devprofile?action=get_profile&token=164113089&lang=zh_CN
        //小程序appId
        requestUrlParam.put("appid", WechatUtil.APPID);
        //小程序secret
        requestUrlParam.put("secret", WechatUtil.SECRET);
        //小程序端返回的code
        requestUrlParam.put("js_code", code);
        //默认参数
        requestUrlParam.put("grant_type", "authorization_code");
        //发送post请求读取调用微信接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject(HttpClientUtil.doPost(requestUrl, requestUrlParam));
        return jsonObject;
    }
}
