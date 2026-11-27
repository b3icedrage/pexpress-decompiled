package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class JV1 implements IV1 {

    @NotNull
    public final GP1 a;

    @NotNull
    public final GP1 b;

    public JV1() {
        GP1 gp1I = C1589Ne.i(Boolean.FALSE);
        this.a = gp1I;
        this.b = gp1I;
    }

    @Override // defpackage.IV1
    public final void a(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        GP1 gp1 = this.a;
        gp1.getClass();
        gp1.m(null, boolValueOf);
    }

    @Override // defpackage.IV1
    @NotNull
    public final GP1 b() {
        return this.b;
    }
}
