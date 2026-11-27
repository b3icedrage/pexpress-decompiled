package defpackage;

import io.sentry.android.core.b0;
import kotlin.coroutines.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Gf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1047Gf extends a implements EN {
    @Override // defpackage.EN
    public final void P(@NotNull Throwable th) {
        b0.f("AppDataUpdatersStarter", "updater failed", th);
    }
}
