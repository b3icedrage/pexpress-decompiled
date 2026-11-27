package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: dq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3447dq0 implements InterfaceC2514Yp0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(AbstractC3447dq0.class, "closed");

    @NotNull
    private volatile /* synthetic */ int closed;

    @NotNull
    public final ExecutorC7200vV d;

    @NotNull
    public final KW1 e;

    public AbstractC3447dq0() {
        Intrinsics.checkNotNullParameter("ktor-okhttp", "engineName");
        this.closed = 0;
        this.d = C6266r20.c;
        this.e = XO0.b(new C3238cq0(this, 0));
    }

    @Override // defpackage.InterfaceC2514Yp0
    public final void N0(@NotNull C1782Pp0 client) {
        Intrinsics.checkNotNullParameter(client, "client");
        client.k.f(C7491wr0.i, new C3029bq0(client, this, null));
    }

    @Override // defpackage.InterfaceC2514Yp0
    @NotNull
    public Set<InterfaceC3657eq0<?>> b0() {
        return C6702t60.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (g.compareAndSet(this, 0, 1)) {
            CoroutineContext.Element elementP = getE().p(XF0.a.d);
            FG fg = elementP instanceof FG ? (FG) elementP : null;
            if (fg == null) {
                return;
            }
            fg.X();
        }
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public CoroutineContext getE() {
        return (CoroutineContext) this.e.getValue();
    }
}
