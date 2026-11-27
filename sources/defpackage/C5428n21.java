package defpackage;

import java.io.Serializable;

/* JADX INFO: renamed from: n21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5428n21 implements FS0, Serializable {
    public static final C5428n21 d = new C5428n21();

    @Override // defpackage.FS0
    public final String getName() {
        return "NOP";
    }

    public final String toString() {
        return getClass().getName().concat("(NOP)");
    }

    @Override // defpackage.FS0
    public final void a() {
    }

    @Override // defpackage.FS0
    public final void c(String str) {
    }
}
