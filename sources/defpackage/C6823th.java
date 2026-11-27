package defpackage;

import io.sentry.protocol.F;
import io.sentry.util.C4529c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: th, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.tool.AppImpl$wireSentryUserContext$3", f = "AppImpl.kt", l = {}, m = "invokeSuspend")
public final class C6823th extends AW1 implements Function2<C8001zH1, JM<? super Unit>, Object> {
    public /* synthetic */ Object d;

    public C6823th() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C6823th c6823th = new C6823th(2, jm);
        c6823th.d = obj;
        return c6823th;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C8001zH1 c8001zH1, JM<? super Unit> jm) {
        return ((C6823th) create(c8001zH1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        F f;
        MN mn = MN.d;
        C1795Pt1.b(obj);
        C8001zH1 c8001zH1 = (C8001zH1) this.d;
        QF1.m("auth.state", c8001zH1.d ? "signed_in" : "anonymous");
        String str = c8001zH1.a;
        if (str != null) {
            f = new F();
            f.e = str;
            f.d = c8001zH1.b;
            C5315mW0 builder = new C5315mW0();
            String str2 = c8001zH1.c;
            if (str2 != null) {
            }
            Boolean bool = c8001zH1.e;
            if (bool != null) {
            }
            builder.put("activated", String.valueOf(c8001zH1.f));
            Intrinsics.checkNotNullParameter(builder, "builder");
            f.k = C4529c.a(builder.c());
        } else {
            f = null;
        }
        QF1.n(f);
        return Unit.a;
    }
}
