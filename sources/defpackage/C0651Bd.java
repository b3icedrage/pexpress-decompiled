package defpackage;

import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App$initJivo$1", f = "App.kt", l = {}, m = "invokeSuspend")
public final class C0651Bd extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public final /* synthetic */ ApplicationC0963Fd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651Bd(ApplicationC0963Fd applicationC0963Fd, JM<? super C0651Bd> jm) {
        super(2, jm);
        this.d = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0651Bd(this.d, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0651Bd) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        C1795Pt1.b(obj);
        int i = ApplicationC0963Fd.F;
        ApplicationC0963Fd applicationC0963Fd = this.d;
        C3332dI.a aVar = new C3332dI.a();
        aVar.a = Integer.valueOf(R.string.welcome_message_placeholder_bot);
        aVar.c = Integer.valueOf(R.string.offline_message_placeholder_bot);
        aVar.d = true;
        R4 callback = new R4(applicationC0963Fd, 1);
        Intrinsics.checkNotNullParameter(callback, "callback");
        aVar.b = callback;
        C3332dI config = new C3332dI(aVar.a, callback, aVar.c, aVar.d);
        C4201hS c4201hS = C6104qF0.a;
        Intrinsics.checkNotNullParameter(config, "config");
        C6104qF0.i = config;
        WA wa = applicationC0963Fd.l;
        if (wa != null) {
            wa.a();
            return Unit.a;
        }
        Intrinsics.l("chatInitializer");
        throw null;
    }
}
