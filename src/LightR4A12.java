import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class LightR4A12 extends ClockDomain{
	public LightR4A12(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal onSignal = new Signal();
	public Signal offSignal = new Signal();
	public Signal humanPresenceSignal = new Signal();
	public Signal humanAbsenceSignal = new Signal();
	public Signal switchOFFLightR4A12 = new Signal();
	public Signal switchONLightR4A12 = new Signal();
	public Signal OKLightR4A12 = new Signal();
	public output_Channel appliancePowerLightR4A12_o = new output_Channel();
	private Signal powerReceive_42;
	private int b_thread_44;
	private int c_thread_44;
	private int d_thread_45;
	private int e_thread_45;
	private int b_thread_46;
	private int c_thread_46;
	private int d_thread_47;
	private int e_thread_47;
	private int power_thread_48;
	private int tutu__491416559;
	private int tutu__1520931480;
	private int tutu__491031810;
	private int tutu__1618551240;
	private int S3623 = 1;
	private int S3189 = 1;
	private int S3239 = 1;
	private int S3289 = 1;
	private int S3339 = 1;
	private int S3389 = 1;
	private int S3621 = 1;
	private int S3391 = 1;
	private int S3398 = 1;
	private int S3393 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread1482514402(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            switch(S3621){
              case 0 : 
              active[48]=0;
              ends[48]=0;
tdone[48]=1;
              break;
              case 1 : 
              switch(S3391){
                case 0 : 
                if(powerReceive_42.getprestatus()){
                                                                        power_thread_48 = powerReceive_42.getpreval() != null ? ((Integer)(powerReceive_42.getpreval())).intValue() : 0;
                  S3391=1;
S3398=0;
if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__1520931480 = 0;
                                        tutu__1520931480 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S3398=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    S3393=0;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                            tutu__491416559 = 0;
                                            tutu__491416559 = appliancePowerLightR4A12_o.get_w_s();
                                            tutu__491416559++;
                                            appliancePowerLightR4A12_o.set_w_s(tutu__491416559);
                                            appliancePowerLightR4A12_o.set_value(new Integer(power_thread_48));
                      S3393=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[48]=2;
                                                ;
                        S3391=0;
active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      else {
                        active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      }
                    else {
                      active[48]=1;
                      ends[48]=1;
tdone[48]=1;
                      }
                    }
                  }
                else {
                  active[48]=1;
                  ends[48]=1;
tdone[48]=1;
                  }
                break;
                case 1 : 
                switch(S3398){
                  case 0 : 
                  if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__1618551240 = 0;
                                        tutu__1618551240 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S3398=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    switch(S3393){
                      case 0 : 
                      if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                tutu__491031810 = 0;
                                                tutu__491031810 = appliancePowerLightR4A12_o.get_w_s();
                                                tutu__491031810++;
                                                appliancePowerLightR4A12_o.set_w_s(tutu__491031810);
                                                appliancePowerLightR4A12_o.set_value(new Integer(power_thread_48));
                        S3393=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                    ends[48]=2;
                                                    ;
                          S3391=0;
active[48]=1;
                          ends[48]=1;
tdone[48]=1;
                          }
                        else {
                          active[48]=1;
                          ends[48]=1;
tdone[48]=1;
                          }
                        }
                      else {
                        active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      break;
                      case 1 : 
                      if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[48]=2;
                                                ;
                        S3391=0;
active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      else {
                        active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      break;
                      }
                    }
                  break;
                  case 1 : 
                  S3398=1;
S3398=0;
if(appliancePowerLightR4A12_o.get_preempted()){
                                        tutu__1618551240 = 0;
                                        tutu__1618551240 = appliancePowerLightR4A12_o.get_preempted() ? appliancePowerLightR4A12_o.refresh() : 0;
                    S3398=1;
active[48]=1;
                    ends[48]=1;
tdone[48]=1;
                    }
                  else {
                    S3393=0;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                            tutu__491031810 = 0;
                                            tutu__491031810 = appliancePowerLightR4A12_o.get_w_s();
                                            tutu__491031810++;
                                            appliancePowerLightR4A12_o.set_w_s(tutu__491031810);
                                            appliancePowerLightR4A12_o.set_value(new Integer(power_thread_48));
                      S3393=1;
if(appliancePowerLightR4A12_o.get_w_s() == appliancePowerLightR4A12_o.get_w_r()){
                                                ends[48]=2;
                                                ;
                        S3391=0;
active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      else {
                        active[48]=1;
                        ends[48]=1;
tdone[48]=1;
                        }
                      }
                    else {
                      active[48]=1;
                      ends[48]=1;
tdone[48]=1;
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
public void thread1566774411(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            switch(S3389){
              case 0 : 
              active[47]=0;
              ends[47]=0;
tdone[47]=1;
              break;
              case 1 : 
                                                        e_thread_47 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_47 = 1;
                if(offSignal.getprestatus()){
                                    e_thread_47 = 1;
                  if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    d_thread_47 = 0;
                                        e_thread_47 = 0;
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  }
                else {
                  if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    d_thread_47 = 0;
                                        e_thread_47 = 0;
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    e_thread_47 = 1;
                  if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    d_thread_47 = 0;
                                        e_thread_47 = 0;
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  }
                else {
                  if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    d_thread_47 = 0;
                                        e_thread_47 = 0;
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  else {
                    active[47]=1;
                    ends[47]=1;
tdone[47]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1554077697(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            switch(S3339){
              case 0 : 
              active[46]=0;
              ends[46]=0;
tdone[46]=1;
              break;
              case 1 : 
                                                        c_thread_46 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_46 = 1;
                if(onSignal.getprestatus()){
                                    c_thread_46 = 1;
                  if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    b_thread_46 = 0;
                                        c_thread_46 = 0;
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  }
                else {
                  if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    b_thread_46 = 0;
                                        c_thread_46 = 0;
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    c_thread_46 = 1;
                  if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    b_thread_46 = 0;
                                        c_thread_46 = 0;
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  }
                else {
                  if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                        System.out.println("OK!");
                                        OKLightR4A12.setPresent();
                    currsigs.addElement(OKLightR4A12);
                    OKLightR4A12.setValue("R4A12: OK!");
                    System.out.println("Emitted OKLightR4A12");
                    b_thread_46 = 0;
                                        c_thread_46 = 0;
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  else {
                    active[46]=1;
                    ends[46]=1;
tdone[46]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1542919979(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            switch(S3289){
              case 0 : 
              active[45]=0;
              ends[45]=0;
tdone[45]=1;
              break;
              case 1 : 
                                                        e_thread_45 = 0;
              if(humanAbsenceSignal.getprestatus()){
                                d_thread_45 = 1;
                if(onSignal.getprestatus()){
                                    e_thread_45 = 1;
                  if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                        System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                        switchOFFLightR4A12.setPresent();
                    currsigs.addElement(switchOFFLightR4A12);
                    switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR4A12");
                    d_thread_45 = 0;
                                        e_thread_45 = 0;
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  }
                else {
                  if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                        System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                        switchOFFLightR4A12.setPresent();
                    currsigs.addElement(switchOFFLightR4A12);
                    switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR4A12");
                    d_thread_45 = 0;
                                        e_thread_45 = 0;
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  }
                }
              else {
                if(onSignal.getprestatus()){
                                    e_thread_45 = 1;
                  if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                        System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                        switchOFFLightR4A12.setPresent();
                    currsigs.addElement(switchOFFLightR4A12);
                    switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR4A12");
                    d_thread_45 = 0;
                                        e_thread_45 = 0;
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  }
                else {
                  if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                        System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                        switchOFFLightR4A12.setPresent();
                    currsigs.addElement(switchOFFLightR4A12);
                    switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                    System.out.println("Emitted switchOFFLightR4A12");
                    d_thread_45 = 0;
                                        e_thread_45 = 0;
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  else {
                    active[45]=1;
                    ends[45]=1;
tdone[45]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1530223265(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            switch(S3239){
              case 0 : 
              active[44]=0;
              ends[44]=0;
tdone[44]=1;
              break;
              case 1 : 
                                                        c_thread_44 = 0;
              if(humanPresenceSignal.getprestatus()){
                                b_thread_44 = 1;
                if(offSignal.getprestatus()){
                                    c_thread_44 = 1;
                  if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                        System.out.println("Please switch ON the lightR4A12");
                                        switchONLightR4A12.setPresent();
                    currsigs.addElement(switchONLightR4A12);
                    switchONLightR4A12.setValue("R4A12: Switch ON Light");
                    System.out.println("Emitted switchONLightR4A12");
                    b_thread_44 = 0;
                                        c_thread_44 = 0;
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  }
                else {
                  if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                        System.out.println("Please switch ON the lightR4A12");
                                        switchONLightR4A12.setPresent();
                    currsigs.addElement(switchONLightR4A12);
                    switchONLightR4A12.setValue("R4A12: Switch ON Light");
                    System.out.println("Emitted switchONLightR4A12");
                    b_thread_44 = 0;
                                        c_thread_44 = 0;
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  }
                }
              else {
                if(offSignal.getprestatus()){
                                    c_thread_44 = 1;
                  if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                        System.out.println("Please switch ON the lightR4A12");
                                        switchONLightR4A12.setPresent();
                    currsigs.addElement(switchONLightR4A12);
                    switchONLightR4A12.setValue("R4A12: Switch ON Light");
                    System.out.println("Emitted switchONLightR4A12");
                    b_thread_44 = 0;
                                        c_thread_44 = 0;
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  }
                else {
                  if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                        System.out.println("Please switch ON the lightR4A12");
                                        switchONLightR4A12.setPresent();
                    currsigs.addElement(switchONLightR4A12);
                    switchONLightR4A12.setValue("R4A12: Switch ON Light");
                    System.out.println("Emitted switchONLightR4A12");
                    b_thread_44 = 0;
                                        c_thread_44 = 0;
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  else {
                    active[44]=1;
                    ends[44]=1;
tdone[44]=1;
                    }
                  }
                }
              break;
              }
            }
          }
public void thread1608327292(int [] tdone, int [] ends){
          if(tdone[43] != 1){
            switch(S3189){
              case 0 : 
              active[43]=0;
              ends[43]=0;
tdone[43]=1;
              break;
              case 1 : 
              if(onSignal.getprestatus()){
                                System.out.println("Light ON signal received");
                                powerReceive_42.setPresent();
                currsigs.addElement(powerReceive_42);
                powerReceive_42.setValue(new Integer(60));
                System.out.println("Emitted powerReceive_42");
active[43]=1;
                ends[43]=1;
tdone[43]=1;
                }
              else {
                if(offSignal.getprestatus()){
                                    System.out.println("Light OFF signal received");
                                    powerReceive_42.setPresent();
                  currsigs.addElement(powerReceive_42);
                  powerReceive_42.setValue(new Integer(0));
                  System.out.println("Emitted powerReceive_42");
active[43]=1;
                  ends[43]=1;
tdone[43]=1;
                  }
                else {
                  active[43]=1;
                  ends[43]=1;
tdone[43]=1;
                  }
                }
              break;
              }
            }
          }
public void thread1609096790(int [] tdone, int [] ends){
          if(tdone[48] != 1){
            S3621=1;
S3391=0;
active[48]=1;
            ends[48]=1;
tdone[48]=1;
            }
          }
public void thread1596400076(int [] tdone, int [] ends){
          if(tdone[47] != 1){
            S3389=1;
                                    e_thread_47 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_47 = 1;
              if(offSignal.getprestatus()){
                                e_thread_47 = 1;
                if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  d_thread_47 = 0;
                                    e_thread_47 = 0;
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                }
              else {
                if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  d_thread_47 = 0;
                                    e_thread_47 = 0;
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                e_thread_47 = 1;
                if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  d_thread_47 = 0;
                                    e_thread_47 = 0;
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                }
              else {
                if((d_thread_47 == 1) && (e_thread_47 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  d_thread_47 = 0;
                                    e_thread_47 = 0;
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                else {
                  active[47]=1;
                  ends[47]=1;
tdone[47]=1;
                  }
                }
              }
            }
          }
public void thread1594476332(int [] tdone, int [] ends){
          if(tdone[46] != 1){
            S3339=1;
                                    c_thread_46 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_46 = 1;
              if(onSignal.getprestatus()){
                                c_thread_46 = 1;
                if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  b_thread_46 = 0;
                                    c_thread_46 = 0;
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                }
              else {
                if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  b_thread_46 = 0;
                                    c_thread_46 = 0;
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                c_thread_46 = 1;
                if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  b_thread_46 = 0;
                                    c_thread_46 = 0;
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                }
              else {
                if((b_thread_46 == 1) && (c_thread_46 == 1)){
                                    System.out.println("OK!");
                                    OKLightR4A12.setPresent();
                  currsigs.addElement(OKLightR4A12);
                  OKLightR4A12.setValue("R4A12: OK!");
                  System.out.println("Emitted OKLightR4A12");
                  b_thread_46 = 0;
                                    c_thread_46 = 0;
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                else {
                  active[46]=1;
                  ends[46]=1;
tdone[46]=1;
                  }
                }
              }
            }
          }
public void thread1581779618(int [] tdone, int [] ends){
          if(tdone[45] != 1){
            S3289=1;
                                    e_thread_45 = 0;
            if(humanAbsenceSignal.getprestatus()){
                            d_thread_45 = 1;
              if(onSignal.getprestatus()){
                                e_thread_45 = 1;
                if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                    System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                    switchOFFLightR4A12.setPresent();
                  currsigs.addElement(switchOFFLightR4A12);
                  switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR4A12");
                  d_thread_45 = 0;
                                    e_thread_45 = 0;
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                }
              else {
                if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                    System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                    switchOFFLightR4A12.setPresent();
                  currsigs.addElement(switchOFFLightR4A12);
                  switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR4A12");
                  d_thread_45 = 0;
                                    e_thread_45 = 0;
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                }
              }
            else {
              if(onSignal.getprestatus()){
                                e_thread_45 = 1;
                if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                    System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                    switchOFFLightR4A12.setPresent();
                  currsigs.addElement(switchOFFLightR4A12);
                  switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR4A12");
                  d_thread_45 = 0;
                                    e_thread_45 = 0;
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                }
              else {
                if((d_thread_45 == 1) && (e_thread_45 == 1)){
                                    System.out.println("Please switch OFF the lightR4A12 as no one is in the room");
                                    switchOFFLightR4A12.setPresent();
                  currsigs.addElement(switchOFFLightR4A12);
                  switchOFFLightR4A12.setValue("R4A12: Switch OFF Light");
                  System.out.println("Emitted switchOFFLightR4A12");
                  d_thread_45 = 0;
                                    e_thread_45 = 0;
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                else {
                  active[45]=1;
                  ends[45]=1;
tdone[45]=1;
                  }
                }
              }
            }
          }
public void thread1275134745(int [] tdone, int [] ends){
          if(tdone[44] != 1){
            S3239=1;
                                    c_thread_44 = 0;
            if(humanPresenceSignal.getprestatus()){
                            b_thread_44 = 1;
              if(offSignal.getprestatus()){
                                c_thread_44 = 1;
                if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                    System.out.println("Please switch ON the lightR4A12");
                                    switchONLightR4A12.setPresent();
                  currsigs.addElement(switchONLightR4A12);
                  switchONLightR4A12.setValue("R4A12: Switch ON Light");
                  System.out.println("Emitted switchONLightR4A12");
                  b_thread_44 = 0;
                                    c_thread_44 = 0;
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                }
              else {
                if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                    System.out.println("Please switch ON the lightR4A12");
                                    switchONLightR4A12.setPresent();
                  currsigs.addElement(switchONLightR4A12);
                  switchONLightR4A12.setValue("R4A12: Switch ON Light");
                  System.out.println("Emitted switchONLightR4A12");
                  b_thread_44 = 0;
                                    c_thread_44 = 0;
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                }
              }
            else {
              if(offSignal.getprestatus()){
                                c_thread_44 = 1;
                if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                    System.out.println("Please switch ON the lightR4A12");
                                    switchONLightR4A12.setPresent();
                  currsigs.addElement(switchONLightR4A12);
                  switchONLightR4A12.setValue("R4A12: Switch ON Light");
                  System.out.println("Emitted switchONLightR4A12");
                  b_thread_44 = 0;
                                    c_thread_44 = 0;
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                }
              else {
                if((b_thread_44 == 1) && (c_thread_44 == 1)){
                                    System.out.println("Please switch ON the lightR4A12");
                                    switchONLightR4A12.setPresent();
                  currsigs.addElement(switchONLightR4A12);
                  switchONLightR4A12.setValue("R4A12: Switch ON Light");
                  System.out.println("Emitted switchONLightR4A12");
                  b_thread_44 = 0;
                                    c_thread_44 = 0;
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                else {
                  active[44]=1;
                  ends[44]=1;
tdone[44]=1;
                  }
                }
              }
            }
          }
public void thread1256282048(int [] tdone, int [] ends){
          if(tdone[43] != 1){
            S3189=1;
if(onSignal.getprestatus()){
                            System.out.println("Light ON signal received");
                            powerReceive_42.setPresent();
              currsigs.addElement(powerReceive_42);
              powerReceive_42.setValue(new Integer(60));
              System.out.println("Emitted powerReceive_42");
active[43]=1;
              ends[43]=1;
tdone[43]=1;
              }
            else {
              if(offSignal.getprestatus()){
                                System.out.println("Light OFF signal received");
                                powerReceive_42.setPresent();
                currsigs.addElement(powerReceive_42);
                powerReceive_42.setValue(new Integer(0));
                System.out.println("Emitted powerReceive_42");
active[43]=1;
                ends[43]=1;
tdone[43]=1;
                }
              else {
                active[43]=1;
                ends[43]=1;
tdone[43]=1;
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
				switch(S3623){
          case 0 : 
          S3623=0;
          break RUN;
                    case 1 : 
          S3623=2;
          powerReceive_42.setClear();
          thread1256282048(tdone,ends);
          thread1275134745(tdone,ends);
          thread1581779618(tdone,ends);
          thread1594476332(tdone,ends);
          thread1596400076(tdone,ends);
          thread1609096790(tdone,ends);
          int biggest1607942543 = 0;
          if(ends[43]>=biggest1607942543){
            biggest1607942543=ends[43];
}
          if(ends[44]>=biggest1607942543){
            biggest1607942543=ends[44];
}
          if(ends[45]>=biggest1607942543){
            biggest1607942543=ends[45];
}
          if(ends[46]>=biggest1607942543){
            biggest1607942543=ends[46];
}
          if(ends[47]>=biggest1607942543){
            biggest1607942543=ends[47];
}
          if(ends[48]>=biggest1607942543){
            biggest1607942543=ends[48];
}
          if(biggest1607942543 == 1){
            active[42]=1;
            ends[42]=1;
            break RUN;
            }
                    case 2 : 
                    powerReceive_42.setClear();
          thread1608327292(tdone,ends);
          thread1530223265(tdone,ends);
          thread1542919979(tdone,ends);
          thread1554077697(tdone,ends);
          thread1566774411(tdone,ends);
          thread1482514402(tdone,ends);
          int biggest1482899151 = 0;
          if(ends[43]>=biggest1482899151){
            biggest1482899151=ends[43];
}
          if(ends[44]>=biggest1482899151){
            biggest1482899151=ends[44];
}
          if(ends[45]>=biggest1482899151){
            biggest1482899151=ends[45];
}
          if(ends[46]>=biggest1482899151){
            biggest1482899151=ends[46];
}
          if(ends[47]>=biggest1482899151){
            biggest1482899151=ends[47];
}
          if(ends[48]>=biggest1482899151){
            biggest1482899151=ends[48];
}
          if(biggest1482899151 == 1){
            active[42]=1;
            ends[42]=1;
            break RUN;
            }
          //FINXME code
if(biggest1482899151 == 0){
            S3623=0;
active[42]=0;
            ends[42]=0;
S3623=0;
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
		powerReceive_42 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[42] != 0){
		int index = 42;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[42]!=0 || suspended[42]!=0 || active[42]!=1);
			else{
				appliancePowerLightR4A12_o.update_w_r();
				if(!df){
					appliancePowerLightR4A12_o.gethook();
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
			switchOFFLightR4A12.setpreclear();
			switchONLightR4A12.setpreclear();
			OKLightR4A12.setpreclear();
			powerReceive_42.setpreclear();
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
			switchOFFLightR4A12.sethook();
			switchOFFLightR4A12.setClear();
			switchONLightR4A12.sethook();
			switchONLightR4A12.setClear();
			OKLightR4A12.sethook();
			OKLightR4A12.setClear();
			powerReceive_42.setClear();
			appliancePowerLightR4A12_o.sethook();
			if(paused[42]!=0 || suspended[42]!=0 || active[42]!=1);
			else{
				appliancePowerLightR4A12_o.gethook();
				onSignal.gethook();
				offSignal.gethook();
				humanPresenceSignal.gethook();
				humanAbsenceSignal.gethook();
			}
			if(active[42] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
