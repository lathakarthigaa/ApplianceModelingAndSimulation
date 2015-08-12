import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class HeaterR2A8 extends ClockDomain{
	public HeaterR2A8(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerHeaterR2A8_o = new output_Channel();
	private Signal powerReceive_22;
	private int power_thread_24;
	private int tutu__527967705;
	private int tutu__875920836;
	private int tutu__526813458;
	private int tutu__1704434404;
	private int S2015 = 1;
	private int S1781 = 1;
	private int S2013 = 1;
	private int S1783 = 1;
	private int S1790 = 1;
	private int S1785 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1036590426(int [] tdone, int [] ends){
          if(tdone[24] != 1){
            switch(S2013){
              case 0 : 
              active[24]=0;
              ends[24]=0;
tdone[24]=1;
              break;
              case 1 : 
              switch(S1783){
                case 0 : 
                if(powerReceive_22.getprestatus()){
                                                                        power_thread_24 = powerReceive_22.getpreval() != null ? ((Integer)(powerReceive_22.getpreval())).intValue() : 0;
                  S1783=1;
S1790=0;
if(appliancePowerHeaterR2A8_o.get_preempted()){
                                        tutu__875920836 = 0;
                                        tutu__875920836 = appliancePowerHeaterR2A8_o.get_preempted() ? appliancePowerHeaterR2A8_o.refresh() : 0;
                    S1790=1;
active[24]=1;
                    ends[24]=1;
tdone[24]=1;
                    }
                  else {
                    S1785=0;
if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                            tutu__527967705 = 0;
                                            tutu__527967705 = appliancePowerHeaterR2A8_o.get_w_s();
                                            tutu__527967705++;
                                            appliancePowerHeaterR2A8_o.set_w_s(tutu__527967705);
                                            appliancePowerHeaterR2A8_o.set_value(new Integer(power_thread_24));
                      S1785=1;
if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                                ends[24]=2;
                                                ;
                        S1783=0;
active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      else {
                        active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      }
                    else {
                      active[24]=1;
                      ends[24]=1;
tdone[24]=1;
                      }
                    }
                  }
                else {
                  active[24]=1;
                  ends[24]=1;
tdone[24]=1;
                  }
                break;
                case 1 : 
                switch(S1790){
                  case 0 : 
                  if(appliancePowerHeaterR2A8_o.get_preempted()){
                                        tutu__1704434404 = 0;
                                        tutu__1704434404 = appliancePowerHeaterR2A8_o.get_preempted() ? appliancePowerHeaterR2A8_o.refresh() : 0;
                    S1790=1;
active[24]=1;
                    ends[24]=1;
tdone[24]=1;
                    }
                  else {
                    switch(S1785){
                      case 0 : 
                      if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                                tutu__526813458 = 0;
                                                tutu__526813458 = appliancePowerHeaterR2A8_o.get_w_s();
                                                tutu__526813458++;
                                                appliancePowerHeaterR2A8_o.set_w_s(tutu__526813458);
                                                appliancePowerHeaterR2A8_o.set_value(new Integer(power_thread_24));
                        S1785=1;
if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                                    ends[24]=2;
                                                    ;
                          S1783=0;
active[24]=1;
                          ends[24]=1;
tdone[24]=1;
                          }
                        else {
                          active[24]=1;
                          ends[24]=1;
tdone[24]=1;
                          }
                        }
                      else {
                        active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                                ends[24]=2;
                                                ;
                        S1783=0;
active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      else {
                        active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S1790=1;
S1790=0;
if(appliancePowerHeaterR2A8_o.get_preempted()){
                                        tutu__1704434404 = 0;
                                        tutu__1704434404 = appliancePowerHeaterR2A8_o.get_preempted() ? appliancePowerHeaterR2A8_o.refresh() : 0;
                    S1790=1;
active[24]=1;
                    ends[24]=1;
tdone[24]=1;
                    }
                  else {
                    S1785=0;
if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                            tutu__526813458 = 0;
                                            tutu__526813458 = appliancePowerHeaterR2A8_o.get_w_s();
                                            tutu__526813458++;
                                            appliancePowerHeaterR2A8_o.set_w_s(tutu__526813458);
                                            appliancePowerHeaterR2A8_o.set_value(new Integer(power_thread_24));
                      S1785=1;
if(appliancePowerHeaterR2A8_o.get_w_s() == appliancePowerHeaterR2A8_o.get_w_r()){
                                                ends[24]=2;
                                                ;
                        S1783=0;
active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      else {
                        active[24]=1;
                        ends[24]=1;
tdone[24]=1;
                        }
                      }
                    else {
                      active[24]=1;
                      ends[24]=1;
tdone[24]=1;
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
public void thread1118541942(int [] tdone, int [] ends){
          if(tdone[23] != 1){
            switch(S1781){
              case 0 : 
              active[23]=0;
              ends[23]=0;
tdone[23]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Heater ON signal received");
                                powerReceive_22.setPresent();
                currsigs.addElement(powerReceive_22);
                powerReceive_22.setValue(new Integer(1800));
                System.out.println("Emitted powerReceive_22");
active[23]=1;
                ends[23]=1;
tdone[23]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Heater OFF signal received");
                                    powerReceive_22.setPresent();
                  currsigs.addElement(powerReceive_22);
                  powerReceive_22.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_22");
active[23]=1;
                  ends[23]=1;
tdone[23]=1;
                  }
                else {
                  active[23]=1;
                  ends[23]=1;
tdone[23]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1119311440(int [] tdone, int [] ends){
          if(tdone[24] != 1){
            S2013=1;
S1783=0;
active[24]=1;
            ends[24]=1;
tdone[24]=1;
            }
          }
public void thread1116618198(int [] tdone, int [] ends){
          if(tdone[23] != 1){
            S1781=1;
if(onSignal.getprestatus()){
                            System.out.println("Heater ON signal received");
                            powerReceive_22.setPresent();
              currsigs.addElement(powerReceive_22);
              powerReceive_22.setValue(new Integer(1800));
              System.out.println("Emitted powerReceive_22");
active[23]=1;
              ends[23]=1;
tdone[23]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Heater OFF signal received");
                                powerReceive_22.setPresent();
                currsigs.addElement(powerReceive_22);
                powerReceive_22.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_22");
active[23]=1;
                ends[23]=1;
tdone[23]=1;
                }
              else {
                active[23]=1;
                ends[23]=1;
tdone[23]=1;
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
				switch(S2015){
          case 0 : 
          S2015=0;
          break RUN;
                    case 1 : 
          S2015=2;
          powerReceive_22.setClear();
          thread1116618198(tdone,ends);
          thread1119311440(tdone,ends);
          int biggest1119696189 = 0;
          if(ends[23]>=biggest1119696189){
            biggest1119696189=ends[23];
}
          if(ends[24]>=biggest1119696189){
            biggest1119696189=ends[24];
}
          if(biggest1119696189 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_22.setClear();
          thread1118541942(tdone,ends);
          thread1036590426(tdone,ends);
          int biggest1035436180 = 0;
          if(ends[23]>=biggest1035436180){
            biggest1035436180=ends[23];
}
          if(ends[24]>=biggest1035436180){
            biggest1035436180=ends[24];
}
          if(biggest1035436180 == 1){
            active[22]=1;
            ends[22]=1;
            break RUN;
            }
          //FINXME code
if(biggest1035436180 == 0){
            S2015=0;
active[22]=0;
            ends[22]=0;
S2015=0;
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
		powerReceive_22 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[22] != 0){
		int index = 22;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
			else{
				appliancePowerHeaterR2A8_o.update_w_r();
				if(!df){
					appliancePowerHeaterR2A8_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_22.setpreclear();
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
			powerReceive_22.setClear();
			appliancePowerHeaterR2A8_o.sethook();
			if(paused[22]!=0 || suspended[22]!=0 || active[22]!=1);
			else{
				appliancePowerHeaterR2A8_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[22] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
