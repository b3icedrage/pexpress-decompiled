package defpackage;

import io.sentry.util.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UF1 implements InterfaceC3328dG1 {

    @NotNull
    public final InterfaceC3328dG1 a;

    public UF1() {
        if (r.a || !r.b) {
            this.a = new XG1();
        } else {
            this.a = new KG1();
        }
    }

    @Override // defpackage.InterfaceC3328dG1
    @NotNull
    public final AbstractC3118cG1 now() {
        return this.a.now();
    }
}
