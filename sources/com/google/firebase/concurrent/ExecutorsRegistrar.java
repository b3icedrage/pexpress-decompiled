package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C2983be;
import defpackage.C3806fa0;
import defpackage.C3980gO0;
import defpackage.C4016ga0;
import defpackage.C4226ha0;
import defpackage.C4436ia0;
import defpackage.C4694ja0;
import defpackage.C4904ka0;
import defpackage.C5208m0;
import defpackage.C5244m9;
import defpackage.C7892yl1;
import defpackage.InterfaceC1233Ip;
import defpackage.InterfaceC3246ct;
import defpackage.InterfaceC5873p82;
import defpackage.PP0;
import defpackage.UG;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final C3980gO0<ScheduledExecutorService> a = new C3980gO0<>(new C3806fa0());
    public static final C3980gO0<ScheduledExecutorService> b = new C3980gO0<>(new C4016ga0(0));
    public static final C3980gO0<ScheduledExecutorService> c = new C3980gO0<>(new C4226ha0());
    public static final C3980gO0<ScheduledExecutorService> d = new C3980gO0<>(new C4436ia0());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<UG<?>> getComponents() {
        C7892yl1 c7892yl1 = new C7892yl1(InterfaceC1233Ip.class, ScheduledExecutorService.class);
        C7892yl1[] c7892yl1Arr = {new C7892yl1(InterfaceC1233Ip.class, ExecutorService.class), new C7892yl1(InterfaceC1233Ip.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(c7892yl1);
        for (C7892yl1 c7892yl2 : c7892yl1Arr) {
            C5208m0.f(c7892yl2, "Null interface");
        }
        Collections.addAll(hashSet, c7892yl1Arr);
        UG ug = new UG(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C2983be(2), hashSet3);
        C7892yl1 c7892yl3 = new C7892yl1(InterfaceC3246ct.class, ScheduledExecutorService.class);
        C7892yl1[] c7892yl1Arr2 = {new C7892yl1(InterfaceC3246ct.class, ExecutorService.class), new C7892yl1(InterfaceC3246ct.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(c7892yl3);
        for (C7892yl1 c7892yl4 : c7892yl1Arr2) {
            C5208m0.f(c7892yl4, "Null interface");
        }
        Collections.addAll(hashSet4, c7892yl1Arr2);
        UG ug2 = new UG(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new C5244m9(3), hashSet6);
        C7892yl1 c7892yl5 = new C7892yl1(PP0.class, ScheduledExecutorService.class);
        C7892yl1[] c7892yl1Arr3 = {new C7892yl1(PP0.class, ExecutorService.class), new C7892yl1(PP0.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(c7892yl5);
        for (C7892yl1 c7892yl6 : c7892yl1Arr3) {
            C5208m0.f(c7892yl6, "Null interface");
        }
        Collections.addAll(hashSet7, c7892yl1Arr3);
        UG ug3 = new UG(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new C4694ja0(0), hashSet9);
        C7892yl1 c7892yl7 = new C7892yl1(InterfaceC5873p82.class, Executor.class);
        C7892yl1[] c7892yl1Arr4 = new C7892yl1[0];
        HashSet hashSet10 = new HashSet();
        HashSet hashSet11 = new HashSet();
        HashSet hashSet12 = new HashSet();
        hashSet10.add(c7892yl7);
        for (C7892yl1 c7892yl8 : c7892yl1Arr4) {
            C5208m0.f(c7892yl8, "Null interface");
        }
        Collections.addAll(hashSet10, c7892yl1Arr4);
        return Arrays.asList(ug, ug2, ug3, new UG(null, new HashSet(hashSet10), new HashSet(hashSet11), 0, 0, new C4904ka0(0), hashSet12));
    }
}
