package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class FH implements InterfaceC7316w20, InterfaceC7737y20 {
    public M91<InterfaceC7316w20> d;
    public volatile boolean e;

    @Override // defpackage.InterfaceC7737y20
    public final boolean a(InterfaceC7316w20 interfaceC7316w20) {
        InterfaceC7316w20 interfaceC7316w21;
        if (this.e) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return false;
                }
                M91<InterfaceC7316w20> m91 = this.d;
                if (m91 != null) {
                    InterfaceC7316w20[] interfaceC7316w20Arr = m91.d;
                    int i = m91.a;
                    int iHashCode = interfaceC7316w20.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    InterfaceC7316w20 interfaceC7316w22 = interfaceC7316w20Arr[i2];
                    if (interfaceC7316w22 != null) {
                        if (interfaceC7316w22.equals(interfaceC7316w20)) {
                            m91.b(interfaceC7316w20Arr, i2, i);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                interfaceC7316w21 = interfaceC7316w20Arr[i2];
                                if (interfaceC7316w21 == null) {
                                }
                            } while (!interfaceC7316w21.equals(interfaceC7316w20));
                            m91.b(interfaceC7316w20Arr, i2, i);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC7316w20
    public final void b() {
        if (this.e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.e) {
                    return;
                }
                this.e = true;
                M91<InterfaceC7316w20> m91 = this.d;
                ArrayList arrayList = null;
                this.d = null;
                if (m91 == null) {
                    return;
                }
                for (InterfaceC7316w20 interfaceC7316w20 : m91.d) {
                    if (interfaceC7316w20 instanceof InterfaceC7316w20) {
                        try {
                            interfaceC7316w20.b();
                        } catch (Throwable th) {
                            C4994l.j(th);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(th);
                        }
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new HH(arrayList);
                    }
                    throw C90.a((Throwable) arrayList.get(0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [T[], java.lang.Object[]] */
    @Override // defpackage.InterfaceC7737y20
    public final boolean c(InterfaceC7316w20 interfaceC7316w20) {
        if (!this.e) {
            synchronized (this) {
                try {
                    if (!this.e) {
                        M91<InterfaceC7316w20> m91 = this.d;
                        if (m91 == null) {
                            m91 = new M91<>();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            m91.a = iNumberOfLeadingZeros - 1;
                            m91.c = (int) (0.75f * iNumberOfLeadingZeros);
                            m91.d = new Object[iNumberOfLeadingZeros];
                            this.d = m91;
                        }
                        m91.a(interfaceC7316w20);
                        return true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        interfaceC7316w20.b();
        return false;
    }

    @Override // defpackage.InterfaceC7737y20
    public final boolean d(InterfaceC7316w20 interfaceC7316w20) {
        if (!a(interfaceC7316w20)) {
            return false;
        }
        interfaceC7316w20.b();
        return true;
    }
}
