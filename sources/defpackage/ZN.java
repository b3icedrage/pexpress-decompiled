package defpackage;

import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class ZN extends LiveData<AbstractC4645jK> {

    @NotNull
    public final Handler l = new Handler(Looper.getMainLooper());

    @Nullable
    public CountDownTimer m;

    public static final class a extends CountDownTimer {
        public final /* synthetic */ ZN a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j, ZN zn) {
            super(j, 1000L);
            this.a = zn;
        }

        public final void a(long j) {
            ZN zn = this.a;
            AbstractC4645jK abstractC4645jKD = zn.d();
            if (abstractC4645jKD instanceof AbstractC4645jK.c) {
                zn.i(AbstractC4645jK.c.a((AbstractC4645jK.c) abstractC4645jKD, j / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
            }
            if (abstractC4645jKD instanceof AbstractC4645jK.d) {
                zn.i(AbstractC4645jK.d.a((AbstractC4645jK.d) abstractC4645jKD, j / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
            }
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            a(0L);
            this.a.m = null;
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            a(j);
        }
    }

    public ZN() {
        k(AbstractC4645jK.e.a);
    }

    @Override // androidx.lifecycle.LiveData
    public final void g() {
        AbstractC4645jK abstractC4645jKD = d();
        if (abstractC4645jKD != null) {
            m(abstractC4645jKD);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void h() {
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.m = null;
    }

    public final void l(long j) {
        try {
            this.m = new a(j, this).start();
        } catch (Exception e) {
            C6104qF0.c("CountDownLiveData: cat not start timer", e);
        }
    }

    public final void m(AbstractC4645jK abstractC4645jK) {
        CountDownTimer countDownTimer = this.m;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.m = null;
        boolean z = abstractC4645jK instanceof AbstractC4645jK.c;
        Handler handler = this.l;
        if (z) {
            AbstractC4645jK.c cVar = (AbstractC4645jK.c) abstractC4645jK;
            final long jCurrentTimeMillis = cVar.a - System.currentTimeMillis();
            if (cVar.a == 0 || jCurrentTimeMillis <= 1000) {
                i(AbstractC4645jK.c.a(cVar, 0L));
                return;
            }
            i(AbstractC4645jK.c.a(cVar, jCurrentTimeMillis / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
            if (Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                l(jCurrentTimeMillis);
            } else {
                handler.post(new Runnable() { // from class: XN
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZN this$0 = this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.l(jCurrentTimeMillis);
                    }
                });
            }
        }
        if (abstractC4645jK instanceof AbstractC4645jK.d) {
            AbstractC4645jK.d dVar = (AbstractC4645jK.d) abstractC4645jK;
            final long jCurrentTimeMillis2 = dVar.a - System.currentTimeMillis();
            if (dVar.a == 0 || jCurrentTimeMillis2 <= 1000) {
                i(AbstractC4645jK.d.a(dVar, 0L));
                return;
            }
            i(AbstractC4645jK.d.a(dVar, jCurrentTimeMillis2 / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT)));
            if (Intrinsics.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                l(jCurrentTimeMillis2);
            } else {
                handler.post(new Runnable() { // from class: YN
                    @Override // java.lang.Runnable
                    public final void run() {
                        ZN this$0 = this;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.l(jCurrentTimeMillis2);
                    }
                });
            }
        }
    }
}
