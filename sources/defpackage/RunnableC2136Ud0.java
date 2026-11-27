package defpackage;

import android.graphics.Bitmap;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFd1vSDK;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.google.android.gms.common.Scopes;
import io.sentry.android.replay.screenshot.b;
import io.sentry.util.f;
import io.sentry.util.v;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import kotlin.Unit;

/* JADX INFO: renamed from: Ud0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2136Ud0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2136Ud0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        L02 l02;
        switch (this.d) {
            case 0:
                ((C2296Wd0) this.e).a();
                return;
            case 1:
                C2688aH1 c2688aH1 = (C2688aH1) this.e;
                String cacheDirPathWithoutDsn = c2688aH1.getCacheDirPathWithoutDsn();
                if (cacheDirPathWithoutDsn != null) {
                    File file = new File(cacheDirPathWithoutDsn, "app_start_profiling_config");
                    try {
                        f.a(file);
                        if (c2688aH1.isEnableAppStartProfiling() || c2688aH1.isStartProfilerOnAppStart()) {
                            if (!c2688aH1.isStartProfilerOnAppStart() && !c2688aH1.isTracingEnabled()) {
                                c2688aH1.getLogger().a(NG1.INFO, "Tracing is disabled and app start profiling will not start.", new Object[0]);
                                return;
                            }
                            if (file.createNewFile()) {
                                if (c2688aH1.isEnableAppStartProfiling()) {
                                    l02 = c2688aH1.getInternalTracesSampler().a(new C6935uC1(new C4804k42("app.launch", Scopes.PROFILE), Double.valueOf(v.a().c())));
                                } else {
                                    l02 = new L02(Boolean.FALSE, null);
                                }
                                RF1 rf1 = new RF1(c2688aH1, l02);
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
                                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, QF1.e));
                                    try {
                                        c2688aH1.getSerializer().b(rf1, bufferedWriter);
                                        bufferedWriter.close();
                                        fileOutputStream.close();
                                        return;
                                    } catch (Throwable th) {
                                        try {
                                            bufferedWriter.close();
                                            break;
                                        } catch (Throwable th2) {
                                            th.addSuppressed(th2);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                        break;
                                    } catch (Throwable th4) {
                                        th3.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th5) {
                        c2688aH1.getLogger().d(NG1.ERROR, "Unable to create app start profiling config file. ", th5);
                        return;
                    }
                }
                return;
            case 2:
                C2872b52 c2872b52 = (C2872b52) this.e;
                C7055um1 c7055um1 = c2872b52.p;
                boolean z = c2872b52.u;
                c7055um1.d.a(z);
                c7055um1.e.a(z);
                return;
            case 3:
                AFLogger.AFLogger((AFLoggerBase[]) this.e);
                return;
            case 4:
                ((AFd1vSDK) this.e).unregisterClient();
                return;
            default:
                b bVar = (b) this.e;
                Bitmap bitmap = bVar.e;
                if (bitmap != null) {
                    synchronized (bitmap) {
                        try {
                            if (!bitmap.isRecycled()) {
                                bitmap.recycle();
                            }
                            Unit unit = Unit.a;
                        } catch (Throwable th6) {
                            throw th6;
                        }
                    }
                }
                bVar.m.release();
                bVar.l.release();
                return;
        }
    }
}
