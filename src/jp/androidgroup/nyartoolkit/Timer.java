package jp.androidgroup.nyartoolkit;

public class Timer {
	long startTime;
	long endTime;
	long erapsedTime;
	long sumTime = 0;
  public void start(){
    startTime = System.currentTimeMillis();
  }
  public void end(){
	  endTime = System.currentTimeMillis();
	  erapsedTime = endTime - startTime;
	  sumTime = sumTime + erapsedTime;
  }
  public void print(){
    System.out.println("実行にかかった時間は " + sumTime + " ミリ秒です。");
  }
}