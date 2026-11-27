package com.onesignal.notifications.internal.generation.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.onesignal.common.AndroidUtils;
import defpackage.AbstractC4477ik2;
import defpackage.C1039Gc0;
import defpackage.C1795Pt1;
import defpackage.C6074q61;
import defpackage.C7766y91;
import defpackage.EnumC5957pa0;
import defpackage.I71;
import defpackage.InterfaceC1402Kt0;
import defpackage.InterfaceC1479Lt0;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.K91;
import defpackage.LM;
import defpackage.MN;
import defpackage.NS0;
import defpackage.R51;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager;", "LLt0;", "<init>", "()V", "Landroid/content/Context;", "context", "", "osNotificationId", "", "androidNotificationId", "Lorg/json/JSONObject;", "jsonPayload", "", NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM, "", "isRestoring", "isHighPriority", "beginEnqueueingWork", "(Landroid/content/Context;Ljava/lang/String;ILorg/json/JSONObject;JZZ)Z", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "NotificationGenerationWorker", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class NotificationGenerationWorkManager implements InterfaceC1479Lt0 {

    @NotNull
    private static final String ANDROID_NOTIF_ID_WORKER_DATA_PARAM = "android_notif_id";

    @NotNull
    private static final String IS_RESTORING_WORKER_DATA_PARAM = "is_restoring";

    @NotNull
    private static final String JSON_PAYLOAD_WORKER_DATA_PARAM = "json_payload";

    @NotNull
    private static final String OS_ID_DATA_PARAM = "os_notif_id";

    @NotNull
    private static final String TIMESTAMP_WORKER_DATA_PARAM = "timestamp";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final ConcurrentHashMap<String, Boolean> notificationIds = new ConcurrentHashMap<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager$NotificationGenerationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(LJM;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class NotificationGenerationWorker extends CoroutineWorker {

        @InterfaceC3368dU(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker", f = "NotificationGenerationWorkManager.kt", l = {81}, m = "doWork")
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends LM {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public a(JM<? super a> jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return NotificationGenerationWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NotificationGenerationWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        @Override // androidx.work.CoroutineWorker
        @Nullable
        public Object doWork(@NotNull JM<? super c.a> jm) throws Throwable {
            a aVar;
            NotificationGenerationWorker notificationGenerationWorker;
            String str;
            String str2 = "NotificationWorker running doWork with data: ";
            if (jm instanceof a) {
                aVar = (a) jm;
                int i = aVar.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.label = i - Integer.MIN_VALUE;
                    notificationGenerationWorker = this;
                } else {
                    notificationGenerationWorker = this;
                    aVar = notificationGenerationWorker.new a(jm);
                }
            } else {
                notificationGenerationWorker = this;
                aVar = notificationGenerationWorker.new a(jm);
            }
            a aVar2 = aVar;
            Object obj = aVar2.result;
            MN mn = MN.d;
            int i2 = aVar2.label;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) aVar2.L$0;
                    try {
                        C1795Pt1.b(obj);
                        Companion companion = NotificationGenerationWorkManager.INSTANCE;
                        Intrinsics.checkNotNull(str);
                        companion.removeNotificationIdProcessed(str);
                        c.a.C0243c c0243c = new c.a.C0243c();
                        Intrinsics.checkNotNullExpressionValue(c0243c, "success()");
                        return c0243c;
                    } catch (JSONException e) {
                        e = e;
                        NS0.error("Error occurred doing work for job with id: " + str, e);
                        c.a.C0242a c0242a = new c.a.C0242a();
                        Intrinsics.checkNotNullExpressionValue(c0242a, "failure()");
                        Companion companion2 = NotificationGenerationWorkManager.INSTANCE;
                        Intrinsics.checkNotNull(str);
                        companion2.removeNotificationIdProcessed(str);
                        return c0242a;
                    }
                }
                C1795Pt1.b(obj);
                Context applicationContext = notificationGenerationWorker.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                if (!C7766y91.c(applicationContext)) {
                    c.a.C0243c c0243c2 = new c.a.C0243c();
                    Intrinsics.checkNotNullExpressionValue(c0243c2, "success()");
                    return c0243c2;
                }
                InterfaceC1402Kt0 interfaceC1402Kt0 = (InterfaceC1402Kt0) C7766y91.b().getService(InterfaceC1402Kt0.class);
                b inputData = notificationGenerationWorker.getInputData();
                Intrinsics.checkNotNullExpressionValue(inputData, "inputData");
                String strB = inputData.b(NotificationGenerationWorkManager.OS_ID_DATA_PARAM);
                if (strB == null) {
                    c.a.C0242a c0242a2 = new c.a.C0242a();
                    Intrinsics.checkNotNullExpressionValue(c0242a2, "failure()");
                    return c0242a2;
                }
                try {
                    NS0.debug$default("NotificationWorker running doWork with data: " + inputData, null, 2, null);
                    HashMap map = inputData.a;
                    Object obj2 = map.get(NotificationGenerationWorkManager.ANDROID_NOTIF_ID_WORKER_DATA_PARAM);
                    int iIntValue = obj2 instanceof Integer ? ((Integer) obj2).intValue() : 0;
                    JSONObject jSONObject = new JSONObject(inputData.b(NotificationGenerationWorkManager.JSON_PAYLOAD_WORKER_DATA_PARAM));
                    long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                    Object obj3 = map.get(NotificationGenerationWorkManager.TIMESTAMP_WORKER_DATA_PARAM);
                    if (obj3 instanceof Long) {
                        jCurrentTimeMillis = ((Long) obj3).longValue();
                    }
                    Object obj4 = map.get(NotificationGenerationWorkManager.IS_RESTORING_WORKER_DATA_PARAM);
                    boolean zBooleanValue = obj4 instanceof Boolean ? ((Boolean) obj4).booleanValue() : false;
                    Context applicationContext2 = notificationGenerationWorker.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext2, "applicationContext");
                    aVar2.L$0 = strB;
                    aVar2.label = 1;
                    if (interfaceC1402Kt0.processNotificationData(applicationContext2, iIntValue, jSONObject, zBooleanValue, jCurrentTimeMillis, aVar2) == mn) {
                        return mn;
                    }
                    str = strB;
                    Companion companion3 = NotificationGenerationWorkManager.INSTANCE;
                    Intrinsics.checkNotNull(str);
                    companion3.removeNotificationIdProcessed(str);
                    c.a.C0243c c0243c3 = new c.a.C0243c();
                    Intrinsics.checkNotNullExpressionValue(c0243c3, "success()");
                    return c0243c3;
                } catch (JSONException e2) {
                    e = e2;
                    str = strB;
                    NS0.error("Error occurred doing work for job with id: " + str, e);
                    c.a.C0242a c0242a3 = new c.a.C0242a();
                    Intrinsics.checkNotNullExpressionValue(c0242a3, "failure()");
                    Companion companion4 = NotificationGenerationWorkManager.INSTANCE;
                    Intrinsics.checkNotNull(str);
                    companion4.removeNotificationIdProcessed(str);
                    return c0242a3;
                } catch (Throwable th) {
                    th = th;
                    str2 = strB;
                    Companion companion5 = NotificationGenerationWorkManager.INSTANCE;
                    Intrinsics.checkNotNull(str2);
                    companion5.removeNotificationIdProcessed(str2);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/onesignal/notifications/internal/generation/impl/NotificationGenerationWorkManager$a;", "", "<init>", "()V", "", "osNotificationId", "", "addNotificationIdProcessed", "(Ljava/lang/String;)Z", "", "removeNotificationIdProcessed", "(Ljava/lang/String;)V", "ANDROID_NOTIF_ID_WORKER_DATA_PARAM", "Ljava/lang/String;", "IS_RESTORING_WORKER_DATA_PARAM", "JSON_PAYLOAD_WORKER_DATA_PARAM", "OS_ID_DATA_PARAM", "TIMESTAMP_WORKER_DATA_PARAM", "Ljava/util/concurrent/ConcurrentHashMap;", "notificationIds", "Ljava/util/concurrent/ConcurrentHashMap;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean addNotificationIdProcessed(@NotNull String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (!AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                return true;
            }
            if (NotificationGenerationWorkManager.notificationIds.contains(osNotificationId)) {
                NS0.debug$default(C1039Gc0.d("OSNotificationWorkManager notification with notificationId: ", osNotificationId, " already queued"), null, 2, null);
                return false;
            }
            NotificationGenerationWorkManager.notificationIds.put(osNotificationId, Boolean.TRUE);
            return true;
        }

        public final void removeNotificationIdProcessed(@NotNull String osNotificationId) {
            Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
            if (AndroidUtils.INSTANCE.isStringNotEmpty(osNotificationId)) {
                NotificationGenerationWorkManager.notificationIds.remove(osNotificationId);
            }
        }

        private Companion() {
        }
    }

    @Override // defpackage.InterfaceC1479Lt0
    public boolean beginEnqueueingWork(@NotNull Context context, @NotNull String osNotificationId, int androidNotificationId, @Nullable JSONObject jsonPayload, long timestamp, boolean isRestoring, boolean isHighPriority) throws Throwable {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(osNotificationId, "osNotificationId");
        String oSNotificationIdFromJson = C6074q61.INSTANCE.getOSNotificationIdFromJson(jsonPayload);
        if (oSNotificationIdFromJson == null) {
            NS0.debug$default("Notification beginEnqueueingWork with id null", null, 2, null);
            return false;
        }
        if (!INSTANCE.addNotificationIdProcessed(oSNotificationIdFromJson)) {
            NS0.debug$default("Notification beginEnqueueingWork with id duplicated", null, 2, null);
            return true;
        }
        HashMap map = new HashMap();
        map.put(OS_ID_DATA_PARAM, oSNotificationIdFromJson);
        map.put(ANDROID_NOTIF_ID_WORKER_DATA_PARAM, Integer.valueOf(androidNotificationId));
        map.put(JSON_PAYLOAD_WORKER_DATA_PARAM, String.valueOf(jsonPayload));
        map.put(TIMESTAMP_WORKER_DATA_PARAM, Long.valueOf(timestamp));
        map.put(IS_RESTORING_WORKER_DATA_PARAM, Boolean.valueOf(isRestoring));
        b bVar = new b(map);
        b.c(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "Builder()\n              …\n                .build()");
        K91 k91A = new K91.a(NotificationGenerationWorker.class).e(bVar).a();
        NS0.debug$default("NotificationWorkManager enqueueing notification work with notificationId: " + osNotificationId + " and jsonPayload: " + jsonPayload, null, 2, null);
        AbstractC4477ik2 i71 = I71.INSTANCE.getInstance(context);
        EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.e;
        i71.getClass();
        i71.a(osNotificationId, enumC5957pa0, Collections.singletonList(k91A));
        return true;
    }
}
