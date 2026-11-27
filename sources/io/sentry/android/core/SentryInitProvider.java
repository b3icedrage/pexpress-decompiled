package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import defpackage.C0741Ch;
import defpackage.LG1;
import defpackage.NG1;
import defpackage.QF1;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryInitProvider extends K {
    @Override // android.content.ContentProvider
    public final void attachInfo(@NotNull Context context, @NotNull ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    @Nullable
    public final String getType(@NotNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zB;
        io.sentry.android.core.performance.h.e(this);
        C4502m c4502m = new C4502m();
        Context context = getContext();
        boolean z = false;
        if (context == null) {
            c4502m.a(NG1.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.h.f(this);
            return false;
        }
        try {
            ApplicationInfo applicationInfoA = Build.VERSION.SDK_INT >= 33 ? F.d.a(context) : F.e.a(context);
            Bundle bundle = applicationInfoA != null ? applicationInfoA.metaData : null;
            zB = bundle != null ? S.b(bundle, c4502m, "io.sentry.auto-init", true) : true;
        } catch (Throwable th) {
            c4502m.d(NG1.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        if (zB) {
            if (context.getPackageName().endsWith(".test")) {
                try {
                    Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
                    while (it.hasNext()) {
                        ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
                        if (component != null && component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                            z = true;
                            break;
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            if (!z) {
                Z.b(new C0741Ch(), context, c4502m);
                LG1.d().a("AutoInit");
            }
        }
        io.sentry.android.core.performance.h.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        QF1.c();
    }
}
