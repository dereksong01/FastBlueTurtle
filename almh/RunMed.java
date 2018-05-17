//John Liu
//APCS2 pd8
//HW #50: Run Run Run
//2018-05-18

import java.util.NoSuchElementException;
public class RunMed{
    private ALHeapMax lilVals;
    private ALHeapMin bigVals;
    public RunMed(){
	lilVals=new ALHeapMax();
	bigVals=new ALHeapMin();
    }
    public Integer getMedian(){
	if(lilVals.size()==bigVals.size()){
	    return (lilVals.peekMax()+bigVals.peekMin())/2;
	}
	if(lilVals.size()>bigVals.size()){
	    if(lilVals.isEmpty()){
		throw new NoSuchElementException();
	    }
	    else{
		return lilVals.peekMax();
	    }
	}
	else{
	    if(bigVals.isEmpty()){
		throw new NoSuchElementException();
	    }
	    else{
		return bigVals.peekMin();
	    }
	}
    }
    public void add(Integer newVal){
	if(lilVals.isEmpty()){
	    lilVals.add(newVal);
	}
	else{
	    if(lilVals.peekMax().compareTo(newVal)>0){
		lilVals.add(newVal);
	    }
	    else{
		bigVals.add(newVal);
	    }
	}
	while(Math.abs(lilVals.size()-bigVals.size())>1){
	    if(lilVals.size()>bigVals.size()){
		bigVals.add(lilVals.removeMax());
	    }
	    else{
		lilVals.add(bigVals.removeMin());
	    }
	}
    }
}
