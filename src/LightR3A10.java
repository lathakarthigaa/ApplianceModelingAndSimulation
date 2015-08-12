import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class LightR3A10 extends ClockDomain{
	public LightR3A10(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public Signal humanPresenceSignal = new Signal();
	public Signal humanAbsenceSignal = new Signal();
	public Signal switchOFFLightR3A10 = new Signal();
	public Signal switchONLightR3A10 = new Signal();
	public Signal OKLightR3A10 = new Signal();
	public output_Channel appliancePowerLightR3A10_o = new output_Channel();
	private Signal powerReceive_32;
	private int b_thread_34;
	private int c_thread_34;
	private int d_thread_35;
	private int e_thread_35;
	private int b_thread_36;
	private int c_thread_36;
	private int d_thread_37;
	private int e_thread_37;
	private int power_thread_38;
	private int tutu__469101123;
	private int tutu__180439850;
	private int tutu__467177378;
	private int tutu__1302015734;
	private int S2919 = 1;
	private int S2485 = 1;
	private int S2535 = 1;
	private int S2585 = 1;
	private int S2635 = 1;
	private int S2685 = 1;
	private int S2917 = 1;
	private int S2687 = 1;
	private int S2694 = 1;
	private int S2689 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1257051546(int [] tdone, int [] ends){
          if(tdone[38] != 1){
            switch(S2917){
              case 0 : 
              active[38]=0;
              ends[38]=0;
tdone[38]=1;
              break;
              case 1 : 
              switch(S2687){
                case 0 : 
                if(powerReceive_32.getprestatus()){
                                                                        power_thread_38 = powerReceive_32.getpreval() != null ? ((Integer)(powerReceive_32.getpreval())).intValue() : 0;
                  S2687=1;
S2694=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__180439850 = 0;
                                        tutu__180439850 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2694=1;
active[38]=1;
                    ends[38]=1;
tdone[38]=1;
                    }
                  else {
                    S2689=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__469101123 = 0;
                                            tutu__469101123 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__469101123++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__469101123);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_38));
                      S2689=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[38]=2;
                                                ;
                        S2687=0;
active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      else {
                        active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      }
                    else {
                      active[38]=1;
                      ends[38]=1;
tdone[38]=1;
                      }
                    }
                  }
                else {
                  active[38]=1;
                  ends[38]=1;
tdone[38]=1;
                  }
                break;
                case 1 : 
                switch(S2694){
                  case 0 : 
                  if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__1302015734 = 0;
                                        tutu__1302015734 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2694=1;
active[38]=1;
                    ends[38]=1;
tdone[38]=1;
                    }
                  else {
                    switch(S2689){
                      case 0 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                tutu__467177378 = 0;
                                                tutu__467177378 = appliancePowerLightR3A10_o.get_w_s();
                                                tutu__467177378++;
                                                appliancePowerLightR3A10_o.set_w_s(tutu__467177378);
                                                appliancePowerLightR3A10_o.set_value(new Integer(power_thread_38));
                        S2689=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                    ends[38]=2;
                                                    ;
                          S2687=0;
active[38]=1;
                          ends[38]=1;
tdone[38]=1;
                          }
                        else {
                          active[38]=1;
                          ends[38]=1;
tdone[38]=1;
                          }
                        }
                      else {
                        active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[38]=2;
                                                ;
                        S2687=0;
active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      else {
                        active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2694=1;
S2694=0;
if(appliancePowerLightR3A10_o.get_preempted()){
                                        tutu__1302015734 = 0;
                                        tutu__1302015734 = appliancePowerLightR3A10_o.get_preempted() ? appliancePowerLightR3A10_o.refresh() : 0;
                    S2694=1;
active[38]=1;
                    ends[38]=1;
tdone[38]=1;
                    }
                  else {
                    S2689=0;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                            tutu__467177378 = 0;
                                            tutu__467177378 = appliancePowerLightR3A10_o.get_w_s();
                                            tutu__467177378++;
                                            appliancePowerLightR3A10_o.set_w_s(tutu__467177378);
                                            appliancePowerLightR3A10_o.set_value(new Integer(power_thread_38));
                      S2689=1;
if(appliancePowerLightR3A10_o.get_w_s() == appliancePowerLightR3A10_o.get_w_r()){
                                                ends[38]=2;
                                                ;
                        S2687=0;
active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      else {
                        active[38]=1;
                        ends[38]=1;
tdone[38]=1;
                        }
                      }
                    else {
                      active[38]=1;
                      ends[38]=1;
tdone[38]=1;
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
public void thread1245893828(int [] tdone, int [] ends){
          if(tdone[37] != 1){
            switch(S2685){
              case 0 : 
              active[37]=0;
              ends[37]=0;
tdone[37]=1;
              break;
              case 1 : 
                                                        e_thread_37 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_37 = 1;
                if(offSignal.getprestatus()){
                                    e_thread_37 = 1;
                  if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    d_thread_37 = 0;
                                        e_thread_37 = 0;
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  else {
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  }
                else {
                  if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    d_thread_37 = 0;
                                        e_thread_37 = 0;
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  else {
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    e_thread_37 = 1;
                  if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    d_thread_37 = 0;
                                        e_thread_37 = 0;
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  else {
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  }
                else {
                  if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    d_thread_37 = 0;
                                        e_thread_37 = 0;
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  else {
                    active[37]=1;
                    ends[37]=1;
tdone[37]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1233197114(int [] tdone, int [] ends){
          if(tdone[36] != 1){
            switch(S2635){
              case 0 : 
              active[36]=0;
              ends[36]=0;
tdone[36]=1;
              break;
              case 1 : 
                                                        c_thread_36 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_36 = 1;
                if(onSignal.getprestatus()){
                                    c_thread_36 = 1;
                  if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    b_thread_36 = 0;
                                        c_thread_36 = 0;
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  }
                else {
                  if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    b_thread_36 = 0;
                                        c_thread_36 = 0;
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    c_thread_36 = 1;
                  if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    b_thread_36 = 0;
                                        c_thread_36 = 0;
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  }
                else {
                  if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                        System.out.println("OK!");
                                        OKLightR3A10.setPresent();
                    currsigs.addElement(OKLightR3A10);
                    OKLightR3A10.setValue("R3A10: OK!");
                    System.out.println("Emitted OKLightR3A10");
                    b_thread_36 = 0;
                                        c_thread_36 = 0;
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  else {
                    active[36]=1;
                    ends[36]=1;
tdone[36]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1305145159(int [] tdone, int [] ends){
          if(tdone[35] != 1){
            switch(S2585){
              case 0 : 
              active[35]=0;
              ends[35]=0;
tdone[35]=1;
              break;
              case 1 : 
                                                        e_thread_35 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_35 = 1;
                if(onSignal.getprestatus()){
                                    e_thread_35 = 1;
                  if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                        System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                        switchOFFLightR3A10.setPresent();
                    currsigs.addElement(switchOFFLightR3A10);
                    switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR3A10");
                    d_thread_35 = 0;
                                        e_thread_35 = 0;
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  else {
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  }
                else {
                  if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                        System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                        switchOFFLightR3A10.setPresent();
                    currsigs.addElement(switchOFFLightR3A10);
                    switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR3A10");
                    d_thread_35 = 0;
                                        e_thread_35 = 0;
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  else {
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    e_thread_35 = 1;
                  if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                        System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                        switchOFFLightR3A10.setPresent();
                    currsigs.addElement(switchOFFLightR3A10);
                    switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR3A10");
                    d_thread_35 = 0;
                                        e_thread_35 = 0;
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  else {
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  }
                else {
                  if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                        System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                        switchOFFLightR3A10.setPresent();
                    currsigs.addElement(switchOFFLightR3A10);
                    switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR3A10");
                    d_thread_35 = 0;
                                        e_thread_35 = 0;
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  else {
                    active[35]=1;
                    ends[35]=1;
tdone[35]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1292448445(int [] tdone, int [] ends){
          if(tdone[34] != 1){
            switch(S2535){
              case 0 : 
              active[34]=0;
              ends[34]=0;
tdone[34]=1;
              break;
              case 1 : 
                                                        c_thread_34 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_34 = 1;
                if(offSignal.getprestatus()){
                                    c_thread_34 = 1;
                  if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                        System.out.println("Please switch ON the lightR3A10");
                                        switchONLightR3A10.setPresent();
                    currsigs.addElement(switchONLightR3A10);
                    switchONLightR3A10.setValue("R3A10: Switch ON Light");
                    System.out.println("Emitted switchONLightR3A10");
                    b_thread_34 = 0;
                                        c_thread_34 = 0;
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  else {
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  }
                else {
                  if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                        System.out.println("Please switch ON the lightR3A10");
                                        switchONLightR3A10.setPresent();
                    currsigs.addElement(switchONLightR3A10);
                    switchONLightR3A10.setValue("R3A10: Switch ON Light");
                    System.out.println("Emitted switchONLightR3A10");
                    b_thread_34 = 0;
                                        c_thread_34 = 0;
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  else {
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    c_thread_34 = 1;
                  if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                        System.out.println("Please switch ON the lightR3A10");
                                        switchONLightR3A10.setPresent();
                    currsigs.addElement(switchONLightR3A10);
                    switchONLightR3A10.setValue("R3A10: Switch ON Light");
                    System.out.println("Emitted switchONLightR3A10");
                    b_thread_34 = 0;
                                        c_thread_34 = 0;
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  else {
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  }
                else {
                  if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                        System.out.println("Please switch ON the lightR3A10");
                                        switchONLightR3A10.setPresent();
                    currsigs.addElement(switchONLightR3A10);
                    switchONLightR3A10.setValue("R3A10: Switch ON Light");
                    System.out.println("Emitted switchONLightR3A10");
                    b_thread_34 = 0;
                                        c_thread_34 = 0;
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  else {
                    active[34]=1;
                    ends[34]=1;
tdone[34]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1299758674(int [] tdone, int [] ends){
          if(tdone[33] != 1){
            switch(S2485){
              case 0 : 
              active[33]=0;
              ends[33]=0;
tdone[33]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Light ON signal received");
                                powerReceive_32.setPresent();
                currsigs.addElement(powerReceive_32);
                powerReceive_32.setValue(new Integer(15));
                System.out.println("Emitted powerReceive_32");
active[33]=1;
                ends[33]=1;
tdone[33]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Light OFF signal received");
                                    powerReceive_32.setPresent();
                  currsigs.addElement(powerReceive_32);
                  powerReceive_32.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_32");
active[33]=1;
                  ends[33]=1;
tdone[33]=1;
                  }
                else {
                  active[33]=1;
                  ends[33]=1;
tdone[33]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1297450181(int [] tdone, int [] ends){
          if(tdone[38] != 1){
            S2917=1;
S2687=0;
active[38]=1;
            ends[38]=1;
tdone[38]=1;
            }
          }
public void thread1284753467(int [] tdone, int [] ends){
          if(tdone[37] != 1){
            S2685=1;
                                    e_thread_37 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_37 = 1;
              if(offSignal.getprestatus()){
                                e_thread_37 = 1;
                if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  d_thread_37 = 0;
                                    e_thread_37 = 0;
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                else {
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                }
              else {
                if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  d_thread_37 = 0;
                                    e_thread_37 = 0;
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                else {
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                e_thread_37 = 1;
                if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  d_thread_37 = 0;
                                    e_thread_37 = 0;
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                else {
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                }
              else {
                if((d_thread_37 == 1) && (e_thread_37 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  d_thread_37 = 0;
                                    e_thread_37 = 0;
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                else {
                  active[37]=1;
                  ends[37]=1;
tdone[37]=1;
                  }
                }
              }
            }
          }
public void thread1372091467(int [] tdone, int [] ends){
          if(tdone[36] != 1){
            S2635=1;
                                    c_thread_36 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_36 = 1;
              if(onSignal.getprestatus()){
                                c_thread_36 = 1;
                if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  b_thread_36 = 0;
                                    c_thread_36 = 0;
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                else {
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                }
              else {
                if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  b_thread_36 = 0;
                                    c_thread_36 = 0;
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                else {
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                c_thread_36 = 1;
                if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  b_thread_36 = 0;
                                    c_thread_36 = 0;
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                else {
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                }
              else {
                if((b_thread_36 == 1) && (c_thread_36 == 1)){
                                    System.out.println("OK!");
                                    OKLightR3A10.setPresent();
                  currsigs.addElement(OKLightR3A10);
                  OKLightR3A10.setValue("R3A10: OK!");
                  System.out.println("Emitted OKLightR3A10");
                  b_thread_36 = 0;
                                    c_thread_36 = 0;
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                else {
                  active[36]=1;
                  ends[36]=1;
tdone[36]=1;
                  }
                }
              }
            }
          }
public void thread1359394754(int [] tdone, int [] ends){
          if(tdone[35] != 1){
            S2585=1;
                                    e_thread_35 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_35 = 1;
              if(onSignal.getprestatus()){
                                e_thread_35 = 1;
                if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                    System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                    switchOFFLightR3A10.setPresent();
                  currsigs.addElement(switchOFFLightR3A10);
                  switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR3A10");
                  d_thread_35 = 0;
                                    e_thread_35 = 0;
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                else {
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                }
              else {
                if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                    System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                    switchOFFLightR3A10.setPresent();
                  currsigs.addElement(switchOFFLightR3A10);
                  switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR3A10");
                  d_thread_35 = 0;
                                    e_thread_35 = 0;
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                else {
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                e_thread_35 = 1;
                if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                    System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                    switchOFFLightR3A10.setPresent();
                  currsigs.addElement(switchOFFLightR3A10);
                  switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR3A10");
                  d_thread_35 = 0;
                                    e_thread_35 = 0;
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                else {
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                }
              else {
                if((d_thread_35 == 1) && (e_thread_35 == 1)){
                                    System.out.println("Please switch OFF the lightR3A10 as no one is in the room");
                                    switchOFFLightR3A10.setPresent();
                  currsigs.addElement(switchOFFLightR3A10);
                  switchOFFLightR3A10.setValue("R3A10: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR3A10");
                  d_thread_35 = 0;
                                    e_thread_35 = 0;
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                else {
                  active[35]=1;
                  ends[35]=1;
tdone[35]=1;
                  }
                }
              }
            }
          }
public void thread1345159044(int [] tdone, int [] ends){
          if(tdone[34] != 1){
            S2535=1;
                                    c_thread_34 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_34 = 1;
              if(offSignal.getprestatus()){
                                c_thread_34 = 1;
                if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                    System.out.println("Please switch ON the lightR3A10");
                                    switchONLightR3A10.setPresent();
                  currsigs.addElement(switchONLightR3A10);
                  switchONLightR3A10.setValue("R3A10: Switch ON Light");
                  System.out.println("Emitted switchONLightR3A10");
                  b_thread_34 = 0;
                                    c_thread_34 = 0;
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                else {
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                }
              else {
                if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                    System.out.println("Please switch ON the lightR3A10");
                                    switchONLightR3A10.setPresent();
                  currsigs.addElement(switchONLightR3A10);
                  switchONLightR3A10.setValue("R3A10: Switch ON Light");
                  System.out.println("Emitted switchONLightR3A10");
                  b_thread_34 = 0;
                                    c_thread_34 = 0;
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                else {
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                c_thread_34 = 1;
                if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                    System.out.println("Please switch ON the lightR3A10");
                                    switchONLightR3A10.setPresent();
                  currsigs.addElement(switchONLightR3A10);
                  switchONLightR3A10.setValue("R3A10: Switch ON Light");
                  System.out.println("Emitted switchONLightR3A10");
                  b_thread_34 = 0;
                                    c_thread_34 = 0;
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                else {
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                }
              else {
                if((b_thread_34 == 1) && (c_thread_34 == 1)){
                                    System.out.println("Please switch ON the lightR3A10");
                                    switchONLightR3A10.setPresent();
                  currsigs.addElement(switchONLightR3A10);
                  switchONLightR3A10.setValue("R3A10: Switch ON Light");
                  System.out.println("Emitted switchONLightR3A10");
                  b_thread_34 = 0;
                                    c_thread_34 = 0;
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                else {
                  active[34]=1;
                  ends[34]=1;
tdone[34]=1;
                  }
                }
              }
            }
          }
public void thread1326306348(int [] tdone, int [] ends){
          if(tdone[33] != 1){
            S2485=1;
if(onSignal.getprestatus()){
                            System.out.println("Light ON signal received");
                            powerReceive_32.setPresent();
              currsigs.addElement(powerReceive_32);
              powerReceive_32.setValue(new Integer(15));
              System.out.println("Emitted powerReceive_32");
active[33]=1;
              ends[33]=1;
tdone[33]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Light OFF signal received");
                                powerReceive_32.setPresent();
                currsigs.addElement(powerReceive_32);
                powerReceive_32.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_32");
active[33]=1;
                ends[33]=1;
tdone[33]=1;
                }
              else {
                active[33]=1;
                ends[33]=1;
tdone[33]=1;
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
				switch(S2919){
          case 0 : 
          S2919=0;
          break RUN;
                    case 1 : 
          S2919=2;
          powerReceive_32.setClear();
          thread1326306348(tdone,ends);
          thread1345159044(tdone,ends);
          thread1359394754(tdone,ends);
          thread1372091467(tdone,ends);
          thread1284753467(tdone,ends);
          thread1297450181(tdone,ends);
          int biggest1299373925 = 0;
          if(ends[33]>=biggest1299373925){
            biggest1299373925=ends[33];
}
          if(ends[34]>=biggest1299373925){
            biggest1299373925=ends[34];
}
          if(ends[35]>=biggest1299373925){
            biggest1299373925=ends[35];
}
          if(ends[36]>=biggest1299373925){
            biggest1299373925=ends[36];
}
          if(ends[37]>=biggest1299373925){
            biggest1299373925=ends[37];
}
          if(ends[38]>=biggest1299373925){
            biggest1299373925=ends[38];
}
          if(biggest1299373925 == 1){
            active[32]=1;
            ends[32]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_32.setClear();
          thread1299758674(tdone,ends);
          thread1292448445(tdone,ends);
          thread1305145159(tdone,ends);
          thread1233197114(tdone,ends);
          thread1245893828(tdone,ends);
          thread1257051546(tdone,ends);
          int biggest1257436295 = 0;
          if(ends[33]>=biggest1257436295){
            biggest1257436295=ends[33];
}
          if(ends[34]>=biggest1257436295){
            biggest1257436295=ends[34];
}
          if(ends[35]>=biggest1257436295){
            biggest1257436295=ends[35];
}
          if(ends[36]>=biggest1257436295){
            biggest1257436295=ends[36];
}
          if(ends[37]>=biggest1257436295){
            biggest1257436295=ends[37];
}
          if(ends[38]>=biggest1257436295){
            biggest1257436295=ends[38];
}
          if(biggest1257436295 == 1){
            active[32]=1;
            ends[32]=1;
            break RUN;
            }
          //FINXME code
if(biggest1257436295 == 0){
            S2919=0;
active[32]=0;
            ends[32]=0;
S2919=0;
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
		powerReceive_32 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[32] != 0){
		int index = 32;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[32]!=0 || suspended[32]!=0 || active[32]!=1);
			else{
				appliancePowerLightR3A10_o.update_w_r();
				if(!df){
					appliancePowerLightR3A10_o.gethook();
					onSignal.gethook();
					offSignal.gethook();
					humanPresenceSignal.gethook();
					humanAbsenceSignal.gethook();
					df = true;
				}
				runClockDomain();
			}
			onSignal.setpreclear();
			offSignal.setpreclear();
			humanPresenceSignal.setpreclear();
			humanAbsenceSignal.setpreclear();
			switchOFFLightR3A10.setpreclear();
			switchONLightR3A10.setpreclear();
			OKLightR3A10.setpreclear();
			powerReceive_32.setpreclear();
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
			dummyint = humanPresenceSignal.getStatus() ? humanPresenceSignal.setprepresent() : humanPresenceSignal.setpreclear();
			humanPresenceSignal.setpreval(humanPresenceSignal.getValue());
			humanPresenceSignal.setClear();
			dummyint = humanAbsenceSignal.getStatus() ? humanAbsenceSignal.setprepresent() : humanAbsenceSignal.setpreclear();
			humanAbsenceSignal.setpreval(humanAbsenceSignal.getValue());
			humanAbsenceSignal.setClear();
			switchOFFLightR3A10.sethook();
			switchOFFLightR3A10.setClear();
			switchONLightR3A10.sethook();
			switchONLightR3A10.setClear();
			OKLightR3A10.sethook();
			OKLightR3A10.setClear();
			powerReceive_32.setClear();
			appliancePowerLightR3A10_o.sethook();
			if(paused[32]!=0 || suspended[32]!=0 || active[32]!=1);
			else{
				appliancePowerLightR3A10_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
				humanPresenceSignal.gethook();
				humanAbsenceSignal.gethook();
			}
			if(active[32] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
