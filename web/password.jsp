<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>超市账单管理系统</title>
    <link rel="stylesheet" href="css/public.css"/>
    <link rel="stylesheet" href="css/style.css"/>
    <script>
        <!--验证原密码-->
        function isOldPwd() {
            var old = document.getElementById("old").value;
            var oldPassword = document.getElementById("old").value;
            if (old==oldPassword){
               return true;
            }else{
                alert("原密码输入有误!");
                return false;
            }
        }
        /*验证新密码与原密码*/
        function isNewPwd() {
            var old = document.getElementById("old").value;
            var newPassword = document.getElementById("newPassword").value;
            var reNewPassword = document.getElementById("reNewPassword").value;
            if (old==newPassword){
                alert("新密码与原密码一样!")
            }else if (newPassword!=""&&newPassword==reNewPassword){
                return true;
            }else{
                alert("两次新密码输入不一致!");
                return false;
            }
        }
        /*表单提交验证方法*/
        function check() {
            if (isOldPwd()&&isNewPwd()){
               return true;
            }else {
                return false;
            }
        }
    </script>
</head>
<body>
<!--头部-->
<header class="publicHeader">
    <h1>超市账单管理系统</h1>
    <div class="publicHeaderR">
        <p><span>下午好！</span><span style="color: #fff21b"> Admin</span> , 欢迎你！</p>
        <a href="login.html">退出</a>
    </div>
</header>
<!--时间-->
<section class="publicTime">
    <span id="time">2015年1月1日 11:11  星期一</span>
    <a href="#">温馨提示：为了能正常浏览，请使用高版本浏览器！（IE10+）</a>
</section>
<!--主体内容-->
<section class="publicMian ">
    <div class="left">
        <h2 class="leftH2"><span class="span1"></span>功能列表 <span></span></h2>
        <nav>
            <ul class="list">
                <li ><a href="billList.html">账单管理</a></li>
                <li><a href="providerList.html">供应商管理</a></li>
                <li><a href="userList.html">用户管理</a></li>
                <li id="active"><a href="password.html">密码修改</a></li>
                <li><a href="login.html">退出系统</a></li>
            </ul>
        </nav>
    </div>
    <div class="right">
        <div class="location">
            <strong>你现在所在的位置是:</strong>
            <span>密码修改页面</span>
        </div>
        <div class="providerAdd">
            <form method="get" action="UserServlet" onsubmit="return check()">
                <input type="hidden" name="updatePassword">
                <!--div的class 为error是验证错误，ok是验证成功-->
                <div class="">
                    <label for="oldPassword">旧密码：<input type="hidden" id="old" name="old" value="${u.upassword}" /></label>
                    <input type="password" name="oldPassword" id="oldPassword" onblur="isOldPwd()" required/>
                    <span>*请输入原密码</span>
                </div>
                <div>
                    <label for="newPassword">新密码：</label>
                    <input type="password" name="newPassword" id="newPassword" required/>
                    <span >*请输入新密码</span>
                </div>
                <div>
                    <label for="reNewPassword">确认新密码：</label>
                    <input type="password" name="reNewPassword" id="reNewPassword" onblur="isNewPwd()" required/>
                    <span >*请输入新确认密码，保证和新密码一致</span>
                </div>
                <div class="providerAddBtn">
                    <!--<a href="#">保存</a>-->
                    <input type="submit" value="保存"/>
                </div>
            </form>
        </div>
    </div>
</section>
<footer class="footer">
</footer>
<script src="js/time.js"></script>

</body>
</html>
