package worker;

import java.util.ArrayList;

public interface VickiOrder {
	double tip();
	ArrayList<String> generate(WorkerInterface w);
}

