package defpackage;

import io.sentry.logger.b;
import io.sentry.protocol.B;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import io.sentry.transport.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Hu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1171Hu0 {
    void A(@Nullable PD1 pd1, @NotNull MD1 md1);

    @NotNull
    InterfaceC4302hv0 B(@NotNull C4804k42 c4804k42, @NotNull C5437n42 c5437n42);

    @NotNull
    InterfaceC1171Hu0 C(@NotNull String str);

    void a(boolean z);

    void b(@Nullable String str, @Nullable String str2);

    void c(@Nullable F f);

    void d(long j);

    @Nullable
    InterfaceC2347Wu0 e();

    @Deprecated
    @NotNull
    InterfaceC1243Is0 f();

    void g(@NotNull C0702Bu c0702Bu);

    @Nullable
    l h();

    boolean i();

    boolean isEnabled();

    default boolean j() {
        return false;
    }

    @NotNull
    u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0);

    void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0);

    @NotNull
    u m(@NotNull C1445Lh1 c1445Lh1);

    @NotNull
    u n(@NotNull String str, @NotNull NG1 ng1, @NotNull MD1 md1);

    @NotNull
    default InterfaceC4302hv0 o(@NotNull String str, @NotNull String str2, @NotNull C5437n42 c5437n42) {
        return B(new C4804k42(str, str2), c5437n42);
    }

    @NotNull
    C2688aH1 p();

    @NotNull
    u q(@NotNull Throwable th, @Nullable C0841Do0 c0841Do0, @NotNull MD1 md1);

    @Nullable
    InterfaceC4302hv0 r();

    void removeTag(@Nullable String str);

    void s();

    void t();

    @NotNull
    b u();

    @NotNull
    u v(@NotNull C2912bH1 c2912bH1, @Nullable C0841Do0 c0841Do0);

    @NotNull
    u w(@NotNull EG1 eg1, @Nullable C0841Do0 c0841Do0);

    @NotNull
    u x(@NotNull B b, @Nullable H02 h02, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1);

    default void y(@NotNull MD1 md1) {
        A(null, md1);
    }

    @NotNull
    default u z(@NotNull Throwable th, @NotNull MD1 md1) {
        return q(th, new C0841Do0(), md1);
    }
}
