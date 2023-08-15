package ra.demospringmvc.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

public class AppConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //Phương thức này trả về mảng các lớp cấu hình chứa các cấu hình liên quan đến ứng dụng,
    // thường gọi là cấu hình gốc.

    //Trong ví dụ này, getRootConfigClasses() trả về mảng chứa một lớp WebConfig,
    // đây là lớp cấu hình chứa các cấu hình liên quan đến Spring MVC như các controller, view resolver, v.v.
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{WebConfig.class};
    }


    // Phương thức này trả về mảng các lớp cấu hình liên quan đến Dispatcher Servlet.
    //Trong ví dụ này, phương thức này trả về một mảng rỗng,
    // vì tất cả cấu hình liên quan đến Dispatcher Servlet đã được xử lý trong getRootConfigClasses().
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }


    //Phương thức này xác định các mẫu URL mà Dispatcher Servlet sẽ xử lý.
    //Trong ví dụ này,
    // getServletMappings() xác định rằng Dispatcher Servlet sẽ xử lý tất cả các URL (chỉ có "/" - root).
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }


    // Phương thức này trả về một mảng chứa các bộ lọc Servlet mà bạn muốn áp dụng cho Dispatcher Servlet.
    //Trong ví dụ này,
    // một CharacterEncodingFilter được tạo và cấu hình để đảm bảo việc mã hóa UTF-8 cho các yêu cầu và phản hồi.
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setForceEncoding(true);
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}