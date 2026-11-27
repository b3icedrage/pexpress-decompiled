package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import com.appsflyer.internal.AFj1vSDK;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.perf.metrics.AppStartTrace;
import io.sentry.android.core.b0;
import java.util.ArrayList;

/* JADX INFO: renamed from: Yh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2489Yh implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2489Yh(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final boolean z;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = this.e;
        switch (this.d) {
            case 0:
                QZ1 qz1 = AppStartTrace.z;
                AppStartTrace appStartTrace = (AppStartTrace) obj;
                I02.a aVarP = I02.P();
                aVarP.x("_as");
                aVarP.v(appStartTrace.a().d);
                aVarP.w(appStartTrace.a().b(appStartTrace.o));
                ArrayList arrayList = new ArrayList(3);
                I02.a aVarP2 = I02.P();
                aVarP2.x("_astui");
                aVarP2.v(appStartTrace.a().d);
                aVarP2.w(appStartTrace.a().b(appStartTrace.m));
                arrayList.add(aVarP2.n());
                I02.a aVarP3 = I02.P();
                aVarP3.x("_astfd");
                aVarP3.v(appStartTrace.m.d);
                aVarP3.w(appStartTrace.m.b(appStartTrace.n));
                arrayList.add(aVarP3.n());
                I02.a aVarP4 = I02.P();
                aVarP4.x("_asti");
                aVarP4.v(appStartTrace.n.d);
                aVarP4.w(appStartTrace.n.b(appStartTrace.o));
                arrayList.add(aVarP4.n());
                aVarP.p();
                I02.z((I02) aVarP.e, arrayList);
                C5970pd1 c5970pd1A = appStartTrace.u.a();
                aVarP.p();
                I02.B((I02) aVarP.e, c5970pd1A);
                appStartTrace.e.c(aVarP.n(), EnumC1134Hi.FOREGROUND_BACKGROUND);
                break;
            case 1:
                final Context context = ((FirebaseMessaging) obj).d;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                if (!applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).getBoolean("proxy_notification_initialized", false)) {
                    try {
                        Context applicationContext2 = context.getApplicationContext();
                        PackageManager packageManager = applicationContext2.getPackageManager();
                        z = (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext2.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) ? applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled") : true;
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (!PlatformVersion.isAtLeastQ()) {
                        Tasks.forResult(null);
                    } else {
                        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        new Runnable() { // from class: Tk1
                            @Override // java.lang.Runnable
                            public final void run() {
                                Context context2 = context;
                                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                                try {
                                    if (Binder.getCallingUid() != context2.getApplicationInfo().uid) {
                                        b0.c("FirebaseMessaging", "error configuring notification delegate for package " + context2.getPackageName());
                                        return;
                                    }
                                    Context applicationContext3 = context2.getApplicationContext();
                                    if (applicationContext3 == null) {
                                        applicationContext3 = context2;
                                    }
                                    SharedPreferences.Editor editorEdit = applicationContext3.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                                    editorEdit.putBoolean("proxy_notification_initialized", true);
                                    editorEdit.apply();
                                    NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                                    if (z) {
                                        notificationManager.setNotificationDelegate("com.google.android.gms");
                                    } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                                        notificationManager.setNotificationDelegate(null);
                                    }
                                } finally {
                                    taskCompletionSource2.trySetResult(null);
                                }
                            }
                        }.run();
                        taskCompletionSource.getTask();
                    }
                    break;
                }
                break;
            default:
                ((AFj1vSDK) obj).w();
                break;
        }
    }
}
