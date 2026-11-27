package defpackage;

import android.annotation.SuppressLint;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: gX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class ScheduledFutureC4006gX<V> extends AbstractC2853b1<V> implements ScheduledFuture<V> {
    public final ScheduledFuture<?> l;

    /* JADX INFO: renamed from: gX$a */
    public class a {
        public a() {
        }

        public final void a(Exception exc) {
            ScheduledFutureC4006gX scheduledFutureC4006gX = ScheduledFutureC4006gX.this;
            scheduledFutureC4006gX.getClass();
            if (AbstractC2853b1.j.b(scheduledFutureC4006gX, null, new AbstractC2853b1.c(exc))) {
                AbstractC2853b1.i(scheduledFutureC4006gX);
            }
        }
    }

    /* JADX INFO: renamed from: gX$b */
    public interface b<T> {
        ScheduledFuture a(a aVar);
    }

    public ScheduledFutureC4006gX(b<V> bVar) {
        this.l = bVar.a(new a());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.l.compareTo(delayed);
    }

    @Override // defpackage.AbstractC2853b1
    public final void e() {
        ScheduledFuture<?> scheduledFuture = this.l;
        Object obj = this.d;
        scheduledFuture.cancel((obj instanceof AbstractC2853b1.b) && ((AbstractC2853b1.b) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.l.getDelay(timeUnit);
    }
}
