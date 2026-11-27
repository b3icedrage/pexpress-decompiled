package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3087c70 implements Runnable {
    public static final String g = AS0.d("EnqueueRunnable");
    public final Vj2 d;
    public final R91 e;

    public RunnableC3087c70(@NonNull Vj2 vj2) {
        R91 r91 = new R91();
        this.d = vj2;
        this.e = r91;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x029b  */
    /* JADX WARN: Code duplicated, block: B:85:0x0171  */
    public static boolean a(@NonNull Vj2 vj2) throws Throwable {
        boolean z;
        boolean z2;
        boolean z3;
        WorkDatabase workDatabase;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        EnumC3638ek2 enumC3638ek2;
        List list;
        vj2.getClass();
        String[] strArr = (String[]) Vj2.x(vj2).toArray(new String[0]);
        long jCurrentTimeMillis = System.currentTimeMillis();
        C4736jk2 c4736jk2 = vj2.e;
        WorkDatabase workDatabase2 = c4736jk2.c;
        boolean z9 = strArr != null && strArr.length > 0;
        EnumC3638ek2 enumC3638ek3 = EnumC3638ek2.g;
        EnumC3638ek2 enumC3638ek4 = EnumC3638ek2.j;
        EnumC3638ek2 enumC3638ek5 = EnumC3638ek2.h;
        if (z9) {
            int length = strArr.length;
            int i = 0;
            z2 = false;
            z3 = false;
            z = true;
            while (true) {
                if (i < length) {
                    String str = strArr[i];
                    Bk2 bk2O = workDatabase2.u().o(str);
                    if (bk2O == null) {
                        AS0.c().a(g, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    } else {
                        EnumC3638ek2 enumC3638ek6 = bk2O.b;
                        z &= enumC3638ek6 == enumC3638ek3;
                        if (enumC3638ek6 == enumC3638ek5) {
                            z3 = true;
                        } else if (enumC3638ek6 == enumC3638ek4) {
                            z2 = true;
                        }
                        i++;
                    }
                }
                z8 = true;
                z7 = false;
                vj2.k = z8;
                return z7;
            }
        }
        z = true;
        z2 = false;
        z3 = false;
        String str2 = vj2.f;
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        EnumC3638ek2 enumC3638ek7 = EnumC3638ek2.d;
        if (zIsEmpty || z9) {
            workDatabase = workDatabase2;
            z4 = zIsEmpty;
            z5 = z9;
            z6 = false;
        } else {
            ArrayList<Bk2.a> arrayListE = workDatabase2.u().e(str2);
            if (arrayListE.isEmpty()) {
                workDatabase = workDatabase2;
                z4 = zIsEmpty;
                z5 = z9;
            } else {
                workDatabase = workDatabase2;
                EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.g;
                z4 = zIsEmpty;
                EnumC5957pa0 enumC5957pa1 = EnumC5957pa0.h;
                boolean z10 = z9;
                EnumC5957pa0 enumC5957pa2 = vj2.g;
                if (enumC5957pa2 == enumC5957pa0 || enumC5957pa2 == enumC5957pa1) {
                    InterfaceC7627xX interfaceC7627xXP = workDatabase.p();
                    ArrayList arrayList = new ArrayList();
                    for (Bk2.a aVar : arrayListE) {
                        boolean z11 = z;
                        boolean z12 = z2;
                        if (interfaceC7627xXP.d(aVar.a)) {
                            z2 = z12;
                        } else {
                            EnumC3638ek2 enumC3638ek8 = aVar.b;
                            z11 &= enumC3638ek8 == enumC3638ek3;
                            if (enumC3638ek8 == enumC3638ek5) {
                                z2 = z12;
                                z3 = true;
                            } else {
                                z2 = enumC3638ek8 == enumC3638ek4 ? true : z12;
                            }
                            arrayList.add(aVar.a);
                        }
                        z = z11;
                    }
                    boolean z13 = z;
                    boolean z14 = z2;
                    if (enumC5957pa2 == enumC5957pa1 && (z14 || z3)) {
                        Ck2 ck2U = workDatabase.u();
                        Iterator it = ck2U.e(str2).iterator();
                        while (it.hasNext()) {
                            ck2U.a(((Bk2.a) it.next()).a);
                        }
                        z2 = false;
                        z3 = false;
                        list = Collections.EMPTY_LIST;
                    } else {
                        z2 = z14;
                        list = arrayList;
                    }
                    strArr = (String[]) list.toArray(strArr);
                    z5 = strArr.length > 0;
                    z = z13;
                } else {
                    if (enumC5957pa2 == EnumC5957pa0.e) {
                        Iterator it2 = arrayListE.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                EnumC3638ek2 enumC3638ek9 = ((Bk2.a) it2.next()).b;
                                if (enumC3638ek9 == enumC3638ek7 || enumC3638ek9 == EnumC3638ek2.e) {
                                    z8 = true;
                                    z7 = false;
                                    vj2.k = z8;
                                    return z7;
                                }
                            }
                        }
                    }
                    new C5201ly(c4736jk2, str2).run();
                    Ck2 ck2U2 = workDatabase.u();
                    Iterator it3 = arrayListE.iterator();
                    while (it3.hasNext()) {
                        ck2U2.a(((Bk2.a) it3.next()).a);
                    }
                    z5 = z10;
                    z6 = true;
                }
            }
            z6 = false;
        }
        Iterator<? extends AbstractC8099zk2> it4 = vj2.h.iterator();
        while (it4.hasNext()) {
            AbstractC8099zk2 next = it4.next();
            Bk2 workSpec = next.b;
            if (!z5 || z) {
                workSpec.n = jCurrentTimeMillis;
            } else if (z3) {
                workSpec.b = enumC3638ek5;
            } else if (z2) {
                workSpec.b = enumC3638ek4;
            } else {
                workSpec.b = EnumC3638ek2.i;
            }
            boolean z15 = workSpec.b == enumC3638ek7 ? true : z6;
            long j = jCurrentTimeMillis;
            Ck2 ck2U3 = workDatabase.u();
            List<InterfaceC5046lD1> schedulers = c4736jk2.e;
            C4736jk2 c4736jk3 = c4736jk2;
            Intrinsics.checkNotNullParameter(schedulers, "schedulers");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            boolean z16 = z15;
            if (Build.VERSION.SDK_INT < 26) {
                Intrinsics.checkNotNullParameter(workSpec, "workSpec");
                VK vk = workSpec.j;
                String name = ConstraintTrackingWorker.class.getName();
                String str3 = workSpec.c;
                if (Intrinsics.a(str3, name) || !(vk.d || vk.e)) {
                    enumC3638ek2 = enumC3638ek4;
                } else {
                    b.a aVar2 = new b.a();
                    aVar2.a(workSpec.e.a);
                    aVar2.a.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str3);
                    b input = new b(aVar2.a);
                    b.c(input);
                    Intrinsics.checkNotNullExpressionValue(input, "Builder().putAll(workSpe…ame)\n            .build()");
                    String workerClassName = ConstraintTrackingWorker.class.getName();
                    Intrinsics.checkNotNullExpressionValue(workerClassName, "name");
                    EnumC3638ek2 state = workSpec.b;
                    String str4 = workSpec.d;
                    long j2 = workSpec.g;
                    VK constraints = workSpec.j;
                    EnumC3638ek2 enumC3638ek10 = enumC3638ek4;
                    long j3 = workSpec.n;
                    enumC3638ek2 = enumC3638ek10;
                    boolean z17 = workSpec.q;
                    String id = workSpec.a;
                    Intrinsics.checkNotNullParameter(id, "id");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
                    Intrinsics.checkNotNullParameter(input, "input");
                    b output = workSpec.f;
                    Intrinsics.checkNotNullParameter(output, "output");
                    Intrinsics.checkNotNullParameter(constraints, "constraints");
                    EnumC1544Mp backoffPolicy = workSpec.l;
                    Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                    EnumC7428wa1 outOfQuotaPolicy = workSpec.r;
                    Intrinsics.checkNotNullParameter(outOfQuotaPolicy, "outOfQuotaPolicy");
                    workSpec = new Bk2(id, state, workerClassName, str4, input, output, j2, workSpec.h, workSpec.i, constraints, workSpec.k, backoffPolicy, workSpec.m, j3, workSpec.o, workSpec.p, z17, outOfQuotaPolicy, workSpec.s, workSpec.t);
                }
            } else {
                enumC3638ek2 = enumC3638ek4;
            }
            ck2U3.r(workSpec);
            UUID uuid = next.a;
            if (z5 != 0) {
                for (String str5 : strArr) {
                    String string = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
                    workDatabase.p().c(new C6786tX(string, str5));
                }
            }
            Sk2 sk2V = workDatabase.v();
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "id.toString()");
            sk2V.b(string2, next.c);
            if (!z4) {
                InterfaceC5579nk2 interfaceC5579nk2S = workDatabase.s();
                String string3 = uuid.toString();
                Intrinsics.checkNotNullExpressionValue(string3, "id.toString()");
                interfaceC5579nk2S.a(new C5369mk2(str2, string3));
            }
            z6 = z16;
            jCurrentTimeMillis = j;
            c4736jk2 = c4736jk3;
            z5 = z5;
            it4 = it4;
            enumC3638ek5 = enumC3638ek5;
            enumC3638ek4 = enumC3638ek2;
        }
        z7 = z6;
        z8 = true;
        vj2.k = z8;
        return z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        R91 r91 = this.e;
        Vj2 vj2 = this.d;
        try {
            vj2.getClass();
            C4736jk2 c4736jk2 = vj2.e;
            HashSet hashSet = new HashSet();
            hashSet.addAll(vj2.i);
            HashSet hashSetX = Vj2.x(vj2);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(vj2.i);
                    z = false;
                    break;
                } else if (hashSetX.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + vj2 + ")");
            }
            WorkDatabase workDatabase = c4736jk2.c;
            workDatabase.c();
            try {
                boolean zA = a(vj2);
                workDatabase.n();
                workDatabase.j();
                if (zA) {
                    C3811fb1.a(c4736jk2.a, RescheduleReceiver.class, true);
                    C6308rD1.a(c4736jk2.b, c4736jk2.c, c4736jk2.e);
                }
                r91.a(P91.a);
            } catch (Throwable th) {
                workDatabase.j();
                throw th;
            }
        } catch (Throwable th2) {
            r91.a(new P91.a.C0114a(th2));
        }
    }
}
