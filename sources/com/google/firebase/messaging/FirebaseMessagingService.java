package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Tasks;
import defpackage.C0663Bh;
import defpackage.C1054Gh0;
import defpackage.C1198Id0;
import defpackage.C2296Wd0;
import defpackage.C3193ce0;
import defpackage.C6133qP;
import defpackage.C6850to;
import defpackage.C6896u20;
import defpackage.C7492wr1;
import defpackage.C7794yI1;
import defpackage.EnumC6825th1;
import defpackage.G61;
import defpackage.H60;
import defpackage.InterfaceC2400Xd0;
import defpackage.UZ0;
import defpackage.VZ0;
import defpackage.W42;
import defpackage.WZ0;
import defpackage.Z60;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingService extends Z60 {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);

    private boolean alreadyReceivedMessage(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = recentlyReceivedMessageIds;
        if (queue.contains(str)) {
            Log.isLoggable("FirebaseMessaging", 3);
            return true;
        }
        if (queue.size() >= 10) {
            queue.remove();
        }
        queue.add(str);
        return false;
    }

    private void dispatchMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (G61.f(extras)) {
            G61 g61 = new G61(extras);
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
            try {
                if (new C6896u20(this, g61, executorServiceNewSingleThreadExecutor).a()) {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    return;
                } else {
                    executorServiceNewSingleThreadExecutor.shutdown();
                    if (UZ0.b(intent)) {
                        UZ0.a("_nf", intent.getExtras());
                    }
                }
            } catch (Throwable th) {
                executorServiceNewSingleThreadExecutor.shutdown();
                throw th;
            }
        }
        onMessageReceived(new C7492wr1(extras));
    }

    private String getMessageId(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private void handleMessageIntent(Intent intent) {
        if (alreadyReceivedMessage(intent.getStringExtra("google.message_id"))) {
            return;
        }
        passMessageIntentToSdk(intent);
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:127:0x0205  */
    /* JADX WARN: Code duplicated, block: B:129:0x020e  */
    /* JADX WARN: Code duplicated, block: B:130:0x0210  */
    /* JADX WARN: Code duplicated, block: B:158:0x01e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0219 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    private void passMessageIntentToSdk(Intent intent) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z;
        long j;
        C1198Id0 c1198Id0C;
        C3193ce0 c3193ce0;
        String str;
        String str2;
        String[] strArrSplit;
        String str3;
        int iIntValue = 0;
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                return;
            case "gcm":
                if (UZ0.b(intent)) {
                    UZ0.a("_nr", intent.getExtras());
                }
                if ("com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
                    z = false;
                } else {
                    try {
                        C1198Id0.c();
                        C1198Id0 c1198Id0C2 = C1198Id0.c();
                        c1198Id0C2.a();
                        Context context = c1198Id0C2.a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            PackageManager packageManager = context.getPackageManager();
                            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                z = false;
                            } else {
                                z = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
                    }
                }
                if (z) {
                    W42 w42 = FirebaseMessaging.o;
                    if (w42 == null) {
                        b0.c("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                    } else {
                        Bundle extras = intent.getExtras();
                        if (extras == null) {
                            extras = Bundle.EMPTY;
                        }
                        Object obj = extras.get("google.ttl");
                        if (obj instanceof Integer) {
                            iIntValue = ((Integer) obj).intValue();
                        } else if (obj instanceof String) {
                            try {
                                iIntValue = Integer.parseInt((String) obj);
                            } catch (NumberFormatException unused2) {
                                b0.e("FirebaseMessaging", "Invalid TTL: " + obj);
                            }
                        }
                        int i = iIntValue;
                        String string = extras.getString("google.to");
                        if (TextUtils.isEmpty(string)) {
                            try {
                                C1198Id0 c1198Id0C3 = C1198Id0.c();
                                Object obj2 = C2296Wd0.m;
                                Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                                string = (String) Tasks.await(((C2296Wd0) c1198Id0C3.b(InterfaceC2400Xd0.class)).getId());
                            } catch (InterruptedException | ExecutionException e) {
                                throw new RuntimeException(e);
                            }
                        }
                        String str4 = string;
                        C1198Id0 c1198Id0C4 = C1198Id0.c();
                        c1198Id0C4.a();
                        String packageName = c1198Id0C4.a.getPackageName();
                        VZ0.b bVar = G61.f(extras) ? VZ0.b.DISPLAY_NOTIFICATION : VZ0.b.DATA_MESSAGE;
                        String string2 = extras.getString("google.message_id");
                        if (string2 == null) {
                            string2 = extras.getString("message_id");
                        }
                        String str5 = string2 != null ? string2 : "";
                        String string3 = extras.getString("from");
                        if (string3 == null || !string3.startsWith("/topics/")) {
                            string3 = null;
                        }
                        String str6 = string3 != null ? string3 : "";
                        String string4 = extras.getString("collapse_key");
                        String str7 = string4 != null ? string4 : "";
                        String string5 = extras.getString("google.c.a.m_l");
                        String str8 = string5 != null ? string5 : "";
                        String string6 = extras.getString("google.c.a.c_l");
                        String str9 = string6 != null ? string6 : "";
                        if (!extras.containsKey("google.c.sender.id")) {
                            c1198Id0C = C1198Id0.c();
                            c1198Id0C.a();
                            c3193ce0 = c1198Id0C.c;
                            str = c3193ce0.e;
                            if (str != null) {
                                c1198Id0C.a();
                                str2 = c3193ce0.b;
                                if (str2.startsWith("1:")) {
                                    j = Long.parseLong(str2);
                                } else {
                                    strArrSplit = str2.split(":");
                                    if (strArrSplit.length < 2) {
                                        str3 = strArrSplit[1];
                                        if (str3.isEmpty()) {
                                            j = Long.parseLong(str3);
                                        } else {
                                            j = 0;
                                        }
                                    } else {
                                        j = 0;
                                    }
                                }
                            } else {
                                j = Long.parseLong(str);
                            }
                        } else {
                            try {
                                j = Long.parseLong(extras.getString("google.c.sender.id"));
                            } catch (NumberFormatException e2) {
                                b0.f("FirebaseMessaging", "error parsing project number", e2);
                                c1198Id0C = C1198Id0.c();
                                c1198Id0C.a();
                                c3193ce0 = c1198Id0C.c;
                                str = c3193ce0.e;
                                if (str != null) {
                                    c1198Id0C.a();
                                    str2 = c3193ce0.b;
                                    if (str2.startsWith("1:")) {
                                        strArrSplit = str2.split(":");
                                        if (strArrSplit.length < 2) {
                                            str3 = strArrSplit[1];
                                            if (str3.isEmpty()) {
                                                j = Long.parseLong(str3);
                                            } else {
                                                j = 0;
                                            }
                                        } else {
                                            j = 0;
                                        }
                                    } else {
                                        j = Long.parseLong(str2);
                                    }
                                } else {
                                    try {
                                        j = Long.parseLong(str);
                                    } catch (NumberFormatException e3) {
                                        b0.f("FirebaseMessaging", "error parsing sender ID", e3);
                                        c1198Id0C.a();
                                        str2 = c3193ce0.b;
                                        if (str2.startsWith("1:")) {
                                            try {
                                                j = Long.parseLong(str2);
                                            } catch (NumberFormatException e4) {
                                                b0.f("FirebaseMessaging", "error parsing app ID", e4);
                                                j = 0;
                                            }
                                        } else {
                                            strArrSplit = str2.split(":");
                                            if (strArrSplit.length < 2) {
                                                j = 0;
                                            } else {
                                                str3 = strArrSplit[1];
                                                if (str3.isEmpty()) {
                                                    j = 0;
                                                } else {
                                                    try {
                                                        j = Long.parseLong(str3);
                                                    } catch (NumberFormatException e5) {
                                                        b0.f("FirebaseMessaging", "error parsing app ID", e5);
                                                        j = 0;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            w42.a("FCM_CLIENT_EVENT_LOGGING", new H60("proto"), new C6133qP()).a(new C6850to(new WZ0(new VZ0(j > 0 ? j : 0L, str5, str4, bVar, packageName, str7, i, str6, str8, str9)), EnumC6825th1.d), new C0663Bh());
                        } catch (RuntimeException e6) {
                            b0.f("FirebaseMessaging", "Failed to send big query analytics payload.", e6);
                        }
                    }
                    break;
                }
                dispatchMessage(intent);
                return;
            case "send_error":
                String messageId = getMessageId(intent);
                String stringExtra2 = intent.getStringExtra("error");
                C1054Gh0 c1054Gh0 = new C1054Gh0(stringExtra2);
                if (stringExtra2 != null) {
                    stringExtra2.toLowerCase(Locale.US).getClass();
                }
                onSendError(messageId, c1054Gh0);
                return;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                return;
            default:
                b0.e("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                return;
        }
    }

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // defpackage.Z60
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) C7794yI1.a().d.poll();
    }

    @Override // defpackage.Z60
    public void handleIntent(Intent intent) {
        String action = intent.getAction();
        if (ACTION_REMOTE_INTENT.equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            handleMessageIntent(intent);
        } else if (ACTION_NEW_TOKEN.equals(action)) {
            onNewToken(intent.getStringExtra(EXTRA_TOKEN));
        } else {
            intent.getAction();
        }
    }

    public void onDeletedMessages() {
    }

    public void onMessageSent(@NonNull String str) {
    }

    public void onNewToken(@NonNull String str) {
    }

    public void onSendError(@NonNull String str, @NonNull Exception exc) {
    }

    public void onMessageReceived(@NonNull C7492wr1 c7492wr1) {
    }
}
