package defpackage;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessagingService;
import io.sentry.android.core.b0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: renamed from: u20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6896u20 {
    public final ExecutorService a;
    public final FirebaseMessagingService b;
    public final G61 c;

    public C6896u20(FirebaseMessagingService firebaseMessagingService, G61 g61, ExecutorService executorService) {
        this.a = executorService;
        this.b = firebaseMessagingService;
        this.c = g61;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0234  */
    /* JADX WARN: Code duplicated, block: B:104:0x0240  */
    /* JADX WARN: Code duplicated, block: B:105:0x0242  */
    /* JADX WARN: Code duplicated, block: B:110:0x026d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0273  */
    /* JADX WARN: Code duplicated, block: B:115:0x0282  */
    /* JADX WARN: Code duplicated, block: B:116:0x0290  */
    /* JADX WARN: Code duplicated, block: B:118:0x029c  */
    /* JADX WARN: Code duplicated, block: B:121:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:122:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:125:0x02be  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:131:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:140:0x030b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0319  */
    /* JADX WARN: Code duplicated, block: B:148:0x0332  */
    /* JADX WARN: Code duplicated, block: B:149:0x0334  */
    /* JADX WARN: Code duplicated, block: B:151:0x0365  */
    /* JADX WARN: Code duplicated, block: B:157:0x0394  */
    /* JADX WARN: Code duplicated, block: B:162:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:164:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:167:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:170:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:171:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:177:0x0409  */
    /* JADX WARN: Code duplicated, block: B:180:0x0419  */
    /* JADX WARN: Code duplicated, block: B:181:0x041b  */
    /* JADX WARN: Code duplicated, block: B:187:0x0443  */
    /* JADX WARN: Code duplicated, block: B:190:0x0451  */
    /* JADX WARN: Code duplicated, block: B:191:0x0453  */
    /* JADX WARN: Code duplicated, block: B:193:0x0459  */
    /* JADX WARN: Code duplicated, block: B:195:0x0472  */
    /* JADX WARN: Code duplicated, block: B:201:0x04af  */
    /* JADX WARN: Code duplicated, block: B:203:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:206:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ce A[Catch: NumberFormatException | JSONException -> 0x04e7, TryCatch #2 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:207:0x04c7, B:209:0x04ce, B:211:0x04d7, B:212:0x04df, B:213:0x04e6), top: B:271:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:211:0x04d7 A[Catch: NumberFormatException | JSONException -> 0x04e7, LOOP:1: B:210:0x04d5->B:211:0x04d7, LOOP_END, TryCatch #2 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:207:0x04c7, B:209:0x04ce, B:211:0x04d7, B:212:0x04df, B:213:0x04e6), top: B:271:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:212:0x04df A[Catch: NumberFormatException | JSONException -> 0x04e7, TryCatch #2 {NumberFormatException | JSONException -> 0x04e7, blocks: (B:207:0x04c7, B:209:0x04ce, B:211:0x04d7, B:212:0x04df, B:213:0x04e6), top: B:271:0x04c7 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0500  */
    /* JADX WARN: Code duplicated, block: B:219:0x0511  */
    /* JADX WARN: Code duplicated, block: B:220:0x0513  */
    /* JADX WARN: Code duplicated, block: B:223:0x051b A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #12 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:221:0x0515, B:223:0x051b, B:225:0x0527, B:228:0x053a, B:229:0x0541, B:230:0x0542, B:231:0x0549), top: B:282:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:225:0x0527 A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #12 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:221:0x0515, B:223:0x051b, B:225:0x0527, B:228:0x053a, B:229:0x0541, B:230:0x0542, B:231:0x0549), top: B:282:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:228:0x053a A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #12 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:221:0x0515, B:223:0x051b, B:225:0x0527, B:228:0x053a, B:229:0x0541, B:230:0x0542, B:231:0x0549), top: B:282:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:230:0x0542 A[Catch: IllegalArgumentException -> 0x0538, JSONException -> 0x0569, TryCatch #12 {IllegalArgumentException -> 0x0538, JSONException -> 0x0569, blocks: (B:221:0x0515, B:223:0x051b, B:225:0x0527, B:228:0x053a, B:229:0x0541, B:230:0x0542, B:231:0x0549), top: B:282:0x0515 }] */
    /* JADX WARN: Code duplicated, block: B:235:0x057e  */
    /* JADX WARN: Code duplicated, block: B:239:0x0596  */
    /* JADX WARN: Code duplicated, block: B:243:0x05ab  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:250:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:255:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:256:0x05ff A[Catch: ExecutionException -> 0x0612, TimeoutException -> 0x0614, InterruptedException -> 0x061d, TryCatch #11 {InterruptedException -> 0x061d, ExecutionException -> 0x0612, TimeoutException -> 0x0614, blocks: (B:253:0x05e0, B:257:0x0607, B:256:0x05ff), top: B:283:0x05e0 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x039c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:271:0x04c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x0375 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0484 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:283:0x05e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:52:0x012d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0134  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Instruction removed from duplicated block: B:193:0x0459, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:250:0x05ca, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v119 */
    /* JADX WARN: Type inference failed for: r0v186 */
    /* JADX WARN: Type inference failed for: r0v187 */
    public final boolean a() {
        C4983kw0 c4983kw0;
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        String strE;
        Uri defaultUri;
        String strE2;
        String strE3;
        Uri uri;
        Intent launchIntentForPackage;
        AtomicInteger atomicInteger;
        Bundle bundle2;
        PendingIntent activity;
        PendingIntent broadcast;
        String strE4;
        Integer numValueOf;
        String strE5;
        Integer numB;
        Integer numB2;
        Integer numB3;
        String strE6;
        Long lValueOf;
        JSONArray jSONArrayC;
        int length;
        long[] jArr;
        int i;
        JSONArray jSONArrayC2;
        int[] iArr;
        int color;
        boolean zA;
        ?? r0;
        int i2;
        String strE7;
        Bitmap bitmap;
        IconCompat iconCompat;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6 = 1;
        if (this.c.a("gcm.n.noui")) {
            return true;
        }
        FirebaseMessagingService firebaseMessagingService = this.b;
        if (!((KeyguardManager) firebaseMessagingService.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (!PlatformVersion.isAtLeastLollipop()) {
                SystemClock.sleep(10L);
            }
            int iMyPid = Process.myPid();
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) firebaseMessagingService.getSystemService("activity")).getRunningAppProcesses();
            if (runningAppProcesses != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        if (runningAppProcessInfo.importance != 100) {
                            break;
                        }
                        return false;
                    }
                }
            }
        }
        String strE8 = this.c.e("gcm.n.image");
        if (TextUtils.isEmpty(strE8)) {
            c4983kw0 = null;
        } else {
            try {
                c4983kw0 = new C4983kw0(new URL(strE8));
            } catch (MalformedURLException unused) {
                b0.e("FirebaseMessaging", "Not downloading image, bad URL: " + strE8);
                c4983kw0 = null;
            }
        }
        if (c4983kw0 != null) {
            ExecutorService executorService = this.a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            c4983kw0.e = executorService.submit(new MK(i6, c4983kw0, taskCompletionSource));
            c4983kw0.g = taskCompletionSource.getTask();
        }
        FirebaseMessagingService firebaseMessagingService2 = this.b;
        G61 g61 = this.c;
        AtomicInteger atomicInteger2 = C4843kG.a;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            b0.e("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle3 = bundle;
        String strE9 = g61.e("gcm.n.android_channel_id");
        if (Build.VERSION.SDK_INT < 26) {
            strE9 = null;
        } else {
            try {
                if (firebaseMessagingService2.getPackageManager().getApplicationInfo(firebaseMessagingService2.getPackageName(), 0).targetSdkVersion < 26) {
                    strE9 = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService2.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strE9)) {
                        strE9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strE9)) {
                            b0.e("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strE9) == null) {
                            b0.e("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                b0.c("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(C4633jG.a(string));
                        }
                        strE9 = "fcm_fallback_notification_channel";
                    } else if (notificationManager.getNotificationChannel(strE9) == null) {
                        b0.e("FirebaseMessaging", "Notification Channel requested (" + strE9 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strE9 = bundle3.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strE9)) {
                            b0.e("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strE9) == null) {
                            b0.e("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService2.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService2.getPackageName());
                            if (identifier == 0) {
                                b0.c("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService2.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(C4633jG.a(string));
                        }
                        strE9 = "fcm_fallback_notification_channel";
                    }
                }
            } catch (PackageManager.NameNotFoundException unused2) {
            }
        }
        String packageName = firebaseMessagingService2.getPackageName();
        Resources resources = firebaseMessagingService2.getResources();
        PackageManager packageManager = firebaseMessagingService2.getPackageManager();
        C4133h61 c4133h61 = new C4133h61(firebaseMessagingService2, strE9);
        CharSequence charSequenceD = g61.d(packageName, resources, "gcm.n.title");
        if (!TextUtils.isEmpty(charSequenceD)) {
            c4133h61.e(charSequenceD);
        }
        CharSequence charSequenceD2 = g61.d(packageName, resources, "gcm.n.body");
        if (!TextUtils.isEmpty(charSequenceD2)) {
            c4133h61.d(charSequenceD2);
            C3923g61 c3923g61 = new C3923g61();
            c3923g61.e = C4133h61.c(charSequenceD2);
            c4133h61.k(c3923g61);
        }
        String strE10 = g61.e("gcm.n.icon");
        if (!TextUtils.isEmpty(strE10)) {
            identifier2 = resources.getIdentifier(strE10, "drawable", packageName);
            if ((identifier2 == 0 || !C4843kG.a(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strE10, "mipmap", packageName)) == 0 || !C4843kG.a(resources, identifier2))) {
                b0.e("FirebaseMessaging", "Icon resource " + strE10 + " not found. Notification will use default icon.");
            } else {
                i6 = 1;
            }
            c4133h61.z.icon = identifier2;
            strE = g61.e("gcm.n.sound2");
            if (TextUtils.isEmpty(strE)) {
                strE = g61.e("gcm.n.sound");
            }
            if (TextUtils.isEmpty(strE)) {
                defaultUri = null;
            } else if (!"default".equals(strE) || resources.getIdentifier(strE, "raw", packageName) == 0) {
                defaultUri = RingtoneManager.getDefaultUri(2);
            } else {
                defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strE);
            }
            if (defaultUri != null) {
                c4133h61.j(defaultUri);
            }
            strE2 = g61.e("gcm.n.click_action");
            if (TextUtils.isEmpty(strE2)) {
                strE3 = g61.e("gcm.n.link_android");
                if (TextUtils.isEmpty(strE3)) {
                    strE3 = g61.e("gcm.n.link");
                }
                if (TextUtils.isEmpty(strE3)) {
                    uri = null;
                } else {
                    uri = Uri.parse(strE3);
                }
                if (uri != null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setPackage(packageName);
                    launchIntentForPackage.setData(uri);
                } else {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                    if (launchIntentForPackage == null) {
                        b0.e("FirebaseMessaging", "No activity found to launch app");
                    }
                }
            } else {
                launchIntentForPackage = new Intent(strE2);
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setFlags(268435456);
            }
            atomicInteger = C4843kG.a;
            if (launchIntentForPackage == null) {
                activity = null;
            } else {
                launchIntentForPackage.addFlags(67108864);
                Bundle bundle4 = g61.a;
                bundle2 = new Bundle(bundle4);
                for (String str : bundle4.keySet()) {
                    if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                        bundle2.remove(str);
                    }
                }
                launchIntentForPackage.putExtras(bundle2);
                if (g61.a("google.c.a.e")) {
                    launchIntentForPackage.putExtra("gcm.n.analytics_data", g61.g());
                }
                activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
            }
            c4133h61.g = activity;
            if (g61.a("google.c.a.e")) {
                broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(firebaseMessagingService2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(g61.g())), 1140850688);
            } else {
                broadcast = null;
            }
            if (broadcast != null) {
                c4133h61.z.deleteIntent = broadcast;
            }
            strE4 = g61.e("gcm.n.color");
            if (TextUtils.isEmpty(strE4)) {
                i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i5 != 0) {
                    numValueOf = Integer.valueOf(C6333rM.getColor(firebaseMessagingService2, i5));
                } else {
                    numValueOf = null;
                }
            } else {
                try {
                    numValueOf = Integer.valueOf(Color.parseColor(strE4));
                } catch (IllegalArgumentException unused3) {
                    b0.e("FirebaseMessaging", "Color is invalid: " + strE4 + ". Notification will use default color.");
                    i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i5 != 0) {
                        try {
                            numValueOf = Integer.valueOf(C6333rM.getColor(firebaseMessagingService2, i5));
                        } catch (Resources.NotFoundException unused4) {
                            b0.e("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            numValueOf = null;
                        }
                    } else {
                        numValueOf = null;
                    }
                }
            }
            if (numValueOf != null) {
                c4133h61.u = numValueOf.intValue();
            }
            c4133h61.g(16, !g61.a("gcm.n.sticky"));
            c4133h61.r = g61.a("gcm.n.local_only");
            strE5 = g61.e("gcm.n.ticker");
            if (strE5 != null) {
                c4133h61.z.tickerText = C4133h61.c(strE5);
            }
            numB = g61.b("gcm.n.notification_priority");
            if (numB == null) {
                numB = null;
            } else if (numB.intValue() >= -2 || numB.intValue() > 2) {
                b0.e("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
                numB = null;
            }
            if (numB != null) {
                c4133h61.j = numB.intValue();
            }
            numB2 = g61.b("gcm.n.visibility");
            if (numB2 == null) {
                numB2 = null;
            } else if (numB2.intValue() >= -1 || numB2.intValue() > i6) {
                b0.e("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
                numB2 = null;
            }
            if (numB2 != null) {
                c4133h61.v = numB2.intValue();
            }
            numB3 = g61.b("gcm.n.notification_count");
            if (numB3 != null) {
                numB3 = null;
            } else if (numB3.intValue() < 0) {
                b0.e("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
                numB3 = null;
            }
            if (numB3 != null) {
                c4133h61.i = numB3.intValue();
            }
            strE6 = g61.e("gcm.n.event_time");
            if (TextUtils.isEmpty(strE6)) {
                lValueOf = null;
            } else {
                try {
                    lValueOf = Long.valueOf(Long.parseLong(strE6));
                } catch (NumberFormatException unused5) {
                    b0.e("NotificationParams", "Couldn't parse value of " + G61.h("gcm.n.event_time") + "(" + strE6 + ") into a long");
                    lValueOf = null;
                }
            }
            if (lValueOf != null) {
                c4133h61.k = true;
                c4133h61.z.when = lValueOf.longValue();
            }
            jSONArrayC = g61.c("gcm.n.vibrate_timings");
            if (jSONArrayC == null) {
                jArr = null;
            } else {
                try {
                    if (jSONArrayC.length() > 1) {
                        throw new JSONException("vibrateTimings have invalid length");
                    }
                    length = jSONArrayC.length();
                    jArr = new long[length];
                    for (i = 0; i < length; i++) {
                        jArr[i] = jSONArrayC.optLong(i);
                    }
                } catch (NumberFormatException | JSONException unused6) {
                    b0.e("NotificationParams", "User defined vibrateTimings is invalid: " + jSONArrayC + ". Skipping setting vibrateTimings.");
                    jArr = null;
                }
            }
            if (jArr != null) {
                c4133h61.z.vibrate = jArr;
            }
            jSONArrayC2 = g61.c("gcm.n.light_settings");
            if (jSONArrayC2 == null) {
                iArr = null;
            } else {
                iArr = new int[3];
                try {
                    if (jSONArrayC2.length() == 3) {
                        throw new JSONException("lightSettings don't have all three fields");
                    }
                    color = Color.parseColor(jSONArrayC2.optString(0));
                    if (color != -16777216) {
                        throw new IllegalArgumentException("Transparent color is invalid");
                    }
                    iArr[0] = color;
                    iArr[1] = jSONArrayC2.optInt(1);
                    iArr[2] = jSONArrayC2.optInt(2);
                } catch (IllegalArgumentException e2) {
                    b0.e("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". " + e2.getMessage() + ". Skipping setting LightSettings");
                    iArr = null;
                } catch (JSONException unused7) {
                    b0.e("NotificationParams", "LightSettings is invalid: " + jSONArrayC2 + ". Skipping setting LightSettings");
                    iArr = null;
                }
            }
            if (iArr != null) {
                int i7 = iArr[0];
                i3 = iArr[1];
                int i8 = iArr[2];
                Notification notification = c4133h61.z;
                notification.ledARGB = i7;
                notification.ledOnMS = i3;
                notification.ledOffMS = i8;
                if (i3 != 0 || i8 == 0) {
                    i4 = 0;
                } else {
                    i4 = 1;
                }
                notification.flags = i4 | ((-2) & notification.flags);
            }
            zA = g61.a("gcm.n.default_sound");
            r0 = zA;
            if (g61.a("gcm.n.default_vibrate_timings")) {
                r0 = (zA ? 1 : 0) | 2;
            }
            i2 = r0;
            if (g61.a("gcm.n.default_light_settings")) {
                i2 = (r0 == true ? 1 : 0) | 4;
            }
            c4133h61.f(i2);
            strE7 = g61.e("gcm.n.tag");
            if (TextUtils.isEmpty(strE7)) {
                strE7 = "FCM-Notification:" + SystemClock.uptimeMillis();
            }
            String str2 = strE7;
            if (c4983kw0 != null) {
                try {
                    bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(c4983kw0.g), 5L, TimeUnit.SECONDS);
                    c4133h61.h(bitmap);
                    C3713f61 c3713f61 = new C3713f61();
                    if (bitmap == null) {
                        iconCompat = null;
                        z = true;
                    } else {
                        z = true;
                        iconCompat = new IconCompat(1);
                        iconCompat.b = bitmap;
                    }
                    c3713f61.e = iconCompat;
                    c3713f61.f = null;
                    c3713f61.g = z;
                    c4133h61.k(c3713f61);
                } catch (InterruptedException unused8) {
                    b0.e("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                    c4983kw0.close();
                    Thread.currentThread().interrupt();
                } catch (ExecutionException e3) {
                    b0.e("FirebaseMessaging", "Failed to download image: " + e3.getCause());
                } catch (TimeoutException unused9) {
                    b0.e("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                    c4983kw0.close();
                }
            }
            Log.isLoggable("FirebaseMessaging", 3);
            ((NotificationManager) this.b.getSystemService("notification")).notify(str2, 0, c4133h61.b());
            return true;
        }
        int i9 = bundle3.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i9 == 0 || !C4843kG.a(resources, i9)) {
            try {
                i9 = packageManager.getApplicationInfo(packageName, 0).icon;
            } catch (PackageManager.NameNotFoundException e4) {
                b0.e("FirebaseMessaging", "Couldn't get own application info: " + e4);
            }
        }
        identifier2 = (i9 == 0 || !C4843kG.a(resources, i9)) ? 17301651 : i9;
        c4133h61.z.icon = identifier2;
        strE = g61.e("gcm.n.sound2");
        if (TextUtils.isEmpty(strE)) {
            strE = g61.e("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strE)) {
            defaultUri = null;
        } else if ("default".equals(strE)) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = RingtoneManager.getDefaultUri(2);
        }
        if (defaultUri != null) {
            c4133h61.j(defaultUri);
        }
        strE2 = g61.e("gcm.n.click_action");
        if (TextUtils.isEmpty(strE2)) {
            launchIntentForPackage = new Intent(strE2);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        } else {
            strE3 = g61.e("gcm.n.link_android");
            if (TextUtils.isEmpty(strE3)) {
                strE3 = g61.e("gcm.n.link");
            }
            if (TextUtils.isEmpty(strE3)) {
                uri = Uri.parse(strE3);
            } else {
                uri = null;
            }
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    b0.e("FirebaseMessaging", "No activity found to launch app");
                }
            }
        }
        atomicInteger = C4843kG.a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle5 = g61.a;
            bundle2 = new Bundle(bundle5);
            while (r13.hasNext()) {
                if (str.startsWith("google.c.")) {
                    bundle2.remove(str);
                } else {
                    bundle2.remove(str);
                }
            }
            launchIntentForPackage.putExtras(bundle2);
            if (g61.a("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", g61.g());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService2, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        c4133h61.g = activity;
        if (g61.a("google.c.a.e")) {
            broadcast = null;
        } else {
            broadcast = PendingIntent.getBroadcast(firebaseMessagingService2, atomicInteger.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(firebaseMessagingService2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(g61.g())), 1140850688);
        }
        if (broadcast != null) {
            c4133h61.z.deleteIntent = broadcast;
        }
        strE4 = g61.e("gcm.n.color");
        if (TextUtils.isEmpty(strE4)) {
            numValueOf = Integer.valueOf(Color.parseColor(strE4));
        } else {
            i5 = bundle3.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i5 != 0) {
                numValueOf = Integer.valueOf(C6333rM.getColor(firebaseMessagingService2, i5));
            } else {
                numValueOf = null;
            }
        }
        if (numValueOf != null) {
            c4133h61.u = numValueOf.intValue();
        }
        c4133h61.g(16, !g61.a("gcm.n.sticky"));
        c4133h61.r = g61.a("gcm.n.local_only");
        strE5 = g61.e("gcm.n.ticker");
        if (strE5 != null) {
            c4133h61.z.tickerText = C4133h61.c(strE5);
        }
        numB = g61.b("gcm.n.notification_priority");
        if (numB == null) {
            if (numB.intValue() >= -2) {
            }
            b0.e("FirebaseMessaging", "notificationPriority is invalid " + numB + ". Skipping setting notificationPriority.");
            numB = null;
        } else {
            numB = null;
        }
        if (numB != null) {
            c4133h61.j = numB.intValue();
        }
        numB2 = g61.b("gcm.n.visibility");
        if (numB2 == null) {
            if (numB2.intValue() >= -1) {
            }
            b0.e("NotificationParams", "visibility is invalid: " + numB2 + ". Skipping setting visibility.");
            numB2 = null;
        } else {
            numB2 = null;
        }
        if (numB2 != null) {
            c4133h61.v = numB2.intValue();
        }
        numB3 = g61.b("gcm.n.notification_count");
        if (numB3 != null) {
            numB3 = null;
        } else if (numB3.intValue() < 0) {
            b0.e("FirebaseMessaging", "notificationCount is invalid: " + numB3 + ". Skipping setting notificationCount.");
            numB3 = null;
        }
        if (numB3 != null) {
            c4133h61.i = numB3.intValue();
        }
        strE6 = g61.e("gcm.n.event_time");
        if (TextUtils.isEmpty(strE6)) {
            lValueOf = Long.valueOf(Long.parseLong(strE6));
        } else {
            lValueOf = null;
        }
        if (lValueOf != null) {
            c4133h61.k = true;
            c4133h61.z.when = lValueOf.longValue();
        }
        jSONArrayC = g61.c("gcm.n.vibrate_timings");
        if (jSONArrayC == null) {
            jArr = null;
        } else {
            if (jSONArrayC.length() > 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            length = jSONArrayC.length();
            jArr = new long[length];
            while (i < length) {
                jArr[i] = jSONArrayC.optLong(i);
            }
        }
        if (jArr != null) {
            c4133h61.z.vibrate = jArr;
        }
        jSONArrayC2 = g61.c("gcm.n.light_settings");
        if (jSONArrayC2 == null) {
            iArr = null;
        } else {
            iArr = new int[3];
            if (jSONArrayC2.length() == 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            color = Color.parseColor(jSONArrayC2.optString(0));
            if (color != -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayC2.optInt(1);
            iArr[2] = jSONArrayC2.optInt(2);
        }
        if (iArr != null) {
            int i10 = iArr[0];
            i3 = iArr[1];
            int i11 = iArr[2];
            Notification notification2 = c4133h61.z;
            notification2.ledARGB = i10;
            notification2.ledOnMS = i3;
            notification2.ledOffMS = i11;
            if (i3 != 0) {
                i4 = 0;
            } else {
                i4 = 0;
            }
            notification2.flags = i4 | ((-2) & notification2.flags);
        }
        zA = g61.a("gcm.n.default_sound");
        r0 = zA;
        if (g61.a("gcm.n.default_vibrate_timings")) {
            r0 = (zA ? 1 : 0) | 2;
        }
        i2 = r0;
        if (g61.a("gcm.n.default_light_settings")) {
            i2 = (r0 == true ? 1 : 0) | 4;
        }
        c4133h61.f(i2);
        strE7 = g61.e("gcm.n.tag");
        if (TextUtils.isEmpty(strE7)) {
            strE7 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        String str3 = strE7;
        if (c4983kw0 != null) {
            bitmap = (Bitmap) Tasks.await((Task) Preconditions.checkNotNull(c4983kw0.g), 5L, TimeUnit.SECONDS);
            c4133h61.h(bitmap);
            C3713f61 c3713f62 = new C3713f61();
            if (bitmap == null) {
                iconCompat = null;
                z = true;
            } else {
                z = true;
                iconCompat = new IconCompat(1);
                iconCompat.b = bitmap;
            }
            c3713f62.e = iconCompat;
            c3713f62.f = null;
            c3713f62.g = z;
            c4133h61.k(c3713f62);
        }
        Log.isLoggable("FirebaseMessaging", 3);
        ((NotificationManager) this.b.getSystemService("notification")).notify(str3, 0, c4133h61.b());
        return true;
    }
}
