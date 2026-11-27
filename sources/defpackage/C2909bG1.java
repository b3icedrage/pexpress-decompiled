package defpackage;

import io.sentry.util.C4527a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2909bG1 {
    public static final C2909bG1 c = new C2909bG1();
    public boolean a;

    @NotNull
    public final C4527a b = new C4527a();

    public final void a() {
        C4527a.C0404a c0404aA = this.b.a();
        try {
            if (!this.a) {
                this.a = true;
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                c0404aA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
