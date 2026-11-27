package defpackage;

import android.content.Intent;
import com.onesignal.NotificationOpenedActivityHMS;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.onesignal.NotificationOpenedActivityHMS$processOpen$1", f = "NotificationOpenedActivityHMS.kt", l = {82}, m = "invokeSuspend")
public final class D61 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3027bp1<InterfaceC1950Rt0> e;
    public final /* synthetic */ NotificationOpenedActivityHMS g;
    public final /* synthetic */ Intent h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D61(C3027bp1<InterfaceC1950Rt0> c3027bp1, NotificationOpenedActivityHMS notificationOpenedActivityHMS, Intent intent, JM<? super D61> jm) {
        super(1, jm);
        this.e = c3027bp1;
        this.g = notificationOpenedActivityHMS;
        this.h = intent;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@NotNull JM<?> jm) {
        return new D61(this.e, this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((D61) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1950Rt0 interfaceC1950Rt0 = this.e.d;
            this.d = 1;
            if (interfaceC1950Rt0.handleHMSNotificationOpenIntent(this.g, this.h, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
