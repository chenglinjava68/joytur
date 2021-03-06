# joytur(欢乐转盘)  

## 介绍

joytur是在Jfinal undertow 1.6 基础上搭建的一个Java项目 简单易学，学习成本低
内置封装很多轻巧组件,异常统一处理组件,异步任务统一处理,权限控制组件,validate注解验证组件,日志记录管理组件.
模块化设计,层次结构清晰,支持h2,mysql数据库,支持自动创建并初始化数据库

本项目是学习Jfinal快速开发最佳学习案例,可以作为接私活的最佳脚手架! 最低性能可以达到1核512M运行JAVA应用.
项目参考很多优秀开源项目优点并且集合优点,可以找到影子, 目前包括以下四大模块
系统管理（system）模块、微信管理（wechat）模块、产品管理（system）模块、订单管理（system）模块

作者邮箱 hlevel@qq.com  gitee: https://gitee.com/hlevel/joytur

## 内置基础功能

1.	用户管理：用户是系统操作者，该功能主要完成系统用户权限配置。
2.	角色管理：角色菜单权限分配、设置角色按机构进行数据范围权限划分。
3.	菜单管理：配置系统菜单，操作权限，页面按钮权限标识等。
4.	系统设置：包括系统基础,系统业务设置,腾讯OSS等配置
5.	防封管理：通过配置两个以上域名来实现动态跳转来防止投诉被封(按照自己思路实现,具体还未应用)。
6.	字典管理：对系统中经常使用的一些较为固定的数据进行维护，如：是否、男女、类别、级别等。
7.	操作日志：系统正常操作日志记录和查询；系统异常信息日志记录和查询。
8.	服务监控：监视当期服务器系统使用指标状态，可进行查看实时了解系统用量。
9.  公众号管理: 可自定义菜单,可接入个人订阅号/企业订阅号/企业服务号
10. 微信回复管理: 可自定义用户输入关键词,自动回复 文本/图片/文章 三种类型

## 内置业务功能

1.	会员管理：微信端关注过来的会员管理。
2.	游戏设置：设置游戏参数及规则。
3.	商品管理：添加售卖商品管理。
4.	订单管理：商品下单订单业务管理。
5.	发货管理：拿货后发货处理管理。
6.	提现管理：用户发起提现进行结算处理。
7.	会员账单：用户消费及充值还有奖励资金流水。
8.	会员账户：用户账户管理多账户及账户类型内部账/外部账/结算账/消耗账。
9.	广告设置：替换wap端系统默认广告横幅banner。
10.	推广活动：管理首次关注送/推荐用户送/满额送/兑换送。
11.	返佣管理：会员推荐会员再推荐会员,可以三级返佣处理。


## 技术选型

1、后端

* JFianl 3.7   
* JFianl Undertow 1.6
* JFinal cos 2017.5
* JFinal weixin 2.1
* Hutool 4.4.0
* Logback 1.2.3
* Fastjson 1.2.54
* Alibaba Druid 1.0.29
* Ehcache 2.6.10
* JWT 3.3.0
* OSHI 3.13.0

2、页面

* Layui 3.1.1
* Jweixin 1.4.0.js
* JQuery

## 平台业务特点

* 个人开发者收款模块：已经实现独立个人及时免签微信到账收款方案(用户对于用户转账),提供三种监控到账方式,邮件/app手机端/微信web登录
app手机端监控特别感谢[vmqApk](https://github.com/szvone/vmqApk),系统实现最大并发相同金额同时支付支持20人。

* 完整的账户体系模块：系统中分为内部账,外部账、账户类型分为结算账,消耗账对于这块未接触账户或者即将接触账户财务模块同学可以参考学习
定位为初级账户模块。

* 轻巧的权限控制模块：权限颗粒精细到按钮级别,同时不臃肿,简单易用

* db操作便捷封装：findByModel, findCount, findList 无需多写一行代码,做到更快捷开发


#### 安装教程

1. 配置 joytur.conf  system.devMode=true   system.ddl.create=false(自动创建表结构和初始化数据)
2. 访问后台链接为 localhost:8080/a  默认用户名密码 admin/123456    访问wap链接为 localhost:8080/wap

## 功能截图

### WAP端
![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/wap_1.png "手机wap端")

### 后台页面端

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_1.png "后台app收款监控")

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_2.png "公众号菜单配置")

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_3.png "系统字典管理")

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_4.png "系统资金流水")

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_5.png "系统操作日志")

![输入图片说明](https://gitee.com/hlevel/joytur/raw/master/screenshot/web_6.png "服务器监控")
