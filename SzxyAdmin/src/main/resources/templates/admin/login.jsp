<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/gsymsg_admin/inc/taglibs.jsp"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>关山月美术馆</title>
<link href="${ctxPath}/css/login.css" type="text/css" rel="stylesheet" />
<link rel="stylesheet" href="${ctxPath}/css/xadmin.css"/>
<link rel="stylesheet" href="${ctxPath}/css/font.css"/>
<script type="text/javascript" src="${ctxPath}/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript" src="${ctxPath}/js/png.js"></script>
<script type="text/javascript" src="${ctxPath}/js/verifyCode.js"></script>

<script type="text/javascript" src="https://cdn.bootcss.com/jquery/3.2.1/jquery.min.js"></script>
<script src="../js/layui/layui.js" charset="utf-8"></script>
<script type="text/javascript" src="../js/xadmin.js"></script>


</head>
  <script>
        $(function  () {
            layui.use('form', function(){
              var form = layui.form;
              form.verify({
            	  username: function(value){
            		  if(value.length == 0 || value == null){
            			  return '用户名不能为空'; 
            		  }
            		  
            	  },
            	  password: function(value){
            		  if(value.length == 0 || value == null){
            			  return '密码不能为空'; 
            		  }
            	  },
            	  vcode: function(value){
            		  if(value.length == 0 || value == null){
            			  return '验证码不能为空'; 
            		  }
            	  }
              });
              
            });
        });

        
    </script>

<body class="login-bg">
    
    <div class="login">
        <div class="message">关山月美术馆-管理登录</div>
        <div id="darkbannerwrap"></div>
        
        <form action="${ctxPath }/access_in/logn.action" name="login_form" method="post" class="layui-form" >
            <input name="username" placeholder="用户名" value="admin" type="text" lay-verify="username" class="layui-input" >
            <hr class="hr15">
            <input name="password"  placeholder="密码" value="gsymsg" type="password" lay-verify="password" class="layui-input">
            <hr class="hr15">
            <input name="vcode" placeholder='验证码' maxlength="4" type='text' autocomplete="off" lay-verify="vcode" style="width:50%;">
            <img id="imgObj" title="看不清，换一张" alt="" src="${ctxPath }/vcode" onclick="changeImg()" style="CURSOR: hand; border: 0px; margin-left:30px; width: 70px; height: 50px;" />
            <hr class="hr15">
            <input value="登录" lay-submit lay-filter="login" style="width:100%;" type="submit">
            <hr class="hr20" >
            <span class="red">${msg }</span>
        </form>
    </div>

  
</html>
