package defpackage;

import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class GN {
    public static final void a(@NotNull Throwable th, @NotNull CoroutineContext coroutineContext) {
        try {
            EN en = (EN) coroutineContext.p(EN.a.d);
            if (en != null) {
                en.P(th);
            } else {
                C0564Aa.o(th, coroutineContext);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                J90.a(runtimeException, th);
                th = runtimeException;
            }
            C0564Aa.o(th, coroutineContext);
        }
    }
}
