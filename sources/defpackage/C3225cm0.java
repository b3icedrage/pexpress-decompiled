package defpackage;

import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.utils.GlideKt$reloadWithCrossFade-SxA4cEA$$inlined$applyWithCrossFade-8Mi8wO0$1", f = "Glide.kt", l = {456}, m = "invokeSuspend")
public final class C3225cm0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ long g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3225cm0(ImageView imageView, long j, JM jm, int i) {
        super(2, jm);
        this.e = imageView;
        this.g = j;
        this.h = i;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3225cm0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3225cm0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        ImageView imageView = this.e;
        long j = this.g;
        if (i == 0) {
            C1795Pt1.b(obj);
            ViewPropertyAnimator viewPropertyAnimatorAlpha = imageView.animate().alpha(0.0f);
            Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha, "alpha(...)");
            C7644xc.j(viewPropertyAnimatorAlpha, j).start();
            this.d = 1;
            if (IW.c(j, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C3435dm0.d(imageView, this.h);
        ViewPropertyAnimator viewPropertyAnimatorAlpha2 = imageView.animate().alpha(1.0f);
        Intrinsics.checkNotNullExpressionValue(viewPropertyAnimatorAlpha2, "alpha(...)");
        C7644xc.j(viewPropertyAnimatorAlpha2, j).start();
        return Unit.a;
    }
}
