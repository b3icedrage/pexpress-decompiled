package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class X80 {

    @NotNull
    public final C2704aN<C4466ii, C3572eS0> a = new C2704aN<>();

    public static final class a extends C3782fS0 implements A20 {
    }

    public final void a(@NotNull C4466ii definition) {
        Unit unit;
        Intrinsics.checkNotNullParameter(definition, "definition");
        C3572eS0 c3572eS0 = (C3572eS0) this.a.a(definition);
        Throwable th = null;
        if (c3572eS0 != null) {
            Object objF = c3572eS0.f();
            Intrinsics.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            Throwable th2 = null;
            for (C3782fS0 c3782fS0I = (C3782fS0) objF; !c3782fS0I.equals(c3572eS0); c3782fS0I = c3782fS0I.i()) {
                if (c3782fS0I instanceof a) {
                    try {
                        Intrinsics.c(null, "null cannot be cast to non-null type kotlin.Function1<T of io.ktor.events.Events.raise$lambda$2, kotlin.Unit>{ io.ktor.events.EventsKt.EventHandler<T of io.ktor.events.Events.raise$lambda$2> }");
                        throw null;
                    } catch (Throwable th3) {
                        if (th2 != null) {
                            J90.a(th2, th3);
                            unit = Unit.a;
                        } else {
                            unit = null;
                        }
                        if (unit == null) {
                            th2 = th3;
                        }
                    }
                }
            }
            th = th2;
        }
        if (th != null) {
            throw th;
        }
    }
}
