package defpackage;

import android.hardware.SensorEvent;
import com.appsflyer.internal.AFi1dSDK;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: eX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3586eX implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ RunnableC3586eX(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                Callable callable = (Callable) this.e;
                ScheduledFutureC4006gX.a aVar = (ScheduledFutureC4006gX.a) this.g;
                try {
                    Object objCall = callable.call();
                    ScheduledFutureC4006gX scheduledFutureC4006gX = ScheduledFutureC4006gX.this;
                    scheduledFutureC4006gX.getClass();
                    if (objCall == null) {
                        objCall = AbstractC2853b1.k;
                    }
                    if (AbstractC2853b1.j.b(scheduledFutureC4006gX, null, objCall)) {
                        AbstractC2853b1.i(scheduledFutureC4006gX);
                    }
                } catch (Exception e) {
                    aVar.a(e);
                    return;
                }
                break;
            case 1:
                OP1 this$0 = (OP1) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ML0 handler = (ML0) this.g;
                Intrinsics.checkNotNullParameter(handler, "$handler");
                this$0.O(handler);
                break;
            default:
                ((AFi1dSDK) this.e).P_((SensorEvent) this.g);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC3586eX(OP1 op1, Function1 function1) {
        this.d = 1;
        this.e = op1;
        this.g = (ML0) function1;
    }
}
