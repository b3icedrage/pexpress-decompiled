package defpackage;

import io.sentry.protocol.B;
import io.sentry.protocol.C4521c;
import io.sentry.protocol.w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3331dH1 implements N80 {

    @Nullable
    public final String d;

    @Nullable
    public final String e;

    public C3331dH1() {
        String property = System.getProperty("java.version");
        String property2 = System.getProperty("java.vendor");
        this.d = property;
        this.e = property2;
    }

    @NotNull
    public final void a(@NotNull VF1 vf1) {
        C4521c c4521c = vf1.e;
        if (c4521c.i() == null) {
            c4521c.v(new w());
        }
        w wVarI = c4521c.i();
        if (wVarI != null && wVarI.d == null && wVarI.e == null) {
            wVarI.d = this.e;
            wVarI.e = this.d;
        }
    }

    @Override // defpackage.N80
    @NotNull
    public final EG1 f(@NotNull EG1 eg1, @Nullable C0841Do0 c0841Do0) {
        a(eg1);
        return eg1;
    }

    @Override // defpackage.N80
    @NotNull
    public final B g(@NotNull B b, @Nullable C0841Do0 c0841Do0) {
        a(b);
        return b;
    }
}
