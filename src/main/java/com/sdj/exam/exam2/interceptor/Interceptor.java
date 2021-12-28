package com.sdj.exam.exam2.interceptor;

import com.sdj.exam.exam2.container.ContainerComponent;
import com.sdj.exam.exam2.http.Rq;

public abstract class Interceptor implements ContainerComponent {
	abstract public boolean runBeforeAction(Rq rq);
}
