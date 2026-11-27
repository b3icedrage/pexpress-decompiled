package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6974uP1 extends AbstractC6764tP1 {

    @NotNull
    public final InterfaceC1442Lg1 d;

    @NotNull
    public final C6702t60 e;

    @NotNull
    public final AbstractC0662Bg1.a<Set<String>> f;

    /* JADX INFO: renamed from: uP1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.trading.usecases.StartedDemoTradingIdsUseCaseBase$writeValue$2", f = "StartedDemoTradingIdsUseCaseBase.kt", l = {26, 26}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Set<? extends String>>, Object> {
        public Set d;
        public int e;
        public final /* synthetic */ AW1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super JM<? super Set<String>>, ? extends Object> function1, JM<? super a> jm) {
            super(1, jm);
            this.h = (AW1) function1;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return C6974uP1.this.new a(this.h, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Set<? extends String>> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [AW1, kotlin.jvm.functions.Function1] */
        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            Set set;
            MN mn = MN.d;
            int i = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC6396rf0<Set<? extends String>> interfaceC6396rf0L = C6974uP1.this.l();
                this.e = 1;
                obj = C4466ii.o(interfaceC6396rf0L, this);
                if (obj != mn) {
                }
                return mn;
            }
            if (i == 1) {
                C1795Pt1.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = this.d;
                C1795Pt1.b(obj);
            }
            return C5907pJ1.d(set, (Iterable) obj);
            Set set2 = (Set) obj;
            this.d = set2;
            this.e = 2;
            Object objInvoke = this.h.invoke(this);
            if (objInvoke != mn) {
                set = set2;
                obj = objInvoke;
                return C5907pJ1.d(set, (Iterable) obj);
            }
            return mn;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6974uP1(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = preferencesRepository;
        this.e = C6702t60.d;
        this.f = C1052Gg1.e("STARTED_DEMO_IDS");
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Set<String>> getKey() {
        return this.f;
    }

    @Override // defpackage.AbstractC8082zg1
    public final Set<? extends String> k() {
        return this.e;
    }

    @Override // defpackage.AbstractC8082zg1
    @Nullable
    public final Object m(@NotNull Function1<? super JM<? super Set<? extends String>>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return j(this.d, new a(function1, null), (LM) jm);
    }
}
