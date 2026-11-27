package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DC implements Function1 {
    public final /* synthetic */ int d;
    public final Object e;

    public /* synthetic */ DC(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e5  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        boolean zIsEmpty;
        C1758Ph0 c1758Ph0C;
        boolean z2 = false;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                InterfaceC7991zE0 m = (InterfaceC7991zE0) obj;
                Intrinsics.checkNotNullParameter(m, "m");
                if (((EC) obj2).b.invoke(m).booleanValue()) {
                    Intrinsics.checkNotNullParameter(m, "<this>");
                    if (m.o().a.isInterface()) {
                        String strE = m.getName().e();
                        int iHashCode = strE.hashCode();
                        if (iHashCode != -1776922004) {
                            if (iHashCode != -1295482945) {
                                if (iHashCode == 147696667 && strE.equals("hashCode")) {
                                    zIsEmpty = ((ArrayList) m.j()).isEmpty();
                                }
                            } else if (strE.equals("equals")) {
                                InterfaceC3953gF0 interfaceC3953gF0 = (InterfaceC3953gF0) CollectionsKt.W(m.j());
                                TE0 type = interfaceC3953gF0 != null ? interfaceC3953gF0.getType() : null;
                                InterfaceC4370iE0 interfaceC4370iE0 = type instanceof InterfaceC4370iE0 ? (InterfaceC4370iE0) type : null;
                                if (interfaceC4370iE0 != null) {
                                    InterfaceC4160hE0 interfaceC4160hE0G = interfaceC4370iE0.g();
                                    if ((interfaceC4160hE0G instanceof InterfaceC2902bE0) && (c1758Ph0C = ((InterfaceC2902bE0) interfaceC4160hE0G).c()) != null && c1758Ph0C.b().equals("java.lang.Object")) {
                                        zIsEmpty = true;
                                    }
                                }
                            }
                            zIsEmpty = false;
                        } else if (strE.equals("toString")) {
                            zIsEmpty = ((ArrayList) m.j()).isEmpty();
                        } else {
                            zIsEmpty = false;
                        }
                        if (zIsEmpty) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                InterfaceC1490Lx interfaceC1490Lx = (InterfaceC1490Lx) obj;
                if (interfaceC1490Lx.h() == InterfaceC1490Lx.a.d) {
                    ((C5693oI0) obj2).getClass();
                    InterfaceC4675jU interfaceC4675jUE = interfaceC1490Lx.e();
                    Intrinsics.c(interfaceC4675jUE, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    FC mutable = (FC) interfaceC4675jUE;
                    Intrinsics.checkNotNullParameter(mutable, "mutable");
                    String str = RE0.a;
                    if (RE0.j.containsKey(C4432iZ.g(mutable))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }
}
