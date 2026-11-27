package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7150vE0 implements InterfaceC2391Xa0 {

    /* JADX INFO: renamed from: vE0$a */
    public static final class a {
        public static boolean a(@NotNull InterfaceC1335Jx superDescriptor, @NotNull InterfaceC1335Jx subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if (!(subDescriptor instanceof AE0) || !(superDescriptor instanceof InterfaceC2076Tj0)) {
                return false;
            }
            AE0 ae0 = (AE0) subDescriptor;
            ae0.j().size();
            InterfaceC2076Tj0 interfaceC2076Tj0 = (InterfaceC2076Tj0) superDescriptor;
            interfaceC2076Tj0.j().size();
            List<Xc2> listJ = ae0.U0().j();
            Intrinsics.checkNotNullExpressionValue(listJ, "getValueParameters(...)");
            List<Xc2> listJ2 = interfaceC2076Tj0.U0().j();
            Intrinsics.checkNotNullExpressionValue(listJ2, "getValueParameters(...)");
            for (Pair pair : CollectionsKt.j0(listJ, listJ2)) {
                Xc2 xc2 = (Xc2) pair.d;
                Xc2 xc3 = (Xc2) pair.e;
                Intrinsics.checkNotNull(xc2);
                boolean z = b((InterfaceC2076Tj0) subDescriptor, xc2) instanceof HI0.c;
                Intrinsics.checkNotNull(xc3);
                if (z != (b(interfaceC2076Tj0, xc3) instanceof HI0.c)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
        /* JADX WARN: Code duplicated, block: B:43:0x00db  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:48:0x00fe  */
        /* JADX WARN: Code duplicated, block: B:50:0x0104  */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x0110, code lost:
        
            if (defpackage.C4900kZ.g(r2).equals(defpackage.C4900kZ.g(r0)) != false) goto L52;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static defpackage.HI0 b(defpackage.InterfaceC2076Tj0 r7, defpackage.Xc2 r8) {
            /*
                Method dump skipped, instruction units count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7150vE0.a.b(Tj0, Xc2):HI0");
        }
    }

    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.a a() {
        return InterfaceC2391Xa0.a.d;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0047  */
    /* JADX WARN: Code duplicated, block: B:16:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b1  */
    @Override // defpackage.InterfaceC2391Xa0
    @NotNull
    public final InterfaceC2391Xa0.b b(@NotNull InterfaceC1335Jx superDescriptor, @NotNull InterfaceC1335Jx subDescriptor, @Nullable FC fc) {
        boolean z;
        InterfaceC2076Tj0 interfaceC2076Tj0;
        Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
        Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
        boolean z2 = superDescriptor instanceof InterfaceC1490Lx;
        InterfaceC2391Xa0.b bVar = InterfaceC2391Xa0.b.e;
        if (z2 && (subDescriptor instanceof InterfaceC2076Tj0) && !RK0.z(subDescriptor)) {
            int i = C1095Gv.l;
            InterfaceC2076Tj0 interfaceC2076Tj1 = (InterfaceC2076Tj0) subDescriptor;
            C5638o21 name = interfaceC2076Tj1.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            if (C1095Gv.b(name)) {
                InterfaceC1490Lx interfaceC1490LxC = C5712oO1.c((InterfaceC1490Lx) superDescriptor);
                z = superDescriptor instanceof InterfaceC2076Tj0;
                if (z) {
                    interfaceC2076Tj0 = (InterfaceC2076Tj0) superDescriptor;
                } else {
                    interfaceC2076Tj0 = null;
                }
                if (interfaceC2076Tj0 == null) {
                    if (fc instanceof InterfaceC3530eE0) {
                        if (!a.a(superDescriptor, subDescriptor)) {
                            return InterfaceC2391Xa0.b.g;
                        }
                    } else if (!a.a(superDescriptor, subDescriptor)) {
                        return InterfaceC2391Xa0.b.g;
                    }
                } else if (fc instanceof InterfaceC3530eE0) {
                    if (!a.a(superDescriptor, subDescriptor)) {
                        return InterfaceC2391Xa0.b.g;
                    }
                } else if (!a.a(superDescriptor, subDescriptor)) {
                    return InterfaceC2391Xa0.b.g;
                }
            } else {
                ArrayList arrayList = C6132qO1.a;
                C5638o21 name2 = interfaceC2076Tj1.getName();
                Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
                Intrinsics.checkNotNullParameter(name2, "<this>");
                if (C6132qO1.j.contains(name2)) {
                    InterfaceC1490Lx interfaceC1490LxC2 = C5712oO1.c((InterfaceC1490Lx) superDescriptor);
                    z = superDescriptor instanceof InterfaceC2076Tj0;
                    if (z) {
                        interfaceC2076Tj0 = (InterfaceC2076Tj0) superDescriptor;
                    } else {
                        interfaceC2076Tj0 = null;
                    }
                    if ((interfaceC2076Tj0 == null && interfaceC2076Tj1.C0() == interfaceC2076Tj0.C0()) || (interfaceC1490LxC2 != null && interfaceC2076Tj1.C0())) {
                        if ((fc instanceof InterfaceC3530eE0) || interfaceC2076Tj1.l0() != null || interfaceC1490LxC2 == null || C5712oO1.d(fc, interfaceC1490LxC2)) {
                            if (!a.a(superDescriptor, subDescriptor)) {
                                return InterfaceC2391Xa0.b.g;
                            }
                        } else if ((interfaceC1490LxC2 instanceof InterfaceC2076Tj0) && z && C1095Gv.a((InterfaceC2076Tj0) interfaceC1490LxC2) != null) {
                            String strA = C3689f01.a(interfaceC2076Tj1, 2);
                            InterfaceC2076Tj0 interfaceC2076Tj0U0 = ((InterfaceC2076Tj0) superDescriptor).U0();
                            Intrinsics.checkNotNullExpressionValue(interfaceC2076Tj0U0, "getOriginal(...)");
                            if (Intrinsics.a(strA, C3689f01.a(interfaceC2076Tj0U0, 2))) {
                                if (!a.a(superDescriptor, subDescriptor)) {
                                    return InterfaceC2391Xa0.b.g;
                                }
                            }
                        }
                    }
                } else if (!a.a(superDescriptor, subDescriptor)) {
                    return InterfaceC2391Xa0.b.g;
                }
            }
        } else if (!a.a(superDescriptor, subDescriptor)) {
            return InterfaceC2391Xa0.b.g;
        }
        return bVar;
    }
}
