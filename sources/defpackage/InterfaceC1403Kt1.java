package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Kt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1403Kt1 {
    void a(@NotNull C1781Pp c1781Pp, @NotNull Object obj, @NotNull String str);

    void b(@NotNull C1666Oc1 c1666Oc1, @NotNull Object obj, @NotNull String str);

    void c(@NotNull UU1 uu1, @NotNull Object obj, @NotNull String str);

    void d(@NotNull C4788k02 c4788k02, @NotNull Object obj, @NotNull String str);

    void e(@NotNull PZ1 pz1, @NotNull Object obj, @NotNull String str);

    default void f(@NotNull InterfaceC1013Ft1 response, @NotNull Object events, @NotNull String eventsString) {
        Intrinsics.checkNotNullParameter(response, "response");
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(eventsString, "eventsString");
        if (response instanceof UU1) {
            c((UU1) response, events, eventsString);
            return;
        }
        if (response instanceof C1781Pp) {
            a((C1781Pp) response, events, eventsString);
            return;
        }
        if (response instanceof C1666Oc1) {
            b((C1666Oc1) response, events, eventsString);
            return;
        }
        if (response instanceof C4788k02) {
            d((C4788k02) response, events, eventsString);
        } else if (response instanceof PZ1) {
            e((PZ1) response, events, eventsString);
        } else {
            g((C7220vb0) response, events, eventsString);
        }
    }

    void g(@NotNull C7220vb0 c7220vb0, @NotNull Object obj, @NotNull String str);
}
