package defpackage;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final class FY0 implements Comparator<InterfaceC4675jU> {
    public static final FY0 a = new FY0();

    public static int a(InterfaceC4675jU interfaceC4675jU) {
        if (C4432iZ.m(interfaceC4675jU)) {
            return 8;
        }
        if (interfaceC4675jU instanceof InterfaceC3550eL) {
            return 7;
        }
        if (interfaceC4675jU instanceof InterfaceC0671Bj1) {
            return ((InterfaceC0671Bj1) interfaceC4675jU).r0() == null ? 6 : 5;
        }
        if (interfaceC4675jU instanceof InterfaceC2076Tj0) {
            return ((InterfaceC2076Tj0) interfaceC4675jU).r0() == null ? 4 : 3;
        }
        if (interfaceC4675jU instanceof FC) {
            return 2;
        }
        return interfaceC4675jU instanceof InterfaceC3714f62 ? 1 : 0;
    }

    @Override // java.util.Comparator
    public final int compare(InterfaceC4675jU interfaceC4675jU, InterfaceC4675jU interfaceC4675jU2) {
        Integer numValueOf;
        InterfaceC4675jU interfaceC4675jU3 = interfaceC4675jU;
        InterfaceC4675jU interfaceC4675jU4 = interfaceC4675jU2;
        int iA = a(interfaceC4675jU4) - a(interfaceC4675jU3);
        if (iA != 0) {
            numValueOf = Integer.valueOf(iA);
        } else if (C4432iZ.m(interfaceC4675jU3) && C4432iZ.m(interfaceC4675jU4)) {
            numValueOf = 0;
        } else {
            int iCompareTo = interfaceC4675jU3.getName().d.compareTo(interfaceC4675jU4.getName().d);
            numValueOf = iCompareTo != 0 ? Integer.valueOf(iCompareTo) : null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }
}
