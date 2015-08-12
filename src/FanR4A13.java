import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class FanR4A13 extends ClockDomain{
	public FanR4A13(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public output_Channel appliancePowerFanR4A13_o = new output_Channel();
	private Signal powerReceive_49;
	private int power_thread_51;
	private int tutu__404078559;
	private int tutu__1822925167;
	private int tutu__405232806;
	private int tutu__1643528561;
	private int S3875 = 1;
	private int S3641 = 1;
	private int S3873 = 1;
	private int S3643 = 1;
	private int S3650 = 1;
	private int S3645 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1478282164(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            switch(S3873){
              case 0 : 
              active[51]=0;
              ends[51]=0;
tdone[51]=1;
              break;
              case 1 : 
              switch(S3643){
                case 0 : 
                if(powerReceive_49.getprestatus()){
                                                                        power_thread_51 = powerReceive_49.getpreval() != null ? ((Integer)(powerReceive_49.getpreval())).intValue() : 0;
                  S3643=1;
S3650=0;
if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1822925167 = 0;
                                        tutu__1822925167 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3650=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    S3645=0;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                            tutu__404078559 = 0;
                                            tutu__404078559 = appliancePowerFanR4A13_o.get_w_s();
                                            tutu__404078559++;
                                            appliancePowerFanR4A13_o.set_w_s(tutu__404078559);
                                            appliancePowerFanR4A13_o.set_value(new Integer(power_thread_51));
                      S3645=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[51]=2;
                                                ;
                        S3643=0;
active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      else {
                        active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      }
                    else {
                      active[51]=1;
                      ends[51]=1;
tdone[51]=1;
                      }
                    }
                  }
                else {
                  active[51]=1;
                  ends[51]=1;
tdone[51]=1;
                  }
                break;
                case 1 : 
                switch(S3650){
                  case 0 : 
                  if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1643528561 = 0;
                                        tutu__1643528561 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3650=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    switch(S3645){
                      case 0 : 
                      if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                tutu__405232806 = 0;
                                                tutu__405232806 = appliancePowerFanR4A13_o.get_w_s();
                                                tutu__405232806++;
                                                appliancePowerFanR4A13_o.set_w_s(tutu__405232806);
                                                appliancePowerFanR4A13_o.set_value(new Integer(power_thread_51));
                        S3645=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                    ends[51]=2;
                                                    ;
                          S3643=0;
active[51]=1;
                          ends[51]=1;
tdone[51]=1;
                          }
                        else {
                          active[51]=1;
                          ends[51]=1;
tdone[51]=1;
                          }
                        }
                      else {
                        active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[51]=2;
                                                ;
                        S3643=0;
active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      else {
                        active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S3650=1;
S3650=0;
if(appliancePowerFanR4A13_o.get_preempted()){
                                        tutu__1643528561 = 0;
                                        tutu__1643528561 = appliancePowerFanR4A13_o.get_preempted() ? appliancePowerFanR4A13_o.refresh() : 0;
                    S3650=1;
active[51]=1;
                    ends[51]=1;
tdone[51]=1;
                    }
                  else {
                    S3645=0;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                            tutu__405232806 = 0;
                                            tutu__405232806 = appliancePowerFanR4A13_o.get_w_s();
                                            tutu__405232806++;
                                            appliancePowerFanR4A13_o.set_w_s(tutu__405232806);
                                            appliancePowerFanR4A13_o.set_value(new Integer(power_thread_51));
                      S3645=1;
if(appliancePowerFanR4A13_o.get_w_s() == appliancePowerFanR4A13_o.get_w_r()){
                                                ends[51]=2;
                                                ;
                        S3643=0;
active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      else {
                        active[51]=1;
                        ends[51]=1;
tdone[51]=1;
                        }
                      }
                    else {
                      active[51]=1;
                      ends[51]=1;
tdone[51]=1;
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
public void thread1474049926(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            switch(S3641){
              case 0 : 
              active[50]=0;
              ends[50]=0;
tdone[50]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Exhaust Fan ON signal received");
                                powerReceive_49.setPresent();
                currsigs.addElement(powerReceive_49);
                powerReceive_49.setValue(new Integer(85));
                System.out.println("Emitted powerReceive_49");
active[50]=1;
                ends[50]=1;
tdone[50]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Exhaust Fan OFF signal received");
                                    powerReceive_49.setPresent();
                  currsigs.addElement(powerReceive_49);
                  powerReceive_49.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_49");
active[50]=1;
                  ends[50]=1;
tdone[50]=1;
                  }
                else {
                  active[50]=1;
                  ends[50]=1;
tdone[50]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1474819424(int [] tdone, int [] ends){
          if(tdone[51] != 1){
            S3873=1;
S3643=0;
active[51]=1;
            ends[51]=1;
tdone[51]=1;
            }
          }
public void thread1484438146(int [] tdone, int [] ends){
          if(tdone[50] != 1){
            S3641=1;
if(onSignal.getprestatus()){
                            System.out.println("Exhaust Fan ON signal received");
                            powerReceive_49.setPresent();
              currsigs.addElement(powerReceive_49);
              powerReceive_49.setValue(new Integer(85));
              System.out.println("Emitted powerReceive_49");
active[50]=1;
              ends[50]=1;
tdone[50]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Exhaust Fan OFF signal received");
                                powerReceive_49.setPresent();
                currsigs.addElement(powerReceive_49);
                powerReceive_49.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_49");
active[50]=1;
                ends[50]=1;
tdone[50]=1;
                }
              else {
                active[50]=1;
                ends[50]=1;
tdone[50]=1;
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
				switch(S3875){
          case 0 : 
          S3875=0;
          break RUN;
                    case 1 : 
          S3875=2;
          powerReceive_49.setClear();
          thread1484438146(tdone,ends);
          thread1474819424(tdone,ends);
          int biggest1475204173 = 0;
          if(ends[50]>=biggest1475204173){
            biggest1475204173=ends[50];
}
          if(ends[51]>=biggest1475204173){
            biggest1475204173=ends[51];
}
          if(biggest1475204173 == 1){
            active[49]=1;
            ends[49]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_49.setClear();
          thread1474049926(tdone,ends);
          thread1478282164(tdone,ends);
          int biggest1477127917 = 0;
          if(ends[50]>=biggest1477127917){
            biggest1477127917=ends[50];
}
          if(ends[51]>=biggest1477127917){
            biggest1477127917=ends[51];
}
          if(biggest1477127917 == 1){
            active[49]=1;
            ends[49]=1;
            break RUN;
            }
          //FINXME code
if(biggest1477127917 == 0){
            S3875=0;
active[49]=0;
            ends[49]=0;
S3875=0;
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
		powerReceive_49 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[49] != 0){
		int index = 49;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[49]!=0 || suspended[49]!=0 || active[49]!=1);
			else{
				appliancePowerFanR4A13_o.update_w_r();
				if(!df){
					appliancePowerFanR4A13_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			powerReceive_49.setpreclear();
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
			powerReceive_49.setClear();
			appliancePowerFanR4A13_o.sethook();
			if(paused[49]!=0 || suspended[49]!=0 || active[49]!=1);
			else{
				appliancePowerFanR4A13_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
			}
			if(active[49] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
