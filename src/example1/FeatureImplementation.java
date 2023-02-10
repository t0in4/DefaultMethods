package example1;

public class FeatureImplementation implements Feature {
    @Override
    public void action() {
        //Feature.super.action();
        System.out.println("Feature Implementation самобытный метод");
    }
}
