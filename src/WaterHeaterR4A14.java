import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class WaterHeaterR4A14 extends ClockDomain{
	public WaterHeaterR4A14(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerWaterHeaterR4A14_o = new output_Channel();
	private Signal powerReceive_52;
	private int power_thread_54;
	private int tutu__412543035;
	private int tutu__2122899024;
	private int tutu__422931255;
	private int tutu__1038755793;
	private int S4127 = 1;
	private int S3893 = 1;
	private int S4125 = 1;
	private int S3895 = 1;
	private int S3902 = 1;
	private int S3897 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1485977142(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            switch(S4125){
              case 0 : 
              active[54]=0;
              ends[54]=0;
tdone[54]=1;
              break;
              case 1 : 
              switch(S3895){
                case 0 : 
                if(powerReceive_52.getprestatus()){
                                                                        power_thread_54 = powerReceive_52.getpreval() != null ? ((Integer)(powerReceive_52.getpreval())).intValue() : 0;
                  S3895=1;
S3902=0;
if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__2122899024 = 0;
                                        tutu__2122899024 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3902=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    S3897=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__412543035 = 0;
                                            tutu__412543035 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__412543035++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__412543035);
                                            appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_54));
                      S3897=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[54]=2;
                                                ;
                        S3895=0;
active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      else {
                        active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      }
                    else {
                      active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    }
                  }
                else {
                  active[54]=1;
                  ends[54]=1;
tdone[54]=1;
                  }
                break;
                case 1 : 
                switch(S3902){
                  case 0 : 
                  if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__1038755793 = 0;
                                        tutu__1038755793 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3902=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    switch(S3897){
                      case 0 : 
                      if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                tutu__422931255 = 0;
                                                tutu__422931255 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                                tutu__422931255++;
                                                appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__422931255);
                                                appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_54));
                        S3897=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                    ends[54]=2;
                                                    ;
                          S3895=0;
active[54]=1;
                          ends[54]=1;
tdone[54]=1;
                          }
                        else {
                          active[54]=1;
                          ends[54]=1;
tdone[54]=1;
                          }
                        }
                      else {
                        active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[54]=2;
                                                ;
                        S3895=0;
active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      else {
                        active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S3902=1;
S3902=0;
if(appliancePowerWaterHeaterR4A14_o.get_preempted()){
                                        tutu__1038755793 = 0;
                                        tutu__1038755793 = appliancePowerWaterHeaterR4A14_o.get_preempted() ? appliancePowerWaterHeaterR4A14_o.refresh() : 0;
                    S3902=1;
active[54]=1;
                    ends[54]=1;
tdone[54]=1;
                    }
                  else {
                    S3897=0;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                            tutu__422931255 = 0;
                                            tutu__422931255 = appliancePowerWaterHeaterR4A14_o.get_w_s();
                                            tutu__422931255++;
                                            appliancePowerWaterHeaterR4A14_o.set_w_s(tutu__422931255);
                                            appliancePowerWaterHeaterR4A14_o.set_value(new Integer(power_thread_54));
                      S3897=1;
if(appliancePowerWaterHeaterR4A14_o.get_w_s() == appliancePowerWaterHeaterR4A14_o.get_w_r()){
                                                ends[54]=2;
                                                ;
                        S3895=0;
active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      else {
                        active[54]=1;
                        ends[54]=1;
tdone[54]=1;
                        }
                      }
                    else {
                      active[54]=1;
                      ends[54]=1;
tdone[54]=1;
                      }
                    }
                  break;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread1494056869(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            switch(S3893){
              case 0 : 
              active[53]=0;
              ends[53]=0;
tdone[53]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Exhaust Fan ON signal received");
                                powerReceive_52.setPresent();
                currsigs.addElement(powerReceive_52);
                powerReceive_52.setValue(new Integer(2000));
                System.out.println("Emitted powerReceive_52");
active[53]=1;
                ends[53]=1;
tdone[53]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Exhaust Fan OFF signal received");
                                    powerReceive_52.setPresent();
                  currsigs.addElement(powerReceive_52);
                  powerReceive_52.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_52");
active[53]=1;
                  ends[53]=1;
tdone[53]=1;
                  }
                else {
                  active[53]=1;
                  ends[53]=1;
tdone[53]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1494826366(int [] tdone, int [] ends){
          if(tdone[54] != 1){
            S4125=1;
S3895=0;
active[54]=1;
            ends[54]=1;
tdone[54]=1;
            }
          }
public void thread1492133124(int [] tdone, int [] ends){
          if(tdone[53] != 1){
            S3893=1;
if(onSignal.getprestatus()){
                            System.out.println("Exhaust Fan ON signal received");
                            powerReceive_52.setPresent();
              currsigs.addElement(powerReceive_52);
              powerReceive_52.setValue(new Integer(2000));
              System.out.println("Emitted powerReceive_52");
active[53]=1;
              ends[53]=1;
tdone[53]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Exhaust Fan OFF signal received");
                                powerReceive_52.setPresent();
                currsigs.addElement(powerReceive_52);
                powerReceive_52.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_52");
active[53]=1;
                ends[53]=1;
tdone[53]=1;
                }
              else {
                active[53]=1;
                ends[53]=1;
tdone[53]=1;
                }
              }
            }
          }
public void runClockDomain(){
			for(int i=0;i<ends.length;i++){
				ends[i] = 0;
				tdone[i] = 0;
				}
RUN: while(true){
				switch(S4127){
          case 0 : 
          S4127=0;
          break RUN;
                    case 1 : 
          S4127=2;
          powerReceive_52.setClear();
          thread1492133124(tdone,ends);
          thread1494826366(tdone,ends);
          int biggest1495211115 = 0;
          if(ends[53]>=biggest1495211115){
            biggest1495211115=ends[53];
}
          if(ends[54]>=biggest1495211115){
            biggest1495211115=ends[54];
}
          if(biggest1495211115 == 1){
            active[52]=1;
            ends[52]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_52.setClear();
          thread1494056869(tdone,ends);
          thread1485977142(tdone,ends);
          int biggest1484822895 = 0;
          if(ends[53]>=biggest1484822895){
            biggest1484822895=ends[53];
}
          if(ends[54]>=biggest1484822895){
            biggest1484822895=ends[54];
}
          if(biggest1484822895 == 1){
            active[52]=1;
            ends[52]=1;
            break RUN;
            }
          //FINXME code
if(biggest1484822895 == 0){
            S4127=0;
active[52]=0;
            ends[52]=0;
S4127=0;
            break RUN;
            }
                    }
        			}
		}
	public void init(){
		char [] active1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		char [] paused1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		char [] suspended1 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		paused = paused1;
		active = active1;
		suspended = suspended1;
		// Now instantiate all the local signals ONLY
		powerReceive_52 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[52] != 0){
		int index = 52;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[52]!=0 || suspended[52]!=0 || active[52]!=1);
			else{
				appliancePowerWaterHeaterR4A14_o.update_w_r();
				if(!df){
					appliancePowerWaterHeaterR4A14_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_52.setpreclear();
			int dummyint = 0;
			for(int qw=0;qw<currsigs.size();++qw){
				dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
				((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
			}
			currsigs.removeAllElements();
			dummyint = onSignal.getStatus() ? onSignal.setprepresent() : onSignal.setpreclear();
			onSignal.setpreval(onSignal.getValue());
			onSignal.setClear();
			dummyint = offSignal.getStatus() ? offSignal.setprepresent() : offSignal.setpreclear();
			offSignal.setpreval(offSignal.getValue());
			offSignal.setClear();
			powerReceive_52.setClear();
			appliancePowerWaterHeaterR4A14_o.sethook();
			if(paused[52]!=0 || suspended[52]!=0 || active[52]!=1);
			else{
				appliancePowerWaterHeaterR4A14_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[52] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
