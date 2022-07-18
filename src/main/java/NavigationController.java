

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="navigationController")
public class NavigationController {
    
    @ManagedProperty (value = "#{param.pageId}")
    private String pageId;
    
    public NavigationController() {
    }
    
    
    
    public String moveToHelloPage(){
        return "hello";
    }
    
    public String goToPage(){
        if(pageId != null){
            return pageId;
        }
        
        return "home";
    }
    
     public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }
    
}
