package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.view.PixelCopy;
import android.view.Surface;
import com.appsflyer.AFLogger;
import defpackage.EK;
import defpackage.NG1;
import io.sentry.android.replay.screenshot.b;
import io.sentry.android.replay.u;
import io.sentry.logger.f;
import io.sentry.util.C4527a;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class PF1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ PF1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((C2688aH1) this.e).loadLazyFields();
                return;
            case 1:
                AFLogger.unregisterClient((C4987kx1) this.e);
                return;
            case 2:
                final b bVar = (b) this.e;
                if (bVar.k.get()) {
                    bVar.c.getLogger().a(NG1.DEBUG, "Canvas Strategy already closed, skipping picture render", new Object[0]);
                    return;
                }
                Picture andSet = bVar.f.getAndSet(null);
                if (andSet == null) {
                    return;
                }
                try {
                    Canvas canvasLockHardwareCanvas = bVar.m.lockHardwareCanvas();
                    try {
                        canvasLockHardwareCanvas.drawColor(-16777216, PorterDuff.Mode.CLEAR);
                        andSet.draw(canvasLockHardwareCanvas);
                        bVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        if (bVar.e == null) {
                            C4527a.C0404a c0404aA = bVar.g.a();
                            try {
                                if (bVar.e == null) {
                                    u uVar = bVar.d;
                                    bVar.e = Bitmap.createBitmap(uVar.a, uVar.b, Bitmap.Config.ARGB_8888);
                                }
                                Unit unit = Unit.a;
                                c0404aA.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    C1589Ne.l(c0404aA, th);
                                    throw th2;
                                }
                            }
                        }
                        if (bVar.k.get()) {
                            bVar.c.getLogger().a(NG1.DEBUG, "Canvas Strategy already closed, skipping pixel copy request", new Object[0]);
                            return;
                        }
                        Surface surface = bVar.m;
                        Bitmap bitmap = bVar.e;
                        Intrinsics.checkNotNull(bitmap);
                        PixelCopy.request(surface, bitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.screenshot.a
                            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                            public final void onPixelCopyFinished(int i) {
                                b bVar2 = bVar;
                                if (bVar2.k.get()) {
                                    bVar2.c.getLogger().a(NG1.DEBUG, "CanvasStrategy is closed, ignoring capture result", new Object[0]);
                                    return;
                                }
                                if (i != 0) {
                                    bVar2.c.getLogger().a(NG1.ERROR, EK.e(i, "Canvas Strategy: PixelCopy failed with code "), new Object[0]);
                                    bVar2.i.set(false);
                                    return;
                                }
                                bVar2.i.set(true);
                                Bitmap bitmap2 = bVar2.e;
                                if (bitmap2 == null || bitmap2.isRecycled()) {
                                    return;
                                }
                                bVar2.b.A(bitmap2);
                            }
                        }, bVar.a.g());
                        return;
                    } catch (Throwable th3) {
                        bVar.m.unlockCanvasAndPost(canvasLockHardwareCanvas);
                        throw th3;
                    }
                } catch (Throwable th4) {
                    bVar.c.getLogger().d(NG1.ERROR, "Canvas Strategy: picture render failed", th4);
                    bVar.i.set(false);
                    return;
                }
            default:
                f fVar = (f) this.e;
                fVar.h.a(fVar.d.getShutdownTimeoutMillis());
                return;
        }
    }
}
