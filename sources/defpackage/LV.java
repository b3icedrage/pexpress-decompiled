package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.DefaultResponseValidationKt$addDefaultResponseValidation$1$1", f = "DefaultResponseValidation.kt", l = {42, 48}, m = "invokeSuspend")
public final class LV extends AW1 implements Function2<AbstractC5391mr0, JM<? super Unit>, Object> {
    public AbstractC5391mr0 d;
    public int e;
    public int g;
    public /* synthetic */ Object h;

    public LV() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        LV lv = new LV(2, jm);
        lv.h = obj;
        return lv;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC5391mr0 abstractC5391mr0, JM<? super Unit> jm) {
        return ((LV) create(abstractC5391mr0, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:44:0x00de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ea  */
    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        int i;
        AbstractC5391mr0 abstractC5391mr0;
        AbstractC5391mr0 abstractC5391mr0D;
        int i2;
        AbstractC5391mr0 abstractC5391mr1;
        AbstractC5391mr0 abstractC5391mr2;
        String str;
        Throwable c1325Jt1;
        MN mn = MN.d;
        int i3 = this.g;
        try {
            if (i3 == 0) {
                C1795Pt1.b(obj);
                AbstractC5391mr0 abstractC5391mr3 = (AbstractC5391mr0) this.h;
                if (!((Boolean) abstractC5391mr3.b().q().f(C1704Op0.b)).booleanValue()) {
                    NV.b.c("Skipping default response validation for " + abstractC5391mr3.b().c().getUrl());
                    return Unit.a;
                }
                i = abstractC5391mr3.g().d;
                C2250Vp0 c2250Vp0B = abstractC5391mr3.b();
                if (i < 300 || c2250Vp0B.q().d(NV.a)) {
                    return Unit.a;
                }
                this.h = abstractC5391mr3;
                this.e = i;
                this.g = 1;
                Object objO = C3057c.o(c2250Vp0B, this);
                if (objO != mn) {
                    abstractC5391mr0 = abstractC5391mr3;
                    obj = objO;
                }
                return mn;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = this.e;
                abstractC5391mr2 = this.d;
                abstractC5391mr1 = (AbstractC5391mr0) this.h;
                try {
                    C1795Pt1.b(obj);
                    str = (String) obj;
                } catch (C3375dW0 unused) {
                    str = "<body failed decoding>";
                }
                if (300 > i2 && i2 < 400) {
                    c1325Jt1 = new C2434Xo1(abstractC5391mr2, str);
                } else if (400 > i2 && i2 < 500) {
                    c1325Jt1 = new VD(abstractC5391mr2, str);
                } else if (500 <= i2 || i2 >= 600) {
                    c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                } else {
                    c1325Jt1 = new C4641jI1(abstractC5391mr2, str);
                }
                NV.b.c("Default response validation for " + abstractC5391mr1.b().c().getUrl() + " failed with " + c1325Jt1);
                throw c1325Jt1;
            }
            i = this.e;
            abstractC5391mr0 = (AbstractC5391mr0) this.h;
            C1795Pt1.b(obj);
            this.h = abstractC5391mr0;
            this.d = abstractC5391mr0D;
            this.e = i;
            this.g = 2;
            Object objA = C6231qr0.a(abstractC5391mr0D, Charsets.UTF_8, this);
            if (objA != mn) {
                i2 = i;
                abstractC5391mr2 = abstractC5391mr0D;
                obj = objA;
                abstractC5391mr1 = abstractC5391mr0;
                str = (String) obj;
                if (300 > i2) {
                    if (400 > i2) {
                        if (500 <= i2) {
                            c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                        } else {
                            c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                        }
                    } else if (500 <= i2) {
                        c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                    } else {
                        c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                    }
                } else if (400 > i2) {
                    if (500 <= i2) {
                        c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                    } else {
                        c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                    }
                } else if (500 <= i2) {
                    c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                } else {
                    c1325Jt1 = new C1325Jt1(abstractC5391mr2, str);
                }
                NV.b.c("Default response validation for " + abstractC5391mr1.b().c().getUrl() + " failed with " + c1325Jt1);
                throw c1325Jt1;
            }
            return mn;
        } catch (C3375dW0 unused2) {
            i2 = i;
            abstractC5391mr1 = abstractC5391mr0;
            abstractC5391mr2 = abstractC5391mr0D;
            str = "<body failed decoding>";
        }
        C2250Vp0 c2250Vp0 = (C2250Vp0) obj;
        c2250Vp0.q().b(NV.a, Unit.a);
        abstractC5391mr0D = c2250Vp0.d();
    }
}
