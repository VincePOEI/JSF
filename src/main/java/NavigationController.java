

import javax.faces.bean.ManagedBean;

@ManagedBean(name="navigationController")
public class NavigationController {

    
    public NavigationController() {
    }
    
    public String moveToHelloPage(){
        return "hello";
    }
    
}
