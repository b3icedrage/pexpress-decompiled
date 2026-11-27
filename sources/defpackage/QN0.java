package defpackage;

import com.pexpress.tool.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppViewModelBase$showAlert$1", f = "LaunchAppViewModelBase.kt", l = {103}, m = "invokeSuspend")
public final class QN0 extends AW1 implements Function1<JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ Gf2 e;
    public final /* synthetic */ ON0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QN0(Gf2 gf2, ON0 on0, JM<? super QN0> jm) {
        super(1, jm);
        this.e = gf2;
        this.g = on0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(JM<?> jm) {
        return new QN0(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(JM<? super Unit> jm) {
        return ((QN0) create(jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            VK1 vk1 = this.g.g;
            Gf2 gf2 = this.e;
            final Integer num = gf2.e;
            final Function0<Unit> action = gf2.f;
            Intrinsics.checkNotNullParameter(action, "action");
            final int i2 = gf2.b;
            final int i3 = gf2.c;
            final Integer num2 = gf2.d;
            final List<Object> list = gf2.g;
            Function1 receiver = new Function1() { // from class: fg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    C3692f10.a DialogFullScreenParams = (C3692f10.a) obj2;
                    Intrinsics.checkNotNullParameter(DialogFullScreenParams, "$this$DialogFullScreenParams");
                    DialogFullScreenParams.b = Integer.valueOf(R.color.networkErrorDialogBackground);
                    Integer num3 = num;
                    if (num3 != null) {
                        DialogFullScreenParams.d(num3.intValue());
                    }
                    Integer num4 = num2;
                    if (num4 != null) {
                        DialogFullScreenParams.f(num4.intValue());
                    }
                    TF tf = DialogFullScreenParams.a;
                    List<? extends Object> args = list;
                    if (args != null) {
                        Intrinsics.checkNotNullParameter(args, "args");
                        tf.e = args;
                    }
                    DialogFullScreenParams.g(i2);
                    TF.a.b(DialogFullScreenParams, Integer.valueOf(i3), new R4(action, 2), 6);
                    tf.o = false;
                    tf.n = false;
                    return Unit.a;
                }
            };
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            C3692f10.a aVar = new C3692f10.a();
            receiver.invoke(aVar);
            C3692f10 c3692f10 = new C3692f10(aVar.b, aVar.c);
            aVar.c(c3692f10);
            AbstractC1592Nf.k kVar = new AbstractC1592Nf.k(c3692f10);
            this.d = 1;
            if (vk1.a(kVar, null, null) == mn) {
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
