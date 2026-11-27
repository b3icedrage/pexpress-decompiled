package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: ai, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2775ai implements C2567Zh.b {
    private final WeakReference<C2567Zh.b> appStateCallback;
    private final C2567Zh appStateMonitor;
    private EnumC1134Hi currentAppState;
    private boolean isRegisteredForAppState;

    public AbstractC2775ai() {
        this(C2567Zh.a());
    }

    public EnumC1134Hi getAppState() {
        return this.currentAppState;
    }

    @VisibleForTesting
    public WeakReference<C2567Zh.b> getAppStateCallback() {
        return this.appStateCallback;
    }

    public void incrementTsnsCount(int i) {
        this.appStateMonitor.l.addAndGet(i);
    }

    @Override // defpackage.C2567Zh.b
    public void onUpdateAppState(EnumC1134Hi enumC1134Hi) {
        EnumC1134Hi enumC1134Hi2 = this.currentAppState;
        EnumC1134Hi enumC1134Hi3 = EnumC1134Hi.APPLICATION_PROCESS_STATE_UNKNOWN;
        if (enumC1134Hi2 == enumC1134Hi3) {
            this.currentAppState = enumC1134Hi;
        } else {
            if (enumC1134Hi2 == enumC1134Hi || enumC1134Hi == enumC1134Hi3) {
                return;
            }
            this.currentAppState = EnumC1134Hi.FOREGROUND_BACKGROUND;
        }
    }

    public void registerForAppState() {
        if (this.isRegisteredForAppState) {
            return;
        }
        C2567Zh c2567Zh = this.appStateMonitor;
        this.currentAppState = c2567Zh.s;
        WeakReference<C2567Zh.b> weakReference = this.appStateCallback;
        synchronized (c2567Zh.j) {
            c2567Zh.j.add(weakReference);
        }
        this.isRegisteredForAppState = true;
    }

    public void unregisterForAppState() {
        if (this.isRegisteredForAppState) {
            C2567Zh c2567Zh = this.appStateMonitor;
            WeakReference<C2567Zh.b> weakReference = this.appStateCallback;
            synchronized (c2567Zh.j) {
                c2567Zh.j.remove(weakReference);
            }
            this.isRegisteredForAppState = false;
        }
    }

    public AbstractC2775ai(@NonNull C2567Zh c2567Zh) {
        this.isRegisteredForAppState = false;
        this.currentAppState = EnumC1134Hi.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.appStateMonitor = c2567Zh;
        this.appStateCallback = new WeakReference<>(this);
    }
}
