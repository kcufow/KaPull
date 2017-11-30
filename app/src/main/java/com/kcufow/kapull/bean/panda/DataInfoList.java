package com.kcufow.kapull.bean.panda;

import java.util.List;

/**
 * Created by ldw on 2017/11/28.
 */

public class DataInfoList {


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

        private String total;
        private TypeBean type;
        private List<ItemsBean> items;

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public TypeBean getType() {
            return type;
        }

        public void setType(TypeBean type) {
            this.type = type;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class TypeBean {
            /**
             * ename : lol
             * cname : 英雄联盟
             */

            private String ename;
            private String cname;

            public String getEname() {
                return ename;
            }

            public void setEname(String ename) {
                this.ename = ename;
            }

            public String getCname() {
                return cname;
            }

            public void setCname(String cname) {
                this.cname = cname;
            }
        }

        public static class ItemsBean {
            /**
             * id : 135069
             * ver : 1
             * createtime : 2015-11-25 06:41:06
             * updatetime : 2017-11-28 11:15:12
             * name : 脏活累活让我来
             * hostid : 21159862
             * person_num : 99700
             * announcement :
             * classification : {"cname":"英雄联盟","ename":"lol"}
             * pictures : {"img":"http://i7.pdim.gs/90/6d54c5fe1d8ddb58b561bc99f365ced6/w338/h190.jpg"}
             * status : 2
             * start_time : 1511834512
             * end_time : 1511834395
             * duration : 4409
             * schedule : 0
             * remind_switch : 1
             * remind_content :
             * stream_status : 1
             * classify_switch : 2
             * reliable : 1
             * banned_reason : 宣传涉及金钱相关的广告信息
             * unlock_time : 1505548475
             * speak_interval : 2
             * person_num_thres :
             * reduce_ratio :
             * person_switch :
             * watermark_switch : 1
             * watermark_loc : 1
             * account_status : 1
             * person_src : 2
             * display_type : 1
             * tag :
             * tag_switch : 1
             * tag_color : 3
             * rcmd_ratio :
             * show_pos : 1
             * rtype_usable : 1
             * room_type : 1
             * rtype_value :
             * style_type : 1
             * cdn_rate : 0
             * cover_switch : 0
             * label : [{"cname":"说学逗唱","color":"2","ename":"sxdc"}]
             * host_level_info : {"val":3213.671111,"c_lv":11,"c_lv_val":2684,"n_lv":12,"n_lv_val":3342,"plays_day":976.5,"bamboo_user":152.843746,"gift_user":1043.468876,"gift_cnt":1040.997987,"vip":0}
             * lianmai : 3
             * sort_weight :
             * top_icon : 0
             * room_key : 8c1f067d926a62776eceff71f05e772d
             * fans : 0
             * userinfo : {"rid":21159862,"nickName":"守卫者","avatar":"http://i3.pdim.gs/t01459a0cf3173b9fa4.png","userName":""}
             * click_trace : list
             * definition_option : {"HD":"1","OD":"1","SD":"1"}
             * xy_stat : 0
             * tx_stat : 0
             * hardware : 2
             * skininfo : {"skin_type":"1","img_top":"http://i5.pdim.gs/ed1f96779d9d007197b5ae0d9ee9e2be.png","img_mid":"http://i5.pdim.gs/426edf66cca4ff3503a5aea18ba22998.png","img_bottom":"http://i6.pdim.gs/f1e3dd011252da005af5534388c5dda5.png","img_list":"","icon_number":"1"}
             */

            private String id;
            private String ver;
            private String createtime;
            private String updatetime;
            private String name;
            private String hostid;
            private String person_num;
            private String announcement;
            private ClassificationBean classification;
            private PicturesBean pictures;
            private String status;
            private String start_time;
            private String end_time;
            private String duration;
            private String schedule;
            private String remind_switch;
            private String remind_content;
            private String stream_status;
            private String classify_switch;
            private String reliable;
            private String banned_reason;
            private String unlock_time;
            private String speak_interval;
            private String person_num_thres;
            private String reduce_ratio;
            private String person_switch;
            private String watermark_switch;
            private String watermark_loc;
            private String account_status;
            private String person_src;
            private String display_type;
            private String tag;
            private String tag_switch;
            private String tag_color;
            private String rcmd_ratio;
            private String show_pos;
            private String rtype_usable;
            private String room_type;
            private String rtype_value;
            private String style_type;
            private String cdn_rate;
            private String cover_switch;
            private String host_level_info;
            private String lianmai;
            private String sort_weight;
            private String top_icon;
            private String room_key;
            private String fans;
            private UserinfoBean userinfo;
            private String click_trace;
            private DefinitionOptionBean definition_option;
            private String xy_stat;
            private String tx_stat;
            private String hardware;
            private SkininfoBean skininfo;
            private List<LabelBean> label;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getHostid() {
                return hostid;
            }

            public void setHostid(String hostid) {
                this.hostid = hostid;
            }

            public String getPerson_num() {
                return person_num;
            }

            public void setPerson_num(String person_num) {
                this.person_num = person_num;
            }

            public String getAnnouncement() {
                return announcement;
            }

            public void setAnnouncement(String announcement) {
                this.announcement = announcement;
            }

            public ClassificationBean getClassification() {
                return classification;
            }

            public void setClassification(ClassificationBean classification) {
                this.classification = classification;
            }

            public PicturesBean getPictures() {
                return pictures;
            }

            public void setPictures(PicturesBean pictures) {
                this.pictures = pictures;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
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

            public String getDuration() {
                return duration;
            }

            public void setDuration(String duration) {
                this.duration = duration;
            }

            public String getSchedule() {
                return schedule;
            }

            public void setSchedule(String schedule) {
                this.schedule = schedule;
            }

            public String getRemind_switch() {
                return remind_switch;
            }

            public void setRemind_switch(String remind_switch) {
                this.remind_switch = remind_switch;
            }

            public String getRemind_content() {
                return remind_content;
            }

            public void setRemind_content(String remind_content) {
                this.remind_content = remind_content;
            }

            public String getStream_status() {
                return stream_status;
            }

            public void setStream_status(String stream_status) {
                this.stream_status = stream_status;
            }

            public String getClassify_switch() {
                return classify_switch;
            }

            public void setClassify_switch(String classify_switch) {
                this.classify_switch = classify_switch;
            }

            public String getReliable() {
                return reliable;
            }

            public void setReliable(String reliable) {
                this.reliable = reliable;
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

            public String getSpeak_interval() {
                return speak_interval;
            }

            public void setSpeak_interval(String speak_interval) {
                this.speak_interval = speak_interval;
            }

            public String getPerson_num_thres() {
                return person_num_thres;
            }

            public void setPerson_num_thres(String person_num_thres) {
                this.person_num_thres = person_num_thres;
            }

            public String getReduce_ratio() {
                return reduce_ratio;
            }

            public void setReduce_ratio(String reduce_ratio) {
                this.reduce_ratio = reduce_ratio;
            }

            public String getPerson_switch() {
                return person_switch;
            }

            public void setPerson_switch(String person_switch) {
                this.person_switch = person_switch;
            }

            public String getWatermark_switch() {
                return watermark_switch;
            }

            public void setWatermark_switch(String watermark_switch) {
                this.watermark_switch = watermark_switch;
            }

            public String getWatermark_loc() {
                return watermark_loc;
            }

            public void setWatermark_loc(String watermark_loc) {
                this.watermark_loc = watermark_loc;
            }

            public String getAccount_status() {
                return account_status;
            }

            public void setAccount_status(String account_status) {
                this.account_status = account_status;
            }

            public String getPerson_src() {
                return person_src;
            }

            public void setPerson_src(String person_src) {
                this.person_src = person_src;
            }

            public String getDisplay_type() {
                return display_type;
            }

            public void setDisplay_type(String display_type) {
                this.display_type = display_type;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getTag_switch() {
                return tag_switch;
            }

            public void setTag_switch(String tag_switch) {
                this.tag_switch = tag_switch;
            }

            public String getTag_color() {
                return tag_color;
            }

            public void setTag_color(String tag_color) {
                this.tag_color = tag_color;
            }

            public String getRcmd_ratio() {
                return rcmd_ratio;
            }

            public void setRcmd_ratio(String rcmd_ratio) {
                this.rcmd_ratio = rcmd_ratio;
            }

            public String getShow_pos() {
                return show_pos;
            }

            public void setShow_pos(String show_pos) {
                this.show_pos = show_pos;
            }

            public String getRtype_usable() {
                return rtype_usable;
            }

            public void setRtype_usable(String rtype_usable) {
                this.rtype_usable = rtype_usable;
            }

            public String getRoom_type() {
                return room_type;
            }

            public void setRoom_type(String room_type) {
                this.room_type = room_type;
            }

            public String getRtype_value() {
                return rtype_value;
            }

            public void setRtype_value(String rtype_value) {
                this.rtype_value = rtype_value;
            }

            public String getStyle_type() {
                return style_type;
            }

            public void setStyle_type(String style_type) {
                this.style_type = style_type;
            }

            public String getCdn_rate() {
                return cdn_rate;
            }

            public void setCdn_rate(String cdn_rate) {
                this.cdn_rate = cdn_rate;
            }

            public String getCover_switch() {
                return cover_switch;
            }

            public void setCover_switch(String cover_switch) {
                this.cover_switch = cover_switch;
            }

            public String getHost_level_info() {
                return host_level_info;
            }

            public void setHost_level_info(String host_level_info) {
                this.host_level_info = host_level_info;
            }

            public String getLianmai() {
                return lianmai;
            }

            public void setLianmai(String lianmai) {
                this.lianmai = lianmai;
            }

            public String getSort_weight() {
                return sort_weight;
            }

            public void setSort_weight(String sort_weight) {
                this.sort_weight = sort_weight;
            }

            public String getTop_icon() {
                return top_icon;
            }

            public void setTop_icon(String top_icon) {
                this.top_icon = top_icon;
            }

            public String getRoom_key() {
                return room_key;
            }

            public void setRoom_key(String room_key) {
                this.room_key = room_key;
            }

            public String getFans() {
                return fans;
            }

            public void setFans(String fans) {
                this.fans = fans;
            }

            public UserinfoBean getUserinfo() {
                return userinfo;
            }

            public void setUserinfo(UserinfoBean userinfo) {
                this.userinfo = userinfo;
            }

            public String getClick_trace() {
                return click_trace;
            }

            public void setClick_trace(String click_trace) {
                this.click_trace = click_trace;
            }

            public DefinitionOptionBean getDefinition_option() {
                return definition_option;
            }

            public void setDefinition_option(DefinitionOptionBean definition_option) {
                this.definition_option = definition_option;
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

            public String getHardware() {
                return hardware;
            }

            public void setHardware(String hardware) {
                this.hardware = hardware;
            }

            public SkininfoBean getSkininfo() {
                return skininfo;
            }

            public void setSkininfo(SkininfoBean skininfo) {
                this.skininfo = skininfo;
            }

            public List<LabelBean> getLabel() {
                return label;
            }

            public void setLabel(List<LabelBean> label) {
                this.label = label;
            }

            public static class ClassificationBean {
                /**
                 * cname : 英雄联盟
                 * ename : lol
                 */

                private String cname;
                private String ename;

                public String getCname() {
                    return cname;
                }

                public void setCname(String cname) {
                    this.cname = cname;
                }

                public String getEname() {
                    return ename;
                }

                public void setEname(String ename) {
                    this.ename = ename;
                }
            }

            public static class PicturesBean {
                /**
                 * img : http://i7.pdim.gs/90/6d54c5fe1d8ddb58b561bc99f365ced6/w338/h190.jpg
                 */

                private String img;

                public String getImg() {
                    return img;
                }

                public void setImg(String img) {
                    this.img = img;
                }
            }

            public static class UserinfoBean {
                /**
                 * rid : 21159862
                 * nickName : 守卫者
                 * avatar : http://i3.pdim.gs/t01459a0cf3173b9fa4.png
                 * userName :
                 */

                private int rid;
                private String nickName;
                private String avatar;
                private String userName;

                public int getRid() {
                    return rid;
                }

                public void setRid(int rid) {
                    this.rid = rid;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getAvatar() {
                    return avatar;
                }

                public void setAvatar(String avatar) {
                    this.avatar = avatar;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }
            }

            public static class DefinitionOptionBean {
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

            public static class SkininfoBean {
                /**
                 * skin_type : 1
                 * img_top : http://i5.pdim.gs/ed1f96779d9d007197b5ae0d9ee9e2be.png
                 * img_mid : http://i5.pdim.gs/426edf66cca4ff3503a5aea18ba22998.png
                 * img_bottom : http://i6.pdim.gs/f1e3dd011252da005af5534388c5dda5.png
                 * img_list :
                 * icon_number : 1
                 */

                private String skin_type;
                private String img_top;
                private String img_mid;
                private String img_bottom;
                private String img_list;
                private String icon_number;

                public String getSkin_type() {
                    return skin_type;
                }

                public void setSkin_type(String skin_type) {
                    this.skin_type = skin_type;
                }

                public String getImg_top() {
                    return img_top;
                }

                public void setImg_top(String img_top) {
                    this.img_top = img_top;
                }

                public String getImg_mid() {
                    return img_mid;
                }

                public void setImg_mid(String img_mid) {
                    this.img_mid = img_mid;
                }

                public String getImg_bottom() {
                    return img_bottom;
                }

                public void setImg_bottom(String img_bottom) {
                    this.img_bottom = img_bottom;
                }

                public String getImg_list() {
                    return img_list;
                }

                public void setImg_list(String img_list) {
                    this.img_list = img_list;
                }

                public String getIcon_number() {
                    return icon_number;
                }

                public void setIcon_number(String icon_number) {
                    this.icon_number = icon_number;
                }
            }

            public static class LabelBean {
                /**
                 * cname : 说学逗唱
                 * color : 2
                 * ename : sxdc
                 */

                private String cname;
                private String color;
                private String ename;

                public String getCname() {
                    return cname;
                }

                public void setCname(String cname) {
                    this.cname = cname;
                }

                public String getColor() {
                    return color;
                }

                public void setColor(String color) {
                    this.color = color;
                }

                public String getEname() {
                    return ename;
                }

                public void setEname(String ename) {
                    this.ename = ename;
                }
            }
        }
    }
}
