package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.io.IOException;
import kotlin.Unit;

/* JADX INFO: renamed from: Sg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.preferences.domain.repository.PreferencesRepositoryBaseKt$safeGet$1", f = "PreferencesRepositoryBase.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
public final class C1990Sg1 extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super AbstractC0662Bg1>, Throwable, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public /* synthetic */ Throwable g;

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
            Throwable th2 = this.g;
            if (!(th2 instanceof IOException) && !(th2 instanceof VN)) {
                throw th2;
            }
            th2.printStackTrace();
            Y11 y11 = new Y11(true, 1);
            this.e = th2;
            this.d = 1;
            if (interfaceC6606sf0.a(y11, this) == mn) {
                return mn;
            }
            th = th2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            th = (Throwable) this.e;
            C1795Pt1.b(obj);
        }
        b0.c("PreferencesRepository", String.valueOf(th.getMessage()));
        return Unit.a;
    }

    @Override // defpackage.InterfaceC1060Gj0
    public final Object k(InterfaceC6606sf0<? super AbstractC0662Bg1> interfaceC6606sf0, Throwable th, JM<? super Unit> jm) {
        C1990Sg1 c1990Sg1 = new C1990Sg1(3, jm);
        c1990Sg1.e = interfaceC6606sf0;
        c1990Sg1.g = th;
        return c1990Sg1.invokeSuspend(Unit.a);
    }
}
