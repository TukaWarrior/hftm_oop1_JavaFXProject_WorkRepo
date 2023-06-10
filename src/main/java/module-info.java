module hftm.lucabuetzberger {
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens hftm.lucabuetzberger to javafx.fxml;
    exports hftm.lucabuetzberger;
}
