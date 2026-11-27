package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class Od2 extends AbstractC1639Nt1 implements Function2<BH1<? super View>, JM<? super Unit>, Object> {
    public int e;
    public /* synthetic */ Object g;
    final /* synthetic */ View h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Od2(View view, JM<? super Od2> jm) {
        super(2, jm);
        this.h = view;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        Od2 od2 = new Od2(this.h, jm);
        od2.g = obj;
        return od2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BH1<? super View> bh1, JM<? super Unit> jm) {
        return ((Od2) create(bh1, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            BH1 bh1 = (BH1) this.g;
            View view = this.h;
            this.g = bh1;
            this.e = 1;
            bh1.c(view, this);
            return mn;
        }
        if (i == 1) {
            BH1 bh2 = (BH1) this.g;
            C1795Pt1.b(obj);
            View view2 = this.h;
            if (view2 instanceof ViewGroup) {
                this.g = null;
                this.e = 2;
                bh2.getClass();
                Object objD = bh2.d(new C3920g52(new Jd2((ViewGroup) view2), C2329Wo0.g), this);
                if (objD != mn) {
                    objD = Unit.a;
                }
                if (objD == mn) {
                    return mn;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
