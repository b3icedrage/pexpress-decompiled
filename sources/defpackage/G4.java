package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class G4 extends B4 {

    @NotNull
    public final M2 d;

    @NotNull
    public final VK1 e;

    @NotNull
    public final C4909kb1 f;

    @NotNull
    public final InterfaceC3880fu1 g;

    @NotNull
    public final String h;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.settings.AccountSettingsViewModelBase$onRateUsClick$1", f = "AccountSettingsViewModelBase.kt", l = {33}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return G4.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            final G4 g4 = G4.this;
            if (i == 0) {
                C1795Pt1.b(obj);
                VK1 vk1 = g4.e;
                String packageName = g4.f.a.getPackageName();
                Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
                AbstractC1592Nf.v vVar = new AbstractC1592Nf.v(StringsKt.N(packageName, ".test"), new C4(g4, 0), new Function1() { // from class: E4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        G4 g5 = g4;
                        g5.g.c((Integer) obj2, g5.h);
                        return Unit.a;
                    }
                }, new F4(g4, 0), new Function2() { // from class: D4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        int iIntValue = ((Integer) obj2).intValue();
                        Boolean bool = (Boolean) obj3;
                        bool.getClass();
                        G4 g5 = g4;
                        g5.g.a(iIntValue, g5.h, bool);
                        return Unit.a;
                    }
                });
                this.d = 1;
                if (vk1.a(vVar, null, null) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            g4.g.b(g4.h);
            return Unit.a;
        }
    }

    public G4(@NotNull M2 accountCallbacks, @NotNull VK1 showDialogUseCase, @NotNull C4909kb1 packageNameProvider, @NotNull InterfaceC3880fu1 eventManagerApi) {
        Intrinsics.checkNotNullParameter(accountCallbacks, "accountCallbacks");
        Intrinsics.checkNotNullParameter(showDialogUseCase, "showDialogUseCase");
        Intrinsics.checkNotNullParameter(packageNameProvider, "packageNameProvider");
        Intrinsics.checkNotNullParameter(eventManagerApi, "eventManagerApi");
        this.d = accountCallbacks;
        this.e = showDialogUseCase;
        this.f = packageNameProvider;
        this.g = eventManagerApi;
        L80 l80 = L80.MAX_PROFIT;
        this.h = "Account";
    }

    @Override // defpackage.B4
    public final void l() {
        this.d.d();
    }

    @Override // defpackage.B4
    public final void m() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    @Override // defpackage.B4
    public final void n() {
        this.d.h();
    }
}
