package defpackage;

import io.sentry.logger.b;
import io.sentry.protocol.B;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import io.sentry.transport.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SD1 implements InterfaceC1171Hu0 {
    public static final SD1 a = new SD1();

    @Override // defpackage.InterfaceC1171Hu0
    public final void A(@Nullable PD1 pd1, @NotNull MD1 md1) {
        QF1.d(md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC4302hv0 B(@NotNull C4804k42 c4804k42, @NotNull C5437n42 c5437n42) {
        return QF1.e().B(c4804k42, c5437n42);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC1171Hu0 C(@NotNull String str) {
        return QF1.e().C("getCurrentScopes");
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void a(boolean z) {
        QF1.c();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void b(@Nullable String str, @Nullable String str2) {
        QF1.m(str, str2);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void c(@Nullable F f) {
        QF1.n(f);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void d(long j) {
        QF1.e().d(j);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC2347Wu0 e() {
        return QF1.e().e();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC1243Is0 clone() {
        return QF1.e().clone();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void g(@NotNull C0702Bu c0702Bu) {
        l(c0702Bu, new C0841Do0());
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final l h() {
        return QF1.e().h();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean i() {
        return QF1.e().i();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean isEnabled() {
        return QF1.j();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0) {
        return QF1.e().k(c3537eG1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0) {
        QF1.e().l(c0702Bu, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u m(@NotNull C1445Lh1 c1445Lh1) {
        return QF1.e().m(c1445Lh1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u n(@NotNull String str, @NotNull NG1 ng1, @NotNull MD1 md1) {
        return QF1.b(str, ng1, md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final C2688aH1 p() {
        return QF1.e().p();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u q(@NotNull Throwable th, @Nullable C0841Do0 c0841Do0, @NotNull MD1 md1) {
        return QF1.e().q(th, c0841Do0, md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC4302hv0 r() {
        return QF1.e().r();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void removeTag(@Nullable String str) {
        QF1.l(str);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void s() {
        QF1.e().s();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void t() {
        QF1.e().t();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final b u() {
        return QF1.e().u();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u v(@NotNull C2912bH1 c2912bH1, @Nullable C0841Do0 c0841Do0) {
        return QF1.e().v(c2912bH1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u w(@NotNull EG1 eg1, @Nullable C0841Do0 c0841Do0) {
        return QF1.e().w(eg1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u x(@NotNull B b, @Nullable H02 h02, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1) {
        return QF1.e().x(b, h02, c0841Do0, c1136Hi1);
    }
}
