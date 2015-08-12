import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class HeaterR3A9 extends ClockDomain{
	public HeaterR3A9(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public Signal humanPresenceSignal = new Signal();
	public Signal humanAbsenceSignal = new Signal();
	public Signal switchOFFHeaterR3A9 = new Signal();
	public Signal OKHeaterR3A9 = new Signal();
	public output_Channel appliancePowerHeaterR3A9_o = new output_Channel();
	private Signal powerReceive_25;
	private int b_thread_27;
	private int c_thread_27;
	private int d_thread_28;
	private int e_thread_28;
	private int b_thread_29;
	private int c_thread_29;
	private int d_thread_30;
	private int e_thread_30;
	private int power_thread_31;
	private int tutu__539125423;
	private int tutu__25235171;
	private int tutu__538740674;
	private int tutu__1130249405;
	private int S2467 = 1;
	private int S2033 = 1;
	private int S2083 = 1;
	private int S2133 = 1;
	private int S2183 = 1;
	private int S2233 = 1;
	private int S2465 = 1;
	private int S2235 = 1;
	private int S2242 = 1;
	private int S2237 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1325536850(int [] tdone, int [] ends){
          if(tdone[31] != 1){
            switch(S2465){
              case 0 : 
              active[31]=0;
              ends[31]=0;
tdone[31]=1;
              break;
              case 1 : 
              switch(S2235){
                case 0 : 
                if(powerReceive_25.getprestatus()){
                                                                        power_thread_31 = powerReceive_25.getpreval() != null ? ((Integer)(powerReceive_25.getpreval())).intValue() : 0;
                  S2235=1;
S2242=0;
if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__25235171 = 0;
                                        tutu__25235171 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2242=1;
active[31]=1;
                    ends[31]=1;
tdone[31]=1;
                    }
                  else {
                    S2237=0;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                            tutu__539125423 = 0;
                                            tutu__539125423 = appliancePowerHeaterR3A9_o.get_w_s();
                                            tutu__539125423++;
                                            appliancePowerHeaterR3A9_o.set_w_s(tutu__539125423);
                                            appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_31));
                      S2237=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[31]=2;
                                                ;
                        S2235=0;
active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      else {
                        active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      }
                    else {
                      active[31]=1;
                      ends[31]=1;
tdone[31]=1;
                      }
                    }
                  }
                else {
                  active[31]=1;
                  ends[31]=1;
tdone[31]=1;
                  }
                break;
                case 1 : 
                switch(S2242){
                  case 0 : 
                  if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__1130249405 = 0;
                                        tutu__1130249405 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2242=1;
active[31]=1;
                    ends[31]=1;
tdone[31]=1;
                    }
                  else {
                    switch(S2237){
                      case 0 : 
                      if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                tutu__538740674 = 0;
                                                tutu__538740674 = appliancePowerHeaterR3A9_o.get_w_s();
                                                tutu__538740674++;
                                                appliancePowerHeaterR3A9_o.set_w_s(tutu__538740674);
                                                appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_31));
                        S2237=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                    ends[31]=2;
                                                    ;
                          S2235=0;
active[31]=1;
                          ends[31]=1;
tdone[31]=1;
                          }
                        else {
                          active[31]=1;
                          ends[31]=1;
tdone[31]=1;
                          }
                        }
                      else {
                        active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[31]=2;
                                                ;
                        S2235=0;
active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      else {
                        active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S2242=1;
S2242=0;
if(appliancePowerHeaterR3A9_o.get_preempted()){
                                        tutu__1130249405 = 0;
                                        tutu__1130249405 = appliancePowerHeaterR3A9_o.get_preempted() ? appliancePowerHeaterR3A9_o.refresh() : 0;
                    S2242=1;
active[31]=1;
                    ends[31]=1;
tdone[31]=1;
                    }
                  else {
                    S2237=0;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                            tutu__538740674 = 0;
                                            tutu__538740674 = appliancePowerHeaterR3A9_o.get_w_s();
                                            tutu__538740674++;
                                            appliancePowerHeaterR3A9_o.set_w_s(tutu__538740674);
                                            appliancePowerHeaterR3A9_o.set_value(new Integer(power_thread_31));
                      S2237=1;
if(appliancePowerHeaterR3A9_o.get_w_s() == appliancePowerHeaterR3A9_o.get_w_r()){
                                                ends[31]=2;
                                                ;
                        S2235=0;
active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      else {
                        active[31]=1;
                        ends[31]=1;
tdone[31]=1;
                        }
                      }
                    else {
                      active[31]=1;
                      ends[31]=1;
tdone[31]=1;
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
public void thread1411335855(int [] tdone, int [] ends){
          if(tdone[30] != 1){
            switch(S2233){
              case 0 : 
              active[30]=0;
              ends[30]=0;
tdone[30]=1;
              break;
              case 1 : 
                                                        e_thread_30 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_30 = 1;
                if(offSignal.getprestatus()){
                                    e_thread_30 = 1;
                  if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    d_thread_30 = 0;
                                        e_thread_30 = 0;
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  }
                else {
                  if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    d_thread_30 = 0;
                                        e_thread_30 = 0;
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    e_thread_30 = 1;
                  if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    d_thread_30 = 0;
                                        e_thread_30 = 0;
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  }
                else {
                  if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    d_thread_30 = 0;
                                        e_thread_30 = 0;
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  else {
                    active[30]=1;
                    ends[30]=1;
tdone[30]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1400178137(int [] tdone, int [] ends){
          if(tdone[29] != 1){
            switch(S2183){
              case 0 : 
              active[29]=0;
              ends[29]=0;
tdone[29]=1;
              break;
              case 1 : 
                                                        c_thread_29 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_29 = 1;
                if(onSignal.getprestatus()){
                                    c_thread_29 = 1;
                  if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_29 = 0;
                                        c_thread_29 = 0;
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  else {
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  }
                else {
                  if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_29 = 0;
                                        c_thread_29 = 0;
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  else {
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    c_thread_29 = 1;
                  if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_29 = 0;
                                        c_thread_29 = 0;
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  else {
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  }
                else {
                  if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_29 = 0;
                                        c_thread_29 = 0;
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  else {
                    active[29]=1;
                    ends[29]=1;
tdone[29]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1390559415(int [] tdone, int [] ends){
          if(tdone[28] != 1){
            switch(S2133){
              case 0 : 
              active[28]=0;
              ends[28]=0;
tdone[28]=1;
              break;
              case 1 : 
                                                        e_thread_28 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_28 = 1;
                if(onSignal.getprestatus()){
                                    e_thread_28 = 1;
                  if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                        System.out.println("Please switch OFF the heater R3A9");
                                        switchOFFHeaterR3A9.setPresent();
                    currsigs.addElement(switchOFFHeaterR3A9);
                    switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                    System.out.println("Emitted switchOFFHeaterR3A9");
                    d_thread_28 = 0;
                                        e_thread_28 = 0;
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  else {
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  }
                else {
                  if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                        System.out.println("Please switch OFF the heater R3A9");
                                        switchOFFHeaterR3A9.setPresent();
                    currsigs.addElement(switchOFFHeaterR3A9);
                    switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                    System.out.println("Emitted switchOFFHeaterR3A9");
                    d_thread_28 = 0;
                                        e_thread_28 = 0;
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  else {
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    e_thread_28 = 1;
                  if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                        System.out.println("Please switch OFF the heater R3A9");
                                        switchOFFHeaterR3A9.setPresent();
                    currsigs.addElement(switchOFFHeaterR3A9);
                    switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                    System.out.println("Emitted switchOFFHeaterR3A9");
                    d_thread_28 = 0;
                                        e_thread_28 = 0;
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  else {
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  }
                else {
                  if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                        System.out.println("Please switch OFF the heater R3A9");
                                        switchOFFHeaterR3A9.setPresent();
                    currsigs.addElement(switchOFFHeaterR3A9);
                    switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                    System.out.println("Emitted switchOFFHeaterR3A9");
                    d_thread_28 = 0;
                                        e_thread_28 = 0;
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  else {
                    active[28]=1;
                    ends[28]=1;
tdone[28]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1379401696(int [] tdone, int [] ends){
          if(tdone[27] != 1){
            switch(S2083){
              case 0 : 
              active[27]=0;
              ends[27]=0;
tdone[27]=1;
              break;
              case 1 : 
                                                        c_thread_27 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_27 = 1;
                if(offSignal.getprestatus()){
                                    c_thread_27 = 1;
                  if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_27 = 0;
                                        c_thread_27 = 0;
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  }
                else {
                  if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_27 = 0;
                                        c_thread_27 = 0;
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    c_thread_27 = 1;
                  if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_27 = 0;
                                        c_thread_27 = 0;
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  }
                else {
                  if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                        System.out.println("OK!");
                                        OKHeaterR3A9.setPresent();
                    currsigs.addElement(OKHeaterR3A9);
                    OKHeaterR3A9.setValue("R3A9: OK!");
                    System.out.println("Emitted OKHeaterR3A9");
                    b_thread_27 = 0;
                                        c_thread_27 = 0;
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  else {
                    active[27]=1;
                    ends[27]=1;
tdone[27]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1385942428(int [] tdone, int [] ends){
          if(tdone[26] != 1){
            switch(S2033){
              case 0 : 
              active[26]=0;
              ends[26]=0;
tdone[26]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Heater ON signal received");
                                powerReceive_25.setPresent();
                currsigs.addElement(powerReceive_25);
                powerReceive_25.setValue(new Integer(1500));
                System.out.println("Emitted powerReceive_25");
active[26]=1;
                ends[26]=1;
tdone[26]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Heater OFF signal received");
                                    powerReceive_25.setPresent();
                  currsigs.addElement(powerReceive_25);
                  powerReceive_25.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_25");
active[26]=1;
                  ends[26]=1;
tdone[26]=1;
                  }
                else {
                  active[26]=1;
                  ends[26]=1;
tdone[26]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1383633934(int [] tdone, int [] ends){
          if(tdone[31] != 1){
            S2465=1;
S2235=0;
active[31]=1;
            ends[31]=1;
tdone[31]=1;
            }
          }
public void thread1076989061(int [] tdone, int [] ends){
          if(tdone[30] != 1){
            S2233=1;
                                    e_thread_30 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_30 = 1;
              if(offSignal.getprestatus()){
                                e_thread_30 = 1;
                if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  d_thread_30 = 0;
                                    e_thread_30 = 0;
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                else {
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                }
              else {
                if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  d_thread_30 = 0;
                                    e_thread_30 = 0;
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                else {
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                e_thread_30 = 1;
                if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  d_thread_30 = 0;
                                    e_thread_30 = 0;
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                else {
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                }
              else {
                if((d_thread_30 == 1) && (e_thread_30 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  d_thread_30 = 0;
                                    e_thread_30 = 0;
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                else {
                  active[30]=1;
                  ends[30]=1;
tdone[30]=1;
                  }
                }
              }
            }
          }
public void thread1055058374(int [] tdone, int [] ends){
          if(tdone[29] != 1){
            S2183=1;
                                    c_thread_29 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_29 = 1;
              if(onSignal.getprestatus()){
                                c_thread_29 = 1;
                if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_29 = 0;
                                    c_thread_29 = 0;
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                else {
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                }
              else {
                if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_29 = 0;
                                    c_thread_29 = 0;
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                else {
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                c_thread_29 = 1;
                if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_29 = 0;
                                    c_thread_29 = 0;
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                else {
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                }
              else {
                if((b_thread_29 == 1) && (c_thread_29 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_29 = 0;
                                    c_thread_29 = 0;
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                else {
                  active[29]=1;
                  ends[29]=1;
tdone[29]=1;
                  }
                }
              }
            }
          }
public void thread1043900656(int [] tdone, int [] ends){
          if(tdone[28] != 1){
            S2133=1;
                                    e_thread_28 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_28 = 1;
              if(onSignal.getprestatus()){
                                e_thread_28 = 1;
                if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                    System.out.println("Please switch OFF the heater R3A9");
                                    switchOFFHeaterR3A9.setPresent();
                  currsigs.addElement(switchOFFHeaterR3A9);
                  switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                  System.out.println("Emitted switchOFFHeaterR3A9");
                  d_thread_28 = 0;
                                    e_thread_28 = 0;
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                else {
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                }
              else {
                if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                    System.out.println("Please switch OFF the heater R3A9");
                                    switchOFFHeaterR3A9.setPresent();
                  currsigs.addElement(switchOFFHeaterR3A9);
                  switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                  System.out.println("Emitted switchOFFHeaterR3A9");
                  d_thread_28 = 0;
                                    e_thread_28 = 0;
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                else {
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                e_thread_28 = 1;
                if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                    System.out.println("Please switch OFF the heater R3A9");
                                    switchOFFHeaterR3A9.setPresent();
                  currsigs.addElement(switchOFFHeaterR3A9);
                  switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                  System.out.println("Emitted switchOFFHeaterR3A9");
                  d_thread_28 = 0;
                                    e_thread_28 = 0;
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                else {
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                }
              else {
                if((d_thread_28 == 1) && (e_thread_28 == 1)){
                                    System.out.println("Please switch OFF the heater R3A9");
                                    switchOFFHeaterR3A9.setPresent();
                  currsigs.addElement(switchOFFHeaterR3A9);
                  switchOFFHeaterR3A9.setValue("R3A9: Switch OFF Heater");
                  System.out.println("Emitted switchOFFHeaterR3A9");
                  d_thread_28 = 0;
                                    e_thread_28 = 0;
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                else {
                  active[28]=1;
                  ends[28]=1;
tdone[28]=1;
                  }
                }
              }
            }
          }
public void thread1031203942(int [] tdone, int [] ends){
          if(tdone[27] != 1){
            S2083=1;
                                    c_thread_27 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_27 = 1;
              if(offSignal.getprestatus()){
                                c_thread_27 = 1;
                if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_27 = 0;
                                    c_thread_27 = 0;
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                else {
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                }
              else {
                if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_27 = 0;
                                    c_thread_27 = 0;
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                else {
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                c_thread_27 = 1;
                if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_27 = 0;
                                    c_thread_27 = 0;
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                else {
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                }
              else {
                if((b_thread_27 == 1) && (c_thread_27 == 1)){
                                    System.out.println("OK!");
                                    OKHeaterR3A9.setPresent();
                  currsigs.addElement(OKHeaterR3A9);
                  OKHeaterR3A9.setValue("R3A9: OK!");
                  System.out.println("Emitted OKHeaterR3A9");
                  b_thread_27 = 0;
                                    c_thread_27 = 0;
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                else {
                  active[27]=1;
                  ends[27]=1;
tdone[27]=1;
                  }
                }
              }
            }
          }
public void thread1039283669(int [] tdone, int [] ends){
          if(tdone[26] != 1){
            S2033=1;
if(onSignal.getprestatus()){
                            System.out.println("Heater ON signal received");
                            powerReceive_25.setPresent();
              currsigs.addElement(powerReceive_25);
              powerReceive_25.setValue(new Integer(1500));
              System.out.println("Emitted powerReceive_25");
active[26]=1;
              ends[26]=1;
tdone[26]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Heater OFF signal received");
                                powerReceive_25.setPresent();
                currsigs.addElement(powerReceive_25);
                powerReceive_25.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_25");
active[26]=1;
                ends[26]=1;
tdone[26]=1;
                }
              else {
                active[26]=1;
                ends[26]=1;
tdone[26]=1;
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
				switch(S2467){
          case 0 : 
          S2467=0;
          break RUN;
                    case 1 : 
          S2467=2;
          powerReceive_25.setClear();
          thread1039283669(tdone,ends);
          thread1031203942(tdone,ends);
          thread1043900656(tdone,ends);
          thread1055058374(tdone,ends);
          thread1076989061(tdone,ends);
          thread1383633934(tdone,ends);
          int biggest1385557679 = 0;
          if(ends[26]>=biggest1385557679){
            biggest1385557679=ends[26];
}
          if(ends[27]>=biggest1385557679){
            biggest1385557679=ends[27];
}
          if(ends[28]>=biggest1385557679){
            biggest1385557679=ends[28];
}
          if(ends[29]>=biggest1385557679){
            biggest1385557679=ends[29];
}
          if(ends[30]>=biggest1385557679){
            biggest1385557679=ends[30];
}
          if(ends[31]>=biggest1385557679){
            biggest1385557679=ends[31];
}
          if(biggest1385557679 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_25.setClear();
          thread1385942428(tdone,ends);
          thread1379401696(tdone,ends);
          thread1390559415(tdone,ends);
          thread1400178137(tdone,ends);
          thread1411335855(tdone,ends);
          thread1325536850(tdone,ends);
          int biggest1325921599 = 0;
          if(ends[26]>=biggest1325921599){
            biggest1325921599=ends[26];
}
          if(ends[27]>=biggest1325921599){
            biggest1325921599=ends[27];
}
          if(ends[28]>=biggest1325921599){
            biggest1325921599=ends[28];
}
          if(ends[29]>=biggest1325921599){
            biggest1325921599=ends[29];
}
          if(ends[30]>=biggest1325921599){
            biggest1325921599=ends[30];
}
          if(ends[31]>=biggest1325921599){
            biggest1325921599=ends[31];
}
          if(biggest1325921599 == 1){
            active[25]=1;
            ends[25]=1;
            break RUN;
            }
          //FINXME code
if(biggest1325921599 == 0){
            S2467=0;
active[25]=0;
            ends[25]=0;
S2467=0;
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
		powerReceive_25 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[25] != 0){
		int index = 25;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
			else{
				appliancePowerHeaterR3A9_o.update_w_r();
				if(!df){
					appliancePowerHeaterR3A9_o.gethook();
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
			switchOFFHeaterR3A9.setpreclear();
			OKHeaterR3A9.setpreclear();
			powerReceive_25.setpreclear();
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
			switchOFFHeaterR3A9.sethook();
			switchOFFHeaterR3A9.setClear();
			OKHeaterR3A9.sethook();
			OKHeaterR3A9.setClear();
			powerReceive_25.setClear();
			appliancePowerHeaterR3A9_o.sethook();
			if(paused[25]!=0 || suspended[25]!=0 || active[25]!=1);
			else{
				appliancePowerHeaterR3A9_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
				humanPresenceSignal.gethook();
				humanAbsenceSignal.gethook();
			}
			if(active[25] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
