package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: Fo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0998Fo1 extends C5494nM implements InterfaceC7183vP0 {
    public boolean h;

    @Override // defpackage.InterfaceC7183vP0
    public final boolean isStarted() {
        return this.h;
    }

    public abstract Runnable q();

    public abstract void r();

    public abstract boolean s();

    @Override // defpackage.InterfaceC7183vP0
    public final void start() {
        if (this.h) {
            return;
        }
        if (this.e == null) {
            throw new IllegalStateException("context not set");
        }
        if (s()) {
            ((ScheduledThreadPoolExecutor) this.e.h()).execute(q());
            this.h = true;
        }
    }

    @Override // defpackage.InterfaceC7183vP0
    public final void stop() {
        if (this.h) {
            try {
                r();
            } catch (RuntimeException e) {
                m("on stop: " + e, e);
            }
            this.h = false;
        }
    }
}
