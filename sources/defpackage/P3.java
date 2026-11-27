package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class P3 extends O3 {

    @NotNull
    public final InterfaceC1442Lg1 c;

    @NotNull
    public final AbstractC0662Bg1.a<Integer> d;

    @NotNull
    public final C1699On1 e;

    @InterfaceC3368dU(c = "com.base.feature.trading.usecases.indicators.AccountModeSelectionUseCaseBase$writeValue$2", f = "AccountModeSelectionUseCaseBase.kt", l = {30}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Integer>, Object> {
        public int d;
        public final /* synthetic */ AW1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super JM<? super EnumC4164hF1>, ? extends Object> function1, JM<? super a> jm) {
            super(1, jm);
            this.e = (AW1) function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Integer> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r4v1, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                obj = this.e.invoke(this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return new Integer(((EnumC4164hF1) obj).e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P3(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.c = preferencesRepository;
        this.d = C1052Gg1.b("account_mode_selection");
        this.e = C4466ii.E(k(), C3784fT.a, IK1.a.a, EnumC4164hF1.g);
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Integer> getKey() {
        return this.d;
    }

    @Override // defpackage.O3
    @NotNull
    public final C1699On1 l() {
        return this.e;
    }

    @Nullable
    public final Object m(@NotNull Function1<? super JM<? super EnumC4164hF1>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return this.c.b(this, new a(function1, null), jm);
    }
}
