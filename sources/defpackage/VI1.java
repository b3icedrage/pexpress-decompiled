package defpackage;

import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b0;
import io.sentry.cache.c;
import io.sentry.cache.m;
import io.sentry.cache.tape.a;
import io.sentry.cache.tape.b;
import io.sentry.cache.tape.d;
import io.sentry.util.l;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class VI1 implements Continuation, MD1, l.a {
    public final /* synthetic */ Object d;

    public /* synthetic */ VI1(Object obj) {
        this.d = obj;
    }

    @Override // io.sentry.util.l.a
    public Object b() {
        d dVar;
        m mVar = (m) this.d;
        SentryAndroidOptions sentryAndroidOptions = mVar.a;
        File fileB = c.b(sentryAndroidOptions, ".scope-cache");
        if (fileB == null) {
            sentryAndroidOptions.getLogger().a(NG1.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return new a();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            int maxBreadcrumbs = sentryAndroidOptions.getMaxBreadcrumbs();
            RandomAccessFile randomAccessFileC = d.c(file);
            try {
                try {
                    dVar = new d(file, randomAccessFileC, maxBreadcrumbs);
                } catch (Throwable th) {
                    randomAccessFileC.close();
                    throw th;
                }
            } catch (IOException e) {
                sentryAndroidOptions.getLogger().d(NG1.ERROR, "Failed to create breadcrumbs queue", e);
                return new a();
            }
        } catch (IOException unused) {
            file.delete();
            int maxBreadcrumbs2 = sentryAndroidOptions.getMaxBreadcrumbs();
            RandomAccessFile randomAccessFileC2 = d.c(file);
            try {
                dVar = new d(file, randomAccessFileC2, maxBreadcrumbs2);
            } catch (Throwable th2) {
                randomAccessFileC2.close();
                throw th2;
            }
        }
        return new b(dVar, new io.sentry.cache.l(mVar));
    }

    @Override // defpackage.MD1
    public void e(InterfaceC1015Fu0 interfaceC1015Fu0) {
        CI1 session = interfaceC1015Fu0.getSession();
        if (session == null || session.c() == null) {
            return;
        }
        ((AtomicBoolean) this.d).set(true);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        boolean z;
        ((WI1) this.d).getClass();
        if (task.isSuccessful()) {
            AbstractC7603xP abstractC7603xP = (AbstractC7603xP) task.getResult();
            abstractC7603xP.getClass();
            Log.isLoggable("FirebaseCrashlytics", 3);
            File fileB = abstractC7603xP.b();
            if (fileB.delete()) {
                fileB.getPath();
                Log.isLoggable("FirebaseCrashlytics", 3);
            } else {
                b0.f("FirebaseCrashlytics", "Crashlytics could not delete report file: " + fileB.getPath(), null);
            }
            z = true;
        } else {
            b0.f("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
