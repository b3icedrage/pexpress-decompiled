package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6281r6 extends C6072q6 {

    @NotNull
    public final C4923kf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6281r6(@NotNull C4923kf appDataRepository) {
        super(appDataRepository);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        this.b = appDataRepository;
    }

    @Override // defpackage.C6072q6
    @NotNull
    public final String b() {
        int iC;
        String str;
        C4923kf c4923kf = this.b;
        C6945uG c6945uG = (C6945uG) c4923kf.k.getValue();
        String str2 = c6945uG != null ? c6945uG.c : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() != 0) {
            return str2;
        }
        GP1 gp1 = c4923kf.k;
        C6945uG c6945uG2 = (C6945uG) gp1.getValue();
        if (c6945uG2 == null || (str = c6945uG2.b) == null) {
            C6945uG c6945uG3 = (C6945uG) gp1.getValue();
            String str3 = c6945uG3 != null ? c6945uG3.b : null;
            int iAbs = Math.abs(str3 != null ? str3.hashCode() : 0);
            int i = iAbs >> 31;
            int i2 = ~iAbs;
            Jl2 jl2 = new Jl2();
            jl2.g = iAbs;
            jl2.h = i;
            jl2.i = 0;
            jl2.j = 0;
            jl2.k = i2;
            jl2.l = (iAbs << 10) ^ (i >>> 4);
            if ((iAbs | i | i2) == 0) {
                throw new IllegalArgumentException("Initial state must have at least one non-zero element.");
            }
            for (int i3 = 0; i3 < 64; i3++) {
                jl2.c();
            }
            iC = jl2.c();
        } else {
            iC = Math.abs(str.hashCode());
        }
        return EK.e(iC, "User_");
    }
}
