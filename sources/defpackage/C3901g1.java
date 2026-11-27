package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3901g1 implements Function1 {
    public final RL1 d;
    public final AbstractC4579j1.a e;

    public C3901g1(RL1 rl1, AbstractC4579j1.a aVar) {
        this.d = rl1;
        this.e = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:23:0x0068->B:36:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object extractNullability) {
        InterfaceC5702oL0 interfaceC5702oL0;
        boolean z;
        C2054Tc c2054TcE;
        InterfaceC1583Nc interfaceC1583NcC;
        boolean z2;
        ArrayList arrayListA;
        Iterator it;
        Intrinsics.checkNotNullParameter(extractNullability, "$this$extractNullability");
        AbstractC4579j1.a aVar = this.e;
        RL1 rl1 = this.d;
        InterfaceC1583Nc annotation = (InterfaceC1583Nc) extractNullability;
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        if ((annotation instanceof InterfaceC1987Sf1) && ((InterfaceC1987Sf1) annotation).a()) {
            z = true;
        } else {
            boolean z3 = annotation instanceof C6550sO0;
            LO0 lo0 = rl1.c;
            if (z3) {
                lo0.a.t.getClass();
                if (!((C6550sO0) annotation).h) {
                    if (rl1.d != EnumC1976Sc.TYPE_PARAMETER_BOUNDS) {
                        interfaceC5702oL0 = aVar.a;
                        if (interfaceC5702oL0 != null && RK0.F((AbstractC4649jL0) interfaceC5702oL0)) {
                            c2054TcE = rl1.e();
                            c2054TcE.getClass();
                            Intrinsics.checkNotNullParameter(annotation, "annotation");
                            interfaceC1583NcC = c2054TcE.c(annotation, C4194hP1.a.t);
                            z2 = false;
                            if (interfaceC1583NcC != null) {
                                arrayListA = c2054TcE.a(false, interfaceC1583NcC);
                                if (!arrayListA.isEmpty()) {
                                    it = arrayListA.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.a((String) it.next(), "TYPE")) {
                                            z2 = true;
                                            break;
                                        }
                                    }
                                }
                            }
                            if (z2) {
                                lo0.a.t.getClass();
                            }
                        }
                        z = false;
                    }
                }
                z = true;
            } else {
                interfaceC5702oL0 = aVar.a;
                if (interfaceC5702oL0 != null) {
                    c2054TcE = rl1.e();
                    c2054TcE.getClass();
                    Intrinsics.checkNotNullParameter(annotation, "annotation");
                    interfaceC1583NcC = c2054TcE.c(annotation, C4194hP1.a.t);
                    z2 = false;
                    if (interfaceC1583NcC != null) {
                        arrayListA = c2054TcE.a(false, interfaceC1583NcC);
                        if (!arrayListA.isEmpty()) {
                            it = arrayListA.iterator();
                            while (it.hasNext()) {
                                if (Intrinsics.a((String) it.next(), "TYPE")) {
                                    z2 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (z2) {
                        lo0.a.t.getClass();
                        z = true;
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
