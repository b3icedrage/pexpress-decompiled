package defpackage;

import com.appsflyer.AppsFlyerLib;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App$initAppsFlyer$2$1", f = "App.kt", l = {279}, m = "invokeSuspend")
public final class C7858yd extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ApplicationC0963Fd e;
    public final /* synthetic */ AppsFlyerLib g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7858yd(ApplicationC0963Fd applicationC0963Fd, JM jm, AppsFlyerLib appsFlyerLib) {
        super(2, jm);
        this.e = applicationC0963Fd;
        this.g = appsFlyerLib;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7858yd(this.e, jm, this.g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7858yd) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        ApplicationC0963Fd applicationC0963Fd = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            this.d = 1;
            obj = ApplicationC0963Fd.e(applicationC0963Fd, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        String str = (String) obj;
        AppsFlyerLib appsFlyerLib = this.g;
        if (str != null) {
            appsFlyerLib.setCustomerUserId(str);
        }
        int i2 = ApplicationC0963Fd.F;
        appsFlyerLib.start(new C7227vd(applicationC0963Fd));
        return Unit.a;
    }
}
