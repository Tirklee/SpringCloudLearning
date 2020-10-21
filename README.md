[TOC]

郑重说明本资料来源于https://www.bilibili.com/video/BV18E411x7eT

# 1.微服务架构零基础理论入门（小白必看）

## 1.1零基础小白，2020.1春节期间预习过第一季的，理解微服务概念的可以不看

## 1.2理论介绍见<<微服务架构2020.pptx>>

## 1.3回顾2018年第一季SpringCloud版本

别再用了

# 2.从2.2.x和H版开始说起

## 2.1本次的SpringCloud第二季分为上半场和下半场

**上篇**：SpringBoot2.X版和SpringCloud H版

**下篇**：SpringCloud Alibaba

**大纲**

## 2.2Springboot版本选择

**git源码地址：**
  https://github.com/spring-projects/spring-boot/releases/



**SpringBoot2.0新特性：**
  https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes



**通过上面官网发现，Boot官方强烈建议你升级到2.X以上版本**

![image-20201020085107723](assets/image-20201020085107723.png)

**官网看Boot版本** 
   springboot(截至2019.10.26)

![image-20201020085543204](assets/image-20201020085543204.png)

  springboot(截至2020.2.15)

![image-20201020085623911](assets/image-20201020085623911.png)

## 2.3SpringCloud版本选择

git源码地址
  https://github.com/spring-projects/spring-cloud/wiki

官网：
  https://spring.io/projects/spring-cloud

### 官网看Cloud版本 

  **Cloud命名规则**

![image-20201020085851491](assets/image-20201020085851491.png)

![image-20201020085922018](assets/image-20201020085922018.png)

**SpringCloud的多版本**

![image-20201020090142426](assets/image-20201020090142426.png)

###   **springcloud(截至2019.10.26)**

![image-20201020090521924](assets/image-20201020090521924.png)

###   **springboot(截至2020.2.15)**

![image-20201020090553731](assets/image-20201020090553731.png)



## 2.4SpringCloud和Springboot之间的依赖关系如何看

https://spring.io/projects/spring-cloud#overview

![image-20201020090737816](assets/image-20201020090737816.png)

依赖

![image-20201020090823810](assets/image-20201020090823810.png)

更详细的版本对应查看方法

https://start.spring.io/actuator/info

结果

![image-20201020091057551](assets/image-20201020091057551.png)

查看json串返回结果

![image-20201020091157613](assets/image-20201020091157613.png)

## 2.5SpringCloud第二季定稿版（截止2020.2.15）

**cloud**:Hoxton.SR1
**boot**：2.2.2.RELEASE
**cloud Alibaba**:2.1.0.RELEASE
**java**:JAVA8
**maven**:3.5及以上
**mysql**:5.7及以上
**不许捣蛋，上述全部版本必须和阳哥一致**
**题外话**

- **boot版已经到2.2.4为最新，为什么选2.2.2？**
    **只用boot，直接用最新**

![image-20201020091732681](assets/image-20201020091732681.png)

**同时用boot和cloud，需要照顾cloud，由cloud决定boot版本 结果**

![image-20201020091957982](assets/image-20201020091957982.png)

**SpringCloud和SpringBoot版本对应关系**

![image-20201020092035895](assets/image-20201020092035895.png)

-  **2.X版本常用的组件pom**

  ![image-20201020092245893](assets/image-20201020092245893.png)

![image-20201020092304955](assets/image-20201020092304955.png)

# 3.关于Cloud各种组件的停更/升级/替换

##   3.1由停更引发的“升级惨案”

​    **停更不停用**
​      被动修复bugs
​      不再接受合并请求
​      不再发布新版本
​    **补充，哈哈**
​      停课不停学
​    **明细条目**
​      以前

![image-20201020093522815](assets/image-20201020093522815.png)

​      now2020

![image-20201020093603626](assets/image-20201020093603626.png)

##  3.2 参考资料见官网

​    Spring Cloud
​      https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/
​      Spring Cloud中文文档
​        https://www.bookstack.cn/read/spring-cloud-docs/docs-index.md
​    Spring Boot
​      https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/

# 4.微服务架构编码构建

##   4.1约定 > 配置 > 编码

##   4.2IDEA新建project工作空间

- 微服务cloud整体聚合父工程Project

  **父工程步骤:**
    1.New Project

  ![image-20201020094214215](assets/image-20201020094214215.png)

    2.聚合总工程名字

  ![image-20201020094239283](assets/image-20201020094239283.png)

    3.Maven选版本

  ![image-20201020094305904](assets/image-20201020094305904.png)

    4.工程名字

  ![image-20201020094341751](assets/image-20201020094341751.png)

    5.字符编码

  ![image-20201020094414848](assets/image-20201020094414848.png)

  ![image-20201020094450406](assets/image-20201020094450406.png)

    6.注解生效激活

  ![image-20201020094521783](assets/image-20201020094521783.png)

    7.java编译版本选8

  ![image-20201020094910354](SpringCloud%E7%AC%AC%E4%BA%8C%E5%AD%A3.assets/image-20201020094910354.png)

    8.File Type过滤

  ![image-20201020095104239](assets/image-20201020095104239.png)

  *.hprof;*.idea;*.iml;*.pyc;*.pyo;*.rbc;*.yarb;*~;.DS_Store;.git;.hg;.svn;CVS;__pycache__;_svn;vssver.scc;vssver2.scc;

  ![image-20201020095140037](assets/image-20201020095140037.png)

- 父工程POM

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
  
    <modelVersion>4.0.0</modelVersion>
  
    <groupId>com.atguigu.springcloud</groupId>
    <artifactId>cloud2020</artifactId>
    <version>1.0-SNAPSHOT</version>
    <packaging>pom</packaging>
    <!-- 统一管理jar包版本 -->
    <properties>
      <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
      <maven.compiler.source>1.8</maven.compiler.source>
      <maven.compiler.target>1.8</maven.compiler.target>
      <junit.version>4.12</junit.version>
      <log4j.version>1.2.17</log4j.version>
      <lombok.version>1.16.18</lombok.version>
      <mysql.version>5.1.47</mysql.version>
      <druid.version>1.1.16</druid.version>
      <mybatis.spring.boot.version>1.3.0</mybatis.spring.boot.version>
    </properties>
  
    <!-- 子模块继承之后，提供作用：锁定版本+子modlue不用写groupId和version  -->
    <dependencyManagement>
      <dependencies>
        <!--spring boot 2.2.2-->
        <dependency>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-dependencies</artifactId>
          <version>2.2.2.RELEASE</version>
          <type>pom</type>
          <scope>import</scope>
        </dependency>
        <!--spring cloud Hoxton.SR1-->
        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-dependencies</artifactId>
          <version>Hoxton.SR1</version>
          <type>pom</type>
          <scope>import</scope>
        </dependency>
        <!--spring cloud alibaba 2.1.0.RELEASE-->
        <dependency>
          <groupId>com.alibaba.cloud</groupId>
          <artifactId>spring-cloud-alibaba-dependencies</artifactId>
          <version>2.1.0.RELEASE</version>
          <type>pom</type>
          <scope>import</scope>
        </dependency>
  
        <dependency>
          <groupId>mysql</groupId>
          <artifactId>mysql-connector-java</artifactId>
          <version>${mysql.version}</version>
        </dependency>
        <dependency>
          <groupId>com.alibaba</groupId>
          <artifactId>druid</artifactId>
          <version>${druid.version}</version>
        </dependency>
        <dependency>
          <groupId>org.mybatis.spring.boot</groupId>
          <artifactId>mybatis-spring-boot-starter</artifactId>
          <version>${mybatis.spring.boot.version}</version>
        </dependency>
        <dependency>
          <groupId>junit</groupId>
          <artifactId>junit</artifactId>
          <version>${junit.version}</version>
        </dependency>
        <dependency>
          <groupId>log4j</groupId>
          <artifactId>log4j</artifactId>
          <version>${log4j.version}</version>
        </dependency>
        <dependency>
          <groupId>org.projectlombok</groupId>
          <artifactId>lombok</artifactId>
          <version>${lombok.version}</version>
          <optional>true</optional>
        </dependency>
      </dependencies>
    </dependencyManagement>
  
    <build>
      <plugins>
        <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <configuration>
            <fork>true</fork>
            <addResources>true</addResources>
          </configuration>
        </plugin>
      </plugins>
    </build>
  </project>
  ```

- 解决maven下载不了jar的问题请复制这个链接到浏览器自行解决：

  在网上拷贝的所有阿里云镜像比如：

  ```xml
  <mirror>
      <id>nexus-aliyun</id>
      <mirrorOf>central</mirrorOf>
      <name>Nexus aliyun</name>
      <url>http://maven.aliyun.com/nexus/content/groups/public</url>
  </mirror>
  ```

  **都不能**解决我的问题，我的包里面一直出现.lastUpdated文件，后来我查看官网之后发现：**阿里不再支持http下载**，只支持**https**。

  因此，先将maven镜像配置如下：

  ```
  <mirror>
  	<id>aliyunmaven</id>
      <mirrorOf>*</mirrorOf>
      <name>阿里云公共仓库</name>
      <url>https://maven.aliyun.com/repository/public</url>
  </mirror>
  ```

  然后我还出现了一个问题，由于使用了HTTPS，存在着SSL证书验证的问题，因此我在IDEA中添加了一行配置：

  ![img](SpringCloud%E7%AC%AC%E4%BA%8C%E5%AD%A3.assets/2020022719493843.png)

  配置如下：

  ```
  -Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true
  ```

  该配置用于忽略ssl证书的验证，然后我的maven终于可以丝滑下载了。

- Maven工程落地细节复习

  Maven中的dependencyManagement和dependencies

  ![image-20201020095735179](assets/image-20201020095735179.png)

  ![image-20201020095815444](assets/image-20201020095815444.png)

  maven中跳过单元测试

- 父工程创建完成执行mvn:install将父工程发布到仓库方便子工程继承

##   4.3Rest微服务工程构建

### 4.3.1构建步骤

#### 4.3.1.1.cloud-provider-payment8001微服务提供者支付Module模块

- 建cloud-provider-payment8001

  创建完成后请回到父工程查看pom文件变化

- 改POM文件

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <parent>
          <artifactId>cloud2020</artifactId>
          <groupId>com.xiyue.cloud</groupId>
          <version>1.0-SNAPSHOT</version>
      </parent>
      <modelVersion>4.0.0</modelVersion>
      <artifactId>cloud-provider-payment8001</artifactId>
      <dependencies>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-actuator</artifactId>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.mybatis.spring.boot</groupId>
              <artifactId>mybatis-spring-boot-starter</artifactId>
          </dependency>
          <!-- https://mvnrepository.com/artifact/com.alibaba/druid -->
          <dependency>
              <groupId>com.alibaba</groupId>
              <artifactId>druid-spring-boot-starter</artifactId>
              <version>1.1.10</version>
          </dependency>
          <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
          <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-jdbc -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-jdbc</artifactId>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-devtools</artifactId>
             <scope>runtime</scope>
              <optional>true</optional>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
          <dependency>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
              <optional>true</optional>
          </dependency>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-test</artifactId>
              <scope>test</scope>
          </dependency>
      </dependencies>
  </project>
  ```

  

- 写YML

  ```yaml
  server:
    port: 8001
  
  spring:
    application:
      name: cloud-payment-service
    datasource:
      type: com.alibaba.druid.pool.DruidDataSource
      driver-class-name: org.gjt.mm.mysql.Driver
      url: jdbc:mysql://localhost:3306/db2019?useUnicode=true&characterEncoding=utf-8&useSSL=false
      username: root
      password: 123456
  
  mybatis:
    mapperLocations: classpath:mapper/*.xml
    type-aliases-package: com.xiyue.cloud.entities
  ```

  

- 主启动

  ```java
  package com.xiyue.cloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  
  @SpringBootApplication
  public class PaymentMain8001 {
  
      public static void main(String[] args) {
          SpringApplication.run(PaymentMain8001.class,args);
      }
  }
  
  ```

  

- 业务类

  1.建表SQL

  ```sql
  CREATE TABLE payment (
   id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
   'serial' VARCHAR(200) DEFAULT null,
   PRIMARY KEY(id)
  ) ENGINE=INNODB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8
  ```

  2.entitles

  主实体Payment

  ```java
  package com.xiyue.cloud.entities;
  
  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;
  
  import java.io.Serializable;
  
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class Payment implements Serializable {
      private Long id;
      private String serial;
  }
  ```

  Json封装体CommonResult

  ```java
  package com.xiyue.cloud.entities;
  
  import lombok.AllArgsConstructor;
  import lombok.Data;
  import lombok.NoArgsConstructor;
  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  public class CommonResult <T>{
      private Integer code;
      private String message;
      private T data;
      public CommonResult(Integer code,String message){
          this(code,message,null);
      }
  }
  ```

  3.dao

  接口PaymentDao

  ```java
  package com.xiyue.cloud.dao;
  
  import com.xiyue.cloud.entities.Payment;
  import org.apache.ibatis.annotations.Mapper;
  import org.apache.ibatis.annotations.Param;
  
  @Mapper
  public interface PaymentDao{
  
      public int create(Payment payment); //写
  
      public Payment getPaymentById(@Param("id") Long id);  //读取
  }
  
  ```

  mybatis的映射文件PaymentMapper.xml

  ​	路径

  ​		src\main\resources\mapper\PaymentMapper.xml
  ​	文件头	

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  <mapper namespace="com.xiyue.cloud.dao.PaymentDao">
  </mapper>
  ```

  ​	PaymentMapper.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
  
  <mapper namespace="com.xiyue.cloud.dao.PaymentDao">
      <insert id="create" parameterType="Payment" useGeneratedKeys="true" keyProperty="id">
              insert into payment(serial) values(${serial});
      </insert>
      <resultMap id="BaseResultMap" type="com.atguigu.springcloud.entities.Payment">
          <id column="id" property="id" jdbcType="BIGINT"></id>
          <id column="serial" property="serial" jdbcType="VARCHAR"></id>
      </resultMap>
      <select id="getPaymentById"  parameterType="Long" resultMap="BaseResultMap">
              select * from payment where id=#{id}
      </select>
  </mapper>
  ```

  4.service

  ​	接口PaymentService

  ```java
  package com.xiyue.cloud.service;
  
  import com.atguigu.springcloud.entities.Payment;
  import org.apache.ibatis.annotations.Param;
  
  public interface PaymentService {
  
      public int create(Payment payment); //写
  
      public Payment getPaymentById(@Param("id") Long id);  //读取
  }
  ```

  ​	实现类

  ```java
  package com.xiyue.cloud.service.impl;
  
  import com.xiyue.cloud.dao.PaymentDao;
  import com.xiyue.cloud.entities.Payment;
  import com.xiyue.cloud.service.PaymentService;
  import org.apache.ibatis.annotations.Param;
  import org.springframework.stereotype.Service;
  import javax.annotation.Resource;
  
  @Service
  public class PaymentServiceImpl implements PaymentService {
  
      @Resource
      private PaymentDao paymentDao;
  
      public int create(Payment payment){
          return paymentDao.create(payment);
      }
  
      public Payment getPaymentById( Long id){
          return paymentDao.getPaymentById(id);
      }
  }
  ```

  5.controller

  ```java
  package com.xiyue.cloud.controller;
  
  import com.xiyue.cloud.entities.CommonResult;
  import com.xiyue.cloud.entities.Payment;
  import com.xiyue.cloud.service.PaymentService;
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.PostMapping;
  import org.springframework.web.bind.annotation.RestController;
  
  import javax.annotation.Resource;
  
  @RestController
  @Slf4j
  public class PaymentController {
  
      @Resource
      private PaymentService paymentService;
  
      @PostMapping(value = "/payment/create")
      public CommonResult create(Payment payment){
          int result = paymentService.create(payment);
          log.info("*****插入结果："+result);
          if (result>0){  //成功
              return new CommonResult(200,"插入数据库成功",result);
          }else {
              return new CommonResult(444,"插入数据库失败",null);
          }
      }
  
      @GetMapping(value = "/payment/get/{id}")
      public CommonResult getPaymentById(@PathVariable("id") Long id){
          Payment payment = paymentService.getPaymentById(id);
          log.info("*****查询结果："+payment);
          if (payment!=null){  //说明有数据，能查询成功
              return new CommonResult(200,"查询成功",payment);
          }else {
              return new CommonResult(444,"没有对应记录，查询ID："+id,null);
          }
      }
  }
  
  ```

  

- 测试

  ![image-20201020150630207](assets/image-20201020150630207.png)

  **http://localhost:8001/payment/get/1**
  **postman模拟post**

  ![image-20201020160057183](assets/image-20201020160057183.png)

  **运行**

  通过修改idea的workpace.xml的方式来快速打开Run DashBoard窗口

  开启Run DashBoard

  ![image-20201020160300512](assets/image-20201020160300512.png)

  填入以下内容：

  ```xml
  <option name="configurationTypes">
        <set>
          <option value="SpringBootApplicationConfigurationType" />
        </set>
  </option>
  ```

  部分同学可能由于idea版本不同，需要关闭重启

- 小总结

  1.建module
  2.改POM
  3.写YML
  4.主启动
  5.业务类

#### <u>4.3.1.2.热部署Devtools</u>

- Adding devtools to your project

  ```xml
  <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
  <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-devtools</artifactId>
     <scope>runtime</scope>
      <optional>true</optional>
  </dependency>
  ```

- Adding plugin to your pom.xml

  ```xml
  <!-- 一段配置黏贴到父工程当中的pom里 -->
  <build>
    <plugins>
      <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <configuration>
          <fork>true</fork>
          <addResources>true</addResources>
        </configuration>
      </plugin>
    </plugins>
  </build>
  ```

  

- Enabling automatic build 

![image-20201020164014387](assets/image-20201020164014387.png)

- Update the value of

  ![image-20201020164105766](assets/image-20201020164105766.png)

  ![image-20201020164259826](assets/image-20201020164259826.png)

- 重启IDEA

#### 4.3.1.3.cloud-consumer-order80微服务消费者订单Module模块

- 新建cloud-consumer-order80

  注意项目名称与上面图片可能不一致需要保持一致哦

  ![image-20201020171041616](assets/image-20201020171041616.png)

- 改POM

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <parent>
          <artifactId>cloud2020</artifactId>
          <groupId>com.xiyue.cloud</groupId>
          <version>1.0-SNAPSHOT</version>
      </parent>
      <modelVersion>4.0.0</modelVersion>
  
      <artifactId>cloud-consumer-order80</artifactId>
      <dependencies>
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web  -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-actuator</artifactId>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-devtools</artifactId>
              <scope>runtime</scope>
              <optional>true</optional>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
          <dependency>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
              <optional>true</optional>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-test</artifactId>
              <scope>test</scope>
          </dependency>
      </dependencies>
  </project>
  ```

- 写YML

  ```yml
  server:
    port: 80
  ```

- 主启动

  ```java
  package com.xiyue.cloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  
  @SpringBootApplication
  public class OrderMain80 {
      public static void main(String[] args) {
          SpringApplication.run(OrderMain80.class,args);
      }
  }
  ```

- 业务类

  创建entities(将cloud-provider-payment8001工程下的entities包下的两个实体类复制过来)

  ![image-20201020172704234](assets/image-20201020172704234.png)

  首说RestTemplate

  > 是什么
  >
  > ![image-20201020172930219](assets/image-20201020172930219.png)
  >
  > 官网及使用
  >
  > **官网地址：**
  > https://docs.spring.io/spring-framework/docs/5.2.2.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html
  >
  > ![image-20201020173034647](assets/image-20201020173034647.png)

  config配置类（ApplicationContextConfig）

  ```java
  package com.xiyue.cloud.config;
  
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  import org.springframework.web.client.RestTemplate;
  
  @Configuration
  public class ApplicationContextConfig {
  
      @Bean
      public RestTemplate getRestTemplate(){
          return new RestTemplate();
      }
  
  }
  ```

  创建controller

  ```java
  package com.xiyue.cloud.controller;
  
  import com.xiyue.cloud.entities.CommonResult;
  import com.xiyue.cloud.entities.Payment;
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.client.RestTemplate;
  
  import javax.annotation.Resource;
  
  @RestController
  @Slf4j
  public class OrderController {
  
      public static final String PAYMENT_URL = "http://localhost:8001";
  
      @Resource
      private RestTemplate restTemplate;
  
      @GetMapping("/consumer/payment/create")
      public CommonResult<Payment>   create(Payment payment){
          return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);  //写操作
      }
  
      @GetMapping("/consumer/payment/get/{id}")
      public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
          return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
      }
  }
  ```

  

- 测试

  > 先启动cloud-provider-payment8001
  > 再启动cloud-consumer-order80
  > http://localhost/consumer/payment/get/1
  >
  > 不要忘记@RequestBody注解
  >
  > ![image-20201020173741955](assets/image-20201020173741955.png)

#### 4.3.1.4.工程重构

> 观察问题
>
> ![image-20201020175809238](assets/image-20201020175809238.png)
>
>   系统中有重复部分，重构
> 新建 cloud-api-commons
>
> ![image-20201020180317364](assets/image-20201020180317364.png)
>
> POM
>
> ```xml
> <?xml version="1.0" encoding="UTF-8"?>
> <project xmlns="http://maven.apache.org/POM/4.0.0"
>          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
>     <parent>
>         <artifactId>cloud2020</artifactId>
>         <groupId>com.xiyue.cloud</groupId>
>         <version>1.0-SNAPSHOT</version>
>     </parent>
>     <modelVersion>4.0.0</modelVersion>
> 
>     <artifactId>cloud-api-commons</artifactId>
>     <dependencies>
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-devtools</artifactId>
>             <scope>runtime</scope>
>             <optional>true</optional>
>         </dependency>
> 
>         <dependency>
>             <groupId>org.projectlombok</groupId>
>             <artifactId>lombok</artifactId>
>             <optional>true</optional>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/cn.hutool/hutool-all -->
>         <dependency>
>             <groupId>cn.hutool</groupId>
>             <artifactId>hutool-all</artifactId>
>             <version>5.1.0</version>
>         </dependency>
>     </dependencies>
> </project>
> ```
>
> entities
>
> -  Payment实体
> - CommonResult通用封装类
>
> maven命令clean install
>
> 订单80和支付8001分别改造
>
> > 删除各自的原先有过的entities文件夹
> > 各自黏贴POM内容
> >
> > ```xml
> > <dependency>
> >     <groupId>com.atguigu.springcloud</groupId>
> >     <artifactId>cloud-api-commons</artifactId>
> >     <version>${project.version}</version>
> > </dependency>
> > ```
> >
> > > 80
> > > 8001



### 4.3.2目前工程样图

![image-20201020181733315](assets/image-20201020181733315.png)

# 5.Eureka服务注册与发现

## 5.1Eureka基础知识

### 5.1.1什么是服务治理

![image-20201020183348148](assets/image-20201020183348148.png)

### 5.1.2什么是服务注册

![image-20201020183437044](assets/image-20201020183437044.png)

![image-20201020183517501](assets/image-20201020183517501.png)

### 5.1.3Eureka两组件

![image-20201020183709671](assets/image-20201020183709671.png)

## 5.2单机Eureka构建步骤

### 5.2.1IDEA生成eurekaServer端服务注册中心类似物业公司

> - 建Module
>
>   cloud-eureka-server7001
>
> - 改POM
>
>   ```xml
>   <?xml version="1.0" encoding="UTF-8"?>
>   <project xmlns="http://maven.apache.org/POM/4.0.0"
>            xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>            xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
>       <parent>
>           <artifactId>cloud2020</artifactId>
>           <groupId>com.xiyue.cloud</groupId>
>           <version>1.0-SNAPSHOT</version>
>       </parent>
>       <modelVersion>4.0.0</modelVersion>
>   
>       <artifactId>cloud-eureka-server7001</artifactId>
>       <dependencies>
>           <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-eureka-server -->
>           <dependency>
>               <groupId>org.springframework.cloud</groupId>
>               <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
>           </dependency>
>   
>           <dependency>
>               <groupId>com.xiyue.cloud</groupId>
>               <artifactId>cloud-api-commons</artifactId>
>               <version>${project.version}</version>
>           </dependency>
>   
>           <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
>           <dependency>
>               <groupId>org.springframework.boot</groupId>
>               <artifactId>spring-boot-starter-web</artifactId>
>           </dependency>
>   
>           <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web  -->
>           <dependency>
>               <groupId>org.springframework.boot</groupId>
>               <artifactId>spring-boot-starter-actuator</artifactId>
>           </dependency>
>   
>           <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
>           <dependency>
>               <groupId>org.springframework.boot</groupId>
>               <artifactId>spring-boot-devtools</artifactId>
>               <scope>runtime</scope>
>               <optional>true</optional>
>           </dependency>
>   
>           <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
>           <dependency>
>               <groupId>org.projectlombok</groupId>
>               <artifactId>lombok</artifactId>
>           </dependency>
>   
>           <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
>           <dependency>
>               <groupId>org.springframework.boot</groupId>
>               <artifactId>spring-boot-starter-test</artifactId>
>               <scope>test</scope>
>           </dependency>
>           <dependency>
>               <groupId>junit</groupId>
>               <artifactId>junit</artifactId>
>           </dependency>
>       </dependencies>
>   </project>
>   ```
>
>   1.X和2.X的对比说明
>
>   ![image-20201020190251651](assets/image-20201020190251651.png)
>
> - 写YML
>
>   application.yml
>
>   ```yml
>   server:
>     port: 7001
>   
>   eureka:
>     instance:
>       hostname: localhost  #eureka服务端的实例名字
>     client:
>       register-with-eureka: false    #表识不向注册中心注册自己
>       fetch-registry: false   #表示自己就是注册中心，职责是维护服务实例，并不需要去检索服务
>      service-url:
>       defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/    #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
>   
>   ```
>
> - 主启动
>
>   ```java
>   package com.xiyue.cloud;
>   
>   import org.springframework.boot.SpringApplication;
>   import org.springframework.boot.autoconfigure.SpringBootApplication;
>   import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
>   
>   @EnableEurekaServer
>   @SpringBootApplication
>   public class EurekaMain7001 {
>       public static void main(String[] args) {
>           SpringApplication.run(EurekaMain7001.class,args);
>       }
>   }
>   ```
>
>   @EnableEurekaServer
>
> - 测试
>
>   http://localhost:7001/
>   结果页面
>
>   ![image-20201020191217881](assets/image-20201020191217881.png)

### 5.2.2EurekaClient端cloud-provider-payment8001将注册进EurekaServer成为服务提供者provider，类似尚硅谷学校对外提供授课服务

> - cloud-provider-payment8001
>
> - 改POM
>
> ```xml
>  <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-eureka-server -->
> <dependency>
>     <groupId>org.springframework.cloud</groupId>
>     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
> </dependency>
> ```
>
> 1.X和2.X的对比说明
>
> ![image-20201020191656685](assets/image-20201020191656685.png)
>
> - 写YML
>
> ```yml
> eureka:
>   client:
>     register-with-eureka: true
>     fetchRegistry: true
>     service-url:
>       defaultZone: http://localhost:7001/eureka
> ```
>
> - 主启动
>
>   ```java
>   package com.xiyue.cloud;
>   
>   import org.springframework.boot.SpringApplication;
>   import org.springframework.boot.autoconfigure.SpringBootApplication;
>   import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
>   
>   @SpringBootApplication
>   @EnableEurekaClient
>   public class PaymentMain8001 {
>   
>       public static void main(String[] args) {
>           SpringApplication.run(PaymentMain8001.class,args);
>       }
>   }
>   
>   ```
>
>   @EnableEurekaClient
>
> - 测试
>
>   > 先要启动EurekaServer
>   > http://localhost:7001/
>   >
>   > ![image-20201020200113893](assets/image-20201020200113893.png)
>   >
>   > 微服务注册名配置说明
>   >
>   > ![image-20201020200207303](assets/image-20201020200207303.png)
>
> - 自我保护机制
>
>   ![image-20201020200255151](assets/image-20201020200255151.png)

### 5.2.3EurekaClient端cloud-consumer-order80将注册进EurekaServer成为服务消费者consumer,类似来尚硅谷上课消费的各位同学

> - cloud-consumer-order80
>
> - POM
>
> ```xml
>  <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-eureka-server -->
> <dependency>
>     <groupId>org.springframework.cloud</groupId>
>     <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
> </dependency>
> ```
>
> - 写YML（application.yml）
>
> ```yml
> server:
>   port: 80
> 
> spring:
>   application:
>     name: cloud-order-service
> 
> eureka:
>   client:
>     register-with-eureka: true
>     fetchRegistry: true
>     service-url:
>       defaultZone: http://localhost:7001/eureka
> ```
>
> - 主启动
>
>   ```java
>   package com.xiyue.cloud;
>   
>   import org.springframework.boot.SpringApplication;
>   import org.springframework.boot.autoconfigure.SpringBootApplication;
>   import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
>   
>   @EnableEurekaClient
>   @SpringBootApplication
>   public class OrderMain80 {
>       public static void main(String[] args) {
>           SpringApplication.run(OrderMain80.class,args);
>       }
>   }
>   ```
>
> @EnableEurekaClient
>
> - 测试
>
> > 先要启动EurekaServer，7001服务
> > 再要启动服务提供者provider，8001服务
> > eureka服务器
> >
> > ![image-20201020201007168](assets/image-20201020201007168.png)
> >
> > http://localhost/consumer/payment/get/1

### 5.2.4bug

![image-20201020201733451](assets/image-20201020201733451.png)



## 5.3集群Eureka构建步骤

### 5.3.1Eureka集群原理说明

![image-20201020202405812](assets/image-20201020202405812.png)

### 5.3.2EurekaServer集群环境构建步骤

> - 参考cloud-eureka-server7001
>
> - 新建cloud-eureka-server7002
>
> - 改POM
>
> - 修改映射配置
>
>   找到C:\Windows\System32\driver\etc路径下的hosts文件
>
>   ![image-20201020203628863](assets/image-20201020203628863.png)
>
>   修改映射配置添加进hosts文件
>
>   > 127.0.0.1 eureka7001.com
>   >
>   > 127.0.0.1 eureka7002.com
>
> - 写YML（以前单机）
>
>   ![image-20201020204230306](assets/image-20201020204230306.png)
>
>   > 7001
>   >
>   > ```yml
>   > server:
>   >   port: 7001
>   > 
>   > eureka:
>   >   instance:
>   >     hostname: eureka7001.com    #eureka服务端的实例名字
>   >   client:
>   >     register-with-eureka: false    #表识不向注册中心注册自己
>   >     fetch-registry: false   #表示自己就是注册中心，职责是维护服务实例，并不需要去检索服务
>   >     service-url:
>   >       defaultZone: http://eureka7002.com:7002/eureka/    #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
>   >  
>   > ```
>   >
>   > 7002
>   >
>   > ```yml
>   > server:
>   >   port: 7002
>   > 
>   > eureka:
>   >   instance:
>   >     hostname: eureka7002.com #eureka服务端的实例名字
>   >   client:
>   >     register-with-eureka: false    #表识不向注册中心注册自己
>   >     fetch-registry: false   #表示自己就是注册中心，职责是维护服务实例，并不需要去检索服务
>   >     service-url:
>   >       defaultZone: http://eureka7001.com:7001/eureka/     #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
>   >  
>   > ```
>   >
>   > 
>
> - 主启动(复制cloud-eureka-server7001的主启动类到7002即可)

### 5.3.3将支付服务8001微服务发布到上面2台Eureka集群配置中

```yml
service-url:
  defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka  #集群版
```

### 5.3.4将订单服务80微服务发布到上面2台Eureka集群配置

```yml
service-url:
  defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka  #集群版
```

### 5.3.5测试01

> 先要启动EurekaServer，7001/7002服务
>
> 再要启动服务提供者provider，8001服务
>
> 再要启动消费者，80
>
> http://localhost/consumer/payment/get/1

### 5.3.6支付服务提供者8001集群环境构建

- 参考cloud-provider-payment8001
- 新建cloud-provider-payment8002
- 改POM

- 写YML

  ![image-20201020211532283](assets/image-20201020211532283.png)

>   7001
>
> ```yml
> server:
>   port: 7001
> 
> eureka:
>   instance:
>     hostname: eureka7001.com    #eureka服务端的实例名字
>   client:
>     register-with-eureka: false    #表识不向注册中心注册自己
>     fetch-registry: false   #表示自己就是注册中心，职责是维护服务实例，并不需要去检索服务
>     service-url:
>       defaultZone: http://eureka7002.com:7002/eureka/    #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
> ```
>
>   7002
>
> ```yml
> server:
>   port: 7002
> 
> eureka:
>   instance:
>     hostname: eureka7002.com #eureka服务端的实例名字
>   client:
>     register-with-eureka: false    #表识不向注册中心注册自己
>     fetch-registry: false   #表示自己就是注册中心，职责是维护服务实例，并不需要去检索服务
>     service-url:
>       defaultZone: http://eureka7001.com:7001/eureka/     #设置与eureka server交互的地址查询服务和注册服务都需要依赖这个地址
> ```

- 主启动类

>   找到C:\Windows\System32\drivers\etc路径下的hosts文件
>
> ![image-20201020211733193](assets/image-20201020211733193.png)
>
>   修改映射配置添加进hosts文件
>
> > 127.0.0.1  eureka7001.com
> >  127.0.0.1  eureka7002.com

- 修改8001/8002的Controller

>   8001
>
> ![image-20201020211809470](assets/image-20201020211809470.png)
>
>   8002
>
> ![image-20201020212015476](assets/image-20201020212015476.png)

### 5.3.7负载均衡

- bug

>   订单服务访问地址不能写死
>
> ```java
> //改为这个：
> public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
> ```

- 使用@LoadBalanced注解赋予RestTemplate负载均衡的能力

  ![image-20201020220120106](assets/image-20201020220120106.png)

- ApplicationContextBean

>   提前说一下Ribbon的负载均衡功能



### 5.3.8测试02

- 先要启动EurekaServer，7001/7002服务
- 再要启动服务提供者provider，8001/8002服务
- http://localhost/consumer/payment/get/1
- 结果

>   负载均衡效果达到
>
>   8001/8002端口交替出现

- Ribbon和Eureka整合后Consumer可以直接调用服务而不用再关心地址和端口号，且该服务还有负载功能了

  ![image-20201020214141557](assets/image-20201020214141557.png)

## 5.4actuator微服务信息完善

- 主机名称：服务名称修改

>   当前问题
>   修改cloud-provider-payment8001
>     YML
>       修改部分
>
> ```yml
> instance:
>     instance-id: payment8001
> ```
>
> ​      完整部分
>   修改之后

- 访问信息有ip信息提示

>   当前问题
>     没有ip提示
>   修改cloud-provider-payment8001
>     YML
>       修改部分
>
> ```yml
> prefer-ip-address: true
> ```
>
> ​      完整内容
>
> ```yml
> eureka:
>   client:
>     register-with-eureka: true
>     fetchRegistry: true
>     service-url:
>       defaultZone: http://eureka7001.com:7001/eureka,http://eureka7002.com:7002/eureka  #集群版
>   instance:
>     instance-id: payment8001
>     prefer-ip-address: true
> ```
>
>   修改之后

## 5.5服务发现Discovery

- 对于注册进eureka里面的微服务，可以通过服务发现来获得该服务的信息

- 修改cloud-provider-payment8001的Controller

  ```java
  @Resource
  private DiscoveryClient discoveryClient;
   
  @GetMapping(value = "/payment/discovery")
  public Object discovery(){
      List<String> services = discoveryClient.getServices();
      for (String element : services) {
          log.info("***** element:"+element);
      }
      List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
      for (ServiceInstance instance : instances) {
          log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
      }
      return this.discoveryClient;
  }
  ```

  

- 8001主启动类

  @EnableDiscoveryClient

![image-20201020223831468](assets/image-20201020223831468.png)

- 自测

  先要启动EurekaServer，7001/7002服务

  再启动8001主启动类，需要稍等一会

  http://localhost:8001/payment/discovery

## 5.6Eureka自我保护

-   故障现象

  ![image-20201020224330537](assets/image-20201020224330537.png)

-   导致原因

  ![image-20201020224450250](assets/image-20201020224450250.png)

  ![image-20201020224517772](assets/image-20201020224517772.png)

![image-20201020224606843](assets/image-20201020224606843.png)

![image-20201020224656439](assets/image-20201020224656439.png)

1. 一句话：某时刻某一个微服务不可用了，Eureka不会立刻清理，依旧会对该微服务的信息进行保存
2. 属于CAP里面的AP分支

-   怎么禁止自我保护（一般生产环境中不会禁止自我保护）

1.  注册中心eureakeServer端7001

   出厂默认，自我保护机制是开启的**eureka.server.enable-self-preservation = true**

   使用**eureka.server.enable-self-preservation = false**可以禁用自我保护模式

   ```yml
   server:
     enable-self-preservation: false
     eviction-interval-timer-in-ms: 2000
   ```

   关闭效果

   在eurekaServer端7001处设置关闭自我保护机制

2. 生产者客户端eureakeClient端8001

​      **默认:**

​        eureka.instance.lease-renewal-interval-in-seconds=30 单位为秒（默认是30秒）
​        eureka.instance.lease-expiration-duration-in-seconds=90单位为秒（默认是90秒）
​      配置

```yml
instance:
    lease-renewal-interval-in-seconds:  1
    lease-expiration-duration-in-seconds:  2
```

​    ![image-20201020225933407](assets/image-20201020225933407.png)

  **测试**
        7001和8001都配置完成

​        先启动7001再启动8001

​        先关闭8001

​          马上被删除了

# 6.Zookeeper服务注册与发现

## 6.1Eureka停止更新了你怎么办 

https://github.com/Netflix/eureka/wiki

## 6.2SpringCloud整合Zookeeper代替Eureka

###     6.2.1注册中心Zookeeper

> zookeeper是一个分布式协调工具，可以实现注册中心功能
>
> 关闭Linux服务器防火墙后启动zookeeper服务器
>
> zookeeper服务器取代Eureka服务器，zk作为服务注册中心

###     6.2.2服务提供者

> 新建cloud-provider-payment8004
>
> POM
>
> ```xml
> <?xml version="1.0" encoding="UTF-8"?>
> <project xmlns="http://maven.apache.org/POM/4.0.0"
>          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
>     <parent>
>         <artifactId>cloud2020</artifactId>
>         <groupId>com.xiyue.cloud</groupId>
>         <version>1.0-SNAPSHOT</version>
>     </parent>
>     <modelVersion>4.0.0</modelVersion>
> 
>     <artifactId>cloud-provider-payment8004</artifactId>
>     <dependencies>
>         <dependency>
>             <groupId>com.xiyue.cloud</groupId>
>             <artifactId>cloud-api-commons</artifactId>
>             <version>${project.version}</version>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-web</artifactId>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-actuator</artifactId>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zookeeper-discovery -->
>         <dependency>
>             <groupId>org.springframework.cloud</groupId>
>             <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-devtools</artifactId>
>             <scope>runtime</scope>
>             <optional>true</optional>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
>         <dependency>
>             <groupId>org.projectlombok</groupId>
>             <artifactId>lombok</artifactId>
>             <optional>true</optional>
>         </dependency>
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-test</artifactId>
>             <scope>test</scope>
>         </dependency>
>     </dependencies>
> </project>
> ```
>
> ​      YML
>
> ```yml
> server:
>   port: 8004
> spring:
>   application:
>     name: cloud-provider-payment
>   cloud:
>     zookeeper:
>       connect-string: 127.0.0.1:2181
> ```
>
> ​      主启动类
>
> ```java
> package com.xiyue.cloud;
> 
> import org.springframework.boot.SpringApplication;
> import org.springframework.boot.autoconfigure.SpringBootApplication;
> import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
> 
> @SpringBootApplication
> @EnableDiscoveryClient
> public class PaymentMain8004 {
>     public static void main(String[] args) {
>         SpringApplication.run(PaymentMain8004.class,args);
>     }
> }
> 
> ```
>
> ​      Controller
>
> ```java
> package com.xiyue.cloud.controller;
> 
> import lombok.extern.slf4j.Slf4j;
> import org.springframework.beans.factory.annotation.Value;
> import org.springframework.web.bind.annotation.GetMapping;
> import org.springframework.web.bind.annotation.RestController;
> 
> import java.util.UUID;
> 
> @RestController
> @Slf4j
> public class PaymentController {
> 
>     @Value("${server.port}")
>     private String serverPort;
> 
>     @GetMapping(value = "/payment/zk")
>     public String paymentzk(){
>         return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
>     }
> 
> }
> ```
>
> ​      启动8004注册进zookeeper
>
> > ​        启动后问题
> >
> > ![image-20201021003706549](assets/image-20201021003706549.png)
> >
> > ​        why
> >
> > > ​          解决zookeeper版本jar包冲突问题
> > >
> > > ![image-20201021003748802](assets/image-20201021003748802.png)
> > >
> > > ​          排除zk冲突后的新POM
> > >
> > > ```xml
> > > <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zookeeper-discovery -->
> > >         <dependency>
> > >             <groupId>org.springframework.cloud</groupId>
> > >             <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
> > >             <!--排除zk3.5.3-->
> > >             <exclusions>
> > >                 <exclusion>
> > >                     <groupId>org.apache.zookeeper</groupId>
> > >                     <artifactId>zookeeper</artifactId>
> > >                 </exclusion>
> > >             </exclusions>
> > >         </dependency>
> > >             <!--添加zk 3.4,9版本-->
> > >         <!-- https://mvnrepository.com/artifact/org.apache.zookeeper/zookeeper -->
> > >         <dependency>
> > >             <groupId>org.apache.zookeeper</groupId>
> > >             <artifactId>zookeeper</artifactId>
> > >             <version>3.4.9</version>
> > >         </dependency>
> > > ```
> > >
> > > 
>
> ​      验证测试
>
> ![image-20201021003945480](assets/image-20201021003945480.png)
>
> ​        http://localhost:8004/payment/zk
>
> ​      验证测试2
>
> ![image-20201021004012819](assets/image-20201021004012819.png)
>
> ​        获得json串后用在线工具查看试试
>
> ​      思考
>
> ​        服务节点是临时节点还是持久节点：是临时节点

### 6.2.3服务消费者

> 新建cloud-consumerzk-order80
>
> POM
>
> ```xml
> <?xml version="1.0" encoding="UTF-8"?>
> <project xmlns="http://maven.apache.org/POM/4.0.0"
>          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
>          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
>     <parent>
>         <artifactId>cloud2020</artifactId>
>         <groupId>com.xiyue.cloud</groupId>
>         <version>1.0-SNAPSHOT</version>
>     </parent>
>     <modelVersion>4.0.0</modelVersion>
> 
>     <artifactId>cloud-consumerzk-order80</artifactId>
> 
>     <dependencies>
> 
>         <dependency>
>             <groupId>com.xiyue.cloud</groupId>
>             <artifactId>cloud-api-commons</artifactId>
>             <version>${project.version}</version>
>         </dependency>
> 
> 
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-web</artifactId>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-actuator</artifactId>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zookeeper-discovery -->
>         <dependency>
>             <groupId>org.springframework.cloud</groupId>
>             <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-devtools</artifactId>
>             <scope>runtime</scope>
>             <optional>true</optional>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
>         <dependency>
>             <groupId>org.projectlombok</groupId>
>             <artifactId>lombok</artifactId>
>             <optional>true</optional>
>         </dependency>
> 
>         <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
>         <dependency>
>             <groupId>org.springframework.boot</groupId>
>             <artifactId>spring-boot-starter-test</artifactId>
>             <scope>test</scope>
>         </dependency>
>     </dependencies>
> </project>
> ```
>
> ​      YML（application.yml）
>
> ```yml
> server:
>   port: 80
> 
> spring:
>   application:
>     name: cloud-consumer-order
>   cloud:
>     zookeeper:
>       connect-string: 127.0.0.1:2181
> ```
>
> ​      主启动
>
> ```java
> package com.xiyue.cloud;
> 
> import org.springframework.boot.SpringApplication;
> import org.springframework.boot.autoconfigure.SpringBootApplication;
> import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
> 
> @SpringBootApplication
> @EnableDiscoveryClient
> public class OrderZKMain80 {
>     public static void main(String[] args) {
>         SpringApplication.run(OrderZKMain80.class,args);
>     }
> }
> ```
>
> ​      业务类
>
> ```java
> package com.xiyue.cloud.controller;
> 
> import lombok.extern.slf4j.Slf4j;
> import org.springframework.beans.factory.annotation.Value;
> import org.springframework.web.bind.annotation.GetMapping;
> import org.springframework.web.bind.annotation.RestController;
> 
> import java.util.UUID;
> 
> @RestController
> @Slf4j
> public class PaymentController {
> 
>     @Value("${server.port}")
>     private String serverPort;
> 
>     @GetMapping(value = "/payment/zk")
>     public String paymentzk(){
>         return "springcloud with zookeeper:"+serverPort+"\t"+ UUID.randomUUID().toString();
>     }
> 
> }
> ```
>
> >  配置Bean
> >
> > ```java
> > package com.xiyue.cloud.config;
> > 
> > import org.springframework.cloud.client.loadbalancer.LoadBalanced;
> > import org.springframework.context.annotation.Bean;
> > import org.springframework.context.annotation.Configuration;
> > import org.springframework.web.client.RestTemplate;
> > 
> > @Configuration
> > public class ApplicationConfig {
> > 
> >     @LoadBalanced
> >     @Bean
> >     public RestTemplate getRestTemplate(){
> >         return new RestTemplate();
> >     }
> > }
> > ```
> >
> > Controller
> >
> > ```java
> > package com.xiyue.cloud.controller;
> > 
> > import lombok.extern.slf4j.Slf4j;
> > import org.springframework.web.bind.annotation.GetMapping;
> > import org.springframework.web.bind.annotation.RestController;
> > import org.springframework.web.client.RestTemplate;
> > 
> > import javax.annotation.Resource;
> > 
> > @RestController
> > @Slf4j
> > public class OrderZKController {
> > 
> >     public static final String INVOME_URL = "http://cloud-provider-payment";
> > 
> >     @Resource
> >     private RestTemplate restTemplate;
> > 
> >     @GetMapping("/consumer/payment/zk")
> >     public String payment (){
> >         String result = restTemplate.getForObject(INVOME_URL+"/payment/zk",String.class);
> >         return result;
> >     }
> > 
> > 
> > }
> > ```
> >
> > 
>
> ​      启动8004注册进zookeeper
>
> >  启动后问题
> >
> > ![image-20201021011321130](assets/image-20201021011321130.png)
> >
> >  why
> >
> > > 解决zookeeper版本jar包冲突问题
> > >
> > > ![image-20201021011345770](assets/image-20201021011345770.png)
> > >
> > >  排出zk冲突后的新POM
> > >
> > >
> > > ```xml
> > > <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-zookeeper-discovery -->
> > >     <dependency>
> > >         <groupId>org.springframework.cloud</groupId>
> > >         <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
> > >         <!--排除zk3.5.3-->
> > >         <exclusions>
> > >             <exclusion>
> > >                 <groupId>org.apache.zookeeper</groupId>
> > >                 <artifactId>zookeeper</artifactId>
> > >             </exclusion>
> > >         </exclusions>
> > >     </dependency>
> > >         <!--添加zk 3.4,9版本-->
> > >     <!-- https://mvnrepository.com/artifact/org.apache.zookeeper/zookeeper -->
> > >     <dependency>
> > >         <groupId>org.apache.zookeeper</groupId>
> > >         <artifactId>zookeeper</artifactId>
> > >         <version>3.4.9</version>
> > >     </dependency>
> > > ```
> > >
>
> ​      验证测试
>
> ![image-20201021011502748](assets/image-20201021011502748.png)
>
> ​        http://localhost:8004/payment/zk
>
> ​      访问测试地址
>
> ​        http://localhost/consumer/payment/zk

# 7.Consul服务注册与发现

## 7.1Consul简介

### 7.1.1是什么

![image-20201021100226165](assets/image-20201021100226165.png)

https://www.consul.io/intro/index.html

### 7.1.2能干嘛

![image-20201021100626876](assets/image-20201021100626876.png)

服务发现:提供HTTP和DNS两种方式

健康监测：支持多种协议、HTTP、TCP、Docker、Shell脚本定制化

KV存储：key、Value的储存方式

多数据中心：Consul支持多数据中心

可视化界面

### 7.1.3去哪下

https://www.consul.io/downloads.html

### 7.1.4怎么玩

https://www.consul.io/downloads.html

## 7.2安装并运行Consul

### 7.2.1官网安装说明

https://learn.hashicorp.com/consul/getting-started/install.html

![image-20201021101132245](assets/image-20201021101132245.png)

下载完成后只有一个Consul.exe文件，硬盘路径下双击运行、查看版本信息。

### 7.2.2使用开发模式启动

- consul agent -dev

- 通过以下地址可以访问Consul的首页：http://localhost:8500

- 结果页面

  ![image-20201021101331128](assets/image-20201021101331128.png)

## 7.3服务提供者

- 新建Module支付服务provider8006:cloud-providerconsul-payment8006
- POM

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>cloud2020</artifactId>
        <groupId>com.xiyue.cloud</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>cloud-providerconsul-payment8006</artifactId>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-consul-discovery -->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-consul-discovery</artifactId>
        </dependency>

        <dependency>
            <groupId>com.xiyue.cloud</groupId>
            <artifactId>cloud-api-commons</artifactId>
            <version>${project.version}</version>
        </dependency>


        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>

</project>
```

- YML(application.yml)

  ```yml
  server:
    port: 8006
  
  
  spring:
    application:
      name: consul-provider-payment
    cloud:
      consul:
        host: localhost
        port: 8500
        discovery:
          service-name: ${spring.application.name}
  ```

- 主启动类

  ```java
  package xom.xiyue.cloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
  
  @SpringBootApplication
  @EnableDiscoveryClient
  public class PaymentMain8006 {
      public static void main(String[] args) {
          SpringApplication.run(PaymentMain8006.class,args);
      }
  }
  
  ```

- 业务类Controller

  ```java
  package xom.xiyue.cloud.controller;
  
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.beans.factory.annotation.Value;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RestController;
  
  import java.util.UUID;
  
  @RestController
  @Slf4j
  public class PaymentController {
  
      @Value("${server.port}")
      private String serverPort;
  
      @GetMapping(value = "/payment/consul")
      public String paymentConsul(){
          return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
      }
  }
  ```

- 验证测试

  http://localhost:8006/payment/consul

![image-20201021103701174](assets/image-20201021103701174.png)

## 7.4服务消费者

- 新建Module消费服务order8006: cloud-consumerconsul-order80

- POM

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <parent>
          <artifactId>cloud2020</artifactId>
          <groupId>com.xiyue.cloud</groupId>
          <version>1.0-SNAPSHOT</version>
      </parent>
      <modelVersion>4.0.0</modelVersion>
  
      <artifactId>cloud-consumerconsul-order80</artifactId>
      <dependencies>
          <!-- https://mvnrepository.com/artifact/org.springframework.cloud/spring-cloud-starter-consul-discovery -->
          <dependency>
              <groupId>org.springframework.cloud</groupId>
              <artifactId>spring-cloud-starter-consul-discovery</artifactId>
          </dependency>
  
          <dependency>
              <groupId>com.xiyue.cloud</groupId>
              <artifactId>cloud-api-commons</artifactId>
              <version>${project.version}</version>
          </dependency>
  
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-actuator</artifactId>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-devtools</artifactId>
              <scope>runtime</scope>
              <optional>true</optional>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.projectlombok/lombok -->
          <dependency>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
              <optional>true</optional>
          </dependency>
  
          <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test -->
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-test</artifactId>
              <scope>test</scope>
          </dependency>
      </dependencies>
  </project>
  ```

- YML（application.yml）

  ```yml
  server:
    port: 80
  
  spring:
    application:
      name: consul-consumer-order
    cloud:
      consul:
        host: localhost
        port: 8500
        discovery:
          service-name: ${spring.application.name}
  
  ```

- 主启动类

  ```java
  package com.xiyue.cloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
  
  @SpringBootApplication
  @EnableDiscoveryClient
  public class OrderConsulMain80 {
  
      public static void main(String[] args) {
          SpringApplication.run(OrderConsulMain80.class,args);
      }
  }
  
  ```

- 配置Bean

  ```java
  package com.xiyue.cloud.config;
  
  import org.springframework.cloud.client.loadbalancer.LoadBalanced;
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  import org.springframework.web.client.RestTemplate;
  
  @Configuration
  public class ApplicationContextConfig {
  
      @LoadBalanced
      @Bean
      public RestTemplate getRestTemplate(){
          return new RestTemplate();
      }
  
  }
  ```

- Controller

  ```java
  package com.xiyue.cloud.controller;
  
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.client.RestTemplate;
  
  import javax.annotation.Resource;
  
  @RestController
  @Slf4j
  public class OrderConsulController {
  
      public static final String INVOME_URL = "http://consul-provider-payment";
  
      @Resource
      private RestTemplate restTemplate;
  
      @GetMapping("/consumer/payment/consul")
      public String payment (){
          String result = restTemplate.getForObject(INVOME_URL+"/payment/consul",String.class);
          return result;
      }
  }
  ```

- 验证测试

  ![image-20201021104918900](assets/image-20201021104918900.png)

- 访问测试地址: http://localhost/consumer/payment/consul

## 7.5三个注册中心异同点

### 7.5.1CAP

-   C:Consistency(强一致性)
-   A:Availability(可用性)
-   P:Partition tolerance(分区容错)
-   CAP理论关注粒度是数据，而不是整体系统设计的策略

### 7.5.2经典CAP图

![image-20201021105219429](assets/image-20201021105219429.png)

-   AP(Eureka)

  ![image-20201021105307797](assets/image-20201021105307797.png)

 ![image-20201021105337557](assets/image-20201021105337557.png)

-  CP(Zookeeper/Consul)

  ![image-20201021105421180](assets/image-20201021105421180.png)

![image-20201021105454223](assets/image-20201021105454223.png)

# 8.Ribbon负载均衡服务调用

## 8.1概述

- 是什么

  ![image-20201021110240528](assets/image-20201021110240528.png)

- 官网资料

  https://github.com/Netflix/ribbon/wiki/Getting-Started
  Ribbon目前也进入维护模式

  ![image-20201021110355178](assets/image-20201021110355178.png)

  未来替换方案

  ![image-20201021110427589](assets/image-20201021110427589.png)

- 能干嘛

  LB（负载均衡）

  ![image-20201021110636241](assets/image-20201021110636241.png)

  >   集中式LB
  >
  > ![image-20201021110735753](assets/image-20201021110735753.png)
  >
  >   进程内LB
  >
  > ![image-20201021110804411](assets/image-20201021110804411.png)

  

  前面我们讲解过了80通过轮询负载访问8001/8002
  一句话:负载均衡+RestTemplate调用

## 8.2Ribbon负载均衡演示

- 架构说明

  ![image-20201021111111774](assets/image-20201021111111774.png)

  ![image-20201021111131305](assets/image-20201021111131305.png)

  总结：Ribbon其实就是一个软负载均衡的客户端组件，他可以和其他所需请求的客户端结合使用，和eureka结合只是其中的一个实例。

- POM

  ![image-20201021111236426](assets/image-20201021111236426.png)

  ![image-20201021111255789](assets/image-20201021111255789.png)

- 二说RestTemplate的使用

  - 官网

    https://docs.spring.io/spring-framework/docs/5.2.2.RELEASE/javadoc-api/org/springframework/web/client/RestTemplate.html

    ![image-20201021111522129](assets/image-20201021111522129.png)

  - getForObject方法/getForEntity方法

    ![image-20201021111602955](assets/image-20201021111602955.png)

  - postForObject/postForEntity

    ![image-20201021111625520](assets/image-20201021111625520.png)

  - GET请求方法

  - POST请求方法

## 8.3Ribbon核心组件IRule

### 8.3.1IRule:根据特定算法从服务列表中选取一个要访问的服务

![image-20201021112138978](assets/image-20201021112138978.png)

- com.netflix.loadbalancer.RoundRobinRule:轮询
- com.netflix.loadbalancer.RandomRule:随机
- com.netflix.loadbalancer.RetryRule: 先按照RoundRobinRule的策略获取服务，如果获取服务失败则在指定时间内会进行重试
- WeightedResponseTimeRule :对RoundRobinRule的扩展，响应速度越快的实例选择权重越大，越容易被选择
- BestAvailableRule :会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发量最小的服务
- AvailabilityFilteringRule : 先过滤掉故障实例，再选择并发较小的实例
- ZoneAvoidanceRule:  默认规则，复合判断server所在区域的性能和server的可用性选择服务器

### 8.3.2如何替换

- 修改cloud-consumer-order80

- 注意配置细节

  ![image-20201021112413373](assets/image-20201021112413373.png)

- 新建package:com.atguigu.myrule

  ![image-20201021112741811](assets/image-20201021112741811.png)

- 上面包下新建MySelfRule规则类

  ```java
  package com.xiyue.myrule;
  
  import com.netflix.loadbalancer.IRule;
  import com.netflix.loadbalancer.RandomRule;
  import org.springframework.context.annotation.Bean;
  import org.springframework.context.annotation.Configuration;
  
  @Configuration
  public class MySelfRule {
  
      @Bean
      public IRule myRule(){
          return new RandomRule();//定义为随机
      }
  }
  ```

- 主启动类添加@RibbonClient

  ```java
  package com.xiyue.cloud;
  
  import com.xiyue.myrule.MySelfRule;
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
  import org.springframework.cloud.netflix.ribbon.RibbonClient;
  
  @EnableEurekaClient
  @SpringBootApplication
  @RibbonClient(name = "CLOUD-PAYMENT-SERVICE",configuration = MySelfRule.class)
  public class OrderMain80 {
      public static void main(String[] args) {
          SpringApplication.run(OrderMain80.class,args);
      }
  }
  ```

  

- 测试:http://localhost/consumer/payment/get/31

## 8.4Ribbon负载均衡算法

- 原理

  ![image-20201021113202876](assets/image-20201021113202876.png)

- RoundRobinRule源码

- 手写

  自己试着写一个本地负载均衡器试试

  -  7001/7002集群启动

  -   8001/8002微服务改造: controller

    ```java
    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
    ```

  -   80订单微服务改造

  ​    1.ApplicationContextBean去掉@LoadBalanced

  ![image-20201021115714021](assets/image-20201021115714021.png)

  ​    2.LoadBalancer接口

  ```java
  package com.xiyue.cloud.lb;
  
  import org.springframework.cloud.client.ServiceInstance;
  
  import java.util.List;
  
  public interface LoadBalancer {
      //收集服务器总共有多少台能够提供服务的机器，并放到list里面
      ServiceInstance instances(List<ServiceInstance> serviceInstances);
  }
  ```

  ​    3.MyLB

  ```java
  package com.xiyue.cloud.lb;
  
  import org.springframework.cloud.client.ServiceInstance;
  import org.springframework.stereotype.Component;
  
  import java.util.List;
  import java.util.concurrent.atomic.AtomicInteger;
  
  @Component
  public class MyLB implements LoadBalancer {
      private AtomicInteger atomicInteger = new AtomicInteger(0);
      //坐标
      private final int getAndIncrement(){
          int current;
          int next;
          do {
              current = this.atomicInteger.get();
              next = current >= 2147483647 ? 0 : current + 1;
          }while (!this.atomicInteger.compareAndSet(current,next));  //第一个参数是期望值，第二个参数是修改值是
          System.out.println("*******第几次访问，次数next: "+next);
          return next;
      }
  
      @Override
      public ServiceInstance instances(List<ServiceInstance> serviceInstances) {  //得到机器的列表
          int index = getAndIncrement() % serviceInstances.size(); //得到服务器的下标位置
          return serviceInstances.get(index);
      }
  }
  ```

  ​    4.OrderController

  ```java
  package com.xiyue.cloud.controller;
  
  import com.xiyue.cloud.entities.CommonResult;
  import com.xiyue.cloud.entities.Payment;
  import com.xiyue.cloud.lb.LoadBalancer;
  import lombok.extern.slf4j.Slf4j;
  import org.springframework.cloud.client.ServiceInstance;
  import org.springframework.cloud.client.discovery.DiscoveryClient;
  import org.springframework.http.ResponseEntity;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PathVariable;
  import org.springframework.web.bind.annotation.RestController;
  import org.springframework.web.client.RestTemplate;
  
  import javax.annotation.Resource;
  import java.net.URI;
  import java.util.List;
  
  @RestController
  @Slf4j
  public class OrderController {
  
      // public static final String PAYMENT_URL = "http://localhost:8001";
      public static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
  
      @Resource
      private RestTemplate restTemplate;
  
      @Resource
      private LoadBalancer loadBalancer;
  
      @Resource
      private DiscoveryClient discoveryClient;
  
      @GetMapping("/consumer/payment/create")
      public CommonResult<Payment>   create( Payment payment){
          return restTemplate.postForObject(PAYMENT_URL+"/payment/create",payment,CommonResult.class);  //写操作
      }
  
      @GetMapping("/consumer/payment/get/{id}")
      public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
          return restTemplate.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
      }
  
      @GetMapping("/consumer/payment/getForEntity/{id}")
      public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
          ResponseEntity<CommonResult> entity = restTemplate.getForEntity(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
          if (entity.getStatusCode().is2xxSuccessful()){
              //  log.info(entity.getStatusCode()+"\t"+entity.getHeaders());
              return entity.getBody();
          }else {
              return new CommonResult<>(444,"操作失败");
          }
      }
  
      @GetMapping(value = "/consumer/payment/lb")
      public String getPaymentLB(){
          List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
          if (instances == null || instances.size() <= 0){
              return null;
          }
          ServiceInstance serviceInstance = loadBalancer.instances(instances);
          URI uri = serviceInstance.getUri();
          return restTemplate.getForObject(uri+"/payment/lb",String.class);
      }
  }
  ```

  ​    5.测试: http://localhost/consumer/payment/lb（8001与8002来回切换）

# 9.OpenFeign服务接口调用

## 9.1概述

- OpenFeign是什么

  ![image-20201021120940762](assets/image-20201021120940762.png)

  ![image-20201021121020000](assets/image-20201021121020000.png)

  Feign是一个声明式的web服务客户端，让编写web服务客户端变得非常容易，只需创建一个接口并在接口上添加注解即可
  GitHub: https://github.com/spring-cloud/spring-cloud-openfeign

- 能干嘛

  ![image-20201021121119677](assets/image-20201021121119677.png)

- Feign和OpenFeign两者区别

  ![image-20201021121240253](assets/image-20201021121240253.png)

## 9.2OpenFeign使用步骤

- 接口+注解:微服务调用接口+@FeignClient

- 新建cloud-consumer-feign-order80:Feign在消费端使用

  ![image-20201021121501727](assets/image-20201021121501727.png)

- POM

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <project xmlns="http://maven.apache.org/POM/4.0.0"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <parent>
          <artifactId>cloud2020</artifactId>
          <groupId>com.xiyue.cloud</groupId>
          <version>1.0-SNAPSHOT</version>
      </parent>
      <modelVersion>4.0.0</modelVersion>
  
      <artifactId>cloud-consumer-feign-order80</artifactId>
      <!--openfeign-->
      <dependencies>
          <dependency>
              <groupId>com.xiyue.cloud</groupId>
              <artifactId>cloud-api-commons</artifactId>
              <version>${project.version}</version>
          </dependency>
          <dependency>
              <groupId>org.springframework.cloud</groupId>
              <artifactId>spring-cloud-starter-openfeign</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework.cloud</groupId>
              <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
          </dependency>
  
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-actuator</artifactId>
          </dependency>
  
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-devtools</artifactId>
              <scope>runtime</scope>
              <optional>true</optional>
          </dependency>
  
          <dependency>
              <groupId>org.projectlombok</groupId>
              <artifactId>lombok</artifactId>
              <optional>true</optional>
          </dependency>
          <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-test</artifactId>
              <scope>test</scope>
          </dependency>
      </dependencies>
  </project>
  ```

- YML(application.yml)

  ```yml
  server:
    port: 80
  eureka:
    client:
      register-with-eureka: false
      service-url:
        defaultZone: http://eureka7001.com:7001/eureka, http://eureka7002.com:7002/eureka
  ```

- 主启动类( @EnableFeignClients)

  ```java
  package com.xiyue.cloud;
  
  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.cloud.openfeign.EnableFeignClients;
  
  @SpringBootApplication
  @EnableFeignClients
  public class OrderFegin80 {
  
      public static void main(String[] args) {
          SpringApplication.run(OrderFegin80.class,args);
      }
  }
  ```

- 业务类

  - 业务逻辑接口+@FeignClient配置调用provider服务

  - 新建PaymentFeignService接口并新增注解@FeignClient

    ```java
    package com.xiyue.cloud.service;
    
    import com.xiyue.cloud.entities.CommonResult;
    import org.springframework.cloud.openfeign.FeignClient;
    import org.springframework.stereotype.Component;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    
    @Component
    @FeignClient(value = "CLOUD-PAYMENT-SERVICE")
    public interface PaymentFeignService {
    
        @GetMapping(value = "/payment/get/{id}")
        public CommonResult getPaymentById(@PathVariable("id") Long id);
    }
    
    ```

  - 控制层Controller

    ```java
    package com.xiyue.cloud.controller;
    
    import com.xiyue.cloud.entities.CommonResult;
    import com.xiyue.cloud.entities.Payment;
    import com.xiyue.cloud.service.PaymentFeignService;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.PathVariable;
    import org.springframework.web.bind.annotation.RestController;
    
    import javax.annotation.Resource;
    
    @RestController
    public class OrderFeignController {
    
        @Resource
        private PaymentFeignService paymentFeignService;
    
        @GetMapping(value = "/consumer/payment/get/{id}")
        public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
            return paymentFeignService.getPaymentById(id);
        }
    
    ```

- 测试

  

  - 先启动2个eureka集群7001/7002

  - 再启动2个微服务8001/8002

  - 启动OpenFeign启动

  - http://localhost/consumer/payment/get/31

  - Feign自带负载均衡配置项

- 小总结

  ![image-20201021123510865](assets/image-20201021123510865.png)

## 9.3OpenFeign超时控制

### 9.4OpenFeign日志打印功能

# 10.Hystrix断路器

# 11.zuul路由网关（没讲）

# 12.Gateway新一代网关

# 13.SpringCloud config分布式配置中心

# 14.SpringCloud Bus 消息总线

# 15.SpringCloud Stream消息驱动

# 16.SpringCloud Sleuth分布式请求链路追踪

# 17.SpringCloud Alibaba入门简介

# 18.SpringCloud Alibaba Nacos服务注册和配置中心

# 19.SpringCloud Alibaba Sentinel实现熔断与限流

# 20.SpringCloud Alibaba Seata处理分布式事务