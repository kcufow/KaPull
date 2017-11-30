package com.kcufow.kapull.bean.panda;

import java.util.List;

/**
 * Created by ldw on 2017/11/28.
 */

public class RoomInfo {

    /**
     * errno : 0
     * errmsg :
     * data : {"info":{"hostinfo":{"rid":108636218,"name":"贾克虎丶虎神","avatar":"http://i7.pdim.gs/a546e1b207a5a5ff1e7d25e5f3fb8594.png","bamboos":"16080478","level":{"val":1334.013013,"c_lv":7,"c_lv_val":1117,"n_lv":8,"n_lv_val":1390,"plays_day":34.5,"bamboo_user":73.951531,"gift_user":749.216956,"gift_cnt":476.587771,"vip":0},"qq":{"list":[{"qq":"535203905","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5vCoKRm","opttime":1511820450},{"qq":"563688102","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5EGxTFl","opttime":1511820413},{"qq":"306324061","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5gnnWBY","opttime":1511820364},{"qq":"326074743","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5IcP1ep","opttime":1511820330}],"count":4}},"roominfo":{"id":"575757","name":"魔法少女贾克虎的韩服王者路~","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"直播时间：12:00-22:00\n新浪微博：贾克虎丶虎神","details":"","person_num":"272391","fans":"190274","pictures":{"img":"http://i9.pdim.gs/90/0ed220cd2140b9a40468c909deb0abb2/w338/h190.jpg"},"display_type":"1","start_time":"1511841547","end_time":"1511800003","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","ngif_switch":"1","remind_content":"","remind_time":"0","remind_status":"0","payBarrageSwitch":"1","videojjSwitch":"0","is_have_short":"1"},"userinfo":{"rid":0,"ispay":false},"videoinfo":{"name":"dota","time":"12369","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"7fb2afc4564d4b2496922ecc0e728607","plflag":"2_3","status":"2","sign":"ff920e3658d6f91fee382327fb6be57f","ts":"&ts=5a1d0f5c&rid=-92843738","hardware":2,"scheme":"http","xy_stat":"0","tx_stat":"0","slaveflag":["4_7","7_12","14_29"],"watermark":"1"},"festival":{"pandatoken":0,"pandawindow":0},"tabinfo":[{"tab_id":"station","label_cname":"车站","tab_rank":"4","is_default_click":"0","link":"https://m.panda.tv/station.html?roomid=575757&hostid=108636218&hostname=%E8%B4%BE%E5%85%8B%E8%99%8E%E4%B8%B6%E8%99%8E%E7%A5%9E"}],"skininfo":[],"groupinfo":{"groupid":"100003","name":"清华大学","sp_name":"清华"}}}
     * authseq :
     */

    private int errno;
    private String errmsg;
    private DataBean data;
    private String authseq;

    public int getErrno() {
        return errno;
    }

    public void setErrno(int errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getAuthseq() {
        return authseq;
    }

    public void setAuthseq(String authseq) {
        this.authseq = authseq;
    }

    public static class DataBean {
        /**
         * info : {"hostinfo":{"rid":108636218,"name":"贾克虎丶虎神","avatar":"http://i7.pdim.gs/a546e1b207a5a5ff1e7d25e5f3fb8594.png","bamboos":"16080478","level":{"val":1334.013013,"c_lv":7,"c_lv_val":1117,"n_lv":8,"n_lv_val":1390,"plays_day":34.5,"bamboo_user":73.951531,"gift_user":749.216956,"gift_cnt":476.587771,"vip":0},"qq":{"list":[{"qq":"535203905","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5vCoKRm","opttime":1511820450},{"qq":"563688102","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5EGxTFl","opttime":1511820413},{"qq":"306324061","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5gnnWBY","opttime":1511820364},{"qq":"326074743","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5IcP1ep","opttime":1511820330}],"count":4}},"roominfo":{"id":"575757","name":"魔法少女贾克虎的韩服王者路~","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"直播时间：12:00-22:00\n新浪微博：贾克虎丶虎神","details":"","person_num":"272391","fans":"190274","pictures":{"img":"http://i9.pdim.gs/90/0ed220cd2140b9a40468c909deb0abb2/w338/h190.jpg"},"display_type":"1","start_time":"1511841547","end_time":"1511800003","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","ngif_switch":"1","remind_content":"","remind_time":"0","remind_status":"0","payBarrageSwitch":"1","videojjSwitch":"0","is_have_short":"1"},"userinfo":{"rid":0,"ispay":false},"videoinfo":{"name":"dota","time":"12369","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"7fb2afc4564d4b2496922ecc0e728607","plflag":"2_3","status":"2","sign":"ff920e3658d6f91fee382327fb6be57f","ts":"&ts=5a1d0f5c&rid=-92843738","hardware":2,"scheme":"http","xy_stat":"0","tx_stat":"0","slaveflag":["4_7","7_12","14_29"],"watermark":"1"},"festival":{"pandatoken":0,"pandawindow":0},"tabinfo":[{"tab_id":"station","label_cname":"车站","tab_rank":"4","is_default_click":"0","link":"https://m.panda.tv/station.html?roomid=575757&hostid=108636218&hostname=%E8%B4%BE%E5%85%8B%E8%99%8E%E4%B8%B6%E8%99%8E%E7%A5%9E"}],"skininfo":[],"groupinfo":{"groupid":"100003","name":"清华大学","sp_name":"清华"}}
         */

        private InfoBean info;

        public InfoBean getInfo() {
            return info;
        }

        public void setInfo(InfoBean info) {
            this.info = info;
        }

        public static class InfoBean {
            /**
             * hostinfo : {"rid":108636218,"name":"贾克虎丶虎神","avatar":"http://i7.pdim.gs/a546e1b207a5a5ff1e7d25e5f3fb8594.png","bamboos":"16080478","level":{"val":1334.013013,"c_lv":7,"c_lv_val":1117,"n_lv":8,"n_lv_val":1390,"plays_day":34.5,"bamboo_user":73.951531,"gift_user":749.216956,"gift_cnt":476.587771,"vip":0},"qq":{"list":[{"qq":"535203905","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5vCoKRm","opttime":1511820450},{"qq":"563688102","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5EGxTFl","opttime":1511820413},{"qq":"306324061","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5gnnWBY","opttime":1511820364},{"qq":"326074743","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5IcP1ep","opttime":1511820330}],"count":4}}
             * roominfo : {"id":"575757","name":"魔法少女贾克虎的韩服王者路~","type":"1","classification":"英雄联盟","cate":"lol","bulletin":"直播时间：12:00-22:00\n新浪微博：贾克虎丶虎神","details":"","person_num":"272391","fans":"190274","pictures":{"img":"http://i9.pdim.gs/90/0ed220cd2140b9a40468c909deb0abb2/w338/h190.jpg"},"display_type":"1","start_time":"1511841547","end_time":"1511800003","room_type":"1","status":"2","style_type":"1","banned_reason":"","unlock_time":"0","ngif_switch":"1","remind_content":"","remind_time":"0","remind_status":"0","payBarrageSwitch":"1","videojjSwitch":"0","is_have_short":"1"}
             * userinfo : {"rid":0,"ispay":false}
             * videoinfo : {"name":"dota","time":"12369","stream_addr":{"HD":"1","OD":"1","SD":"1"},"room_key":"7fb2afc4564d4b2496922ecc0e728607","plflag":"2_3","status":"2","sign":"ff920e3658d6f91fee382327fb6be57f","ts":"&ts=5a1d0f5c&rid=-92843738","hardware":2,"scheme":"http","xy_stat":"0","tx_stat":"0","slaveflag":["4_7","7_12","14_29"],"watermark":"1"}
             * festival : {"pandatoken":0,"pandawindow":0}
             * tabinfo : [{"tab_id":"station","label_cname":"车站","tab_rank":"4","is_default_click":"0","link":"https://m.panda.tv/station.html?roomid=575757&hostid=108636218&hostname=%E8%B4%BE%E5%85%8B%E8%99%8E%E4%B8%B6%E8%99%8E%E7%A5%9E"}]
             * skininfo : []
             * groupinfo : {"groupid":"100003","name":"清华大学","sp_name":"清华"}
             */

            private HostinfoBean hostinfo;
            private RoominfoBean roominfo;
            private UserinfoBean userinfo;
            private VideoinfoBean videoinfo;
            private FestivalBean festival;
            private GroupinfoBean groupinfo;
            private List<TabinfoBean> tabinfo;
            private List<?> skininfo;

            public HostinfoBean getHostinfo() {
                return hostinfo;
            }

            public void setHostinfo(HostinfoBean hostinfo) {
                this.hostinfo = hostinfo;
            }

            public RoominfoBean getRoominfo() {
                return roominfo;
            }

            public void setRoominfo(RoominfoBean roominfo) {
                this.roominfo = roominfo;
            }

            public UserinfoBean getUserinfo() {
                return userinfo;
            }

            public void setUserinfo(UserinfoBean userinfo) {
                this.userinfo = userinfo;
            }

            public VideoinfoBean getVideoinfo() {
                return videoinfo;
            }

            public void setVideoinfo(VideoinfoBean videoinfo) {
                this.videoinfo = videoinfo;
            }

            public FestivalBean getFestival() {
                return festival;
            }

            public void setFestival(FestivalBean festival) {
                this.festival = festival;
            }

            public GroupinfoBean getGroupinfo() {
                return groupinfo;
            }

            public void setGroupinfo(GroupinfoBean groupinfo) {
                this.groupinfo = groupinfo;
            }

            public List<TabinfoBean> getTabinfo() {
                return tabinfo;
            }

            public void setTabinfo(List<TabinfoBean> tabinfo) {
                this.tabinfo = tabinfo;
            }

            public List<?> getSkininfo() {
                return skininfo;
            }

            public void setSkininfo(List<?> skininfo) {
                this.skininfo = skininfo;
            }

            public static class HostinfoBean {
                /**
                 * rid : 108636218
                 * name : 贾克虎丶虎神
                 * avatar : http://i7.pdim.gs/a546e1b207a5a5ff1e7d25e5f3fb8594.png
                 * bamboos : 16080478
                 * level : {"val":1334.013013,"c_lv":7,"c_lv_val":1117,"n_lv":8,"n_lv_val":1390,"plays_day":34.5,"bamboo_user":73.951531,"gift_user":749.216956,"gift_cnt":476.587771,"vip":0}
                 * qq : {"list":[{"qq":"535203905","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5vCoKRm","opttime":1511820450},{"qq":"563688102","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5EGxTFl","opttime":1511820413},{"qq":"306324061","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5gnnWBY","opttime":1511820364},{"qq":"326074743","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5IcP1ep","opttime":1511820330}],"count":4}
                 */

                private int rid;
                private String name;
                private String avatar;
                private String bamboos;
                private LevelBean level;
                private QqBean qq;

                public int getRid() {
                    return rid;
                }

                public void setRid(int rid) {
                    this.rid = rid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getBamboos() {
                    return bamboos;
                }

                public void setBamboos(String bamboos) {
                    this.bamboos = bamboos;
                }

                public LevelBean getLevel() {
                    return level;
                }

                public void setLevel(LevelBean level) {
                    this.level = level;
                }

                public QqBean getQq() {
                    return qq;
                }

                public void setQq(QqBean qq) {
                    this.qq = qq;
                }

                public static class LevelBean {
                    /**
                     * val : 1334.013013
                     * c_lv : 7
                     * c_lv_val : 1117
                     * n_lv : 8
                     * n_lv_val : 1390
                     * plays_day : 34.5
                     * bamboo_user : 73.951531
                     * gift_user : 749.216956
                     * gift_cnt : 476.587771
                     * vip : 0
                     */

                    private double val;
                    private int c_lv;
                    private int c_lv_val;
                    private int n_lv;
                    private int n_lv_val;
                    private double plays_day;
                    private double bamboo_user;
                    private double gift_user;
                    private double gift_cnt;
                    private int vip;

                    public double getVal() {
                        return val;
                    }

                    public void setVal(double val) {
                        this.val = val;
                    }

                    public int getC_lv() {
                        return c_lv;
                    }

                    public void setC_lv(int c_lv) {
                        this.c_lv = c_lv;
                    }

                    public int getC_lv_val() {
                        return c_lv_val;
                    }

                    public void setC_lv_val(int c_lv_val) {
                        this.c_lv_val = c_lv_val;
                    }

                    public int getN_lv() {
                        return n_lv;
                    }

                    public void setN_lv(int n_lv) {
                        this.n_lv = n_lv;
                    }

                    public int getN_lv_val() {
                        return n_lv_val;
                    }

                    public void setN_lv_val(int n_lv_val) {
                        this.n_lv_val = n_lv_val;
                    }

                    public double getPlays_day() {
                        return plays_day;
                    }

                    public void setPlays_day(double plays_day) {
                        this.plays_day = plays_day;
                    }

                    public double getBamboo_user() {
                        return bamboo_user;
                    }

                    public void setBamboo_user(double bamboo_user) {
                        this.bamboo_user = bamboo_user;
                    }

                    public double getGift_user() {
                        return gift_user;
                    }

                    public void setGift_user(double gift_user) {
                        this.gift_user = gift_user;
                    }

                    public double getGift_cnt() {
                        return gift_cnt;
                    }

                    public void setGift_cnt(double gift_cnt) {
                        this.gift_cnt = gift_cnt;
                    }

                    public int getVip() {
                        return vip;
                    }

                    public void setVip(int vip) {
                        this.vip = vip;
                    }
                }

                public static class QqBean {
                    /**
                     * list : [{"qq":"535203905","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5vCoKRm","opttime":1511820450},{"qq":"563688102","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5EGxTFl","opttime":1511820413},{"qq":"306324061","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5gnnWBY","opttime":1511820364},{"qq":"326074743","description":"贾克虎丶虎神粉丝群","url":"https://jq.qq.com/?_wv=1027&k=5IcP1ep","opttime":1511820330}]
                     * count : 4
                     */

                    private int count;
                    private List<ListBean> list;

                    public int getCount() {
                        return count;
                    }

                    public void setCount(int count) {
                        this.count = count;
                    }

                    public List<ListBean> getList() {
                        return list;
                    }

                    public void setList(List<ListBean> list) {
                        this.list = list;
                    }

                    public static class ListBean {
                        /**
                         * qq : 535203905
                         * description : 贾克虎丶虎神粉丝群
                         * url : https://jq.qq.com/?_wv=1027&k=5vCoKRm
                         * opttime : 1511820450
                         */

                        private String qq;
                        private String description;
                        private String url;
                        private int opttime;

                        public String getQq() {
                            return qq;
                        }

                        public void setQq(String qq) {
                            this.qq = qq;
                        }

                        public String getDescription() {
                            return description;
                        }

                        public void setDescription(String description) {
                            this.description = description;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public int getOpttime() {
                            return opttime;
                        }

                        public void setOpttime(int opttime) {
                            this.opttime = opttime;
                        }
                    }
                }
            }

            public static class RoominfoBean {
                /**
                 * id : 575757
                 * name : 魔法少女贾克虎的韩服王者路~
                 * type : 1
                 * classification : 英雄联盟
                 * cate : lol
                 * bulletin : 直播时间：12:00-22:00
                 新浪微博：贾克虎丶虎神
                 * details :
                 * person_num : 272391
                 * fans : 190274
                 * pictures : {"img":"http://i9.pdim.gs/90/0ed220cd2140b9a40468c909deb0abb2/w338/h190.jpg"}
                 * display_type : 1
                 * start_time : 1511841547
                 * end_time : 1511800003
                 * room_type : 1
                 * status : 2
                 * style_type : 1
                 * banned_reason :
                 * unlock_time : 0
                 * ngif_switch : 1
                 * remind_content :
                 * remind_time : 0
                 * remind_status : 0
                 * payBarrageSwitch : 1
                 * videojjSwitch : 0
                 * is_have_short : 1
                 */

                private String id;
                private String name;
                private String type;
                private String classification;
                private String cate;
                private String bulletin;
                private String details;
                private String person_num;
                private String fans;
                private PicturesBean pictures;
                private String display_type;
                private String start_time;
                private String end_time;
                private String room_type;
                private String status;
                private String style_type;
                private String banned_reason;
                private String unlock_time;
                private String ngif_switch;
                private String remind_content;
                private String remind_time;
                private String remind_status;
                private String payBarrageSwitch;
                private String videojjSwitch;
                private String is_have_short;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getClassification() {
                    return classification;
                }

                public void setClassification(String classification) {
                    this.classification = classification;
                }

                public String getCate() {
                    return cate;
                }

                public void setCate(String cate) {
                    this.cate = cate;
                }

                public String getBulletin() {
                    return bulletin;
                }

                public void setBulletin(String bulletin) {
                    this.bulletin = bulletin;
                }

                public String getDetails() {
                    return details;
                }

                public void setDetails(String details) {
                    this.details = details;
                }

                public String getPerson_num() {
                    return person_num;
                }

                public void setPerson_num(String person_num) {
                    this.person_num = person_num;
                }

                public String getFans() {
                    return fans;
                }

                public void setFans(String fans) {
                    this.fans = fans;
                }

                public PicturesBean getPictures() {
                    return pictures;
                }

                public void setPictures(PicturesBean pictures) {
                    this.pictures = pictures;
                }

                public String getDisplay_type() {
                    return display_type;
                }

                public void setDisplay_type(String display_type) {
                    this.display_type = display_type;
                }

                public String getStart_time() {
                    return start_time;
                }

                public void setStart_time(String start_time) {
                    this.start_time = start_time;
                }

                public String getEnd_time() {
                    return end_time;
                }

                public void setEnd_time(String end_time) {
                    this.end_time = end_time;
                }

                public String getRoom_type() {
                    return room_type;
                }

                public void setRoom_type(String room_type) {
                    this.room_type = room_type;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getStyle_type() {
                    return style_type;
                }

                public void setStyle_type(String style_type) {
                    this.style_type = style_type;
                }

                public String getBanned_reason() {
                    return banned_reason;
                }

                public void setBanned_reason(String banned_reason) {
                    this.banned_reason = banned_reason;
                }

                public String getUnlock_time() {
                    return unlock_time;
                }

                public void setUnlock_time(String unlock_time) {
                    this.unlock_time = unlock_time;
                }

                public String getNgif_switch() {
                    return ngif_switch;
                }

                public void setNgif_switch(String ngif_switch) {
                    this.ngif_switch = ngif_switch;
                }

                public String getRemind_content() {
                    return remind_content;
                }

                public void setRemind_content(String remind_content) {
                    this.remind_content = remind_content;
                }

                public String getRemind_time() {
                    return remind_time;
                }

                public void setRemind_time(String remind_time) {
                    this.remind_time = remind_time;
                }

                public String getRemind_status() {
                    return remind_status;
                }

                public void setRemind_status(String remind_status) {
                    this.remind_status = remind_status;
                }

                public String getPayBarrageSwitch() {
                    return payBarrageSwitch;
                }

                public void setPayBarrageSwitch(String payBarrageSwitch) {
                    this.payBarrageSwitch = payBarrageSwitch;
                }

                public String getVideojjSwitch() {
                    return videojjSwitch;
                }

                public void setVideojjSwitch(String videojjSwitch) {
                    this.videojjSwitch = videojjSwitch;
                }

                public String getIs_have_short() {
                    return is_have_short;
                }

                public void setIs_have_short(String is_have_short) {
                    this.is_have_short = is_have_short;
                }

                public static class PicturesBean {
                    /**
                     * img : http://i9.pdim.gs/90/0ed220cd2140b9a40468c909deb0abb2/w338/h190.jpg
                     */

                    private String img;

                    public String getImg() {
                        return img;
                    }

                    public void setImg(String img) {
                        this.img = img;
                    }
                }
            }

            public static class UserinfoBean {
                /**
                 * rid : 0
                 * ispay : false
                 */

                private int rid;
                private boolean ispay;

                public int getRid() {
                    return rid;
                }

                public void setRid(int rid) {
                    this.rid = rid;
                }

                public boolean isIspay() {
                    return ispay;
                }

                public void setIspay(boolean ispay) {
                    this.ispay = ispay;
                }
            }

            public static class VideoinfoBean {
                /**
                 * name : dota
                 * time : 12369
                 * stream_addr : {"HD":"1","OD":"1","SD":"1"}
                 * room_key : 7fb2afc4564d4b2496922ecc0e728607
                 * plflag : 2_3
                 * status : 2
                 * sign : ff920e3658d6f91fee382327fb6be57f
                 * ts : &ts=5a1d0f5c&rid=-92843738
                 * hardware : 2
                 * scheme : http
                 * xy_stat : 0
                 * tx_stat : 0
                 * slaveflag : ["4_7","7_12","14_29"]
                 * watermark : 1
                 */

                private String name;
                private String time;
                private StreamAddrBean stream_addr;
                private String room_key;
                private String plflag;
                private String status;
                private String sign;
                private String ts;
                private int hardware;
                private String scheme;
                private String xy_stat;
                private String tx_stat;
                private String watermark;
                private List<String> slaveflag;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public StreamAddrBean getStream_addr() {
                    return stream_addr;
                }

                public void setStream_addr(StreamAddrBean stream_addr) {
                    this.stream_addr = stream_addr;
                }

                public String getRoom_key() {
                    return room_key;
                }

                public void setRoom_key(String room_key) {
                    this.room_key = room_key;
                }

                public String getPlflag() {
                    return plflag;
                }

                public void setPlflag(String plflag) {
                    this.plflag = plflag;
                }

                public String getStatus() {
                    return status;
                }

                public void setStatus(String status) {
                    this.status = status;
                }

                public String getSign() {
                    return sign;
                }

                public void setSign(String sign) {
                    this.sign = sign;
                }

                public String getTs() {
                    return ts;
                }

                public void setTs(String ts) {
                    this.ts = ts;
                }

                public int getHardware() {
                    return hardware;
                }

                public void setHardware(int hardware) {
                    this.hardware = hardware;
                }

                public String getScheme() {
                    return scheme;
                }

                public void setScheme(String scheme) {
                    this.scheme = scheme;
                }

                public String getXy_stat() {
                    return xy_stat;
                }

                public void setXy_stat(String xy_stat) {
                    this.xy_stat = xy_stat;
                }

                public String getTx_stat() {
                    return tx_stat;
                }

                public void setTx_stat(String tx_stat) {
                    this.tx_stat = tx_stat;
                }

                public String getWatermark() {
                    return watermark;
                }

                public void setWatermark(String watermark) {
                    this.watermark = watermark;
                }

                public List<String> getSlaveflag() {
                    return slaveflag;
                }

                public void setSlaveflag(List<String> slaveflag) {
                    this.slaveflag = slaveflag;
                }

                public static class StreamAddrBean {
                    /**
                     * HD : 1
                     * OD : 1
                     * SD : 1
                     */

                    private String HD;
                    private String OD;
                    private String SD;

                    public String getHD() {
                        return HD;
                    }

                    public void setHD(String HD) {
                        this.HD = HD;
                    }

                    public String getOD() {
                        return OD;
                    }

                    public void setOD(String OD) {
                        this.OD = OD;
                    }

                    public String getSD() {
                        return SD;
                    }

                    public void setSD(String SD) {
                        this.SD = SD;
                    }
                }
            }

            public static class FestivalBean {
                /**
                 * pandatoken : 0
                 * pandawindow : 0
                 */

                private int pandatoken;
                private int pandawindow;

                public int getPandatoken() {
                    return pandatoken;
                }

                public void setPandatoken(int pandatoken) {
                    this.pandatoken = pandatoken;
                }

                public int getPandawindow() {
                    return pandawindow;
                }

                public void setPandawindow(int pandawindow) {
                    this.pandawindow = pandawindow;
                }
            }

            public static class GroupinfoBean {
                /**
                 * groupid : 100003
                 * name : 清华大学
                 * sp_name : 清华
                 */

                private String groupid;
                private String name;
                private String sp_name;

                public String getGroupid() {
                    return groupid;
                }

                public void setGroupid(String groupid) {
                    this.groupid = groupid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getSp_name() {
                    return sp_name;
                }

                public void setSp_name(String sp_name) {
                    this.sp_name = sp_name;
                }
            }

            public static class TabinfoBean {
                /**
                 * tab_id : station
                 * label_cname : 车站
                 * tab_rank : 4
                 * is_default_click : 0
                 * link : https://m.panda.tv/station.html?roomid=575757&hostid=108636218&hostname=%E8%B4%BE%E5%85%8B%E8%99%8E%E4%B8%B6%E8%99%8E%E7%A5%9E
                 */

                private String tab_id;
                private String label_cname;
                private String tab_rank;
                private String is_default_click;
                private String link;

                public String getTab_id() {
                    return tab_id;
                }

                public void setTab_id(String tab_id) {
                    this.tab_id = tab_id;
                }

                public String getLabel_cname() {
                    return label_cname;
                }

                public void setLabel_cname(String label_cname) {
                    this.label_cname = label_cname;
                }

                public String getTab_rank() {
                    return tab_rank;
                }

                public void setTab_rank(String tab_rank) {
                    this.tab_rank = tab_rank;
                }

                public String getIs_default_click() {
                    return is_default_click;
                }

                public void setIs_default_click(String is_default_click) {
                    this.is_default_click = is_default_click;
                }

                public String getLink() {
                    return link;
                }

                public void setLink(String link) {
                    this.link = link;
                }
            }
        }
    }
}
