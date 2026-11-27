package defpackage;

import io.sentry.protocol.B;
import io.sentry.protocol.u;
import io.sentry.transport.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ju0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1327Ju0 {
    void a(boolean z);

    void b(@NotNull PG1 pg1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0);

    @NotNull
    u c(@NotNull C2912bH1 c2912bH1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0);

    void d(long j);

    @NotNull
    u e(@NotNull B b, @Nullable H02 h02, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1);

    @NotNull
    u f(@NotNull EG1 eg1, @Nullable InterfaceC1015Fu0 interfaceC1015Fu0, @Nullable C0841Do0 c0841Do0);

    void g(@NotNull CI1 ci1, @Nullable C0841Do0 c0841Do0);

    @Nullable
    l h();

    default boolean i() {
        return true;
    }

    boolean isEnabled();

    @Nullable
    u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0);

    @NotNull
    u m(@NotNull C1445Lh1 c1445Lh1);
}
