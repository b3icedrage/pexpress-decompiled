package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {
    public final a a;

    public static class a extends b {
        public static HandlerThread e;
        public static Handler f;
        public final int a;
        public SparseIntArray[] b = new SparseIntArray[9];
        public final ArrayList<WeakReference<Activity>> c = new ArrayList<>();
        public final WindowOnFrameMetricsAvailableListenerC0229a d = new WindowOnFrameMetricsAvailableListenerC0229a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        public class WindowOnFrameMetricsAvailableListenerC0229a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0229a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                a aVar = a.this;
                if ((aVar.a & 1) != 0) {
                    a.a(aVar.b[0], frameMetrics.getMetric(8));
                }
                if ((aVar.a & 2) != 0) {
                    a.a(aVar.b[1], frameMetrics.getMetric(1));
                }
                if ((aVar.a & 4) != 0) {
                    a.a(aVar.b[2], frameMetrics.getMetric(3));
                }
                if ((aVar.a & 8) != 0) {
                    a.a(aVar.b[3], frameMetrics.getMetric(4));
                }
                if ((aVar.a & 16) != 0) {
                    a.a(aVar.b[4], frameMetrics.getMetric(5));
                }
                if ((aVar.a & 64) != 0) {
                    a.a(aVar.b[6], frameMetrics.getMetric(7));
                }
                if ((aVar.a & 32) != 0) {
                    a.a(aVar.b[5], frameMetrics.getMetric(6));
                }
                if ((aVar.a & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                    a.a(aVar.b[7], frameMetrics.getMetric(0));
                }
                if ((aVar.a & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
                    a.a(aVar.b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i) {
            this.a = i;
        }

        public static void a(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }
    }

    public static class b {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public final void a(@NonNull Activity activity) {
        a aVar = this.a;
        aVar.getClass();
        if (a.e == null) {
            HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
            a.e = handlerThread;
            handlerThread.start();
            a.f = new Handler(a.e.getLooper());
        }
        for (int i = 0; i <= 8; i++) {
            SparseIntArray[] sparseIntArrayArr = aVar.b;
            if (sparseIntArrayArr[i] == null && (aVar.a & (1 << i)) != 0) {
                sparseIntArrayArr[i] = new SparseIntArray();
            }
        }
        activity.getWindow().addOnFrameMetricsAvailableListener(aVar.d, a.f);
        aVar.c.add(new WeakReference<>(activity));
    }

    public final void b(@NonNull Activity activity) {
        a aVar = this.a;
        ArrayList<WeakReference<Activity>> arrayList = aVar.c;
        for (WeakReference<Activity> weakReference : arrayList) {
            if (weakReference.get() == activity) {
                arrayList.remove(weakReference);
                break;
            }
        }
        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar.d);
    }

    public FrameMetricsAggregator(int i) {
        this.a = new a(i);
    }
}
