package defpackage;

import android.os.CountDownTimer;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: ih2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.WebSocketService$startTimer$1", f = "WebSocketService.kt", l = {108}, m = "invokeSuspend")
public final class C4465ih2 extends AW1 implements Function2<InterfaceC1133Hh1<? super Integer>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ int g;

    /* JADX INFO: renamed from: ih2$a */
    public static final class a extends CountDownTimer {
        public final /* synthetic */ InterfaceC1133Hh1<Integer> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC1133Hh1<? super Integer> interfaceC1133Hh1, long j) {
            super(j, 1000L);
            this.a = interfaceC1133Hh1;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            try {
                this.a.n(-1);
            } catch (CancellationException unused) {
                cancel();
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            try {
                this.a.n(Integer.valueOf((int) (j / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT))));
            } catch (CancellationException unused) {
                cancel();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4465ih2(int i, JM<? super C4465ih2> jm) {
        super(2, jm);
        this.g = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        C4465ih2 c4465ih2 = new C4465ih2(this.g, jm);
        c4465ih2.e = obj;
        return c4465ih2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1133Hh1<? super Integer> interfaceC1133Hh1, JM<? super Unit> jm) {
        return ((C4465ih2) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            InterfaceC1133Hh1 interfaceC1133Hh1 = (InterfaceC1133Hh1) this.e;
            a aVar = new a(interfaceC1133Hh1, ((long) this.g) * 1000);
            aVar.start();
            C5500nO c5500nO = new C5500nO(aVar, 8);
            this.d = 1;
            if (C0977Fh1.a(interfaceC1133Hh1, c5500nO, this) == mn) {
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
