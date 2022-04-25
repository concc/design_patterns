package cn.edu.hbuas.base.memoto;

/**
 * 负责管理Memoto
 */
public class Caretaker {
    //备忘录
    Memoto memoto;

    //存档
    public void archive(Memoto memoto){
        this.memoto = memoto;
    }

    //获取存档
    public Memoto getMemoto(){
        return memoto;
    }


    public static void main(String[] args) {
        //构建游戏对象
        CallOfDuty callOfDuty = new CallOfDuty();
        //开始游戏
        callOfDuty.play();
        //构建caretaker，用于游戏存档
        Caretaker caretaker = new Caretaker();
        //通过游戏本身创建备忘录，caretaker执行存档操作
        caretaker.archive(callOfDuty.createMemoto());
        //退出游戏
        callOfDuty.quit();
        //重新开启游戏，并通过caretaker恢复游戏进度
        CallOfDuty callOfDuty1 = new CallOfDuty();
        callOfDuty1.restore(caretaker.getMemoto());
    }
}
