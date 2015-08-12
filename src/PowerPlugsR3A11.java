import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class PowerPlugsR3A11 extends ClockDomain{
	public PowerPlugsR3A11(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerPowerPlugsR3A11_o = new output_Channel();
	private Signal powerReceive_39;
	private int power_thread_41;
	private int tutu__482182586;
	private int tutu__812209769;
	private int tutu__481797837;
	private int tutu__343274807;
	private int S3171 = 1;
	private int S2937 = 1;
	private int S3169 = 1;
	private int S2939 = 1;
	private int S2946 = 1;
	private int S2941 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1252819308(int [] tdone, int [] ends){
          if(tdone[41] != 1){
            switch(S3169){
              case 0 : 
              active[41]=0;
              ends[41]=0;
tdone[41]=1;
              break;
              case 1 : 
              switch(S2939){
                case 0 : 
                if(powerReceive_39.getprestatus()){
                                                                        power_thread_41 = powerReceive_39.getpreval() != null ? ((Integer)(powerReceive_39.getpreval())).intValue() : 0;
                  S2939=1;
S2946=0;
if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__812209769 = 0;
                                        tutu__812209769 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2946=1;
active[41]=1;
                    ends[41]=1;
tdone[41]=1;
                    }
                  else {
                    S2941=0;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                            tutu__482182586 = 0;
                                            tutu__482182586 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                            tutu__482182586++;
                                            appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__482182586);
                                            appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_41));
                      S2941=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[41]=2;
                                                ;
                        S2939=0;
active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      else {
                        active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      }
                    else {
                      active[41]=1;
                      ends[41]=1;
tdone[41]=1;
                      }
                    }
                  }
                else {
                  active[41]=1;
                  ends[41]=1;
tdone[41]=1;
                  }
                break;
                case 1 : 
                switch(S2946){
                  case 0 : 
                  if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__343274807 = 0;
                                        tutu__343274807 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2946=1;
active[41]=1;
                    ends[41]=1;
tdone[41]=1;
                    }
                  else {
                    switch(S2941){
                      case 0 : 
                      if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                tutu__481797837 = 0;
                                                tutu__481797837 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                                tutu__481797837++;
                                                appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__481797837);
                                                appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_41));
                        S2941=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                    ends[41]=2;
                                                    ;
                          S2939=0;
active[41]=1;
                          ends[41]=1;
tdone[41]=1;
                          }
                        else {
                          active[41]=1;
                          ends[41]=1;
tdone[41]=1;
                          }
                        }
                      else {
                        active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[41]=2;
                                                ;
                        S2939=0;
active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      else {
                        active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2946=1;
S2946=0;
if(appliancePowerPowerPlugsR3A11_o.get_preempted()){
                                        tutu__343274807 = 0;
                                        tutu__343274807 = appliancePowerPowerPlugsR3A11_o.get_preempted() ? appliancePowerPowerPlugsR3A11_o.refresh() : 0;
                    S2946=1;
active[41]=1;
                    ends[41]=1;
tdone[41]=1;
                    }
                  else {
                    S2941=0;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                            tutu__481797837 = 0;
                                            tutu__481797837 = appliancePowerPowerPlugsR3A11_o.get_w_s();
                                            tutu__481797837++;
                                            appliancePowerPowerPlugsR3A11_o.set_w_s(tutu__481797837);
                                            appliancePowerPowerPlugsR3A11_o.set_value(new Integer(power_thread_41));
                      S2941=1;
if(appliancePowerPowerPlugsR3A11_o.get_w_s() == appliancePowerPowerPlugsR3A11_o.get_w_r()){
                                                ends[41]=2;
                                                ;
                        S2939=0;
active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      else {
                        active[41]=1;
                        ends[41]=1;
tdone[41]=1;
                        }
                      }
                    else {
                      active[41]=1;
                      ends[41]=1;
tdone[41]=1;
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
public void thread1251665062(int [] tdone, int [] ends){
          if(tdone[40] != 1){
            switch(S2937){
              case 0 : 
              active[40]=0;
              ends[40]=0;
tdone[40]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("PowerPlugs ON signal received");
                                powerReceive_39.setPresent();
                currsigs.addElement(powerReceive_39);
                powerReceive_39.setValue(new Integer(45));
                System.out.println("Emitted powerReceive_39");
active[40]=1;
                ends[40]=1;
tdone[40]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("PowerPlugs OFF signal received");
                                    powerReceive_39.setPresent();
                  currsigs.addElement(powerReceive_39);
                  powerReceive_39.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_39");
active[40]=1;
                  ends[40]=1;
tdone[40]=1;
                  }
                else {
                  active[40]=1;
                  ends[40]=1;
tdone[40]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1261668533(int [] tdone, int [] ends){
          if(tdone[41] != 1){
            S3169=1;
S2939=0;
active[41]=1;
            ends[41]=1;
tdone[41]=1;
            }
          }
public void thread1258975291(int [] tdone, int [] ends){
          if(tdone[40] != 1){
            S2937=1;
if(onSignal.getprestatus()){
                            System.out.println("PowerPlugs ON signal received");
                            powerReceive_39.setPresent();
              currsigs.addElement(powerReceive_39);
              powerReceive_39.setValue(new Integer(45));
              System.out.println("Emitted powerReceive_39");
active[40]=1;
              ends[40]=1;
tdone[40]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("PowerPlugs OFF signal received");
                                powerReceive_39.setPresent();
                currsigs.addElement(powerReceive_39);
                powerReceive_39.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_39");
active[40]=1;
                ends[40]=1;
tdone[40]=1;
                }
              else {
                active[40]=1;
                ends[40]=1;
tdone[40]=1;
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
				switch(S3171){
          case 0 : 
          S3171=0;
          break RUN;
                    case 1 : 
          S3171=2;
          powerReceive_39.setClear();
          thread1258975291(tdone,ends);
          thread1261668533(tdone,ends);
          int biggest1262053282 = 0;
          if(ends[40]>=biggest1262053282){
            biggest1262053282=ends[40];
}
          if(ends[41]>=biggest1262053282){
            biggest1262053282=ends[41];
}
          if(biggest1262053282 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_39.setClear();
          thread1251665062(tdone,ends);
          thread1252819308(tdone,ends);
          int biggest1254743053 = 0;
          if(ends[40]>=biggest1254743053){
            biggest1254743053=ends[40];
}
          if(ends[41]>=biggest1254743053){
            biggest1254743053=ends[41];
}
          if(biggest1254743053 == 1){
            active[39]=1;
            ends[39]=1;
            break RUN;
            }
          //FINXME code
if(biggest1254743053 == 0){
            S3171=0;
active[39]=0;
            ends[39]=0;
S3171=0;
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
		powerReceive_39 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[39] != 0){
		int index = 39;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[39]!=0 || suspended[39]!=0 || active[39]!=1);
			else{
				appliancePowerPowerPlugsR3A11_o.update_w_r();
				if(!df){
					appliancePowerPowerPlugsR3A11_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_39.setpreclear();
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
			powerReceive_39.setClear();
			appliancePowerPowerPlugsR3A11_o.sethook();
			if(paused[39]!=0 || suspended[39]!=0 || active[39]!=1);
			else{
				appliancePowerPowerPlugsR3A11_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[39] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
