package defpackage;

import android.annotation.SuppressLint;
import androidx.lifecycle.b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3150cR0<T> implements InterfaceC2941bR0<T> {

    @NotNull
    public final b<T> a;

    @NotNull
    public final CoroutineContext b;

    /* JADX INFO: renamed from: cR0$a */
    @InterfaceC3368dU(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {99}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ C3150cR0<T> e;
        public final /* synthetic */ T g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3150cR0<T> c3150cR0, T t, JM<? super a> jm) {
            super(2, jm);
            this.e = c3150cR0;
            this.g = t;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            return new a(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.d;
            C3150cR0<T> c3150cR0 = this.e;
            if (i == 0) {
                C1795Pt1.b(obj);
                b<T> bVar = c3150cR0.a;
                this.d = 1;
                if (bVar.n(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c3150cR0.a.k(this.g);
            return Unit.a;
        }
    }

    public C3150cR0(@NotNull b<T> target, @NotNull CoroutineContext context) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = target;
        RV rv = C6266r20.a;
        this.b = context.t(QV0.a.s1());
    }

    @Override // defpackage.InterfaceC2941bR0
    @SuppressLint({"NullSafeMutableLiveData"})
    @Nullable
    public final Object a(T t, @NotNull JM<? super Unit> jm) throws Throwable {
        Object objP = C5189lv.p(this.b, new a(this, t, null), jm);
        return objP == MN.d ? objP : Unit.a;
    }
}
