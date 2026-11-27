package defpackage;

import io.sentry.logger.b;
import io.sentry.protocol.B;
import io.sentry.protocol.F;
import io.sentry.protocol.u;
import io.sentry.transport.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class C1551Mr0 implements InterfaceC1243Is0 {

    @NotNull
    public final RD1 a;

    public C1551Mr0(@NotNull RD1 rd1) {
        this.a = rd1;
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void A(@Nullable PD1 pd1, @NotNull MD1 md1) {
        this.a.A(null, md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC4302hv0 B(@NotNull C4804k42 c4804k42, @NotNull C5437n42 c5437n42) {
        return this.a.B(c4804k42, c5437n42);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final InterfaceC1171Hu0 C(@NotNull String str) {
        return this.a.C("getCurrentScopes");
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void a(boolean z) {
        this.a.a(z);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void b(@Nullable String str, @Nullable String str2) {
        this.a.b(str, str2);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void c(@Nullable F f) {
        this.a.c(f);
    }

    @Deprecated
    @NotNull
    public final Object clone() {
        return this.a.clone();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void d(long j) {
        this.a.d(j);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC2347Wu0 e() {
        return this.a.e();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Deprecated
    @NotNull
    /* JADX INFO: renamed from: f */
    public final InterfaceC1243Is0 clone() {
        return this.a.clone();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void g(@NotNull C0702Bu c0702Bu) {
        this.a.g(c0702Bu);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final l h() {
        return this.a.h();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean i() {
        return this.a.i();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u k(@NotNull C3537eG1 c3537eG1, @Nullable C0841Do0 c0841Do0) {
        return this.a.k(c3537eG1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void l(@NotNull C0702Bu c0702Bu, @Nullable C0841Do0 c0841Do0) {
        this.a.l(c0702Bu, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u m(@NotNull C1445Lh1 c1445Lh1) {
        return this.a.m(c1445Lh1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u n(@NotNull String str, @NotNull NG1 ng1, @NotNull MD1 md1) {
        return this.a.n(str, ng1, md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final C2688aH1 p() {
        return this.a.p();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u q(@NotNull Throwable th, @Nullable C0841Do0 c0841Do0, @NotNull MD1 md1) {
        return this.a.q(th, c0841Do0, md1);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @Nullable
    public final InterfaceC4302hv0 r() {
        return this.a.r();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void removeTag(@Nullable String str) {
        this.a.removeTag(str);
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void s() {
        this.a.s();
    }

    @Override // defpackage.InterfaceC1171Hu0
    public final void t() {
        this.a.t();
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final b u() {
        return this.a.f;
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u v(@NotNull C2912bH1 c2912bH1, @Nullable C0841Do0 c0841Do0) {
        return this.a.v(c2912bH1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u w(@NotNull EG1 eg1, @Nullable C0841Do0 c0841Do0) {
        return this.a.w(eg1, c0841Do0);
    }

    @Override // defpackage.InterfaceC1171Hu0
    @NotNull
    public final u x(@NotNull B b, @Nullable H02 h02, @Nullable C0841Do0 c0841Do0, @Nullable C1136Hi1 c1136Hi1) {
        return this.a.x(b, h02, c0841Do0, c1136Hi1);
    }
}
