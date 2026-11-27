package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1847Ql implements InterfaceC1691Ol {

    @NotNull
    public final C5253mB1 a;

    @NotNull
    public final InterfaceC3951gE1 b;

    @NotNull
    public final InterfaceC1547Mq c;

    @NotNull
    public final AbstractC5045lD0 d;

    public C1847Ql(@NotNull C5253mB1 router, @NotNull InterfaceC3951gE1 screensProvider, @NotNull InterfaceC1547Mq baseRegistrationCallback, @NotNull AbstractC5045lD0 isShowUseCaseApi) {
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(screensProvider, "screensProvider");
        Intrinsics.checkNotNullParameter(baseRegistrationCallback, "baseRegistrationCallback");
        Intrinsics.checkNotNullParameter(isShowUseCaseApi, "isShowUseCaseApi");
        this.a = router;
        this.b = screensProvider;
        this.c = baseRegistrationCallback;
        this.d = isShowUseCaseApi;
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void a() {
        this.c.a();
    }

    @Override // defpackage.InterfaceC1691Ol
    @Nullable
    public final Object b(@NotNull C0912Em c0912Em) {
        Object objK = k(c0912Em);
        return objK == MN.d ? objK : Unit.a;
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void c() {
        this.c.c();
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void d() {
        this.c.d();
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void e() {
        this.c.e();
    }

    @Override // defpackage.InterfaceC1691Ol
    public final void f() {
        this.a.c(this.b.p(), false);
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void g() {
        this.c.g();
    }

    @Override // defpackage.InterfaceC1691Ol
    public final void h() {
        this.a.c(this.b.u(), false);
    }

    @Override // defpackage.InterfaceC1691Ol
    @Nullable
    public final Object i(@NotNull C0834Dm c0834Dm) {
        Object objK = k(c0834Dm);
        return objK == MN.d ? objK : Unit.a;
    }

    @Override // defpackage.InterfaceC1547Mq
    public final void j() {
        this.c.j();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(LM lm) {
        C1769Pl c1769Pl;
        C1847Ql c1847Ql;
        if (lm instanceof C1769Pl) {
            c1769Pl = (C1769Pl) lm;
            int i = c1769Pl.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1769Pl.h = i - Integer.MIN_VALUE;
            } else {
                c1769Pl = new C1769Pl(this, lm);
            }
        } else {
            c1769Pl = new C1769Pl(this, lm);
        }
        Object objO = c1769Pl.e;
        MN mn = MN.d;
        int i2 = c1769Pl.h;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Boolean> interfaceC6396rf0L = this.d.l();
            c1769Pl.d = this;
            c1769Pl.h = 1;
            objO = C4466ii.o(interfaceC6396rf0L, c1769Pl);
            if (objO == mn) {
                return mn;
            }
            c1847Ql = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1847Ql = c1769Pl.d;
            C1795Pt1.b(objO);
        }
        if (((Boolean) objO).booleanValue()) {
            c1847Ql.a.e(c1847Ql.b.k());
        } else {
            c1847Ql.a.e(c1847Ql.b.a());
        }
        return Unit.a;
    }
}
