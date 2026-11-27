package defpackage;

import android.view.View;
import androidx.work.c;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.airbnb.lottie.LottieAnimationView;
import com.base.feature.alertdialog.screen.StarViewGroup;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class QK implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ QK(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Exception {
        switch (this.d) {
            case 0:
                ConstraintTrackingWorker this$0 = (ConstraintTrackingWorker) this.e;
                PQ0<? extends c.a> innerFuture = (PQ0) this.g;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
                synchronized (this$0.e) {
                    try {
                        if (this$0.g) {
                            C6117qJ1<c.a> future = this$0.h;
                            Intrinsics.checkNotNullExpressionValue(future, "future");
                            String str = RK.a;
                            future.j(new c.a.b());
                        } else {
                            this$0.h.l(innerFuture);
                        }
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                try {
                    ((Runnable) this.e).run();
                    return;
                } catch (Exception e) {
                    ((ScheduledFutureC4006gX.a) this.g).a(e);
                    throw e;
                }
            default:
                if (((StarViewGroup) this.e).selectedStarIndex == -1) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) this.g);
                    lottieAnimationView.setSelected(false);
                    lottieAnimationView.setProgress(0.5f);
                    lottieAnimationView.setSpeed(-1.5f);
                    lottieAnimationView.r.add(LottieAnimationView.c.j);
                    lottieAnimationView.l.n();
                    return;
                }
                return;
        }
    }
}
