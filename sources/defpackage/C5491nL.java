package defpackage;

import java.util.List;

/* JADX INFO: renamed from: nL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5491nL implements InterfaceC1608Nj0 {
    public final /* synthetic */ int d;

    public static int a(int i, int i2, long j) {
        return (Long.hashCode(j) + i) * i2;
    }

    public static int b(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static String c(String str, String str2) {
        return str + str2;
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 0:
                return Boolean.valueOf(((C6960uL.a) obj).d);
            default:
                return (C1774Pm1) obj;
        }
    }
}
