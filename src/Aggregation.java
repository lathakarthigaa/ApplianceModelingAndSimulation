import java.util.*;
import systemj.bootstrap.ClockDomain;
import systemj.lib.*;

public class Aggregation extends ClockDomain{
	public Aggregation(){super(); init();}
	Vector currsigs = new Vector();
	private boolean df = false;
	private char [] active;
	private char [] paused;
	private char [] suspended;
	public Signal date = new Signal();
	public Signal time = new Signal();
	public Signal fridgeR1A1PowerSignal = new Signal();
	public Signal dishwasherR1A2PowerSignal = new Signal();
	public Signal dryerR1A3PowerSignal = new Signal();
	public Signal stoveR1A4PowerSignal = new Signal();
	public Signal ovenR1A5PowerSignal = new Signal();
	public Signal TVR2A6PowerSignal = new Signal();
	public Signal powerplugsR2A7PowerSignal = new Signal();
	public Signal heaterR2A8PowerSignal = new Signal();
	public Signal heaterR3A9PowerSignal = new Signal();
	public Signal lightR3A10PowerSignal = new Signal();
	public Signal powerplugsR3A11PowerSignal = new Signal();
	public Signal lightR4A12PowerSignal = new Signal();
	public Signal fanR4A13PowerSignal = new Signal();
	public Signal waterHeaterR4A14PowerSignal = new Signal();
	public Signal aggregatedPowerSignal = new Signal();
	public input_Channel appliancePowerFridgeR1A1_in = new input_Channel();
	public input_Channel appliancePowerDishwasherR1A2_in = new input_Channel();
	public input_Channel appliancePowerDryerR1A3_in = new input_Channel();
	public input_Channel appliancePowerStoveR1A4_in = new input_Channel();
	public input_Channel appliancePowerOvenR1A5_in = new input_Channel();
	public input_Channel appliancePowerTVR2A6_in = new input_Channel();
	public input_Channel appliancePowerPowerPlugsR2A7_in = new input_Channel();
	public input_Channel appliancePowerHeaterR2A8_in = new input_Channel();
	public input_Channel appliancePowerHeaterR3A9_in = new input_Channel();
	public input_Channel appliancePowerLightR3A10_in = new input_Channel();
	public input_Channel appliancePowerPowerPlugsR3A11_in = new input_Channel();
	public input_Channel appliancePowerLightR4A12_in = new input_Channel();
	public input_Channel appliancePowerFanR4A13_in = new input_Channel();
	public input_Channel appliancePowerWaterHeaterR4A14_in = new input_Channel();
	private Signal receivedFridgeR1A1Powers_55;
	private Signal receivedDishwasherR1A2Powers_55;
	private Signal receivedDryerR1A3Powers_55;
	private Signal receivedStoveR1A4Powers_55;
	private Signal receivedOvenR1A5Powers_55;
	private Signal receivedTVR2A6Powers_55;
	private Signal receivedPowerPlugsR2A7Powers_55;
	private Signal receivedHeaterR2A8Powers_55;
	private Signal receivedHeaterR3A9Powers_55;
	private Signal receivedLightR3A10Powers_55;
	private Signal receivedPowerPlugsR3A11Powers_55;
	private Signal receivedLightR4A12Powers_55;
	private Signal receivedFanR4A13Powers_55;
	private Signal receivedWaterHeaterR4A14Powers_55;
	private int tutu__432549977;
	private int tutu__2078554830;
	private int tutu__431780480;
	private int appliancePowerFridgeR1A1Int_thread_56;
	private String appliancePowerFridgeR1A1String_thread_56;
	private int tutu__232414322;
	private int tutu__432165229;
	private int tutu__923070254;
	private int tutu__434473722;
	private int appliancePowerDishwasherR1A2Int_thread_57;
	private String appliancePowerDishwasherR1A2String_thread_57;
	private int tutu__733956882;
	private int tutu__433319475;
	private int tutu__94556686;
	private int tutu__435243220;
	private int appliancePowerDryerR1A3Int_thread_58;
	private String appliancePowerDryerR1A3String_thread_58;
	private int tutu__1577012269;
	private int tutu__424854999;
	private int tutu__443699791;
	private int tutu__424085502;
	private int appliancePowerStoveR1A4Int_thread_59;
	private String appliancePowerStoveR1A4String_thread_59;
	private int tutu__1867269361;
	private int tutu__424470251;
	private int tutu__711784785;
	private int tutu__426778744;
	private int appliancePowerOvenR1A5Int_thread_60;
	private String appliancePowerOvenR1A5String_thread_60;
	private int tutu__1926155374;
	private int tutu__425624497;
	private int tutu__1540298353;
	private int tutu__428317740;
	private int appliancePowerTVR2A6Int_thread_61;
	private String appliancePowerTVR2A6String_thread_61;
	private int tutu__2041840914;
	private int tutu__427163493;
	private int tutu__1213327346;
	private int tutu__429471986;
	private int appliancePowerPowerPlugsR2A7Int_thread_62;
	private String appliancePowerPowerPlugsR2A7String_thread_62;
	private int tutu__1424612814;
	private int tutu__443707696;
	private int tutu__1227869165;
	private int tutu__442938198;
	private int appliancePowerHeaterR2A8Int_thread_63;
	private String appliancePowerHeaterR2A8String_thread_63;
	private int tutu__1083099987;
	private int tutu__444861942;
	private int tutu__399355596;
	private int tutu__444092444;
	private int appliancePowerHeaterR3A9Int_thread_64;
	private String appliancePowerHeaterR3A9String_thread_64;
	private int tutu__1911613555;
	private int tutu__444477193;
	private int tutu__756128979;
	private int tutu__446785687;
	private int appliancePowerLightR3A10Int_thread_65;
	private String appliancePowerLightR3A10String_thread_65;
	private int tutu__1881811180;
	private int tutu__445631440;
	private int tutu__1584642548;
	private int tutu__447939933;
	private int appliancePowerPowerPlugsR3A11Int_thread_66;
	private String appliancePowerPowerPlugsR3A11String_thread_66;
	private int tutu__1053297612;
	private int tutu__448324682;
	private int tutu__2086185108;
	private int tutu__436782215;
	private int appliancePowerLightR4A12Int_thread_67;
	private String appliancePowerLightR4A12String_thread_67;
	private int tutu__1903983277;
	private int tutu__438705960;
	private int tutu__908528435;
	private int tutu__437936462;
	private int appliancePowerFanR4A13Int_thread_68;
	private String appliancePowerFanR4A13String_thread_68;
	private int tutu__1075469709;
	private int tutu__438321211;
	private int tutu__2064013011;
	private int tutu__440629704;
	private int appliancePowerWaterHeaterR4A14Int_thread_69;
	private String appliancePowerWaterHeaterR4A14String_thread_69;
	private int tutu__573927149;
	private int fridgeR1A1Power_thread_70;
	private int dishwasherR1A2Power_thread_70;
	private int dryerR1A3Power_thread_70;
	private int stoveR1A4Power_thread_70;
	private int ovenR1A5Power_thread_70;
	private int TVR2A6_thread_70;
	private int powerplugsR2A7Power_thread_70;
	private int heaterR2A8Power_thread_70;
	private int heaterR3A9Power_thread_70;
	private int lightR3A10Power_thread_70;
	private int powerplugsR3A11Power_thread_70;
	private int lightR4A12Power_thread_70;
	private int fanR4A13Power_thread_70;
	private int waterHeaterR4A14Power_thread_70;
	private int aggregatedPower_thread_70;
	private String aggregatedPowerString_thread_70;
	private int S4890 = 1;
	private int S4185 = 1;
	private int S4155 = 1;
	private int S4145 = 1;
	private int S4229 = 1;
	private int S4199 = 1;
	private int S4189 = 1;
	private int S4273 = 1;
	private int S4243 = 1;
	private int S4233 = 1;
	private int S4317 = 1;
	private int S4287 = 1;
	private int S4277 = 1;
	private int S4361 = 1;
	private int S4331 = 1;
	private int S4321 = 1;
	private int S4405 = 1;
	private int S4375 = 1;
	private int S4365 = 1;
	private int S4449 = 1;
	private int S4419 = 1;
	private int S4409 = 1;
	private int S4493 = 1;
	private int S4463 = 1;
	private int S4453 = 1;
	private int S4537 = 1;
	private int S4507 = 1;
	private int S4497 = 1;
	private int S4581 = 1;
	private int S4551 = 1;
	private int S4541 = 1;
	private int S4625 = 1;
	private int S4595 = 1;
	private int S4585 = 1;
	private int S4669 = 1;
	private int S4639 = 1;
	private int S4629 = 1;
	private int S4713 = 1;
	private int S4683 = 1;
	private int S4673 = 1;
	private int S4757 = 1;
	private int S4727 = 1;
	private int S4717 = 1;
	private int S4888 = 1;
	private int S4800 = 1;
	private int S4760 = 1;
	private int S4763 = 1;
	private int S4766 = 1;
	private int S4769 = 1;
	private int S4772 = 1;
	private int S4775 = 1;
	private int S4778 = 1;
	private int S4781 = 1;
	private int S4784 = 1;
	private int S4787 = 1;
	private int S4790 = 1;
	private int S4793 = 1;
	private int S4796 = 1;
	private int S4799 = 1;
	
	private int[] ends = new int[85];
	private int[] tdone = new int[85];
		public void thread282713552(int [] tdone, int [] ends){
                if(tdone[84] != 1){
                  S4799=1;
active[84]=1;
                  ends[84]=1;
tdone[84]=1;
                  }
                }
public void thread284637296(int [] tdone, int [] ends){
                if(tdone[83] != 1){
                  S4796=1;
active[83]=1;
                  ends[83]=1;
tdone[83]=1;
                  }
                }
public void thread285022045(int [] tdone, int [] ends){
                if(tdone[82] != 1){
                  S4793=1;
active[82]=1;
                  ends[82]=1;
tdone[82]=1;
                  }
                }
public void thread283867799(int [] tdone, int [] ends){
                if(tdone[81] != 1){
                  S4790=1;
active[81]=1;
                  ends[81]=1;
tdone[81]=1;
                  }
                }
public void thread284252548(int [] tdone, int [] ends){
                if(tdone[80] != 1){
                  S4787=1;
active[80]=1;
                  ends[80]=1;
tdone[80]=1;
                  }
                }
public void thread286176292(int [] tdone, int [] ends){
                if(tdone[79] != 1){
                  S4784=1;
active[79]=1;
                  ends[79]=1;
tdone[79]=1;
                  }
                }
public void thread286561041(int [] tdone, int [] ends){
                if(tdone[78] != 1){
                  S4781=1;
active[78]=1;
                  ends[78]=1;
tdone[78]=1;
                  }
                }
public void thread285406794(int [] tdone, int [] ends){
                if(tdone[77] != 1){
                  S4778=1;
active[77]=1;
                  ends[77]=1;
tdone[77]=1;
                  }
                }
public void thread285791543(int [] tdone, int [] ends){
                if(tdone[76] != 1){
                  S4775=1;
active[76]=1;
                  ends[76]=1;
tdone[76]=1;
                  }
                }
public void thread287715288(int [] tdone, int [] ends){
                if(tdone[75] != 1){
                  S4772=1;
active[75]=1;
                  ends[75]=1;
tdone[75]=1;
                  }
                }
public void thread288100037(int [] tdone, int [] ends){
                if(tdone[74] != 1){
                  S4769=1;
active[74]=1;
                  ends[74]=1;
tdone[74]=1;
                  }
                }
public void thread286945790(int [] tdone, int [] ends){
                if(tdone[73] != 1){
                  S4766=1;
active[73]=1;
                  ends[73]=1;
tdone[73]=1;
                  }
                }
public void thread287330539(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  S4763=1;
active[72]=1;
                  ends[72]=1;
tdone[72]=1;
                  }
                }
public void thread276942318(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  S4760=1;
active[71]=1;
                  ends[71]=1;
tdone[71]=1;
                  }
                }
public void thread289639032(int [] tdone, int [] ends){
                if(tdone[84] != 1){
                  switch(S4799){
                    case 0 : 
                    active[84]=0;
                    ends[84]=0;
tdone[84]=1;
                    break;
                    case 1 : 
                    if(receivedWaterHeaterR4A14Powers_55.getprestatus()){
                      S4799=0;
active[84]=0;
                      ends[84]=0;
tdone[84]=1;
                      }
                    else {
                      active[84]=1;
                      ends[84]=1;
tdone[84]=1;
                      }
                    break;
                    }
                  }
                }
public void thread288484785(int [] tdone, int [] ends){
                if(tdone[83] != 1){
                  switch(S4796){
                    case 0 : 
                    active[83]=0;
                    ends[83]=0;
tdone[83]=1;
                    break;
                    case 1 : 
                    if(receivedFanR4A13Powers_55.getprestatus()){
                      S4796=0;
active[83]=0;
                      ends[83]=0;
tdone[83]=1;
                      }
                    else {
                      active[83]=1;
                      ends[83]=1;
tdone[83]=1;
                      }
                    break;
                    }
                  }
                }
public void thread288869534(int [] tdone, int [] ends){
                if(tdone[82] != 1){
                  switch(S4793){
                    case 0 : 
                    active[82]=0;
                    ends[82]=0;
tdone[82]=1;
                    break;
                    case 1 : 
                    if(receivedLightR4A12Powers_55.getprestatus()){
                      S4793=0;
active[82]=0;
                      ends[82]=0;
tdone[82]=1;
                      }
                    else {
                      active[82]=1;
                      ends[82]=1;
tdone[82]=1;
                      }
                    break;
                    }
                  }
                }
public void thread290793279(int [] tdone, int [] ends){
                if(tdone[81] != 1){
                  switch(S4790){
                    case 0 : 
                    active[81]=0;
                    ends[81]=0;
tdone[81]=1;
                    break;
                    case 1 : 
                    if(receivedPowerPlugsR3A11Powers_55.getprestatus()){
                      S4790=0;
active[81]=0;
                      ends[81]=0;
tdone[81]=1;
                      }
                    else {
                      active[81]=1;
                      ends[81]=1;
tdone[81]=1;
                      }
                    break;
                    }
                  }
                }
public void thread291178028(int [] tdone, int [] ends){
                if(tdone[80] != 1){
                  switch(S4787){
                    case 0 : 
                    active[80]=0;
                    ends[80]=0;
tdone[80]=1;
                    break;
                    case 1 : 
                    if(receivedLightR3A10Powers_55.getprestatus()){
                      S4787=0;
active[80]=0;
                      ends[80]=0;
tdone[80]=1;
                      }
                    else {
                      active[80]=1;
                      ends[80]=1;
tdone[80]=1;
                      }
                    break;
                    }
                  }
                }
public void thread290023781(int [] tdone, int [] ends){
                if(tdone[79] != 1){
                  switch(S4784){
                    case 0 : 
                    active[79]=0;
                    ends[79]=0;
tdone[79]=1;
                    break;
                    case 1 : 
                    if(receivedHeaterR3A9Powers_55.getprestatus()){
                      S4784=0;
active[79]=0;
                      ends[79]=0;
tdone[79]=1;
                      }
                    else {
                      active[79]=1;
                      ends[79]=1;
tdone[79]=1;
                      }
                    break;
                    }
                  }
                }
public void thread290408530(int [] tdone, int [] ends){
                if(tdone[78] != 1){
                  switch(S4781){
                    case 0 : 
                    active[78]=0;
                    ends[78]=0;
tdone[78]=1;
                    break;
                    case 1 : 
                    if(receivedHeaterR2A8Powers_55.getprestatus()){
                      S4781=0;
active[78]=0;
                      ends[78]=0;
tdone[78]=1;
                      }
                    else {
                      active[78]=1;
                      ends[78]=1;
tdone[78]=1;
                      }
                    break;
                    }
                  }
                }
public void thread292332274(int [] tdone, int [] ends){
                if(tdone[77] != 1){
                  switch(S4778){
                    case 0 : 
                    active[77]=0;
                    ends[77]=0;
tdone[77]=1;
                    break;
                    case 1 : 
                    if(receivedPowerPlugsR2A7Powers_55.getprestatus()){
                      S4778=0;
active[77]=0;
                      ends[77]=0;
tdone[77]=1;
                      }
                    else {
                      active[77]=1;
                      ends[77]=1;
tdone[77]=1;
                      }
                    break;
                    }
                  }
                }
public void thread292717023(int [] tdone, int [] ends){
                if(tdone[76] != 1){
                  switch(S4775){
                    case 0 : 
                    active[76]=0;
                    ends[76]=0;
tdone[76]=1;
                    break;
                    case 1 : 
                    if(receivedTVR2A6Powers_55.getprestatus()){
                      S4775=0;
active[76]=0;
                      ends[76]=0;
tdone[76]=1;
                      }
                    else {
                      active[76]=1;
                      ends[76]=1;
tdone[76]=1;
                      }
                    break;
                    }
                  }
                }
public void thread291562777(int [] tdone, int [] ends){
                if(tdone[75] != 1){
                  switch(S4772){
                    case 0 : 
                    active[75]=0;
                    ends[75]=0;
tdone[75]=1;
                    break;
                    case 1 : 
                    if(receivedOvenR1A5Powers_55.getprestatus()){
                      S4772=0;
active[75]=0;
                      ends[75]=0;
tdone[75]=1;
                      }
                    else {
                      active[75]=1;
                      ends[75]=1;
tdone[75]=1;
                      }
                    break;
                    }
                  }
                }
public void thread291947526(int [] tdone, int [] ends){
                if(tdone[74] != 1){
                  switch(S4769){
                    case 0 : 
                    active[74]=0;
                    ends[74]=0;
tdone[74]=1;
                    break;
                    case 1 : 
                    if(receivedStoveR1A4Powers_55.getprestatus()){
                      S4769=0;
active[74]=0;
                      ends[74]=0;
tdone[74]=1;
                      }
                    else {
                      active[74]=1;
                      ends[74]=1;
tdone[74]=1;
                      }
                    break;
                    }
                  }
                }
public void thread293871270(int [] tdone, int [] ends){
                if(tdone[73] != 1){
                  switch(S4766){
                    case 0 : 
                    active[73]=0;
                    ends[73]=0;
tdone[73]=1;
                    break;
                    case 1 : 
                    if(receivedDryerR1A3Powers_55.getprestatus()){
                      S4766=0;
active[73]=0;
                      ends[73]=0;
tdone[73]=1;
                      }
                    else {
                      active[73]=1;
                      ends[73]=1;
tdone[73]=1;
                      }
                    break;
                    }
                  }
                }
public void thread294256019(int [] tdone, int [] ends){
                if(tdone[72] != 1){
                  switch(S4763){
                    case 0 : 
                    active[72]=0;
                    ends[72]=0;
tdone[72]=1;
                    break;
                    case 1 : 
                    if(receivedDishwasherR1A2Powers_55.getprestatus()){
                      S4763=0;
active[72]=0;
                      ends[72]=0;
tdone[72]=1;
                      }
                    else {
                      active[72]=1;
                      ends[72]=1;
tdone[72]=1;
                      }
                    break;
                    }
                  }
                }
public void thread293101772(int [] tdone, int [] ends){
                if(tdone[71] != 1){
                  switch(S4760){
                    case 0 : 
                    active[71]=0;
                    ends[71]=0;
tdone[71]=1;
                    break;
                    case 1 : 
                    if(receivedFridgeR1A1Powers_55.getprestatus()){
                      S4760=0;
active[71]=0;
                      ends[71]=0;
tdone[71]=1;
                      }
                    else {
                      active[71]=1;
                      ends[71]=1;
tdone[71]=1;
                      }
                    break;
                    }
                  }
                }
public void thread293486521(int [] tdone, int [] ends){
          if(tdone[70] != 1){
            switch(S4888){
              case 0 : 
              active[70]=0;
              ends[70]=0;
tdone[70]=1;
              break;
              case 1 : 
              switch(S4800){
                case 0 : 
                thread293101772(tdone,ends);
                thread294256019(tdone,ends);
                thread293871270(tdone,ends);
                thread291947526(tdone,ends);
                thread291562777(tdone,ends);
                thread292717023(tdone,ends);
                thread292332274(tdone,ends);
                thread290408530(tdone,ends);
                thread290023781(tdone,ends);
                thread291178028(tdone,ends);
                thread290793279(tdone,ends);
                thread288869534(tdone,ends);
                thread288484785(tdone,ends);
                thread289639032(tdone,ends);
                int biggest289254283 = 0;
                if(ends[71]>=biggest289254283){
                  biggest289254283=ends[71];
}
                if(ends[72]>=biggest289254283){
                  biggest289254283=ends[72];
}
                if(ends[73]>=biggest289254283){
                  biggest289254283=ends[73];
}
                if(ends[74]>=biggest289254283){
                  biggest289254283=ends[74];
}
                if(ends[75]>=biggest289254283){
                  biggest289254283=ends[75];
}
                if(ends[76]>=biggest289254283){
                  biggest289254283=ends[76];
}
                if(ends[77]>=biggest289254283){
                  biggest289254283=ends[77];
}
                if(ends[78]>=biggest289254283){
                  biggest289254283=ends[78];
}
                if(ends[79]>=biggest289254283){
                  biggest289254283=ends[79];
}
                if(ends[80]>=biggest289254283){
                  biggest289254283=ends[80];
}
                if(ends[81]>=biggest289254283){
                  biggest289254283=ends[81];
}
                if(ends[82]>=biggest289254283){
                  biggest289254283=ends[82];
}
                if(ends[83]>=biggest289254283){
                  biggest289254283=ends[83];
}
                if(ends[84]>=biggest289254283){
                  biggest289254283=ends[84];
}
                if(biggest289254283 == 1){
                  active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                //FINXME code
if(biggest289254283 == 0){
                                    fridgeR1A1Power_thread_70 = (Integer)receivedFridgeR1A1Powers_55.getpreval();
                                    dishwasherR1A2Power_thread_70 = (Integer)receivedDishwasherR1A2Powers_55.getpreval();
                                    dryerR1A3Power_thread_70 = (Integer)receivedDryerR1A3Powers_55.getpreval();
                                    stoveR1A4Power_thread_70 = (Integer)receivedStoveR1A4Powers_55.getpreval();
                                    ovenR1A5Power_thread_70 = (Integer)receivedOvenR1A5Powers_55.getpreval();
                                    TVR2A6_thread_70 = (Integer)receivedTVR2A6Powers_55.getpreval();
                                    powerplugsR2A7Power_thread_70 = (Integer)receivedPowerPlugsR2A7Powers_55.getpreval();
                                    heaterR2A8Power_thread_70 = (Integer)receivedHeaterR2A8Powers_55.getpreval();
                                    heaterR3A9Power_thread_70 = (Integer)receivedHeaterR3A9Powers_55.getpreval();
                                    lightR3A10Power_thread_70 = (Integer)receivedLightR3A10Powers_55.getpreval();
                                    powerplugsR3A11Power_thread_70 = (Integer)receivedPowerPlugsR3A11Powers_55.getpreval();
                                    lightR4A12Power_thread_70 = (Integer)receivedLightR4A12Powers_55.getpreval();
                                    fanR4A13Power_thread_70 = (Integer)receivedFanR4A13Powers_55.getpreval();
                                    waterHeaterR4A14Power_thread_70 = (Integer)receivedWaterHeaterR4A14Powers_55.getpreval();
                                    aggregatedPower_thread_70 = fridgeR1A1Power_thread_70 + dishwasherR1A2Power_thread_70 + dryerR1A3Power_thread_70 + stoveR1A4Power_thread_70 + ovenR1A5Power_thread_70 + TVR2A6_thread_70 + powerplugsR2A7Power_thread_70 + heaterR2A8Power_thread_70 + heaterR3A9Power_thread_70 + lightR3A10Power_thread_70 + powerplugsR3A11Power_thread_70 + lightR4A12Power_thread_70 + fanR4A13Power_thread_70 + waterHeaterR4A14Power_thread_70;
                                    aggregatedPowerString_thread_70 = "" + aggregatedPower_thread_70;
                                    aggregatedPowerSignal.setPresent();
                  currsigs.addElement(aggregatedPowerSignal);
                  aggregatedPowerSignal.setValue(aggregatedPowerString_thread_70);
                  System.out.println("Emitted aggregatedPowerSignal");
                  System.out.println("Emitted aggregated power:" + aggregatedPower_thread_70);
                  S4800=1;
active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                break;
                case 1 : 
                S4800=1;
S4800=0;
thread276942318(tdone,ends);
                thread287330539(tdone,ends);
                thread286945790(tdone,ends);
                thread288100037(tdone,ends);
                thread287715288(tdone,ends);
                thread285791543(tdone,ends);
                thread285406794(tdone,ends);
                thread286561041(tdone,ends);
                thread286176292(tdone,ends);
                thread284252548(tdone,ends);
                thread283867799(tdone,ends);
                thread285022045(tdone,ends);
                thread284637296(tdone,ends);
                thread282713552(tdone,ends);
                int biggest282328803 = 0;
                if(ends[71]>=biggest282328803){
                  biggest282328803=ends[71];
}
                if(ends[72]>=biggest282328803){
                  biggest282328803=ends[72];
}
                if(ends[73]>=biggest282328803){
                  biggest282328803=ends[73];
}
                if(ends[74]>=biggest282328803){
                  biggest282328803=ends[74];
}
                if(ends[75]>=biggest282328803){
                  biggest282328803=ends[75];
}
                if(ends[76]>=biggest282328803){
                  biggest282328803=ends[76];
}
                if(ends[77]>=biggest282328803){
                  biggest282328803=ends[77];
}
                if(ends[78]>=biggest282328803){
                  biggest282328803=ends[78];
}
                if(ends[79]>=biggest282328803){
                  biggest282328803=ends[79];
}
                if(ends[80]>=biggest282328803){
                  biggest282328803=ends[80];
}
                if(ends[81]>=biggest282328803){
                  biggest282328803=ends[81];
}
                if(ends[82]>=biggest282328803){
                  biggest282328803=ends[82];
}
                if(ends[83]>=biggest282328803){
                  biggest282328803=ends[83];
}
                if(ends[84]>=biggest282328803){
                  biggest282328803=ends[84];
}
                if(biggest282328803 == 1){
                  active[70]=1;
                  ends[70]=1;
tdone[70]=1;
                  }
                break;
                }
              break;
              }
            }
          }
public void thread168443129(int [] tdone, int [] ends){
          if(tdone[69] != 1){
            switch(S4757){
              case 0 : 
              active[69]=0;
              ends[69]=0;
tdone[69]=1;
              break;
              case 1 : 
              switch(S4727){
                case 0 : 
                switch(S4717){
                  case 0 : 
                  if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                        tutu__2064013011 = 0;
                                        tutu__2064013011 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4717=1;
active[69]=1;
                    ends[69]=1;
tdone[69]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__438321211 = 0;
                                            tutu__438321211 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__438321211++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__438321211);
                                            appliancePowerWaterHeaterR4A14_in.get_val();
                                            ends[69]=2;
                                            ;
                                            appliancePowerWaterHeaterR4A14Int_thread_69 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                            System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_69);
                                            appliancePowerWaterHeaterR4A14String_thread_69 = "" + appliancePowerWaterHeaterR4A14Int_thread_69;
                                            waterHeaterR4A14PowerSignal.setPresent();
                      currsigs.addElement(waterHeaterR4A14PowerSignal);
                      waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_69);
                      System.out.println("Emitted waterHeaterR4A14PowerSignal");
                      receivedWaterHeaterR4A14Powers_55.setPresent();
                      currsigs.addElement(receivedWaterHeaterR4A14Powers_55);
                      receivedWaterHeaterR4A14Powers_55.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_69));
                      System.out.println("Emitted receivedWaterHeaterR4A14Powers_55");
S4727=1;
active[69]=1;
                      ends[69]=1;
tdone[69]=1;
                      }
                    else {
                      active[69]=1;
                      ends[69]=1;
tdone[69]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4717=1;
S4717=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                        tutu__2064013011 = 0;
                                        tutu__2064013011 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                    S4717=1;
active[69]=1;
                    ends[69]=1;
tdone[69]=1;
                    }
                  else {
                    if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                            tutu__438321211 = 0;
                                            tutu__438321211 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                            tutu__438321211++;
                                            appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__438321211);
                                            appliancePowerWaterHeaterR4A14_in.get_val();
                                            ends[69]=2;
                                            ;
                                            appliancePowerWaterHeaterR4A14Int_thread_69 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                            System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_69);
                                            appliancePowerWaterHeaterR4A14String_thread_69 = "" + appliancePowerWaterHeaterR4A14Int_thread_69;
                                            waterHeaterR4A14PowerSignal.setPresent();
                      currsigs.addElement(waterHeaterR4A14PowerSignal);
                      waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_69);
                      System.out.println("Emitted waterHeaterR4A14PowerSignal");
                      receivedWaterHeaterR4A14Powers_55.setPresent();
                      currsigs.addElement(receivedWaterHeaterR4A14Powers_55);
                      receivedWaterHeaterR4A14Powers_55.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_69));
                      System.out.println("Emitted receivedWaterHeaterR4A14Powers_55");
S4727=1;
active[69]=1;
                      ends[69]=1;
tdone[69]=1;
                      }
                    else {
                      active[69]=1;
                      ends[69]=1;
tdone[69]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4727=1;
S4727=0;
S4717=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                                    tutu__573927149 = 0;
                                    tutu__573927149 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
                  S4717=1;
active[69]=1;
                  ends[69]=1;
tdone[69]=1;
                  }
                else {
                  if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                        tutu__440629704 = 0;
                                        tutu__440629704 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                        tutu__440629704++;
                                        appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__440629704);
                                        appliancePowerWaterHeaterR4A14_in.get_val();
                                        ends[69]=2;
                                        ;
                                        appliancePowerWaterHeaterR4A14Int_thread_69 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                        System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_69);
                                        appliancePowerWaterHeaterR4A14String_thread_69 = "" + appliancePowerWaterHeaterR4A14Int_thread_69;
                                        waterHeaterR4A14PowerSignal.setPresent();
                    currsigs.addElement(waterHeaterR4A14PowerSignal);
                    waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_69);
                    System.out.println("Emitted waterHeaterR4A14PowerSignal");
                    receivedWaterHeaterR4A14Powers_55.setPresent();
                    currsigs.addElement(receivedWaterHeaterR4A14Powers_55);
                    receivedWaterHeaterR4A14Powers_55.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_69));
                    System.out.println("Emitted receivedWaterHeaterR4A14Powers_55");
S4727=1;
active[69]=1;
                    ends[69]=1;
tdone[69]=1;
                    }
                  else {
                    active[69]=1;
                    ends[69]=1;
tdone[69]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread537417324(int [] tdone, int [] ends){
          if(tdone[68] != 1){
            switch(S4713){
              case 0 : 
              active[68]=0;
              ends[68]=0;
tdone[68]=1;
              break;
              case 1 : 
              switch(S4683){
                case 0 : 
                switch(S4673){
                  case 0 : 
                  if(appliancePowerFanR4A13_in.get_preempted()){
                                        tutu__908528435 = 0;
                                        tutu__908528435 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4673=1;
active[68]=1;
                    ends[68]=1;
tdone[68]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__438705960 = 0;
                                            tutu__438705960 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__438705960++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__438705960);
                                            appliancePowerFanR4A13_in.get_val();
                                            ends[68]=2;
                                            ;
                                            appliancePowerFanR4A13Int_thread_68 = (Integer)appliancePowerFanR4A13_in.get_value();
                                            System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_68);
                                            appliancePowerFanR4A13String_thread_68 = "" + appliancePowerFanR4A13Int_thread_68;
                                            fanR4A13PowerSignal.setPresent();
                      currsigs.addElement(fanR4A13PowerSignal);
                      fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_68);
                      System.out.println("Emitted fanR4A13PowerSignal");
                      receivedFanR4A13Powers_55.setPresent();
                      currsigs.addElement(receivedFanR4A13Powers_55);
                      receivedFanR4A13Powers_55.setValue(new Integer(appliancePowerFanR4A13Int_thread_68));
                      System.out.println("Emitted receivedFanR4A13Powers_55");
S4683=1;
active[68]=1;
                      ends[68]=1;
tdone[68]=1;
                      }
                    else {
                      active[68]=1;
                      ends[68]=1;
tdone[68]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4673=1;
S4673=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                                        tutu__908528435 = 0;
                                        tutu__908528435 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                    S4673=1;
active[68]=1;
                    ends[68]=1;
tdone[68]=1;
                    }
                  else {
                    if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                            tutu__438705960 = 0;
                                            tutu__438705960 = appliancePowerFanR4A13_in.get_r_r();
                                            tutu__438705960++;
                                            appliancePowerFanR4A13_in.set_r_r(tutu__438705960);
                                            appliancePowerFanR4A13_in.get_val();
                                            ends[68]=2;
                                            ;
                                            appliancePowerFanR4A13Int_thread_68 = (Integer)appliancePowerFanR4A13_in.get_value();
                                            System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_68);
                                            appliancePowerFanR4A13String_thread_68 = "" + appliancePowerFanR4A13Int_thread_68;
                                            fanR4A13PowerSignal.setPresent();
                      currsigs.addElement(fanR4A13PowerSignal);
                      fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_68);
                      System.out.println("Emitted fanR4A13PowerSignal");
                      receivedFanR4A13Powers_55.setPresent();
                      currsigs.addElement(receivedFanR4A13Powers_55);
                      receivedFanR4A13Powers_55.setValue(new Integer(appliancePowerFanR4A13Int_thread_68));
                      System.out.println("Emitted receivedFanR4A13Powers_55");
S4683=1;
active[68]=1;
                      ends[68]=1;
tdone[68]=1;
                      }
                    else {
                      active[68]=1;
                      ends[68]=1;
tdone[68]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4683=1;
S4683=0;
S4673=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                                    tutu__1075469709 = 0;
                                    tutu__1075469709 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
                  S4673=1;
active[68]=1;
                  ends[68]=1;
tdone[68]=1;
                  }
                else {
                  if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                        tutu__437936462 = 0;
                                        tutu__437936462 = appliancePowerFanR4A13_in.get_r_r();
                                        tutu__437936462++;
                                        appliancePowerFanR4A13_in.set_r_r(tutu__437936462);
                                        appliancePowerFanR4A13_in.get_val();
                                        ends[68]=2;
                                        ;
                                        appliancePowerFanR4A13Int_thread_68 = (Integer)appliancePowerFanR4A13_in.get_value();
                                        System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_68);
                                        appliancePowerFanR4A13String_thread_68 = "" + appliancePowerFanR4A13Int_thread_68;
                                        fanR4A13PowerSignal.setPresent();
                    currsigs.addElement(fanR4A13PowerSignal);
                    fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_68);
                    System.out.println("Emitted fanR4A13PowerSignal");
                    receivedFanR4A13Powers_55.setPresent();
                    currsigs.addElement(receivedFanR4A13Powers_55);
                    receivedFanR4A13Powers_55.setValue(new Integer(appliancePowerFanR4A13Int_thread_68));
                    System.out.println("Emitted receivedFanR4A13Powers_55");
S4683=1;
active[68]=1;
                    ends[68]=1;
tdone[68]=1;
                    }
                  else {
                    active[68]=1;
                    ends[68]=1;
tdone[68]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread412373931(int [] tdone, int [] ends){
          if(tdone[67] != 1){
            switch(S4669){
              case 0 : 
              active[67]=0;
              ends[67]=0;
tdone[67]=1;
              break;
              case 1 : 
              switch(S4639){
                case 0 : 
                switch(S4629){
                  case 0 : 
                  if(appliancePowerLightR4A12_in.get_preempted()){
                                        tutu__2086185108 = 0;
                                        tutu__2086185108 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4629=1;
active[67]=1;
                    ends[67]=1;
tdone[67]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__448324682 = 0;
                                            tutu__448324682 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__448324682++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__448324682);
                                            appliancePowerLightR4A12_in.get_val();
                                            ends[67]=2;
                                            ;
                                            appliancePowerLightR4A12Int_thread_67 = (Integer)appliancePowerLightR4A12_in.get_value();
                                            System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_67);
                                            appliancePowerLightR4A12String_thread_67 = "" + appliancePowerLightR4A12Int_thread_67;
                                            lightR4A12PowerSignal.setPresent();
                      currsigs.addElement(lightR4A12PowerSignal);
                      lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_67);
                      System.out.println("Emitted lightR4A12PowerSignal");
                      receivedLightR4A12Powers_55.setPresent();
                      currsigs.addElement(receivedLightR4A12Powers_55);
                      receivedLightR4A12Powers_55.setValue(new Integer(appliancePowerLightR4A12Int_thread_67));
                      System.out.println("Emitted receivedLightR4A12Powers_55");
S4639=1;
active[67]=1;
                      ends[67]=1;
tdone[67]=1;
                      }
                    else {
                      active[67]=1;
                      ends[67]=1;
tdone[67]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4629=1;
S4629=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                                        tutu__2086185108 = 0;
                                        tutu__2086185108 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                    S4629=1;
active[67]=1;
                    ends[67]=1;
tdone[67]=1;
                    }
                  else {
                    if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                            tutu__448324682 = 0;
                                            tutu__448324682 = appliancePowerLightR4A12_in.get_r_r();
                                            tutu__448324682++;
                                            appliancePowerLightR4A12_in.set_r_r(tutu__448324682);
                                            appliancePowerLightR4A12_in.get_val();
                                            ends[67]=2;
                                            ;
                                            appliancePowerLightR4A12Int_thread_67 = (Integer)appliancePowerLightR4A12_in.get_value();
                                            System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_67);
                                            appliancePowerLightR4A12String_thread_67 = "" + appliancePowerLightR4A12Int_thread_67;
                                            lightR4A12PowerSignal.setPresent();
                      currsigs.addElement(lightR4A12PowerSignal);
                      lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_67);
                      System.out.println("Emitted lightR4A12PowerSignal");
                      receivedLightR4A12Powers_55.setPresent();
                      currsigs.addElement(receivedLightR4A12Powers_55);
                      receivedLightR4A12Powers_55.setValue(new Integer(appliancePowerLightR4A12Int_thread_67));
                      System.out.println("Emitted receivedLightR4A12Powers_55");
S4639=1;
active[67]=1;
                      ends[67]=1;
tdone[67]=1;
                      }
                    else {
                      active[67]=1;
                      ends[67]=1;
tdone[67]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4639=1;
S4639=0;
S4629=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                                    tutu__1903983277 = 0;
                                    tutu__1903983277 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
                  S4629=1;
active[67]=1;
                  ends[67]=1;
tdone[67]=1;
                  }
                else {
                  if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                        tutu__436782215 = 0;
                                        tutu__436782215 = appliancePowerLightR4A12_in.get_r_r();
                                        tutu__436782215++;
                                        appliancePowerLightR4A12_in.set_r_r(tutu__436782215);
                                        appliancePowerLightR4A12_in.get_val();
                                        ends[67]=2;
                                        ;
                                        appliancePowerLightR4A12Int_thread_67 = (Integer)appliancePowerLightR4A12_in.get_value();
                                        System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_67);
                                        appliancePowerLightR4A12String_thread_67 = "" + appliancePowerLightR4A12Int_thread_67;
                                        lightR4A12PowerSignal.setPresent();
                    currsigs.addElement(lightR4A12PowerSignal);
                    lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_67);
                    System.out.println("Emitted lightR4A12PowerSignal");
                    receivedLightR4A12Powers_55.setPresent();
                    currsigs.addElement(receivedLightR4A12Powers_55);
                    receivedLightR4A12Powers_55.setValue(new Integer(appliancePowerLightR4A12Int_thread_67));
                    System.out.println("Emitted receivedLightR4A12Powers_55");
S4639=1;
active[67]=1;
                    ends[67]=1;
tdone[67]=1;
                    }
                  else {
                    active[67]=1;
                    ends[67]=1;
tdone[67]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread398522971(int [] tdone, int [] ends){
          if(tdone[66] != 1){
            switch(S4625){
              case 0 : 
              active[66]=0;
              ends[66]=0;
tdone[66]=1;
              break;
              case 1 : 
              switch(S4595){
                case 0 : 
                switch(S4585){
                  case 0 : 
                  if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                        tutu__1584642548 = 0;
                                        tutu__1584642548 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S4585=1;
active[66]=1;
                    ends[66]=1;
tdone[66]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__445631440 = 0;
                                            tutu__445631440 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__445631440++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__445631440);
                                            appliancePowerPowerPlugsR3A11_in.get_val();
                                            ends[66]=2;
                                            ;
                                            appliancePowerPowerPlugsR3A11Int_thread_66 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                            System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_66);
                                            appliancePowerPowerPlugsR3A11String_thread_66 = "" + appliancePowerPowerPlugsR3A11Int_thread_66;
                                            powerplugsR3A11PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR3A11PowerSignal);
                      powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_66);
                      System.out.println("Emitted powerplugsR3A11PowerSignal");
                      receivedPowerPlugsR3A11Powers_55.setPresent();
                      currsigs.addElement(receivedPowerPlugsR3A11Powers_55);
                      receivedPowerPlugsR3A11Powers_55.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_66));
                      System.out.println("Emitted receivedPowerPlugsR3A11Powers_55");
S4595=1;
active[66]=1;
                      ends[66]=1;
tdone[66]=1;
                      }
                    else {
                      active[66]=1;
                      ends[66]=1;
tdone[66]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4585=1;
S4585=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                        tutu__1584642548 = 0;
                                        tutu__1584642548 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                    S4585=1;
active[66]=1;
                    ends[66]=1;
tdone[66]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                            tutu__445631440 = 0;
                                            tutu__445631440 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                            tutu__445631440++;
                                            appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__445631440);
                                            appliancePowerPowerPlugsR3A11_in.get_val();
                                            ends[66]=2;
                                            ;
                                            appliancePowerPowerPlugsR3A11Int_thread_66 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                            System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_66);
                                            appliancePowerPowerPlugsR3A11String_thread_66 = "" + appliancePowerPowerPlugsR3A11Int_thread_66;
                                            powerplugsR3A11PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR3A11PowerSignal);
                      powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_66);
                      System.out.println("Emitted powerplugsR3A11PowerSignal");
                      receivedPowerPlugsR3A11Powers_55.setPresent();
                      currsigs.addElement(receivedPowerPlugsR3A11Powers_55);
                      receivedPowerPlugsR3A11Powers_55.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_66));
                      System.out.println("Emitted receivedPowerPlugsR3A11Powers_55");
S4595=1;
active[66]=1;
                      ends[66]=1;
tdone[66]=1;
                      }
                    else {
                      active[66]=1;
                      ends[66]=1;
tdone[66]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4595=1;
S4595=0;
S4585=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                                    tutu__1053297612 = 0;
                                    tutu__1053297612 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
                  S4585=1;
active[66]=1;
                  ends[66]=1;
tdone[66]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                        tutu__447939933 = 0;
                                        tutu__447939933 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                        tutu__447939933++;
                                        appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__447939933);
                                        appliancePowerPowerPlugsR3A11_in.get_val();
                                        ends[66]=2;
                                        ;
                                        appliancePowerPowerPlugsR3A11Int_thread_66 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                        System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_66);
                                        appliancePowerPowerPlugsR3A11String_thread_66 = "" + appliancePowerPowerPlugsR3A11Int_thread_66;
                                        powerplugsR3A11PowerSignal.setPresent();
                    currsigs.addElement(powerplugsR3A11PowerSignal);
                    powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_66);
                    System.out.println("Emitted powerplugsR3A11PowerSignal");
                    receivedPowerPlugsR3A11Powers_55.setPresent();
                    currsigs.addElement(receivedPowerPlugsR3A11Powers_55);
                    receivedPowerPlugsR3A11Powers_55.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_66));
                    System.out.println("Emitted receivedPowerPlugsR3A11Powers_55");
S4595=1;
active[66]=1;
                    ends[66]=1;
tdone[66]=1;
                    }
                  else {
                    active[66]=1;
                    ends[66]=1;
tdone[66]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread910008038(int [] tdone, int [] ends){
          if(tdone[65] != 1){
            switch(S4581){
              case 0 : 
              active[65]=0;
              ends[65]=0;
tdone[65]=1;
              break;
              case 1 : 
              switch(S4551){
                case 0 : 
                switch(S4541){
                  case 0 : 
                  if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__756128979 = 0;
                                        tutu__756128979 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S4541=1;
active[65]=1;
                    ends[65]=1;
tdone[65]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__444477193 = 0;
                                            tutu__444477193 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__444477193++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__444477193);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[65]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_65 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_65);
                                            appliancePowerLightR3A10String_thread_65 = "" + appliancePowerLightR3A10Int_thread_65;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_65);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_55.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_55);
                      receivedLightR3A10Powers_55.setValue(new Integer(appliancePowerLightR3A10Int_thread_65));
                      System.out.println("Emitted receivedLightR3A10Powers_55");
S4551=1;
active[65]=1;
                      ends[65]=1;
tdone[65]=1;
                      }
                    else {
                      active[65]=1;
                      ends[65]=1;
tdone[65]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4541=1;
S4541=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                        tutu__756128979 = 0;
                                        tutu__756128979 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                    S4541=1;
active[65]=1;
                    ends[65]=1;
tdone[65]=1;
                    }
                  else {
                    if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                            tutu__444477193 = 0;
                                            tutu__444477193 = appliancePowerLightR3A10_in.get_r_r();
                                            tutu__444477193++;
                                            appliancePowerLightR3A10_in.set_r_r(tutu__444477193);
                                            appliancePowerLightR3A10_in.get_val();
                                            ends[65]=2;
                                            ;
                                            appliancePowerLightR3A10Int_thread_65 = (Integer)appliancePowerLightR3A10_in.get_value();
                                            System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_65);
                                            appliancePowerLightR3A10String_thread_65 = "" + appliancePowerLightR3A10Int_thread_65;
                                            lightR3A10PowerSignal.setPresent();
                      currsigs.addElement(lightR3A10PowerSignal);
                      lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_65);
                      System.out.println("Emitted lightR3A10PowerSignal");
                      receivedLightR3A10Powers_55.setPresent();
                      currsigs.addElement(receivedLightR3A10Powers_55);
                      receivedLightR3A10Powers_55.setValue(new Integer(appliancePowerLightR3A10Int_thread_65));
                      System.out.println("Emitted receivedLightR3A10Powers_55");
S4551=1;
active[65]=1;
                      ends[65]=1;
tdone[65]=1;
                      }
                    else {
                      active[65]=1;
                      ends[65]=1;
tdone[65]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4551=1;
S4551=0;
S4541=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                                    tutu__1881811180 = 0;
                                    tutu__1881811180 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
                  S4541=1;
active[65]=1;
                  ends[65]=1;
tdone[65]=1;
                  }
                else {
                  if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                        tutu__446785687 = 0;
                                        tutu__446785687 = appliancePowerLightR3A10_in.get_r_r();
                                        tutu__446785687++;
                                        appliancePowerLightR3A10_in.set_r_r(tutu__446785687);
                                        appliancePowerLightR3A10_in.get_val();
                                        ends[65]=2;
                                        ;
                                        appliancePowerLightR3A10Int_thread_65 = (Integer)appliancePowerLightR3A10_in.get_value();
                                        System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_65);
                                        appliancePowerLightR3A10String_thread_65 = "" + appliancePowerLightR3A10Int_thread_65;
                                        lightR3A10PowerSignal.setPresent();
                    currsigs.addElement(lightR3A10PowerSignal);
                    lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_65);
                    System.out.println("Emitted lightR3A10PowerSignal");
                    receivedLightR3A10Powers_55.setPresent();
                    currsigs.addElement(receivedLightR3A10Powers_55);
                    receivedLightR3A10Powers_55.setValue(new Integer(appliancePowerLightR3A10Int_thread_65));
                    System.out.println("Emitted receivedLightR3A10Powers_55");
S4551=1;
active[65]=1;
                    ends[65]=1;
tdone[65]=1;
                    }
                  else {
                    active[65]=1;
                    ends[65]=1;
tdone[65]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread936555712(int [] tdone, int [] ends){
          if(tdone[64] != 1){
            switch(S4537){
              case 0 : 
              active[64]=0;
              ends[64]=0;
tdone[64]=1;
              break;
              case 1 : 
              switch(S4507){
                case 0 : 
                switch(S4497){
                  case 0 : 
                  if(appliancePowerHeaterR3A9_in.get_preempted()){
                                        tutu__399355596 = 0;
                                        tutu__399355596 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S4497=1;
active[64]=1;
                    ends[64]=1;
tdone[64]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__444861942 = 0;
                                            tutu__444861942 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__444861942++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__444861942);
                                            appliancePowerHeaterR3A9_in.get_val();
                                            ends[64]=2;
                                            ;
                                            appliancePowerHeaterR3A9Int_thread_64 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                            System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_64);
                                            appliancePowerHeaterR3A9String_thread_64 = "" + appliancePowerHeaterR3A9Int_thread_64;
                                            heaterR3A9PowerSignal.setPresent();
                      currsigs.addElement(heaterR3A9PowerSignal);
                      heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_64);
                      System.out.println("Emitted heaterR3A9PowerSignal");
                      receivedHeaterR3A9Powers_55.setPresent();
                      currsigs.addElement(receivedHeaterR3A9Powers_55);
                      receivedHeaterR3A9Powers_55.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_64));
                      System.out.println("Emitted receivedHeaterR3A9Powers_55");
S4507=1;
active[64]=1;
                      ends[64]=1;
tdone[64]=1;
                      }
                    else {
                      active[64]=1;
                      ends[64]=1;
tdone[64]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4497=1;
S4497=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                                        tutu__399355596 = 0;
                                        tutu__399355596 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                    S4497=1;
active[64]=1;
                    ends[64]=1;
tdone[64]=1;
                    }
                  else {
                    if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                            tutu__444861942 = 0;
                                            tutu__444861942 = appliancePowerHeaterR3A9_in.get_r_r();
                                            tutu__444861942++;
                                            appliancePowerHeaterR3A9_in.set_r_r(tutu__444861942);
                                            appliancePowerHeaterR3A9_in.get_val();
                                            ends[64]=2;
                                            ;
                                            appliancePowerHeaterR3A9Int_thread_64 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                            System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_64);
                                            appliancePowerHeaterR3A9String_thread_64 = "" + appliancePowerHeaterR3A9Int_thread_64;
                                            heaterR3A9PowerSignal.setPresent();
                      currsigs.addElement(heaterR3A9PowerSignal);
                      heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_64);
                      System.out.println("Emitted heaterR3A9PowerSignal");
                      receivedHeaterR3A9Powers_55.setPresent();
                      currsigs.addElement(receivedHeaterR3A9Powers_55);
                      receivedHeaterR3A9Powers_55.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_64));
                      System.out.println("Emitted receivedHeaterR3A9Powers_55");
S4507=1;
active[64]=1;
                      ends[64]=1;
tdone[64]=1;
                      }
                    else {
                      active[64]=1;
                      ends[64]=1;
tdone[64]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4507=1;
S4507=0;
S4497=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                                    tutu__1911613555 = 0;
                                    tutu__1911613555 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
                  S4497=1;
active[64]=1;
                  ends[64]=1;
tdone[64]=1;
                  }
                else {
                  if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                        tutu__444092444 = 0;
                                        tutu__444092444 = appliancePowerHeaterR3A9_in.get_r_r();
                                        tutu__444092444++;
                                        appliancePowerHeaterR3A9_in.set_r_r(tutu__444092444);
                                        appliancePowerHeaterR3A9_in.get_val();
                                        ends[64]=2;
                                        ;
                                        appliancePowerHeaterR3A9Int_thread_64 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                        System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_64);
                                        appliancePowerHeaterR3A9String_thread_64 = "" + appliancePowerHeaterR3A9Int_thread_64;
                                        heaterR3A9PowerSignal.setPresent();
                    currsigs.addElement(heaterR3A9PowerSignal);
                    heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_64);
                    System.out.println("Emitted heaterR3A9PowerSignal");
                    receivedHeaterR3A9Powers_55.setPresent();
                    currsigs.addElement(receivedHeaterR3A9Powers_55);
                    receivedHeaterR3A9Powers_55.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_64));
                    System.out.println("Emitted receivedHeaterR3A9Powers_55");
S4507=1;
active[64]=1;
                    ends[64]=1;
tdone[64]=1;
                    }
                  else {
                    active[64]=1;
                    ends[64]=1;
tdone[64]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread678389200(int [] tdone, int [] ends){
          if(tdone[63] != 1){
            switch(S4493){
              case 0 : 
              active[63]=0;
              ends[63]=0;
tdone[63]=1;
              break;
              case 1 : 
              switch(S4463){
                case 0 : 
                switch(S4453){
                  case 0 : 
                  if(appliancePowerHeaterR2A8_in.get_preempted()){
                                        tutu__1227869165 = 0;
                                        tutu__1227869165 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S4453=1;
active[63]=1;
                    ends[63]=1;
tdone[63]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__443707696 = 0;
                                            tutu__443707696 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__443707696++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__443707696);
                                            appliancePowerHeaterR2A8_in.get_val();
                                            ends[63]=2;
                                            ;
                                            appliancePowerHeaterR2A8Int_thread_63 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                            System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_63);
                                            appliancePowerHeaterR2A8String_thread_63 = "" + appliancePowerHeaterR2A8Int_thread_63;
                                            heaterR2A8PowerSignal.setPresent();
                      currsigs.addElement(heaterR2A8PowerSignal);
                      heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_63);
                      System.out.println("Emitted heaterR2A8PowerSignal");
                      receivedHeaterR2A8Powers_55.setPresent();
                      currsigs.addElement(receivedHeaterR2A8Powers_55);
                      receivedHeaterR2A8Powers_55.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_63));
                      System.out.println("Emitted receivedHeaterR2A8Powers_55");
S4463=1;
active[63]=1;
                      ends[63]=1;
tdone[63]=1;
                      }
                    else {
                      active[63]=1;
                      ends[63]=1;
tdone[63]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4453=1;
S4453=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                                        tutu__1227869165 = 0;
                                        tutu__1227869165 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                    S4453=1;
active[63]=1;
                    ends[63]=1;
tdone[63]=1;
                    }
                  else {
                    if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                            tutu__443707696 = 0;
                                            tutu__443707696 = appliancePowerHeaterR2A8_in.get_r_r();
                                            tutu__443707696++;
                                            appliancePowerHeaterR2A8_in.set_r_r(tutu__443707696);
                                            appliancePowerHeaterR2A8_in.get_val();
                                            ends[63]=2;
                                            ;
                                            appliancePowerHeaterR2A8Int_thread_63 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                            System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_63);
                                            appliancePowerHeaterR2A8String_thread_63 = "" + appliancePowerHeaterR2A8Int_thread_63;
                                            heaterR2A8PowerSignal.setPresent();
                      currsigs.addElement(heaterR2A8PowerSignal);
                      heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_63);
                      System.out.println("Emitted heaterR2A8PowerSignal");
                      receivedHeaterR2A8Powers_55.setPresent();
                      currsigs.addElement(receivedHeaterR2A8Powers_55);
                      receivedHeaterR2A8Powers_55.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_63));
                      System.out.println("Emitted receivedHeaterR2A8Powers_55");
S4463=1;
active[63]=1;
                      ends[63]=1;
tdone[63]=1;
                      }
                    else {
                      active[63]=1;
                      ends[63]=1;
tdone[63]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4463=1;
S4463=0;
S4453=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                                    tutu__1083099987 = 0;
                                    tutu__1083099987 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
                  S4453=1;
active[63]=1;
                  ends[63]=1;
tdone[63]=1;
                  }
                else {
                  if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                        tutu__442938198 = 0;
                                        tutu__442938198 = appliancePowerHeaterR2A8_in.get_r_r();
                                        tutu__442938198++;
                                        appliancePowerHeaterR2A8_in.set_r_r(tutu__442938198);
                                        appliancePowerHeaterR2A8_in.get_val();
                                        ends[63]=2;
                                        ;
                                        appliancePowerHeaterR2A8Int_thread_63 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                        System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_63);
                                        appliancePowerHeaterR2A8String_thread_63 = "" + appliancePowerHeaterR2A8Int_thread_63;
                                        heaterR2A8PowerSignal.setPresent();
                    currsigs.addElement(heaterR2A8PowerSignal);
                    heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_63);
                    System.out.println("Emitted heaterR2A8PowerSignal");
                    receivedHeaterR2A8Powers_55.setPresent();
                    currsigs.addElement(receivedHeaterR2A8Powers_55);
                    receivedHeaterR2A8Powers_55.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_63));
                    System.out.println("Emitted receivedHeaterR2A8Powers_55");
S4463=1;
active[63]=1;
                    ends[63]=1;
tdone[63]=1;
                    }
                  else {
                    active[63]=1;
                    ends[63]=1;
tdone[63]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread704936875(int [] tdone, int [] ends){
          if(tdone[62] != 1){
            switch(S4449){
              case 0 : 
              active[62]=0;
              ends[62]=0;
tdone[62]=1;
              break;
              case 1 : 
              switch(S4419){
                case 0 : 
                switch(S4409){
                  case 0 : 
                  if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                        tutu__1213327346 = 0;
                                        tutu__1213327346 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S4409=1;
active[62]=1;
                    ends[62]=1;
tdone[62]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__427163493 = 0;
                                            tutu__427163493 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__427163493++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__427163493);
                                            appliancePowerPowerPlugsR2A7_in.get_val();
                                            ends[62]=2;
                                            ;
                                            appliancePowerPowerPlugsR2A7Int_thread_62 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                            System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_62);
                                            appliancePowerPowerPlugsR2A7String_thread_62 = "" + appliancePowerPowerPlugsR2A7Int_thread_62;
                                            powerplugsR2A7PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR2A7PowerSignal);
                      powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_62);
                      System.out.println("Emitted powerplugsR2A7PowerSignal");
                      receivedPowerPlugsR2A7Powers_55.setPresent();
                      currsigs.addElement(receivedPowerPlugsR2A7Powers_55);
                      receivedPowerPlugsR2A7Powers_55.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_62));
                      System.out.println("Emitted receivedPowerPlugsR2A7Powers_55");
S4419=1;
active[62]=1;
                      ends[62]=1;
tdone[62]=1;
                      }
                    else {
                      active[62]=1;
                      ends[62]=1;
tdone[62]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4409=1;
S4409=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                        tutu__1213327346 = 0;
                                        tutu__1213327346 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                    S4409=1;
active[62]=1;
                    ends[62]=1;
tdone[62]=1;
                    }
                  else {
                    if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                            tutu__427163493 = 0;
                                            tutu__427163493 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                            tutu__427163493++;
                                            appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__427163493);
                                            appliancePowerPowerPlugsR2A7_in.get_val();
                                            ends[62]=2;
                                            ;
                                            appliancePowerPowerPlugsR2A7Int_thread_62 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                            System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_62);
                                            appliancePowerPowerPlugsR2A7String_thread_62 = "" + appliancePowerPowerPlugsR2A7Int_thread_62;
                                            powerplugsR2A7PowerSignal.setPresent();
                      currsigs.addElement(powerplugsR2A7PowerSignal);
                      powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_62);
                      System.out.println("Emitted powerplugsR2A7PowerSignal");
                      receivedPowerPlugsR2A7Powers_55.setPresent();
                      currsigs.addElement(receivedPowerPlugsR2A7Powers_55);
                      receivedPowerPlugsR2A7Powers_55.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_62));
                      System.out.println("Emitted receivedPowerPlugsR2A7Powers_55");
S4419=1;
active[62]=1;
                      ends[62]=1;
tdone[62]=1;
                      }
                    else {
                      active[62]=1;
                      ends[62]=1;
tdone[62]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4419=1;
S4419=0;
S4409=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                                    tutu__1424612814 = 0;
                                    tutu__1424612814 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
                  S4409=1;
active[62]=1;
                  ends[62]=1;
tdone[62]=1;
                  }
                else {
                  if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                        tutu__429471986 = 0;
                                        tutu__429471986 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                        tutu__429471986++;
                                        appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__429471986);
                                        appliancePowerPowerPlugsR2A7_in.get_val();
                                        ends[62]=2;
                                        ;
                                        appliancePowerPowerPlugsR2A7Int_thread_62 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                        System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_62);
                                        appliancePowerPowerPlugsR2A7String_thread_62 = "" + appliancePowerPowerPlugsR2A7Int_thread_62;
                                        powerplugsR2A7PowerSignal.setPresent();
                    currsigs.addElement(powerplugsR2A7PowerSignal);
                    powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_62);
                    System.out.println("Emitted powerplugsR2A7PowerSignal");
                    receivedPowerPlugsR2A7Powers_55.setPresent();
                    currsigs.addElement(receivedPowerPlugsR2A7Powers_55);
                    receivedPowerPlugsR2A7Powers_55.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_62));
                    System.out.println("Emitted receivedPowerPlugsR2A7Powers_55");
S4419=1;
active[62]=1;
                    ends[62]=1;
tdone[62]=1;
                    }
                  else {
                    active[62]=1;
                    ends[62]=1;
tdone[62]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread831519263(int [] tdone, int [] ends){
          if(tdone[61] != 1){
            switch(S4405){
              case 0 : 
              active[61]=0;
              ends[61]=0;
tdone[61]=1;
              break;
              case 1 : 
              switch(S4375){
                case 0 : 
                switch(S4365){
                  case 0 : 
                  if(appliancePowerTVR2A6_in.get_preempted()){
                                        tutu__1540298353 = 0;
                                        tutu__1540298353 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S4365=1;
active[61]=1;
                    ends[61]=1;
tdone[61]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__425624497 = 0;
                                            tutu__425624497 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__425624497++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__425624497);
                                            appliancePowerTVR2A6_in.get_val();
                                            ends[61]=2;
                                            ;
                                            appliancePowerTVR2A6Int_thread_61 = (Integer)appliancePowerTVR2A6_in.get_value();
                                            System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_61);
                                            appliancePowerTVR2A6String_thread_61 = "" + appliancePowerTVR2A6Int_thread_61;
                                            TVR2A6PowerSignal.setPresent();
                      currsigs.addElement(TVR2A6PowerSignal);
                      TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_61);
                      System.out.println("Emitted TVR2A6PowerSignal");
                      receivedTVR2A6Powers_55.setPresent();
                      currsigs.addElement(receivedTVR2A6Powers_55);
                      receivedTVR2A6Powers_55.setValue(new Integer(appliancePowerTVR2A6Int_thread_61));
                      System.out.println("Emitted receivedTVR2A6Powers_55");
S4375=1;
active[61]=1;
                      ends[61]=1;
tdone[61]=1;
                      }
                    else {
                      active[61]=1;
                      ends[61]=1;
tdone[61]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4365=1;
S4365=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                                        tutu__1540298353 = 0;
                                        tutu__1540298353 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                    S4365=1;
active[61]=1;
                    ends[61]=1;
tdone[61]=1;
                    }
                  else {
                    if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                            tutu__425624497 = 0;
                                            tutu__425624497 = appliancePowerTVR2A6_in.get_r_r();
                                            tutu__425624497++;
                                            appliancePowerTVR2A6_in.set_r_r(tutu__425624497);
                                            appliancePowerTVR2A6_in.get_val();
                                            ends[61]=2;
                                            ;
                                            appliancePowerTVR2A6Int_thread_61 = (Integer)appliancePowerTVR2A6_in.get_value();
                                            System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_61);
                                            appliancePowerTVR2A6String_thread_61 = "" + appliancePowerTVR2A6Int_thread_61;
                                            TVR2A6PowerSignal.setPresent();
                      currsigs.addElement(TVR2A6PowerSignal);
                      TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_61);
                      System.out.println("Emitted TVR2A6PowerSignal");
                      receivedTVR2A6Powers_55.setPresent();
                      currsigs.addElement(receivedTVR2A6Powers_55);
                      receivedTVR2A6Powers_55.setValue(new Integer(appliancePowerTVR2A6Int_thread_61));
                      System.out.println("Emitted receivedTVR2A6Powers_55");
S4375=1;
active[61]=1;
                      ends[61]=1;
tdone[61]=1;
                      }
                    else {
                      active[61]=1;
                      ends[61]=1;
tdone[61]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4375=1;
S4375=0;
S4365=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                                    tutu__2041840914 = 0;
                                    tutu__2041840914 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
                  S4365=1;
active[61]=1;
                  ends[61]=1;
tdone[61]=1;
                  }
                else {
                  if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                        tutu__428317740 = 0;
                                        tutu__428317740 = appliancePowerTVR2A6_in.get_r_r();
                                        tutu__428317740++;
                                        appliancePowerTVR2A6_in.set_r_r(tutu__428317740);
                                        appliancePowerTVR2A6_in.get_val();
                                        ends[61]=2;
                                        ;
                                        appliancePowerTVR2A6Int_thread_61 = (Integer)appliancePowerTVR2A6_in.get_value();
                                        System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_61);
                                        appliancePowerTVR2A6String_thread_61 = "" + appliancePowerTVR2A6Int_thread_61;
                                        TVR2A6PowerSignal.setPresent();
                    currsigs.addElement(TVR2A6PowerSignal);
                    TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_61);
                    System.out.println("Emitted TVR2A6PowerSignal");
                    receivedTVR2A6Powers_55.setPresent();
                    currsigs.addElement(receivedTVR2A6Powers_55);
                    receivedTVR2A6Powers_55.setValue(new Integer(appliancePowerTVR2A6Int_thread_61));
                    System.out.println("Emitted receivedTVR2A6Powers_55");
S4375=1;
active[61]=1;
                    ends[61]=1;
tdone[61]=1;
                    }
                  else {
                    active[61]=1;
                    ends[61]=1;
tdone[61]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread451772098(int [] tdone, int [] ends){
          if(tdone[60] != 1){
            switch(S4361){
              case 0 : 
              active[60]=0;
              ends[60]=0;
tdone[60]=1;
              break;
              case 1 : 
              switch(S4331){
                case 0 : 
                switch(S4321){
                  case 0 : 
                  if(appliancePowerOvenR1A5_in.get_preempted()){
                                        tutu__711784785 = 0;
                                        tutu__711784785 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S4321=1;
active[60]=1;
                    ends[60]=1;
tdone[60]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__424470251 = 0;
                                            tutu__424470251 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__424470251++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__424470251);
                                            appliancePowerOvenR1A5_in.get_val();
                                            ends[60]=2;
                                            ;
                                            appliancePowerOvenR1A5Int_thread_60 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                            System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_60);
                                            appliancePowerOvenR1A5String_thread_60 = "" + appliancePowerOvenR1A5Int_thread_60;
                                            ovenR1A5PowerSignal.setPresent();
                      currsigs.addElement(ovenR1A5PowerSignal);
                      ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_60);
                      System.out.println("Emitted ovenR1A5PowerSignal");
                      receivedOvenR1A5Powers_55.setPresent();
                      currsigs.addElement(receivedOvenR1A5Powers_55);
                      receivedOvenR1A5Powers_55.setValue(new Integer(appliancePowerOvenR1A5Int_thread_60));
                      System.out.println("Emitted receivedOvenR1A5Powers_55");
S4331=1;
active[60]=1;
                      ends[60]=1;
tdone[60]=1;
                      }
                    else {
                      active[60]=1;
                      ends[60]=1;
tdone[60]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4321=1;
S4321=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                                        tutu__711784785 = 0;
                                        tutu__711784785 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                    S4321=1;
active[60]=1;
                    ends[60]=1;
tdone[60]=1;
                    }
                  else {
                    if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                            tutu__424470251 = 0;
                                            tutu__424470251 = appliancePowerOvenR1A5_in.get_r_r();
                                            tutu__424470251++;
                                            appliancePowerOvenR1A5_in.set_r_r(tutu__424470251);
                                            appliancePowerOvenR1A5_in.get_val();
                                            ends[60]=2;
                                            ;
                                            appliancePowerOvenR1A5Int_thread_60 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                            System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_60);
                                            appliancePowerOvenR1A5String_thread_60 = "" + appliancePowerOvenR1A5Int_thread_60;
                                            ovenR1A5PowerSignal.setPresent();
                      currsigs.addElement(ovenR1A5PowerSignal);
                      ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_60);
                      System.out.println("Emitted ovenR1A5PowerSignal");
                      receivedOvenR1A5Powers_55.setPresent();
                      currsigs.addElement(receivedOvenR1A5Powers_55);
                      receivedOvenR1A5Powers_55.setValue(new Integer(appliancePowerOvenR1A5Int_thread_60));
                      System.out.println("Emitted receivedOvenR1A5Powers_55");
S4331=1;
active[60]=1;
                      ends[60]=1;
tdone[60]=1;
                      }
                    else {
                      active[60]=1;
                      ends[60]=1;
tdone[60]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4331=1;
S4331=0;
S4321=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                                    tutu__1926155374 = 0;
                                    tutu__1926155374 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
                  S4321=1;
active[60]=1;
                  ends[60]=1;
tdone[60]=1;
                  }
                else {
                  if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                        tutu__426778744 = 0;
                                        tutu__426778744 = appliancePowerOvenR1A5_in.get_r_r();
                                        tutu__426778744++;
                                        appliancePowerOvenR1A5_in.set_r_r(tutu__426778744);
                                        appliancePowerOvenR1A5_in.get_val();
                                        ends[60]=2;
                                        ;
                                        appliancePowerOvenR1A5Int_thread_60 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                        System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_60);
                                        appliancePowerOvenR1A5String_thread_60 = "" + appliancePowerOvenR1A5Int_thread_60;
                                        ovenR1A5PowerSignal.setPresent();
                    currsigs.addElement(ovenR1A5PowerSignal);
                    ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_60);
                    System.out.println("Emitted ovenR1A5PowerSignal");
                    receivedOvenR1A5Powers_55.setPresent();
                    currsigs.addElement(receivedOvenR1A5Powers_55);
                    receivedOvenR1A5Powers_55.setValue(new Integer(appliancePowerOvenR1A5Int_thread_60));
                    System.out.println("Emitted receivedOvenR1A5Powers_55");
S4331=1;
active[60]=1;
                    ends[60]=1;
tdone[60]=1;
                    }
                  else {
                    active[60]=1;
                    ends[60]=1;
tdone[60]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread584895218(int [] tdone, int [] ends){
          if(tdone[59] != 1){
            switch(S4317){
              case 0 : 
              active[59]=0;
              ends[59]=0;
tdone[59]=1;
              break;
              case 1 : 
              switch(S4287){
                case 0 : 
                switch(S4277){
                  case 0 : 
                  if(appliancePowerStoveR1A4_in.get_preempted()){
                                        tutu__443699791 = 0;
                                        tutu__443699791 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S4277=1;
active[59]=1;
                    ends[59]=1;
tdone[59]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__424854999 = 0;
                                            tutu__424854999 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__424854999++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__424854999);
                                            appliancePowerStoveR1A4_in.get_val();
                                            ends[59]=2;
                                            ;
                                            appliancePowerStoveR1A4Int_thread_59 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                            System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_59);
                                            appliancePowerStoveR1A4String_thread_59 = "" + appliancePowerStoveR1A4Int_thread_59;
                                            stoveR1A4PowerSignal.setPresent();
                      currsigs.addElement(stoveR1A4PowerSignal);
                      stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_59);
                      System.out.println("Emitted stoveR1A4PowerSignal");
                      receivedStoveR1A4Powers_55.setPresent();
                      currsigs.addElement(receivedStoveR1A4Powers_55);
                      receivedStoveR1A4Powers_55.setValue(new Integer(appliancePowerStoveR1A4Int_thread_59));
                      System.out.println("Emitted receivedStoveR1A4Powers_55");
S4287=1;
active[59]=1;
                      ends[59]=1;
tdone[59]=1;
                      }
                    else {
                      active[59]=1;
                      ends[59]=1;
tdone[59]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4277=1;
S4277=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                                        tutu__443699791 = 0;
                                        tutu__443699791 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                    S4277=1;
active[59]=1;
                    ends[59]=1;
tdone[59]=1;
                    }
                  else {
                    if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                            tutu__424854999 = 0;
                                            tutu__424854999 = appliancePowerStoveR1A4_in.get_r_r();
                                            tutu__424854999++;
                                            appliancePowerStoveR1A4_in.set_r_r(tutu__424854999);
                                            appliancePowerStoveR1A4_in.get_val();
                                            ends[59]=2;
                                            ;
                                            appliancePowerStoveR1A4Int_thread_59 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                            System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_59);
                                            appliancePowerStoveR1A4String_thread_59 = "" + appliancePowerStoveR1A4Int_thread_59;
                                            stoveR1A4PowerSignal.setPresent();
                      currsigs.addElement(stoveR1A4PowerSignal);
                      stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_59);
                      System.out.println("Emitted stoveR1A4PowerSignal");
                      receivedStoveR1A4Powers_55.setPresent();
                      currsigs.addElement(receivedStoveR1A4Powers_55);
                      receivedStoveR1A4Powers_55.setValue(new Integer(appliancePowerStoveR1A4Int_thread_59));
                      System.out.println("Emitted receivedStoveR1A4Powers_55");
S4287=1;
active[59]=1;
                      ends[59]=1;
tdone[59]=1;
                      }
                    else {
                      active[59]=1;
                      ends[59]=1;
tdone[59]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4287=1;
S4287=0;
S4277=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                                    tutu__1867269361 = 0;
                                    tutu__1867269361 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
                  S4277=1;
active[59]=1;
                  ends[59]=1;
tdone[59]=1;
                  }
                else {
                  if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                        tutu__424085502 = 0;
                                        tutu__424085502 = appliancePowerStoveR1A4_in.get_r_r();
                                        tutu__424085502++;
                                        appliancePowerStoveR1A4_in.set_r_r(tutu__424085502);
                                        appliancePowerStoveR1A4_in.get_val();
                                        ends[59]=2;
                                        ;
                                        appliancePowerStoveR1A4Int_thread_59 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                        System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_59);
                                        appliancePowerStoveR1A4String_thread_59 = "" + appliancePowerStoveR1A4Int_thread_59;
                                        stoveR1A4PowerSignal.setPresent();
                    currsigs.addElement(stoveR1A4PowerSignal);
                    stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_59);
                    System.out.println("Emitted stoveR1A4PowerSignal");
                    receivedStoveR1A4Powers_55.setPresent();
                    currsigs.addElement(receivedStoveR1A4Powers_55);
                    receivedStoveR1A4Powers_55.setValue(new Integer(appliancePowerStoveR1A4Int_thread_59));
                    System.out.println("Emitted receivedStoveR1A4Powers_55");
S4287=1;
active[59]=1;
                    ends[59]=1;
tdone[59]=1;
                    }
                  else {
                    active[59]=1;
                    ends[59]=1;
tdone[59]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread600669923(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            switch(S4273){
              case 0 : 
              active[58]=0;
              ends[58]=0;
tdone[58]=1;
              break;
              case 1 : 
              switch(S4243){
                case 0 : 
                switch(S4233){
                  case 0 : 
                  if(appliancePowerDryerR1A3_in.get_preempted()){
                                        tutu__94556686 = 0;
                                        tutu__94556686 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S4233=1;
active[58]=1;
                    ends[58]=1;
tdone[58]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__433319475 = 0;
                                            tutu__433319475 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__433319475++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__433319475);
                                            appliancePowerDryerR1A3_in.get_val();
                                            ends[58]=2;
                                            ;
                                            appliancePowerDryerR1A3Int_thread_58 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                            System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_58);
                                            appliancePowerDryerR1A3String_thread_58 = "" + appliancePowerDryerR1A3Int_thread_58;
                                            dryerR1A3PowerSignal.setPresent();
                      currsigs.addElement(dryerR1A3PowerSignal);
                      dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_58);
                      System.out.println("Emitted dryerR1A3PowerSignal");
                      receivedDryerR1A3Powers_55.setPresent();
                      currsigs.addElement(receivedDryerR1A3Powers_55);
                      receivedDryerR1A3Powers_55.setValue(new Integer(appliancePowerDryerR1A3Int_thread_58));
                      System.out.println("Emitted receivedDryerR1A3Powers_55");
S4243=1;
active[58]=1;
                      ends[58]=1;
tdone[58]=1;
                      }
                    else {
                      active[58]=1;
                      ends[58]=1;
tdone[58]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4233=1;
S4233=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                                        tutu__94556686 = 0;
                                        tutu__94556686 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                    S4233=1;
active[58]=1;
                    ends[58]=1;
tdone[58]=1;
                    }
                  else {
                    if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                            tutu__433319475 = 0;
                                            tutu__433319475 = appliancePowerDryerR1A3_in.get_r_r();
                                            tutu__433319475++;
                                            appliancePowerDryerR1A3_in.set_r_r(tutu__433319475);
                                            appliancePowerDryerR1A3_in.get_val();
                                            ends[58]=2;
                                            ;
                                            appliancePowerDryerR1A3Int_thread_58 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                            System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_58);
                                            appliancePowerDryerR1A3String_thread_58 = "" + appliancePowerDryerR1A3Int_thread_58;
                                            dryerR1A3PowerSignal.setPresent();
                      currsigs.addElement(dryerR1A3PowerSignal);
                      dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_58);
                      System.out.println("Emitted dryerR1A3PowerSignal");
                      receivedDryerR1A3Powers_55.setPresent();
                      currsigs.addElement(receivedDryerR1A3Powers_55);
                      receivedDryerR1A3Powers_55.setValue(new Integer(appliancePowerDryerR1A3Int_thread_58));
                      System.out.println("Emitted receivedDryerR1A3Powers_55");
S4243=1;
active[58]=1;
                      ends[58]=1;
tdone[58]=1;
                      }
                    else {
                      active[58]=1;
                      ends[58]=1;
tdone[58]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4243=1;
S4243=0;
S4233=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                                    tutu__1577012269 = 0;
                                    tutu__1577012269 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
                  S4233=1;
active[58]=1;
                  ends[58]=1;
tdone[58]=1;
                  }
                else {
                  if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                        tutu__435243220 = 0;
                                        tutu__435243220 = appliancePowerDryerR1A3_in.get_r_r();
                                        tutu__435243220++;
                                        appliancePowerDryerR1A3_in.set_r_r(tutu__435243220);
                                        appliancePowerDryerR1A3_in.get_val();
                                        ends[58]=2;
                                        ;
                                        appliancePowerDryerR1A3Int_thread_58 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                        System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_58);
                                        appliancePowerDryerR1A3String_thread_58 = "" + appliancePowerDryerR1A3Int_thread_58;
                                        dryerR1A3PowerSignal.setPresent();
                    currsigs.addElement(dryerR1A3PowerSignal);
                    dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_58);
                    System.out.println("Emitted dryerR1A3PowerSignal");
                    receivedDryerR1A3Powers_55.setPresent();
                    currsigs.addElement(receivedDryerR1A3Powers_55);
                    receivedDryerR1A3Powers_55.setValue(new Integer(appliancePowerDryerR1A3Int_thread_58));
                    System.out.println("Emitted receivedDryerR1A3Powers_55");
S4243=1;
active[58]=1;
                    ends[58]=1;
tdone[58]=1;
                    }
                  else {
                    active[58]=1;
                    ends[58]=1;
tdone[58]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread331730441(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            switch(S4229){
              case 0 : 
              active[57]=0;
              ends[57]=0;
tdone[57]=1;
              break;
              case 1 : 
              switch(S4199){
                case 0 : 
                switch(S4189){
                  case 0 : 
                  if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__923070254 = 0;
                                        tutu__923070254 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S4189=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__432165229 = 0;
                                            tutu__432165229 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__432165229++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__432165229);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[57]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_57 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_57);
                                            appliancePowerDishwasherR1A2String_thread_57 = "" + appliancePowerDishwasherR1A2Int_thread_57;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_57);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_55.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_55);
                      receivedDishwasherR1A2Powers_55.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_57));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_55");
S4199=1;
active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    else {
                      active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4189=1;
S4189=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                        tutu__923070254 = 0;
                                        tutu__923070254 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                    S4189=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                            tutu__432165229 = 0;
                                            tutu__432165229 = appliancePowerDishwasherR1A2_in.get_r_r();
                                            tutu__432165229++;
                                            appliancePowerDishwasherR1A2_in.set_r_r(tutu__432165229);
                                            appliancePowerDishwasherR1A2_in.get_val();
                                            ends[57]=2;
                                            ;
                                            appliancePowerDishwasherR1A2Int_thread_57 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                            System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_57);
                                            appliancePowerDishwasherR1A2String_thread_57 = "" + appliancePowerDishwasherR1A2Int_thread_57;
                                            dishwasherR1A2PowerSignal.setPresent();
                      currsigs.addElement(dishwasherR1A2PowerSignal);
                      dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_57);
                      System.out.println("Emitted dishwasherR1A2PowerSignal");
                      receivedDishwasherR1A2Powers_55.setPresent();
                      currsigs.addElement(receivedDishwasherR1A2Powers_55);
                      receivedDishwasherR1A2Powers_55.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_57));
                      System.out.println("Emitted receivedDishwasherR1A2Powers_55");
S4199=1;
active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    else {
                      active[57]=1;
                      ends[57]=1;
tdone[57]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4199=1;
S4199=0;
S4189=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                                    tutu__733956882 = 0;
                                    tutu__733956882 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
                  S4189=1;
active[57]=1;
                  ends[57]=1;
tdone[57]=1;
                  }
                else {
                  if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                        tutu__434473722 = 0;
                                        tutu__434473722 = appliancePowerDishwasherR1A2_in.get_r_r();
                                        tutu__434473722++;
                                        appliancePowerDishwasherR1A2_in.set_r_r(tutu__434473722);
                                        appliancePowerDishwasherR1A2_in.get_val();
                                        ends[57]=2;
                                        ;
                                        appliancePowerDishwasherR1A2Int_thread_57 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                        System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_57);
                                        appliancePowerDishwasherR1A2String_thread_57 = "" + appliancePowerDishwasherR1A2Int_thread_57;
                                        dishwasherR1A2PowerSignal.setPresent();
                    currsigs.addElement(dishwasherR1A2PowerSignal);
                    dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_57);
                    System.out.println("Emitted dishwasherR1A2PowerSignal");
                    receivedDishwasherR1A2Powers_55.setPresent();
                    currsigs.addElement(receivedDishwasherR1A2Powers_55);
                    receivedDishwasherR1A2Powers_55.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_57));
                    System.out.println("Emitted receivedDishwasherR1A2Powers_55");
S4199=1;
active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  else {
                    active[57]=1;
                    ends[57]=1;
tdone[57]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread356739120(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            switch(S4185){
              case 0 : 
              active[56]=0;
              ends[56]=0;
tdone[56]=1;
              break;
              case 1 : 
              switch(S4155){
                case 0 : 
                switch(S4145){
                  case 0 : 
                  if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__2078554830 = 0;
                                        tutu__2078554830 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S4145=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__432549977 = 0;
                                            tutu__432549977 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__432549977++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__432549977);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[56]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_56 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_56);
                                            appliancePowerFridgeR1A1String_thread_56 = "" + appliancePowerFridgeR1A1Int_thread_56;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_56);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_55.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_55);
                      receivedFridgeR1A1Powers_55.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_56));
                      System.out.println("Emitted receivedFridgeR1A1Powers_55");
S4155=1;
active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    else {
                      active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    }
                  break;
                  case 1 : 
                  S4145=1;
S4145=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                        tutu__2078554830 = 0;
                                        tutu__2078554830 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                    S4145=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                            tutu__432549977 = 0;
                                            tutu__432549977 = appliancePowerFridgeR1A1_in.get_r_r();
                                            tutu__432549977++;
                                            appliancePowerFridgeR1A1_in.set_r_r(tutu__432549977);
                                            appliancePowerFridgeR1A1_in.get_val();
                                            ends[56]=2;
                                            ;
                                            appliancePowerFridgeR1A1Int_thread_56 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                            System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_56);
                                            appliancePowerFridgeR1A1String_thread_56 = "" + appliancePowerFridgeR1A1Int_thread_56;
                                            fridgeR1A1PowerSignal.setPresent();
                      currsigs.addElement(fridgeR1A1PowerSignal);
                      fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_56);
                      System.out.println("Emitted fridgeR1A1PowerSignal");
                      receivedFridgeR1A1Powers_55.setPresent();
                      currsigs.addElement(receivedFridgeR1A1Powers_55);
                      receivedFridgeR1A1Powers_55.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_56));
                      System.out.println("Emitted receivedFridgeR1A1Powers_55");
S4155=1;
active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    else {
                      active[56]=1;
                      ends[56]=1;
tdone[56]=1;
                      }
                    }
                  break;
                  }
                break;
                case 1 : 
                S4155=1;
S4155=0;
S4145=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                                    tutu__232414322 = 0;
                                    tutu__232414322 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
                  S4145=1;
active[56]=1;
                  ends[56]=1;
tdone[56]=1;
                  }
                else {
                  if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                        tutu__431780480 = 0;
                                        tutu__431780480 = appliancePowerFridgeR1A1_in.get_r_r();
                                        tutu__431780480++;
                                        appliancePowerFridgeR1A1_in.set_r_r(tutu__431780480);
                                        appliancePowerFridgeR1A1_in.get_val();
                                        ends[56]=2;
                                        ;
                                        appliancePowerFridgeR1A1Int_thread_56 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                        System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_56);
                                        appliancePowerFridgeR1A1String_thread_56 = "" + appliancePowerFridgeR1A1Int_thread_56;
                                        fridgeR1A1PowerSignal.setPresent();
                    currsigs.addElement(fridgeR1A1PowerSignal);
                    fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_56);
                    System.out.println("Emitted fridgeR1A1PowerSignal");
                    receivedFridgeR1A1Powers_55.setPresent();
                    currsigs.addElement(receivedFridgeR1A1Powers_55);
                    receivedFridgeR1A1Powers_55.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_56));
                    System.out.println("Emitted receivedFridgeR1A1Powers_55");
S4155=1;
active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  else {
                    active[56]=1;
                    ends[56]=1;
tdone[56]=1;
                    }
                  }
                break;
                }
              break;
              }
            }
          }
public void thread355584873(int [] tdone, int [] ends){
            if(tdone[84] != 1){
              S4799=1;
active[84]=1;
              ends[84]=1;
tdone[84]=1;
              }
            }
public void thread355200124(int [] tdone, int [] ends){
            if(tdone[83] != 1){
              S4796=1;
active[83]=1;
              ends[83]=1;
tdone[83]=1;
              }
            }
public void thread356354371(int [] tdone, int [] ends){
            if(tdone[82] != 1){
              S4793=1;
active[82]=1;
              ends[82]=1;
tdone[82]=1;
              }
            }
public void thread355969622(int [] tdone, int [] ends){
            if(tdone[81] != 1){
              S4790=1;
active[81]=1;
              ends[81]=1;
tdone[81]=1;
              }
            }
public void thread354045878(int [] tdone, int [] ends){
            if(tdone[80] != 1){
              S4787=1;
active[80]=1;
              ends[80]=1;
tdone[80]=1;
              }
            }
public void thread353661129(int [] tdone, int [] ends){
            if(tdone[79] != 1){
              S4784=1;
active[79]=1;
              ends[79]=1;
tdone[79]=1;
              }
            }
public void thread354815375(int [] tdone, int [] ends){
            if(tdone[78] != 1){
              S4781=1;
active[78]=1;
              ends[78]=1;
tdone[78]=1;
              }
            }
public void thread354430627(int [] tdone, int [] ends){
            if(tdone[77] != 1){
              S4778=1;
active[77]=1;
              ends[77]=1;
tdone[77]=1;
              }
            }
public void thread352506882(int [] tdone, int [] ends){
            if(tdone[76] != 1){
              S4775=1;
active[76]=1;
              ends[76]=1;
tdone[76]=1;
              }
            }
public void thread352122133(int [] tdone, int [] ends){
            if(tdone[75] != 1){
              S4772=1;
active[75]=1;
              ends[75]=1;
tdone[75]=1;
              }
            }
public void thread353276380(int [] tdone, int [] ends){
            if(tdone[74] != 1){
              S4769=1;
active[74]=1;
              ends[74]=1;
tdone[74]=1;
              }
            }
public void thread352891631(int [] tdone, int [] ends){
            if(tdone[73] != 1){
              S4766=1;
active[73]=1;
              ends[73]=1;
tdone[73]=1;
              }
            }
public void thread363279851(int [] tdone, int [] ends){
            if(tdone[72] != 1){
              S4763=1;
active[72]=1;
              ends[72]=1;
tdone[72]=1;
              }
            }
public void thread362895102(int [] tdone, int [] ends){
            if(tdone[71] != 1){
              S4760=1;
active[71]=1;
              ends[71]=1;
tdone[71]=1;
              }
            }
public void thread364049349(int [] tdone, int [] ends){
          if(tdone[70] != 1){
            S4888=1;
S4800=0;
thread362895102(tdone,ends);
            thread363279851(tdone,ends);
            thread352891631(tdone,ends);
            thread353276380(tdone,ends);
            thread352122133(tdone,ends);
            thread352506882(tdone,ends);
            thread354430627(tdone,ends);
            thread354815375(tdone,ends);
            thread353661129(tdone,ends);
            thread354045878(tdone,ends);
            thread355969622(tdone,ends);
            thread356354371(tdone,ends);
            thread355200124(tdone,ends);
            thread355584873(tdone,ends);
            int biggest357508618 = 0;
            if(ends[71]>=biggest357508618){
              biggest357508618=ends[71];
}
            if(ends[72]>=biggest357508618){
              biggest357508618=ends[72];
}
            if(ends[73]>=biggest357508618){
              biggest357508618=ends[73];
}
            if(ends[74]>=biggest357508618){
              biggest357508618=ends[74];
}
            if(ends[75]>=biggest357508618){
              biggest357508618=ends[75];
}
            if(ends[76]>=biggest357508618){
              biggest357508618=ends[76];
}
            if(ends[77]>=biggest357508618){
              biggest357508618=ends[77];
}
            if(ends[78]>=biggest357508618){
              biggest357508618=ends[78];
}
            if(ends[79]>=biggest357508618){
              biggest357508618=ends[79];
}
            if(ends[80]>=biggest357508618){
              biggest357508618=ends[80];
}
            if(ends[81]>=biggest357508618){
              biggest357508618=ends[81];
}
            if(ends[82]>=biggest357508618){
              biggest357508618=ends[82];
}
            if(ends[83]>=biggest357508618){
              biggest357508618=ends[83];
}
            if(ends[84]>=biggest357508618){
              biggest357508618=ends[84];
}
            if(biggest357508618 == 1){
              active[70]=1;
              ends[70]=1;
tdone[70]=1;
              }
            }
          }
public void thread436766891(int [] tdone, int [] ends){
          if(tdone[69] != 1){
            S4757=1;
S4727=0;
S4717=0;
if(appliancePowerWaterHeaterR4A14_in.get_preempted()){
                            tutu__2064013011 = 0;
                            tutu__2064013011 = appliancePowerWaterHeaterR4A14_in.get_preempted() ? appliancePowerWaterHeaterR4A14_in.refresh() : 0;
              S4717=1;
active[69]=1;
              ends[69]=1;
tdone[69]=1;
              }
            else {
              if(appliancePowerWaterHeaterR4A14_in.get_r_s() > appliancePowerWaterHeaterR4A14_in.get_r_r()){
                                tutu__438321211 = 0;
                                tutu__438321211 = appliancePowerWaterHeaterR4A14_in.get_r_r();
                                tutu__438321211++;
                                appliancePowerWaterHeaterR4A14_in.set_r_r(tutu__438321211);
                                appliancePowerWaterHeaterR4A14_in.get_val();
                                ends[69]=2;
                                ;
                                appliancePowerWaterHeaterR4A14Int_thread_69 = (Integer)appliancePowerWaterHeaterR4A14_in.get_value();
                                System.out.println("WaterHeaterR4A14's power:" + appliancePowerWaterHeaterR4A14Int_thread_69);
                                appliancePowerWaterHeaterR4A14String_thread_69 = "" + appliancePowerWaterHeaterR4A14Int_thread_69;
                                waterHeaterR4A14PowerSignal.setPresent();
                currsigs.addElement(waterHeaterR4A14PowerSignal);
                waterHeaterR4A14PowerSignal.setValue(appliancePowerWaterHeaterR4A14String_thread_69);
                System.out.println("Emitted waterHeaterR4A14PowerSignal");
                receivedWaterHeaterR4A14Powers_55.setPresent();
                currsigs.addElement(receivedWaterHeaterR4A14Powers_55);
                receivedWaterHeaterR4A14Powers_55.setValue(new Integer(appliancePowerWaterHeaterR4A14Int_thread_69));
                System.out.println("Emitted receivedWaterHeaterR4A14Powers_55");
S4727=1;
active[69]=1;
                ends[69]=1;
tdone[69]=1;
                }
              else {
                active[69]=1;
                ends[69]=1;
tdone[69]=1;
                }
              }
            }
          }
public void thread412527711(int [] tdone, int [] ends){
          if(tdone[68] != 1){
            S4713=1;
S4683=0;
S4673=0;
if(appliancePowerFanR4A13_in.get_preempted()){
                            tutu__908528435 = 0;
                            tutu__908528435 = appliancePowerFanR4A13_in.get_preempted() ? appliancePowerFanR4A13_in.refresh() : 0;
              S4673=1;
active[68]=1;
              ends[68]=1;
tdone[68]=1;
              }
            else {
              if(appliancePowerFanR4A13_in.get_r_s() > appliancePowerFanR4A13_in.get_r_r()){
                                tutu__438705960 = 0;
                                tutu__438705960 = appliancePowerFanR4A13_in.get_r_r();
                                tutu__438705960++;
                                appliancePowerFanR4A13_in.set_r_r(tutu__438705960);
                                appliancePowerFanR4A13_in.get_val();
                                ends[68]=2;
                                ;
                                appliancePowerFanR4A13Int_thread_68 = (Integer)appliancePowerFanR4A13_in.get_value();
                                System.out.println("FanR4A13's power:" + appliancePowerFanR4A13Int_thread_68);
                                appliancePowerFanR4A13String_thread_68 = "" + appliancePowerFanR4A13Int_thread_68;
                                fanR4A13PowerSignal.setPresent();
                currsigs.addElement(fanR4A13PowerSignal);
                fanR4A13PowerSignal.setValue(appliancePowerFanR4A13String_thread_68);
                System.out.println("Emitted fanR4A13PowerSignal");
                receivedFanR4A13Powers_55.setPresent();
                currsigs.addElement(receivedFanR4A13Powers_55);
                receivedFanR4A13Powers_55.setValue(new Integer(appliancePowerFanR4A13Int_thread_68));
                System.out.println("Emitted receivedFanR4A13Powers_55");
S4683=1;
active[68]=1;
                ends[68]=1;
tdone[68]=1;
                }
              else {
                active[68]=1;
                ends[68]=1;
tdone[68]=1;
                }
              }
            }
          }
public void thread1657959900(int [] tdone, int [] ends){
          if(tdone[67] != 1){
            S4669=1;
S4639=0;
S4629=0;
if(appliancePowerLightR4A12_in.get_preempted()){
                            tutu__2086185108 = 0;
                            tutu__2086185108 = appliancePowerLightR4A12_in.get_preempted() ? appliancePowerLightR4A12_in.refresh() : 0;
              S4629=1;
active[67]=1;
              ends[67]=1;
tdone[67]=1;
              }
            else {
              if(appliancePowerLightR4A12_in.get_r_s() > appliancePowerLightR4A12_in.get_r_r()){
                                tutu__448324682 = 0;
                                tutu__448324682 = appliancePowerLightR4A12_in.get_r_r();
                                tutu__448324682++;
                                appliancePowerLightR4A12_in.set_r_r(tutu__448324682);
                                appliancePowerLightR4A12_in.get_val();
                                ends[67]=2;
                                ;
                                appliancePowerLightR4A12Int_thread_67 = (Integer)appliancePowerLightR4A12_in.get_value();
                                System.out.println("LightR4A12's power:" + appliancePowerLightR4A12Int_thread_67);
                                appliancePowerLightR4A12String_thread_67 = "" + appliancePowerLightR4A12Int_thread_67;
                                lightR4A12PowerSignal.setPresent();
                currsigs.addElement(lightR4A12PowerSignal);
                lightR4A12PowerSignal.setValue(appliancePowerLightR4A12String_thread_67);
                System.out.println("Emitted lightR4A12PowerSignal");
                receivedLightR4A12Powers_55.setPresent();
                currsigs.addElement(receivedLightR4A12Powers_55);
                receivedLightR4A12Powers_55.setValue(new Integer(appliancePowerLightR4A12Int_thread_67));
                System.out.println("Emitted receivedLightR4A12Powers_55");
S4639=1;
active[67]=1;
                ends[67]=1;
tdone[67]=1;
                }
              else {
                active[67]=1;
                ends[67]=1;
tdone[67]=1;
                }
              }
            }
          }
public void thread1633720719(int [] tdone, int [] ends){
          if(tdone[66] != 1){
            S4625=1;
S4595=0;
S4585=0;
if(appliancePowerPowerPlugsR3A11_in.get_preempted()){
                            tutu__1584642548 = 0;
                            tutu__1584642548 = appliancePowerPowerPlugsR3A11_in.get_preempted() ? appliancePowerPowerPlugsR3A11_in.refresh() : 0;
              S4585=1;
active[66]=1;
              ends[66]=1;
tdone[66]=1;
              }
            else {
              if(appliancePowerPowerPlugsR3A11_in.get_r_s() > appliancePowerPowerPlugsR3A11_in.get_r_r()){
                                tutu__445631440 = 0;
                                tutu__445631440 = appliancePowerPowerPlugsR3A11_in.get_r_r();
                                tutu__445631440++;
                                appliancePowerPowerPlugsR3A11_in.set_r_r(tutu__445631440);
                                appliancePowerPowerPlugsR3A11_in.get_val();
                                ends[66]=2;
                                ;
                                appliancePowerPowerPlugsR3A11Int_thread_66 = (Integer)appliancePowerPowerPlugsR3A11_in.get_value();
                                System.out.println("PowerPlugsR3A11's power:" + appliancePowerPowerPlugsR3A11Int_thread_66);
                                appliancePowerPowerPlugsR3A11String_thread_66 = "" + appliancePowerPowerPlugsR3A11Int_thread_66;
                                powerplugsR3A11PowerSignal.setPresent();
                currsigs.addElement(powerplugsR3A11PowerSignal);
                powerplugsR3A11PowerSignal.setValue(appliancePowerPowerPlugsR3A11String_thread_66);
                System.out.println("Emitted powerplugsR3A11PowerSignal");
                receivedPowerPlugsR3A11Powers_55.setPresent();
                currsigs.addElement(receivedPowerPlugsR3A11Powers_55);
                receivedPowerPlugsR3A11Powers_55.setValue(new Integer(appliancePowerPowerPlugsR3A11Int_thread_66));
                System.out.println("Emitted receivedPowerPlugsR3A11Powers_55");
S4595=1;
active[66]=1;
                ends[66]=1;
tdone[66]=1;
                }
              else {
                active[66]=1;
                ends[66]=1;
tdone[66]=1;
                }
              }
            }
          }
public void thread1706438262(int [] tdone, int [] ends){
          if(tdone[65] != 1){
            S4581=1;
S4551=0;
S4541=0;
if(appliancePowerLightR3A10_in.get_preempted()){
                            tutu__756128979 = 0;
                            tutu__756128979 = appliancePowerLightR3A10_in.get_preempted() ? appliancePowerLightR3A10_in.refresh() : 0;
              S4541=1;
active[65]=1;
              ends[65]=1;
tdone[65]=1;
              }
            else {
              if(appliancePowerLightR3A10_in.get_r_s() > appliancePowerLightR3A10_in.get_r_r()){
                                tutu__444477193 = 0;
                                tutu__444477193 = appliancePowerLightR3A10_in.get_r_r();
                                tutu__444477193++;
                                appliancePowerLightR3A10_in.set_r_r(tutu__444477193);
                                appliancePowerLightR3A10_in.get_val();
                                ends[65]=2;
                                ;
                                appliancePowerLightR3A10Int_thread_65 = (Integer)appliancePowerLightR3A10_in.get_value();
                                System.out.println("LightR3A10's power:" + appliancePowerLightR3A10Int_thread_65);
                                appliancePowerLightR3A10String_thread_65 = "" + appliancePowerLightR3A10Int_thread_65;
                                lightR3A10PowerSignal.setPresent();
                currsigs.addElement(lightR3A10PowerSignal);
                lightR3A10PowerSignal.setValue(appliancePowerLightR3A10String_thread_65);
                System.out.println("Emitted lightR3A10PowerSignal");
                receivedLightR3A10Powers_55.setPresent();
                currsigs.addElement(receivedLightR3A10Powers_55);
                receivedLightR3A10Powers_55.setValue(new Integer(appliancePowerLightR3A10Int_thread_65));
                System.out.println("Emitted receivedLightR3A10Powers_55");
S4551=1;
active[65]=1;
                ends[65]=1;
tdone[65]=1;
                }
              else {
                active[65]=1;
                ends[65]=1;
tdone[65]=1;
                }
              }
            }
          }
public void thread1682199081(int [] tdone, int [] ends){
          if(tdone[64] != 1){
            S4537=1;
S4507=0;
S4497=0;
if(appliancePowerHeaterR3A9_in.get_preempted()){
                            tutu__399355596 = 0;
                            tutu__399355596 = appliancePowerHeaterR3A9_in.get_preempted() ? appliancePowerHeaterR3A9_in.refresh() : 0;
              S4497=1;
active[64]=1;
              ends[64]=1;
tdone[64]=1;
              }
            else {
              if(appliancePowerHeaterR3A9_in.get_r_s() > appliancePowerHeaterR3A9_in.get_r_r()){
                                tutu__444861942 = 0;
                                tutu__444861942 = appliancePowerHeaterR3A9_in.get_r_r();
                                tutu__444861942++;
                                appliancePowerHeaterR3A9_in.set_r_r(tutu__444861942);
                                appliancePowerHeaterR3A9_in.get_val();
                                ends[64]=2;
                                ;
                                appliancePowerHeaterR3A9Int_thread_64 = (Integer)appliancePowerHeaterR3A9_in.get_value();
                                System.out.println("HeaterR3A9's power:" + appliancePowerHeaterR3A9Int_thread_64);
                                appliancePowerHeaterR3A9String_thread_64 = "" + appliancePowerHeaterR3A9Int_thread_64;
                                heaterR3A9PowerSignal.setPresent();
                currsigs.addElement(heaterR3A9PowerSignal);
                heaterR3A9PowerSignal.setValue(appliancePowerHeaterR3A9String_thread_64);
                System.out.println("Emitted heaterR3A9PowerSignal");
                receivedHeaterR3A9Powers_55.setPresent();
                currsigs.addElement(receivedHeaterR3A9Powers_55);
                receivedHeaterR3A9Powers_55.setValue(new Integer(appliancePowerHeaterR3A9Int_thread_64));
                System.out.println("Emitted receivedHeaterR3A9Powers_55");
S4507=1;
active[64]=1;
                ends[64]=1;
tdone[64]=1;
                }
              else {
                active[64]=1;
                ends[64]=1;
tdone[64]=1;
                }
              }
            }
          }
public void thread1757994614(int [] tdone, int [] ends){
          if(tdone[63] != 1){
            S4493=1;
S4463=0;
S4453=0;
if(appliancePowerHeaterR2A8_in.get_preempted()){
                            tutu__1227869165 = 0;
                            tutu__1227869165 = appliancePowerHeaterR2A8_in.get_preempted() ? appliancePowerHeaterR2A8_in.refresh() : 0;
              S4453=1;
active[63]=1;
              ends[63]=1;
tdone[63]=1;
              }
            else {
              if(appliancePowerHeaterR2A8_in.get_r_s() > appliancePowerHeaterR2A8_in.get_r_r()){
                                tutu__443707696 = 0;
                                tutu__443707696 = appliancePowerHeaterR2A8_in.get_r_r();
                                tutu__443707696++;
                                appliancePowerHeaterR2A8_in.set_r_r(tutu__443707696);
                                appliancePowerHeaterR2A8_in.get_val();
                                ends[63]=2;
                                ;
                                appliancePowerHeaterR2A8Int_thread_63 = (Integer)appliancePowerHeaterR2A8_in.get_value();
                                System.out.println("HeaterR2A8's power:" + appliancePowerHeaterR2A8Int_thread_63);
                                appliancePowerHeaterR2A8String_thread_63 = "" + appliancePowerHeaterR2A8Int_thread_63;
                                heaterR2A8PowerSignal.setPresent();
                currsigs.addElement(heaterR2A8PowerSignal);
                heaterR2A8PowerSignal.setValue(appliancePowerHeaterR2A8String_thread_63);
                System.out.println("Emitted heaterR2A8PowerSignal");
                receivedHeaterR2A8Powers_55.setPresent();
                currsigs.addElement(receivedHeaterR2A8Powers_55);
                receivedHeaterR2A8Powers_55.setValue(new Integer(appliancePowerHeaterR2A8Int_thread_63));
                System.out.println("Emitted receivedHeaterR2A8Powers_55");
S4463=1;
active[63]=1;
                ends[63]=1;
tdone[63]=1;
                }
              else {
                active[63]=1;
                ends[63]=1;
tdone[63]=1;
                }
              }
            }
          }
public void thread1733755433(int [] tdone, int [] ends){
          if(tdone[62] != 1){
            S4449=1;
S4419=0;
S4409=0;
if(appliancePowerPowerPlugsR2A7_in.get_preempted()){
                            tutu__1213327346 = 0;
                            tutu__1213327346 = appliancePowerPowerPlugsR2A7_in.get_preempted() ? appliancePowerPowerPlugsR2A7_in.refresh() : 0;
              S4409=1;
active[62]=1;
              ends[62]=1;
tdone[62]=1;
              }
            else {
              if(appliancePowerPowerPlugsR2A7_in.get_r_s() > appliancePowerPowerPlugsR2A7_in.get_r_r()){
                                tutu__427163493 = 0;
                                tutu__427163493 = appliancePowerPowerPlugsR2A7_in.get_r_r();
                                tutu__427163493++;
                                appliancePowerPowerPlugsR2A7_in.set_r_r(tutu__427163493);
                                appliancePowerPowerPlugsR2A7_in.get_val();
                                ends[62]=2;
                                ;
                                appliancePowerPowerPlugsR2A7Int_thread_62 = (Integer)appliancePowerPowerPlugsR2A7_in.get_value();
                                System.out.println("PowerPlugsR2A7's power:" + appliancePowerPowerPlugsR2A7Int_thread_62);
                                appliancePowerPowerPlugsR2A7String_thread_62 = "" + appliancePowerPowerPlugsR2A7Int_thread_62;
                                powerplugsR2A7PowerSignal.setPresent();
                currsigs.addElement(powerplugsR2A7PowerSignal);
                powerplugsR2A7PowerSignal.setValue(appliancePowerPowerPlugsR2A7String_thread_62);
                System.out.println("Emitted powerplugsR2A7PowerSignal");
                receivedPowerPlugsR2A7Powers_55.setPresent();
                currsigs.addElement(receivedPowerPlugsR2A7Powers_55);
                receivedPowerPlugsR2A7Powers_55.setValue(new Integer(appliancePowerPowerPlugsR2A7Int_thread_62));
                System.out.println("Emitted receivedPowerPlugsR2A7Powers_55");
S4419=1;
active[62]=1;
                ends[62]=1;
tdone[62]=1;
                }
              else {
                active[62]=1;
                ends[62]=1;
tdone[62]=1;
                }
              }
            }
          }
public void thread1806472976(int [] tdone, int [] ends){
          if(tdone[61] != 1){
            S4405=1;
S4375=0;
S4365=0;
if(appliancePowerTVR2A6_in.get_preempted()){
                            tutu__1540298353 = 0;
                            tutu__1540298353 = appliancePowerTVR2A6_in.get_preempted() ? appliancePowerTVR2A6_in.refresh() : 0;
              S4365=1;
active[61]=1;
              ends[61]=1;
tdone[61]=1;
              }
            else {
              if(appliancePowerTVR2A6_in.get_r_s() > appliancePowerTVR2A6_in.get_r_r()){
                                tutu__425624497 = 0;
                                tutu__425624497 = appliancePowerTVR2A6_in.get_r_r();
                                tutu__425624497++;
                                appliancePowerTVR2A6_in.set_r_r(tutu__425624497);
                                appliancePowerTVR2A6_in.get_val();
                                ends[61]=2;
                                ;
                                appliancePowerTVR2A6Int_thread_61 = (Integer)appliancePowerTVR2A6_in.get_value();
                                System.out.println("TVR2A6's power:" + appliancePowerTVR2A6Int_thread_61);
                                appliancePowerTVR2A6String_thread_61 = "" + appliancePowerTVR2A6Int_thread_61;
                                TVR2A6PowerSignal.setPresent();
                currsigs.addElement(TVR2A6PowerSignal);
                TVR2A6PowerSignal.setValue(appliancePowerTVR2A6String_thread_61);
                System.out.println("Emitted TVR2A6PowerSignal");
                receivedTVR2A6Powers_55.setPresent();
                currsigs.addElement(receivedTVR2A6Powers_55);
                receivedTVR2A6Powers_55.setValue(new Integer(appliancePowerTVR2A6Int_thread_61));
                System.out.println("Emitted receivedTVR2A6Powers_55");
S4375=1;
active[61]=1;
                ends[61]=1;
tdone[61]=1;
                }
              else {
                active[61]=1;
                ends[61]=1;
tdone[61]=1;
                }
              }
            }
          }
public void thread1781849046(int [] tdone, int [] ends){
          if(tdone[60] != 1){
            S4361=1;
S4331=0;
S4321=0;
if(appliancePowerOvenR1A5_in.get_preempted()){
                            tutu__711784785 = 0;
                            tutu__711784785 = appliancePowerOvenR1A5_in.get_preempted() ? appliancePowerOvenR1A5_in.refresh() : 0;
              S4321=1;
active[60]=1;
              ends[60]=1;
tdone[60]=1;
              }
            else {
              if(appliancePowerOvenR1A5_in.get_r_s() > appliancePowerOvenR1A5_in.get_r_r()){
                                tutu__424470251 = 0;
                                tutu__424470251 = appliancePowerOvenR1A5_in.get_r_r();
                                tutu__424470251++;
                                appliancePowerOvenR1A5_in.set_r_r(tutu__424470251);
                                appliancePowerOvenR1A5_in.get_val();
                                ends[60]=2;
                                ;
                                appliancePowerOvenR1A5Int_thread_60 = (Integer)appliancePowerOvenR1A5_in.get_value();
                                System.out.println("OvenR1A5's power:" + appliancePowerOvenR1A5Int_thread_60);
                                appliancePowerOvenR1A5String_thread_60 = "" + appliancePowerOvenR1A5Int_thread_60;
                                ovenR1A5PowerSignal.setPresent();
                currsigs.addElement(ovenR1A5PowerSignal);
                ovenR1A5PowerSignal.setValue(appliancePowerOvenR1A5String_thread_60);
                System.out.println("Emitted ovenR1A5PowerSignal");
                receivedOvenR1A5Powers_55.setPresent();
                currsigs.addElement(receivedOvenR1A5Powers_55);
                receivedOvenR1A5Powers_55.setValue(new Integer(appliancePowerOvenR1A5Int_thread_60));
                System.out.println("Emitted receivedOvenR1A5Powers_55");
S4331=1;
active[60]=1;
                ends[60]=1;
tdone[60]=1;
                }
              else {
                active[60]=1;
                ends[60]=1;
tdone[60]=1;
                }
              }
            }
          }
public void thread1462122710(int [] tdone, int [] ends){
          if(tdone[59] != 1){
            S4317=1;
S4287=0;
S4277=0;
if(appliancePowerStoveR1A4_in.get_preempted()){
                            tutu__443699791 = 0;
                            tutu__443699791 = appliancePowerStoveR1A4_in.get_preempted() ? appliancePowerStoveR1A4_in.refresh() : 0;
              S4277=1;
active[59]=1;
              ends[59]=1;
tdone[59]=1;
              }
            else {
              if(appliancePowerStoveR1A4_in.get_r_s() > appliancePowerStoveR1A4_in.get_r_r()){
                                tutu__424854999 = 0;
                                tutu__424854999 = appliancePowerStoveR1A4_in.get_r_r();
                                tutu__424854999++;
                                appliancePowerStoveR1A4_in.set_r_r(tutu__424854999);
                                appliancePowerStoveR1A4_in.get_val();
                                ends[59]=2;
                                ;
                                appliancePowerStoveR1A4Int_thread_59 = (Integer)appliancePowerStoveR1A4_in.get_value();
                                System.out.println("StoveR1A4's power:" + appliancePowerStoveR1A4Int_thread_59);
                                appliancePowerStoveR1A4String_thread_59 = "" + appliancePowerStoveR1A4Int_thread_59;
                                stoveR1A4PowerSignal.setPresent();
                currsigs.addElement(stoveR1A4PowerSignal);
                stoveR1A4PowerSignal.setValue(appliancePowerStoveR1A4String_thread_59);
                System.out.println("Emitted stoveR1A4PowerSignal");
                receivedStoveR1A4Powers_55.setPresent();
                currsigs.addElement(receivedStoveR1A4Powers_55);
                receivedStoveR1A4Powers_55.setValue(new Integer(appliancePowerStoveR1A4Int_thread_59));
                System.out.println("Emitted receivedStoveR1A4Powers_55");
S4287=1;
active[59]=1;
                ends[59]=1;
tdone[59]=1;
                }
              else {
                active[59]=1;
                ends[59]=1;
tdone[59]=1;
                }
              }
            }
          }
public void thread1439422525(int [] tdone, int [] ends){
          if(tdone[58] != 1){
            S4273=1;
S4243=0;
S4233=0;
if(appliancePowerDryerR1A3_in.get_preempted()){
                            tutu__94556686 = 0;
                            tutu__94556686 = appliancePowerDryerR1A3_in.get_preempted() ? appliancePowerDryerR1A3_in.refresh() : 0;
              S4233=1;
active[58]=1;
              ends[58]=1;
tdone[58]=1;
              }
            else {
              if(appliancePowerDryerR1A3_in.get_r_s() > appliancePowerDryerR1A3_in.get_r_r()){
                                tutu__433319475 = 0;
                                tutu__433319475 = appliancePowerDryerR1A3_in.get_r_r();
                                tutu__433319475++;
                                appliancePowerDryerR1A3_in.set_r_r(tutu__433319475);
                                appliancePowerDryerR1A3_in.get_val();
                                ends[58]=2;
                                ;
                                appliancePowerDryerR1A3Int_thread_58 = (Integer)appliancePowerDryerR1A3_in.get_value();
                                System.out.println("DryerR1A3's power:" + appliancePowerDryerR1A3Int_thread_58);
                                appliancePowerDryerR1A3String_thread_58 = "" + appliancePowerDryerR1A3Int_thread_58;
                                dryerR1A3PowerSignal.setPresent();
                currsigs.addElement(dryerR1A3PowerSignal);
                dryerR1A3PowerSignal.setValue(appliancePowerDryerR1A3String_thread_58);
                System.out.println("Emitted dryerR1A3PowerSignal");
                receivedDryerR1A3Powers_55.setPresent();
                currsigs.addElement(receivedDryerR1A3Powers_55);
                receivedDryerR1A3Powers_55.setValue(new Integer(appliancePowerDryerR1A3Int_thread_58));
                System.out.println("Emitted receivedDryerR1A3Powers_55");
S4243=1;
active[58]=1;
                ends[58]=1;
tdone[58]=1;
                }
              else {
                active[58]=1;
                ends[58]=1;
tdone[58]=1;
                }
              }
            }
          }
public void thread1513679063(int [] tdone, int [] ends){
          if(tdone[57] != 1){
            S4229=1;
S4199=0;
S4189=0;
if(appliancePowerDishwasherR1A2_in.get_preempted()){
                            tutu__923070254 = 0;
                            tutu__923070254 = appliancePowerDishwasherR1A2_in.get_preempted() ? appliancePowerDishwasherR1A2_in.refresh() : 0;
              S4189=1;
active[57]=1;
              ends[57]=1;
tdone[57]=1;
              }
            else {
              if(appliancePowerDishwasherR1A2_in.get_r_s() > appliancePowerDishwasherR1A2_in.get_r_r()){
                                tutu__432165229 = 0;
                                tutu__432165229 = appliancePowerDishwasherR1A2_in.get_r_r();
                                tutu__432165229++;
                                appliancePowerDishwasherR1A2_in.set_r_r(tutu__432165229);
                                appliancePowerDishwasherR1A2_in.get_val();
                                ends[57]=2;
                                ;
                                appliancePowerDishwasherR1A2Int_thread_57 = (Integer)appliancePowerDishwasherR1A2_in.get_value();
                                System.out.println("DishwasherR1A2's power:" + appliancePowerDishwasherR1A2Int_thread_57);
                                appliancePowerDishwasherR1A2String_thread_57 = "" + appliancePowerDishwasherR1A2Int_thread_57;
                                dishwasherR1A2PowerSignal.setPresent();
                currsigs.addElement(dishwasherR1A2PowerSignal);
                dishwasherR1A2PowerSignal.setValue(appliancePowerDishwasherR1A2String_thread_57);
                System.out.println("Emitted dishwasherR1A2PowerSignal");
                receivedDishwasherR1A2Powers_55.setPresent();
                currsigs.addElement(receivedDishwasherR1A2Powers_55);
                receivedDishwasherR1A2Powers_55.setValue(new Integer(appliancePowerDishwasherR1A2Int_thread_57));
                System.out.println("Emitted receivedDishwasherR1A2Powers_55");
S4199=1;
active[57]=1;
                ends[57]=1;
tdone[57]=1;
                }
              else {
                active[57]=1;
                ends[57]=1;
tdone[57]=1;
                }
              }
            }
          }
public void thread1487900886(int [] tdone, int [] ends){
          if(tdone[56] != 1){
            S4185=1;
S4155=0;
S4145=0;
if(appliancePowerFridgeR1A1_in.get_preempted()){
                            tutu__2078554830 = 0;
                            tutu__2078554830 = appliancePowerFridgeR1A1_in.get_preempted() ? appliancePowerFridgeR1A1_in.refresh() : 0;
              S4145=1;
active[56]=1;
              ends[56]=1;
tdone[56]=1;
              }
            else {
              if(appliancePowerFridgeR1A1_in.get_r_s() > appliancePowerFridgeR1A1_in.get_r_r()){
                                tutu__432549977 = 0;
                                tutu__432549977 = appliancePowerFridgeR1A1_in.get_r_r();
                                tutu__432549977++;
                                appliancePowerFridgeR1A1_in.set_r_r(tutu__432549977);
                                appliancePowerFridgeR1A1_in.get_val();
                                ends[56]=2;
                                ;
                                appliancePowerFridgeR1A1Int_thread_56 = (Integer)appliancePowerFridgeR1A1_in.get_value();
                                System.out.println("FridgeR1A1's power:" + appliancePowerFridgeR1A1Int_thread_56);
                                appliancePowerFridgeR1A1String_thread_56 = "" + appliancePowerFridgeR1A1Int_thread_56;
                                fridgeR1A1PowerSignal.setPresent();
                currsigs.addElement(fridgeR1A1PowerSignal);
                fridgeR1A1PowerSignal.setValue(appliancePowerFridgeR1A1String_thread_56);
                System.out.println("Emitted fridgeR1A1PowerSignal");
                receivedFridgeR1A1Powers_55.setPresent();
                currsigs.addElement(receivedFridgeR1A1Powers_55);
                receivedFridgeR1A1Powers_55.setValue(new Integer(appliancePowerFridgeR1A1Int_thread_56));
                System.out.println("Emitted receivedFridgeR1A1Powers_55");
S4155=1;
active[56]=1;
                ends[56]=1;
tdone[56]=1;
                }
              else {
                active[56]=1;
                ends[56]=1;
tdone[56]=1;
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
				switch(S4890){
          case 0 : 
          S4890=0;
          break RUN;
                    case 1 : 
          S4890=2;
          receivedFridgeR1A1Powers_55.setClear();
                    receivedDishwasherR1A2Powers_55.setClear();
                    receivedDryerR1A3Powers_55.setClear();
                    receivedStoveR1A4Powers_55.setClear();
                    receivedOvenR1A5Powers_55.setClear();
                    receivedTVR2A6Powers_55.setClear();
                    receivedPowerPlugsR2A7Powers_55.setClear();
                    receivedHeaterR2A8Powers_55.setClear();
                    receivedHeaterR3A9Powers_55.setClear();
                    receivedLightR3A10Powers_55.setClear();
                    receivedPowerPlugsR3A11Powers_55.setClear();
                    receivedLightR4A12Powers_55.setClear();
                    receivedFanR4A13Powers_55.setClear();
                    receivedWaterHeaterR4A14Powers_55.setClear();
          thread1487900886(tdone,ends);
          thread1513679063(tdone,ends);
          thread1439422525(tdone,ends);
          thread1462122710(tdone,ends);
          thread1781849046(tdone,ends);
          thread1806472976(tdone,ends);
          thread1733755433(tdone,ends);
          thread1757994614(tdone,ends);
          thread1682199081(tdone,ends);
          thread1706438262(tdone,ends);
          thread1633720719(tdone,ends);
          thread1657959900(tdone,ends);
          thread412527711(tdone,ends);
          thread436766891(tdone,ends);
          thread364049349(tdone,ends);
          int biggest357893367 = 0;
          if(ends[56]>=biggest357893367){
            biggest357893367=ends[56];
}
          if(ends[57]>=biggest357893367){
            biggest357893367=ends[57];
}
          if(ends[58]>=biggest357893367){
            biggest357893367=ends[58];
}
          if(ends[59]>=biggest357893367){
            biggest357893367=ends[59];
}
          if(ends[60]>=biggest357893367){
            biggest357893367=ends[60];
}
          if(ends[61]>=biggest357893367){
            biggest357893367=ends[61];
}
          if(ends[62]>=biggest357893367){
            biggest357893367=ends[62];
}
          if(ends[63]>=biggest357893367){
            biggest357893367=ends[63];
}
          if(ends[64]>=biggest357893367){
            biggest357893367=ends[64];
}
          if(ends[65]>=biggest357893367){
            biggest357893367=ends[65];
}
          if(ends[66]>=biggest357893367){
            biggest357893367=ends[66];
}
          if(ends[67]>=biggest357893367){
            biggest357893367=ends[67];
}
          if(ends[68]>=biggest357893367){
            biggest357893367=ends[68];
}
          if(ends[69]>=biggest357893367){
            biggest357893367=ends[69];
}
          if(ends[70]>=biggest357893367){
            biggest357893367=ends[70];
}
          if(biggest357893367 == 1){
            active[55]=1;
            ends[55]=1;
            break RUN;
            }
                    case 2 : 
                    receivedFridgeR1A1Powers_55.setClear();
                    receivedDishwasherR1A2Powers_55.setClear();
                    receivedDryerR1A3Powers_55.setClear();
                    receivedStoveR1A4Powers_55.setClear();
                    receivedOvenR1A5Powers_55.setClear();
                    receivedTVR2A6Powers_55.setClear();
                    receivedPowerPlugsR2A7Powers_55.setClear();
                    receivedHeaterR2A8Powers_55.setClear();
                    receivedHeaterR3A9Powers_55.setClear();
                    receivedLightR3A10Powers_55.setClear();
                    receivedPowerPlugsR3A11Powers_55.setClear();
                    receivedLightR4A12Powers_55.setClear();
                    receivedFanR4A13Powers_55.setClear();
                    receivedWaterHeaterR4A14Powers_55.setClear();
          thread356739120(tdone,ends);
          thread331730441(tdone,ends);
          thread600669923(tdone,ends);
          thread584895218(tdone,ends);
          thread451772098(tdone,ends);
          thread831519263(tdone,ends);
          thread704936875(tdone,ends);
          thread678389200(tdone,ends);
          thread936555712(tdone,ends);
          thread910008038(tdone,ends);
          thread398522971(tdone,ends);
          thread412373931(tdone,ends);
          thread537417324(tdone,ends);
          thread168443129(tdone,ends);
          thread293486521(tdone,ends);
          int biggest283483050 = 0;
          if(ends[56]>=biggest283483050){
            biggest283483050=ends[56];
}
          if(ends[57]>=biggest283483050){
            biggest283483050=ends[57];
}
          if(ends[58]>=biggest283483050){
            biggest283483050=ends[58];
}
          if(ends[59]>=biggest283483050){
            biggest283483050=ends[59];
}
          if(ends[60]>=biggest283483050){
            biggest283483050=ends[60];
}
          if(ends[61]>=biggest283483050){
            biggest283483050=ends[61];
}
          if(ends[62]>=biggest283483050){
            biggest283483050=ends[62];
}
          if(ends[63]>=biggest283483050){
            biggest283483050=ends[63];
}
          if(ends[64]>=biggest283483050){
            biggest283483050=ends[64];
}
          if(ends[65]>=biggest283483050){
            biggest283483050=ends[65];
}
          if(ends[66]>=biggest283483050){
            biggest283483050=ends[66];
}
          if(ends[67]>=biggest283483050){
            biggest283483050=ends[67];
}
          if(ends[68]>=biggest283483050){
            biggest283483050=ends[68];
}
          if(ends[69]>=biggest283483050){
            biggest283483050=ends[69];
}
          if(ends[70]>=biggest283483050){
            biggest283483050=ends[70];
}
          if(biggest283483050 == 1){
            active[55]=1;
            ends[55]=1;
            break RUN;
            }
          //FINXME code
if(biggest283483050 == 0){
            S4890=0;
active[55]=0;
            ends[55]=0;
S4890=0;
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
		receivedFridgeR1A1Powers_55 = new Signal();
		receivedDishwasherR1A2Powers_55 = new Signal();
		receivedDryerR1A3Powers_55 = new Signal();
		receivedStoveR1A4Powers_55 = new Signal();
		receivedOvenR1A5Powers_55 = new Signal();
		receivedTVR2A6Powers_55 = new Signal();
		receivedPowerPlugsR2A7Powers_55 = new Signal();
		receivedHeaterR2A8Powers_55 = new Signal();
		receivedHeaterR3A9Powers_55 = new Signal();
		receivedLightR3A10Powers_55 = new Signal();
		receivedPowerPlugsR3A11Powers_55 = new Signal();
		receivedLightR4A12Powers_55 = new Signal();
		receivedFanR4A13Powers_55 = new Signal();
		receivedWaterHeaterR4A14Powers_55 = new Signal();
		// --------------------------------------------------
		}
	public void run(){
		while(active[55] != 0){
		int index = 55;
			if(paused[index]==1 || suspended[index]==1 || active[index] == 0){
				for(int h=1;h<paused.length;++h){
					paused[h]=0;
				}
			}
			if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
			else{
				appliancePowerFridgeR1A1_in.update_r_s();
				appliancePowerDishwasherR1A2_in.update_r_s();
				appliancePowerDryerR1A3_in.update_r_s();
				appliancePowerStoveR1A4_in.update_r_s();
				appliancePowerOvenR1A5_in.update_r_s();
				appliancePowerTVR2A6_in.update_r_s();
				appliancePowerPowerPlugsR2A7_in.update_r_s();
				appliancePowerHeaterR2A8_in.update_r_s();
				appliancePowerHeaterR3A9_in.update_r_s();
				appliancePowerLightR3A10_in.update_r_s();
				appliancePowerPowerPlugsR3A11_in.update_r_s();
				appliancePowerLightR4A12_in.update_r_s();
				appliancePowerFanR4A13_in.update_r_s();
				appliancePowerWaterHeaterR4A14_in.update_r_s();
				if(!df){
					appliancePowerFridgeR1A1_in.gethook();
					appliancePowerDishwasherR1A2_in.gethook();
					appliancePowerDryerR1A3_in.gethook();
					appliancePowerStoveR1A4_in.gethook();
					appliancePowerOvenR1A5_in.gethook();
					appliancePowerTVR2A6_in.gethook();
					appliancePowerPowerPlugsR2A7_in.gethook();
					appliancePowerHeaterR2A8_in.gethook();
					appliancePowerHeaterR3A9_in.gethook();
					appliancePowerLightR3A10_in.gethook();
					appliancePowerPowerPlugsR3A11_in.gethook();
					appliancePowerLightR4A12_in.gethook();
					appliancePowerFanR4A13_in.gethook();
					appliancePowerWaterHeaterR4A14_in.gethook();
					df = true;
				}
				runClockDomain();
			}
			date.setpreclear();
			time.setpreclear();
			fridgeR1A1PowerSignal.setpreclear();
			dishwasherR1A2PowerSignal.setpreclear();
			dryerR1A3PowerSignal.setpreclear();
			stoveR1A4PowerSignal.setpreclear();
			ovenR1A5PowerSignal.setpreclear();
			TVR2A6PowerSignal.setpreclear();
			powerplugsR2A7PowerSignal.setpreclear();
			heaterR2A8PowerSignal.setpreclear();
			heaterR3A9PowerSignal.setpreclear();
			lightR3A10PowerSignal.setpreclear();
			powerplugsR3A11PowerSignal.setpreclear();
			lightR4A12PowerSignal.setpreclear();
			fanR4A13PowerSignal.setpreclear();
			waterHeaterR4A14PowerSignal.setpreclear();
			aggregatedPowerSignal.setpreclear();
			receivedFridgeR1A1Powers_55.setpreclear();
			receivedDishwasherR1A2Powers_55.setpreclear();
			receivedDryerR1A3Powers_55.setpreclear();
			receivedStoveR1A4Powers_55.setpreclear();
			receivedOvenR1A5Powers_55.setpreclear();
			receivedTVR2A6Powers_55.setpreclear();
			receivedPowerPlugsR2A7Powers_55.setpreclear();
			receivedHeaterR2A8Powers_55.setpreclear();
			receivedHeaterR3A9Powers_55.setpreclear();
			receivedLightR3A10Powers_55.setpreclear();
			receivedPowerPlugsR3A11Powers_55.setpreclear();
			receivedLightR4A12Powers_55.setpreclear();
			receivedFanR4A13Powers_55.setpreclear();
			receivedWaterHeaterR4A14Powers_55.setpreclear();
			int dummyint = 0;
			for(int qw=0;qw<currsigs.size();++qw){
				dummyint = ((Signal)currsigs.elementAt(qw)).getStatus() ? ((Signal)currsigs.elementAt(qw)).setprepresent() : ((Signal)currsigs.elementAt(qw)).setpreclear();
				((Signal)currsigs.elementAt(qw)).setpreval(((Signal)currsigs.elementAt(qw)).getValue());
			}
			currsigs.removeAllElements();
			date.sethook();
			date.setClear();
			time.sethook();
			time.setClear();
			fridgeR1A1PowerSignal.sethook();
			fridgeR1A1PowerSignal.setClear();
			dishwasherR1A2PowerSignal.sethook();
			dishwasherR1A2PowerSignal.setClear();
			dryerR1A3PowerSignal.sethook();
			dryerR1A3PowerSignal.setClear();
			stoveR1A4PowerSignal.sethook();
			stoveR1A4PowerSignal.setClear();
			ovenR1A5PowerSignal.sethook();
			ovenR1A5PowerSignal.setClear();
			TVR2A6PowerSignal.sethook();
			TVR2A6PowerSignal.setClear();
			powerplugsR2A7PowerSignal.sethook();
			powerplugsR2A7PowerSignal.setClear();
			heaterR2A8PowerSignal.sethook();
			heaterR2A8PowerSignal.setClear();
			heaterR3A9PowerSignal.sethook();
			heaterR3A9PowerSignal.setClear();
			lightR3A10PowerSignal.sethook();
			lightR3A10PowerSignal.setClear();
			powerplugsR3A11PowerSignal.sethook();
			powerplugsR3A11PowerSignal.setClear();
			lightR4A12PowerSignal.sethook();
			lightR4A12PowerSignal.setClear();
			fanR4A13PowerSignal.sethook();
			fanR4A13PowerSignal.setClear();
			waterHeaterR4A14PowerSignal.sethook();
			waterHeaterR4A14PowerSignal.setClear();
			aggregatedPowerSignal.sethook();
			aggregatedPowerSignal.setClear();
			receivedFridgeR1A1Powers_55.setClear();
			receivedDishwasherR1A2Powers_55.setClear();
			receivedDryerR1A3Powers_55.setClear();
			receivedStoveR1A4Powers_55.setClear();
			receivedOvenR1A5Powers_55.setClear();
			receivedTVR2A6Powers_55.setClear();
			receivedPowerPlugsR2A7Powers_55.setClear();
			receivedHeaterR2A8Powers_55.setClear();
			receivedHeaterR3A9Powers_55.setClear();
			receivedLightR3A10Powers_55.setClear();
			receivedPowerPlugsR3A11Powers_55.setClear();
			receivedLightR4A12Powers_55.setClear();
			receivedFanR4A13Powers_55.setClear();
			receivedWaterHeaterR4A14Powers_55.setClear();
			appliancePowerFridgeR1A1_in.sethook();
			appliancePowerDishwasherR1A2_in.sethook();
			appliancePowerDryerR1A3_in.sethook();
			appliancePowerStoveR1A4_in.sethook();
			appliancePowerOvenR1A5_in.sethook();
			appliancePowerTVR2A6_in.sethook();
			appliancePowerPowerPlugsR2A7_in.sethook();
			appliancePowerHeaterR2A8_in.sethook();
			appliancePowerHeaterR3A9_in.sethook();
			appliancePowerLightR3A10_in.sethook();
			appliancePowerPowerPlugsR3A11_in.sethook();
			appliancePowerLightR4A12_in.sethook();
			appliancePowerFanR4A13_in.sethook();
			appliancePowerWaterHeaterR4A14_in.sethook();
			if(paused[55]!=0 || suspended[55]!=0 || active[55]!=1);
			else{
				appliancePowerFridgeR1A1_in.gethook();
				appliancePowerDishwasherR1A2_in.gethook();
				appliancePowerDryerR1A3_in.gethook();
				appliancePowerStoveR1A4_in.gethook();
				appliancePowerOvenR1A5_in.gethook();
				appliancePowerTVR2A6_in.gethook();
				appliancePowerPowerPlugsR2A7_in.gethook();
				appliancePowerHeaterR2A8_in.gethook();
				appliancePowerHeaterR3A9_in.gethook();
				appliancePowerLightR3A10_in.gethook();
				appliancePowerPowerPlugsR3A11_in.gethook();
				appliancePowerLightR4A12_in.gethook();
				appliancePowerFanR4A13_in.gethook();
				appliancePowerWaterHeaterR4A14_in.gethook();
			}
			if(active[55] == 0){
				System.out.println("Finished CD");
			}
			if(!threaded) break;
		}
	}
}
