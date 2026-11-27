package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class NP implements MP {

    @NotNull
    public final C3735fC1 a = new C3735fC1(new a(2, null));

    @InterfaceC3368dU(c = "com.base.feature.robot.robot.confirm_bottomsheet.usecases.CreateStopConfirmationParamsUseCaseBase$stopConfirmParamsFlow$1", f = "CreateStopConfirmationParamsUseCaseBase.kt", l = {14}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super EQ1>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super EQ1> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6606sf0 interfaceC6606sf0 = (InterfaceC6606sf0) this.e;
                EQ1 eq1 = new EQ1();
                this.d = 1;
                if (interfaceC6606sf0.a(eq1, this) == mn) {
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

    @Override // defpackage.MP
    @NotNull
    public final C3735fC1 a() {
        return this.a;
    }
}
