package com.joinbright.grsm.web.struts2.action;

import com.joinbright.grsm.model.User;
import com.joinbright.grsm.service.UserManager;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * ����ModelDriven���ƣ�����ʹ��ҳ��ı�̸��Ӽ� 
 * <form> 
 * <input type="text" name="username">
 * <input type="text" name="password"> ... </form>
 * 
 * @author Administrator
 * 
 */
public class UserAction extends ActionSupport implements ModelDriven {

    private User user;
    private UserManager userManager;
    
    public Object getModel() {
        if (user == null) {
            user = new User();
        }
        return user;
    }

    /**
     * ��ȡ�û������б�
     * 
     * @return
     */
    public String index() {
        ActionContext.getContext().put("users", userManager.findAll());
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public String save() {
        userManager.add(user);
        return SUCCESS;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public String execute() throws Exception {
        // TODO Auto-generated method stub
        return null;
    }

}
