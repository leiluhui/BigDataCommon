package com.hzgc.service.visual.bean;

public class CaptureCountBean {
    private Integer today;
    private Integer total;

    public CaptureCountBean(Integer today, Integer total) {
        setToday(today);
        setTotal(total);
    }

    public Integer getToday() {
        return today;
    }

    public void setToday(Integer today) {
        this.today = today;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
}