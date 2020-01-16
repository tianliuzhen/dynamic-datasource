package com.aaa.dynamicdatamybatishikari2.configs;

import org.apache.commons.lang3.StringUtils;

/**
 * description: 日志分类
 *
 * @author 田留振(liuzhen.tian @ haoxiaec.com)
 * @version 1.0
 * @date 2019/12/31
 */
public enum LogFileName {

    //配置到logback.xml中的logger name="vipUser"
    ByDiy_log2("ByDiylog2"),
    ByDiy_log1("ByDiylog1");

    private String logFileName;

    LogFileName(String fileName) {
        this.logFileName = fileName;
    }

    public String getLogFileName() {
        return logFileName;
    }

    public void setLogFileName(String logFileName) {
        this.logFileName = logFileName;
    }

    public static LogFileName getAwardTypeEnum(String value) {
        LogFileName[] arr = values();
        for (LogFileName item : arr) {
            if (null != item && StringUtils.isNotBlank(item.logFileName)) {
                return item;
            }
        }
        return null;
    }
}

