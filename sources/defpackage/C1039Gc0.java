package defpackage;

import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: renamed from: Gc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1039Gc0 implements InterfaceC1608Nj0, InterfaceC5056lH, A42, KD1.b {
    public static final /* synthetic */ int[] e = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    public final /* synthetic */ int d;

    public /* synthetic */ C1039Gc0(int i) {
        this.d = i;
    }

    public static int b(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static String d(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String e(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder f(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static /* synthetic */ int g(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] h(int i) {
        int[] iArr = new int[i];
        System.arraycopy(e, 0, iArr, 0, i);
        return iArr;
    }

    @Override // KD1.b
    public void a(CI1 ci1) {
    }

    @Override // defpackage.InterfaceC1608Nj0
    public Object apply(Object obj) {
        switch (this.d) {
            case 2:
                return Boolean.valueOf(((C6960uL.a) obj).c);
            case 3:
            case 4:
            default:
                return Boolean.valueOf(((C2980bd0) obj).f instanceof AbstractC5539na2.a);
            case 5:
                C5127ld1 c5127ld1 = (C5127ld1) obj;
                c5127ld1.getClass();
                try {
                    int iA = c5127ld1.a();
                    byte[] bArr = new byte[iA];
                    Logger logger = HE.f;
                    HE.a aVar = new HE.a(iA, bArr);
                    c5127ld1.l(aVar);
                    if (aVar.I() == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e2) {
                    throw new RuntimeException(c5127ld1.n("byte array"), e2);
                }
            case 6:
                return ((C7896ym1) obj).a;
        }
    }

    @Override // defpackage.InterfaceC5056lH
    public Object c(C1480Lt1 c1480Lt1) {
        return FirebaseInstallationsRegistrar.lambda$getComponents$0(c1480Lt1);
    }
}
