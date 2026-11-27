package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Trace;
import androidx.activity.ComponentActivity;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.Toolbar;
import androidx.emoji2.text.c;
import androidx.emoji2.text.f;
import androidx.emoji2.text.g;
import androidx.lifecycle.LiveData;
import com.appsflyer.internal.AFe1wSDK;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import java.lang.ref.WeakReference;
import java.nio.MappedByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2555Zd implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2555Zd(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    private final void a() {
        TI ti;
        String strA;
        C2872b52 c2872b52 = (C2872b52) this.e;
        C1198Id0 c1198Id0 = c2872b52.h;
        c1198Id0.a();
        Context context = c1198Id0.a;
        c2872b52.n = context;
        c2872b52.s = context.getPackageName();
        c2872b52.o = C8002zI.e();
        c2872b52.p = new C7055um1(c2872b52.n, new C6006pm1(100L, 1L, TimeUnit.MINUTES));
        c2872b52.q = C2567Zh.a();
        InterfaceC1612Nk1<W42> interfaceC1612Nk1 = c2872b52.k;
        C8002zI c8002zI = c2872b52.o;
        c8002zI.getClass();
        TI ti2 = TI.e;
        synchronized (TI.class) {
            try {
                if (TI.e == null) {
                    TI.e = new TI();
                }
                ti = TI.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        ti.getClass();
        Long l = (Long) c8002zI.a.getRemoteConfigValueOrDefault("fpr_log_source", -1L);
        l.getClass();
        Map<Long, String> map = TI.f;
        if (!map.containsKey(l) || (strA = map.get(l)) == null) {
            C2745aa1<String> c2745aa1D = c8002zI.d(ti);
            strA = c2745aa1D.b() ? c2745aa1D.a() : "FIREPERF";
        } else {
            c8002zI.c.f("com.google.firebase.perf.LogSourceName", strA);
        }
        c2872b52.l = new C2988bf0(interfaceC1612Nk1, strA);
        C2567Zh c2567Zh = c2872b52.q;
        WeakReference weakReference = new WeakReference(C2872b52.w);
        synchronized (c2567Zh.j) {
            c2567Zh.j.add(weakReference);
        }
        C0822Di.a aVarH = C0822Di.H();
        c2872b52.r = aVarH;
        C1198Id0 c1198Id1 = c2872b52.h;
        c1198Id1.a();
        String str = c1198Id1.c.b;
        aVarH.p();
        C0822Di.w((C0822Di) aVarH.e, str);
        C2390Xa.a aVarC = C2390Xa.C();
        String str2 = c2872b52.s;
        aVarC.p();
        C2390Xa.w((C2390Xa) aVarC.e, str2);
        aVarC.p();
        C2390Xa.x((C2390Xa) aVarC.e);
        Context context2 = c2872b52.n;
        String str3 = "";
        try {
            String str4 = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).versionName;
            if (str4 != null) {
                str3 = str4;
            }
            while (true) {
                ConcurrentLinkedQueue<C2981bd1> concurrentLinkedQueue = c2872b52.e;
                if (concurrentLinkedQueue.isEmpty()) {
                    return;
                }
                C2981bd1 c2981bd1Poll = concurrentLinkedQueue.poll();
                if (c2981bd1Poll != null) {
                    c2872b52.m.execute(new W10(2, c2872b52, c2981bd1Poll));
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        aVarC.p();
        C2390Xa.y((C2390Xa) aVarC.e, str3);
        aVarH.p();
        C0822Di.A((C0822Di) aVarH.e, aVarC.n());
        c2872b52.g.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.d) {
            case 0:
                AbstractC2759ae.x((Context) this.e);
                return;
            case 1:
                AppStartTrace appStartTrace = (AppStartTrace) this.e;
                if (appStartTrace.r != null) {
                    return;
                }
                appStartTrace.r = new QZ1();
                long j = appStartTrace.c().d;
                I02.a aVar = appStartTrace.h;
                aVar.v(j);
                aVar.w(appStartTrace.c().b(appStartTrace.r));
                appStartTrace.e(aVar);
                return;
            case 2:
                ComponentActivity.menuHostHelper$lambda$0((ComponentActivity) this.e);
                return;
            case 3:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.e;
                if (firebaseMessaging.g.a()) {
                    firebaseMessaging.e();
                    return;
                }
                return;
            case 4:
                f.b bVar = (f.b) this.e;
                synchronized (bVar.d) {
                    try {
                        if (bVar.h == null) {
                            return;
                        }
                        try {
                            C4044gh0 c4044gh0C = bVar.c();
                            int i2 = c4044gh0C.e;
                            if (i2 == 2) {
                                synchronized (bVar.d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = G02.a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                f.a aVar2 = bVar.c;
                                Context context = bVar.a;
                                aVar2.getClass();
                                Typeface typefaceB = C4606j72.a.b(context, new C4044gh0[]{c4044gh0C}, 0);
                                MappedByteBuffer mappedByteBufferE = C6079q72.e(bVar.a, c4044gh0C.a);
                                if (mappedByteBufferE == null || typefaceB == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    g gVar = new g(typefaceB, LL.j(mappedByteBufferE));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (bVar.d) {
                                        try {
                                            c.g gVar2 = bVar.h;
                                            if (gVar2 != null) {
                                                gVar2.b(gVar);
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th2) {
                                    int i4 = G02.a;
                                    Trace.endSection();
                                    throw th2;
                                }
                            } catch (Throwable th3) {
                                int i5 = G02.a;
                                Trace.endSection();
                                throw th3;
                            }
                            break;
                        } catch (Throwable th4) {
                            synchronized (bVar.d) {
                                try {
                                    c.g gVar3 = bVar.h;
                                    if (gVar3 != null) {
                                        gVar3.a(th4);
                                    }
                                    bVar.b();
                                    return;
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                }
            case 5:
                final AbstractC1776Pn0 this$0 = (AbstractC1776Pn0) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                C3457dt1 c3457dt1 = new C3457dt1(0, null, null, null, 31);
                EY0<C3457dt1<R>> ey0 = this$0.a;
                if (!Intrinsics.a(ey0.d(), c3457dt1)) {
                    ey0.k((C3457dt1<R>) c3457dt1);
                }
                final LiveData<C4705jd<Void>> liveDataA = this$0.a();
                this$0.a.l((LiveData<S>) liveDataA, (InterfaceC4819k81<? super S>) new InterfaceC4819k81() { // from class: Nn0
                    /* JADX WARN: Type inference incomplete: some casts might be missing */
                    @Override // defpackage.InterfaceC4819k81
                    public final void d(Object obj) {
                        int i6;
                        C4705jd c4705jd = (C4705jd) obj;
                        AbstractC1776Pn0 this$1 = this$0;
                        Intrinsics.checkNotNullParameter(this$1, "this$0");
                        LiveData apiSource = liveDataA;
                        Intrinsics.checkNotNullParameter(apiSource, "$apiSource");
                        this$1.a.m((LiveData<S>) apiSource);
                        EY0<C3457dt1<R>> ey1 = this$1.a;
                        if (c4705jd == null || 200 > (i6 = c4705jd.a) || i6 >= 300) {
                            Map<String, ? extends List<String>> map = Collections.EMPTY_MAP;
                            Intrinsics.checkNotNullExpressionValue(map, "emptyMap()");
                            C3457dt1 c3457dt2 = new C3457dt1(1, null, this$1.b(map), null, 26);
                            if (Intrinsics.a(ey1.d(), c3457dt2)) {
                                return;
                            }
                            ey1.k((C3457dt1<R>) c3457dt2);
                            return;
                        }
                        Map<String, ? extends List<String>> headers = c4705jd.c;
                        if (headers == null) {
                            headers = Collections.EMPTY_MAP;
                        }
                        Intrinsics.checkNotNullExpressionValue(headers, "headers");
                        C3457dt1 c3457dt3 = new C3457dt1(1, null, this$1.b(headers), null, 26);
                        if (Intrinsics.a(ey1.d(), c3457dt3)) {
                            return;
                        }
                        ey1.k((C3457dt1<R>) c3457dt3);
                    }
                });
                return;
            case 6:
                break;
            case 7:
                Toolbar.f fVar = ((Toolbar) this.e).Q;
                h hVar = fVar == null ? null : fVar.e;
                if (hVar != null) {
                    hVar.collapseActionView();
                    return;
                }
                return;
            case 8:
                a();
                return;
            default:
                AFe1wSDK.AFLogger((AFe1wSDK) this.e);
                return;
        }
        while (true) {
            HG1 hg1 = (HG1) this.e;
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = hg1.a;
            if (i >= 40) {
                scheduledThreadPoolExecutor.purge();
                return;
            } else {
                try {
                    scheduledThreadPoolExecutor.schedule(hg1.c, 365L, TimeUnit.DAYS).cancel(true);
                    i++;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            return;
        }
    }
}
