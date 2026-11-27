package defpackage;

import io.sentry.android.core.b0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.time.b;

/* JADX INFO: renamed from: sb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.webview.PageReadiness$startTimeout$1", f = "PageReadiness.kt", l = {101}, m = "invokeSuspend")
public final class C6591sb1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C6381rb1 e;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6591sb1(C6381rb1 c6381rb1, int i, JM<? super C6591sb1> jm) {
        super(2, jm);
        this.e = c6381rb1;
        this.g = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6591sb1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6591sb1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C6381rb1 c6381rb1 = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            long j = c6381rb1.j;
            this.d = 1;
            if (IW.c(j, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        if (this.g != c6381rb1.g) {
            return Unit.a;
        }
        b0.e("PageReadiness", c6381rb1.b + ": shown without " + c6381rb1.h + " after " + b.s(c6381rb1.c));
        c6381rb1.l = null;
        c6381rb1.k = null;
        c6381rb1.h = C6702t60.d;
        c6381rb1.c();
        return Unit.a;
    }
}
