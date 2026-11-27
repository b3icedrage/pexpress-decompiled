package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5612nv implements Function0 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ C5612nv(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[LOOP:1: B:39:0x00d3->B:100:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:84:0x0216  */
    /* JADX WARN: Code duplicated, block: B:93:0x00e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00b2 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        GenericDeclaration genericDeclarationW;
        AbstractC2615Zx<Constructor<?>> abstractC2615ZxV;
        InterfaceC2076Tj0 interfaceC2076Tj0;
        InterfaceC4675jU interfaceC4675jUE;
        Member memberC;
        C2139Ue0.a aVar;
        Object next;
        List<Xc2> listJ;
        Iterator<T> it;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                C5822ov c5822ov = (C5822ov) obj;
                return c5822ov.a.i(c5822ov.b).y();
            case 1:
                return (InterfaceC1076Go1) obj;
            default:
                QC qc = DB1.a;
                C6535sJ0 c6535sJ0 = (C6535sJ0) obj;
                AbstractC7373wI0 abstractC7373wI0C = DB1.c(c6535sJ0.o());
                boolean z = abstractC7373wI0C instanceof AbstractC7373wI0.e;
                AbstractC5906pJ0 abstractC5906pJ0 = c6535sJ0.i;
                if (z) {
                    InterfaceC2076Tj0 interfaceC2076Tj0O = c6535sJ0.o();
                    InterfaceC4675jU interfaceC4675jUE2 = interfaceC2076Tj0O.e();
                    Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE2, "getContainingDeclaration(...)");
                    if (C7138vA0.d(interfaceC4675jUE2) && (interfaceC2076Tj0O instanceof InterfaceC3550eL) && ((InterfaceC3550eL) interfaceC2076Tj0O).G()) {
                        throw new C3761fL0(c6535sJ0.o().e() + " cannot have default arguments");
                    }
                    InterfaceC2076Tj0 interfaceC2076Tj0O2 = c6535sJ0.o();
                    List<Xc2> listJ2 = interfaceC2076Tj0O2.j();
                    Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
                    if (listJ2 == null || !listJ2.isEmpty()) {
                        Iterator<T> it2 = listJ2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                interfaceC4675jUE = interfaceC2076Tj0O2.e();
                                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                                if (C7138vA0.f(interfaceC4675jUE)) {
                                    memberC = c6535sJ0.i().c();
                                    Intrinsics.checkNotNull(memberC);
                                    if (Modifier.isStatic(memberC.getModifiers())) {
                                        aVar = new C2139Ue0.a(C4900kZ.l(interfaceC2076Tj0O2));
                                        while (true) {
                                            if (aVar.hasNext()) {
                                                next = aVar.next();
                                                listJ = ((InterfaceC1490Lx) next).j();
                                                Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                                                if (listJ != null || !listJ.isEmpty()) {
                                                    it = listJ.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            continue;
                                                        } else if (((Xc2) it.next()).z0()) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                next = null;
                                            }
                                        }
                                        if (next instanceof InterfaceC2076Tj0) {
                                            interfaceC2076Tj0 = (InterfaceC2076Tj0) next;
                                        }
                                    }
                                }
                            } else if (((Xc2) it2.next()).z0()) {
                            }
                            interfaceC2076Tj0 = null;
                        }
                    } else {
                        interfaceC4675jUE = interfaceC2076Tj0O2.e();
                        Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                        if (C7138vA0.f(interfaceC4675jUE)) {
                            memberC = c6535sJ0.i().c();
                            Intrinsics.checkNotNull(memberC);
                            if (Modifier.isStatic(memberC.getModifiers())) {
                                aVar = new C2139Ue0.a(C4900kZ.l(interfaceC2076Tj0O2));
                                while (true) {
                                    if (aVar.hasNext()) {
                                        next = aVar.next();
                                        listJ = ((InterfaceC1490Lx) next).j();
                                        Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
                                        if (listJ != null) {
                                        }
                                        it = listJ.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                continue;
                                            } else if (((Xc2) it.next()).z0()) {
                                            }
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                if (next instanceof InterfaceC2076Tj0) {
                                    interfaceC2076Tj0 = (InterfaceC2076Tj0) next;
                                } else {
                                    interfaceC2076Tj0 = null;
                                }
                            } else {
                                interfaceC2076Tj0 = null;
                            }
                        } else {
                            interfaceC2076Tj0 = null;
                        }
                    }
                    if (interfaceC2076Tj0 != null) {
                        AbstractC7583xI0.b bVar = ((AbstractC7373wI0.e) DB1.c(interfaceC2076Tj0)).a;
                        genericDeclarationW = abstractC5906pJ0.j(bVar.a, bVar.b, true);
                    } else {
                        AbstractC7583xI0.b bVar2 = ((AbstractC7373wI0.e) abstractC7373wI0C).a;
                        String str = bVar2.a;
                        Member memberC2 = c6535sJ0.i().c();
                        Intrinsics.checkNotNull(memberC2);
                        genericDeclarationW = abstractC5906pJ0.j(str, bVar2.b, !Modifier.isStatic(memberC2.getModifiers()));
                    }
                } else if (abstractC7373wI0C instanceof AbstractC7373wI0.d) {
                    if (c6535sJ0.s()) {
                        Class<?> clsH = abstractC5906pJ0.h();
                        List<GJ0> listB = c6535sJ0.b();
                        ArrayList arrayList = new ArrayList(XE.m(listB, 10));
                        Iterator<T> it3 = listB.iterator();
                        while (it3.hasNext()) {
                            String name = ((GJ0) it3.next()).getName();
                            Intrinsics.checkNotNull(name);
                            arrayList.add(name);
                        }
                        C1116Hc.a aVar2 = C1116Hc.a.d;
                        C1116Hc.b bVar3 = C1116Hc.b.d;
                        return new C1116Hc(clsH, arrayList, aVar2);
                    }
                    String desc = ((AbstractC7373wI0.d) abstractC7373wI0C).a.b;
                    abstractC5906pJ0.getClass();
                    Intrinsics.checkNotNullParameter(desc, "desc");
                    Class<?> clsH2 = abstractC5906pJ0.h();
                    ArrayList arrayList2 = new ArrayList();
                    AbstractC5906pJ0.i(arrayList2, abstractC5906pJ0.u(desc, false).a, true);
                    Unit unit = Unit.a;
                    genericDeclarationW = AbstractC5906pJ0.w(clsH2, arrayList2);
                } else {
                    if (abstractC7373wI0C instanceof AbstractC7373wI0.a) {
                        Class<?> clsH3 = abstractC5906pJ0.h();
                        List<Method> list = ((AbstractC7373wI0.a) abstractC7373wI0C).a;
                        ArrayList arrayList3 = new ArrayList(XE.m(list, 10));
                        Iterator<T> it4 = list.iterator();
                        while (it4.hasNext()) {
                            arrayList3.add(((Method) it4.next()).getName());
                        }
                        return new C1116Hc(clsH3, arrayList3, C1116Hc.a.d, C1116Hc.b.d, list);
                    }
                    genericDeclarationW = null;
                }
                if (genericDeclarationW instanceof Constructor) {
                    abstractC2615ZxV = c6535sJ0.u((Constructor) genericDeclarationW, c6535sJ0.o(), true);
                } else if (!(genericDeclarationW instanceof Method)) {
                    abstractC2615ZxV = null;
                } else if (c6535sJ0.o().k().p(C7437wc2.a) != null) {
                    InterfaceC4675jU interfaceC4675jUE3 = c6535sJ0.o().e();
                    Intrinsics.c(interfaceC4675jUE3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (((FC) interfaceC4675jUE3).E()) {
                        abstractC2615ZxV = c6535sJ0.v((Method) genericDeclarationW);
                    } else {
                        Method method = (Method) genericDeclarationW;
                        abstractC2615ZxV = c6535sJ0.t() ? new AbstractC2615Zx.g.b(method) : new AbstractC2615Zx.g.f(method);
                    }
                } else {
                    abstractC2615ZxV = c6535sJ0.v((Method) genericDeclarationW);
                }
                if (abstractC2615ZxV != null) {
                    return N7.c(abstractC2615ZxV, c6535sJ0.o(), true);
                }
                return null;
        }
    }
}
