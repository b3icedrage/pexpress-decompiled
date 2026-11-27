package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ij1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4472ij1 implements InterfaceC4263hj1 {

    @NotNull
    public final GP1 a;

    public C4472ij1() {
        GP1 gp1I = C1589Ne.i(0);
        this.a = gp1I;
        C4466ii.f(gp1I);
    }

    @Override // defpackage.InterfaceC4263hj1
    @Nullable
    public final Object a() {
        GP1 gp1;
        Object value;
        do {
            gp1 = this.a;
            value = gp1.getValue();
        } while (!gp1.d(value, new Integer(((Number) value).intValue() + 1)));
        return value;
    }
}
