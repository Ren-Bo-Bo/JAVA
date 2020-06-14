package com.qf.market.servlet;

import com.qf.market.entity.Tuser;
import com.qf.market.service.ItuserService;
import com.qf.market.service.impl.TuserServiceImpl;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *用户模块控制器
 *@author sx
 * @version 1.0 2020-04-07
 */
@WebServlet("/UserServlet")
public class UserServlet extends FatherServlet {
    /**
    *创建业务类对象
    */
    public ItuserService userService=new TuserServiceImpl();

    /**
    *登录方法
    *@param request, response
    *@return java.lang.String
    */
    public String login(HttpServletRequest request, HttpServletResponse response) throws IllegalAccessException, NoSuchFieldException, InstantiationException {
        //1.接收请求中数据,调用公共Servlet中方法接收请求数据
        Tuser u1=requestMap(Tuser.class,request,response);

        //2.调用业务层去处理请求并得到结果,声明变量存结果
        Tuser u2=userService.login(u1);

        //3.根据结果选择相应页面跳转
        if (u2==null){//登录失败
            request.setAttribute("mess","loginFailed");
            return "login.jsp";
        }else{//登录成功
            //用session将用户信息存下来
            request.getSession().setAttribute("u",u2);

            return "index.jsp";
        }
    }

    /**
     *退出方法
     *@param request, response
     *@return java.lang.String
     */
    public String exit(HttpServletRequest request, HttpServletResponse response){
        //清session
        request.getSession().removeAttribute("u");
        //重定向到登录页面
        return "redirect:login.jsp";
    }
    public String updatePassword(HttpServletRequest request, HttpServletResponse response){
        //1.获得请求中的数据
        String newPwd = request.getParameter("newPassword");
        String uaccount= ((Tuser) request.getSession().getAttribute("u")).getUaccount();

        int result=userService.updatePassword(newPwd,uaccount);
        if (result>0){

        }else{

        }
        return "redirect:login.jsp";
    }
}
