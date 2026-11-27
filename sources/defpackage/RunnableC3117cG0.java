package defpackage;

import android.app.job.JobParameters;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.base.feature.alertdialog.screen.StarViewGroup;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.jivosite.sdk.model.pojo.push.Device;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: cG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3117cG0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC3117cG0(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.g;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                int i = JobInfoSchedulerService.d;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            case 1:
                C7406wT0 this$0 = (C7406wT0) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                AbstractC5723oS0 message = (AbstractC5723oS0) obj;
                Intrinsics.checkNotNullParameter(message, "$message");
                this$0.getClass();
                LinkedList<AbstractC5723oS0> linkedList = new LinkedList<>(this$0.b);
                linkedList.add(message);
                this$0.b = linkedList;
                this$0.c.i(linkedList);
                return;
            case 2:
                if (((StarViewGroup) obj2).e == -1) {
                    LottieAnimationView lottieAnimationView = (LottieAnimationView) ((View) obj);
                    lottieAnimationView.setSelected(true);
                    lottieAnimationView.setSpeed(1.0f);
                    lottieAnimationView.r.add(LottieAnimationView.c.j);
                    lottieAnimationView.l.l();
                    return;
                }
                return;
            default:
                W92 this$1 = (W92) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Device deviceInfo = (Device) obj;
                Intrinsics.checkNotNullParameter(deviceInfo, "$deviceInfo");
                InterfaceC5889pD1 schedulers = this$1.b;
                Intrinsics.checkNotNullParameter(schedulers, "schedulers");
                Q92 supplier = new Q92(this$1, deviceInfo);
                Intrinsics.checkNotNullParameter(supplier, "supplier");
                R92 handler = R92.d;
                Intrinsics.checkNotNullParameter(handler, "handler");
                if (handler != null) {
                    EY0<C3457dt1<Object>> ey0 = new Z31(supplier, handler, schedulers).a;
                    ey0.f(new V92(ey0));
                    return;
                } else {
                    C6104qF0.b("You need to declare handle response method");
                    Unit.a.getClass();
                    throw new IllegalArgumentException("kotlin.Unit");
                }
        }
    }
}
