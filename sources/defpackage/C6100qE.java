package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6100qE {

    @NotNull
    public static final C6100qE b = new C6100qE(null);

    @Nullable
    public final Throwable a;

    public C6100qE(@Nullable Throwable th) {
        this.a = th;
    }

    @NotNull
    public final Throwable a() {
        Throwable th = this.a;
        return th == null ? new C7149vE("The channel was closed") : th;
    }

    @NotNull
    public final String toString() {
        return "Closed[" + a() + ']';
    }
}
