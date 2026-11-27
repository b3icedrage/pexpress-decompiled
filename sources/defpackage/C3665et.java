package defpackage;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.onesignal.core.activities.PermissionsActivity;
import io.sentry.android.core.b0;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3665et implements InterfaceC7846ya, InterfaceC7636xa, InterfaceC4286hq {
    public final Object d;
    public final Object e;
    public Object g;

    public C3665et(@NotNull InterfaceC1086Gs referenceCounter, @NotNull OS1 strongMemoryCache, @NotNull Kf2 weakMemoryCache) {
        Intrinsics.checkNotNullParameter(referenceCounter, "referenceCounter");
        Intrinsics.checkNotNullParameter(strongMemoryCache, "strongMemoryCache");
        Intrinsics.checkNotNullParameter(weakMemoryCache, "weakMemoryCache");
        this.d = referenceCounter;
        this.e = strongMemoryCache;
        this.g = weakMemoryCache;
    }

    @Override // defpackage.InterfaceC7636xa
    public void a(Bundle bundle) {
        synchronized (this.e) {
            Objects.toString(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            this.g = new CountDownLatch(1);
            ((C5293mP) this.d).a(bundle);
            Log.isLoggable("FirebaseCrashlytics", 2);
            try {
                if (((CountDownLatch) this.g).await(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, TimeUnit.MILLISECONDS)) {
                    Log.isLoggable("FirebaseCrashlytics", 2);
                } else {
                    b0.f("FirebaseCrashlytics", "Timeout exceeded while awaiting app exception callback from Analytics listener.", null);
                }
            } catch (InterruptedException unused) {
                b0.d("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.g = null;
        }
    }

    @Override // defpackage.InterfaceC7846ya
    public void c(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = (CountDownLatch) this.g;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.InterfaceC4286hq
    public void onDismiss() {
        InterfaceC4286hq interfaceC4286hq = (InterfaceC4286hq) this.d;
        if (interfaceC4286hq != null) {
            interfaceC4286hq.onDismiss();
        }
        ((ViewGroup) this.e).addView((ViewOnTouchListenerC3656eq) this.g);
    }

    public C3665et(@NonNull C5293mP c5293mP) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.e = new Object();
        this.d = c5293mP;
    }

    public C3665et(InterfaceC4286hq interfaceC4286hq, ViewGroup viewGroup, ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq) {
        this.d = interfaceC4286hq;
        this.e = viewGroup;
        this.g = viewOnTouchListenerC3656eq;
    }
}
