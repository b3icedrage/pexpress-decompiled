package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dh2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3417dh2 implements InterfaceC3207ch2 {

    @NotNull
    public final GP1 a = C1589Ne.i(0);

    @Override // defpackage.InterfaceC3207ch2
    @NotNull
    public final String a() {
        GP1 gp1;
        Object value;
        int iIntValue;
        do {
            gp1 = this.a;
            value = gp1.getValue();
            iIntValue = ((Number) value).intValue() + 1;
        } while (!gp1.d(value, Integer.valueOf(iIntValue)));
        return String.valueOf(iIntValue);
    }
}
