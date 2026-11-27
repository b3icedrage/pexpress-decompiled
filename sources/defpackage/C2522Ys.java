package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ys, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {188}, m = "invokeSuspend")
public final class C2522Ys extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C2827at<Object> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2522Ys(C2827at<Object> c2827at, JM<? super C2522Ys> jm) {
        super(2, jm);
        this.e = c2827at;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        return new C2522Ys(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2522Ys) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        C2827at<Object> c2827at = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            c2827at.getClass();
            this.d = 1;
            if (IW.b(5000L, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        if (c2827at.a.c <= 0) {
            C2936bP1 c2936bP1 = c2827at.e;
            if (c2936bP1 != null) {
                c2936bP1.l(null);
            }
            c2827at.e = null;
        }
        return Unit.a;
    }
}
