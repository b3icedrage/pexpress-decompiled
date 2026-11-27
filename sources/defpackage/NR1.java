package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class NR1 extends MR1 {

    @NotNull
    public final InterfaceC1442Lg1 e;

    @NotNull
    public final AbstractC0662Bg1.a<Integer> f;

    @InterfaceC3368dU(c = "com.base.feature.trading.usecases.StrategySelectionUseCaseBase$writeValue$2", f = "StrategySelectionUseCaseBase.kt", l = {ConnectionResult.API_DISABLED_FOR_CONNECTION}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Integer>, Object> {
        public int d;
        public final /* synthetic */ AW1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super JM<? super EnumC2644a42>, ? extends Object> function1, JM<? super a> jm) {
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
            return new Integer(((EnumC2644a42) obj).d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NR1(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull InterfaceC0565Aa0 experimentsProviderApi) {
        super(preferencesRepository, experimentsProviderApi);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(experimentsProviderApi, "experimentsProviderApi");
        this.e = preferencesRepository;
        this.f = C1052Gg1.b("strategy_selection");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Integer> getKey() {
        return this.f;
    }

    @Nullable
    public final Object l(@NotNull Function1<? super JM<? super EnumC2644a42>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return j(this.e, new a(function1, null), (LM) jm);
    }
}
