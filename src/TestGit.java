/*
* author Robin
* */

public class TestGit {
    double x,y;

    TestGit(double _x,double _y){//构造器,有参的构造器
        x=_x;
        y=_y;
    }

    public double getDistance(TestGit p){//方法
        double d = Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
        return d;//有返回值
    }

    public static void main(String[] args) {
        TestGit p1 = new TestGit(3.0,4.0);
        TestGit origin = new TestGit(0,0);

        System.out.println(p1.getDistance(origin));
    }
}
