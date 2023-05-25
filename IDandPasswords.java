public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();

    IDandPasswords(){

        logininfo.put("hi","pizza");
        logininfo.put("Brometheus","PASSWORD");
        logininfo.put("Code","abc123");
    }

    public HashMap getLoginInfo(){
        return logininfo;
    }
}
