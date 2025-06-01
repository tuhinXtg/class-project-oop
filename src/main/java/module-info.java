module com.example.class_project_oop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.class_project_oop to javafx.fxml;
    exports com.example.class_project_oop;
}