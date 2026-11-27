package defpackage;

import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.onesignal.common.AndroidUtils;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: p61, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u001a\u001a\u00020\u00192\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b!\u0010\"J9\u0010)\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020#2\b\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010%\u001a\u00020\u00172\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J#\u0010,\u001a\u0004\u0018\u00010\u00172\b\u0010 \u001a\u0004\u0018\u00010\u00152\u0006\u0010+\u001a\u00020&H\u0002¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020&H\u0002¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u0004\u0018\u00010/2\u0006\u00102\u001a\u00020&H\u0002¢\u0006\u0004\b3\u00101J\u001b\u00105\u001a\u0004\u0018\u00010/2\b\u00104\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b5\u00101J\u0019\u00107\u001a\u00020\u00172\b\u00106\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b7\u00108J\u0017\u00109\u001a\u00020\u00172\u0006\u00104\u001a\u00020&H\u0002¢\u0006\u0004\b9\u00108J\u001b\u0010:\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010<R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010>R\u0016\u0010B\u001a\u0004\u0018\u00010?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0016\u0010I\u001a\u0004\u0018\u00010&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010J\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\bJ\u0010K\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006L"}, d2 = {"Lp61;", "LJt0;", "LWr0;", "_applicationService", "LPt0;", "_notificationLimitManager", "Ldv0;", "_summaryNotificationDisplayer", "LIt0;", "_notificationDisplayBuilder", "<init>", "(LWr0;LPt0;Ldv0;LIt0;)V", "Lr61;", "notificationJob", "", "showNotification", "(Lr61;LJM;)Ljava/lang/Object;", "Lh61;", "notifBuilder", "LQB0;", "intentGenerator", "Lorg/json/JSONObject;", "gcmBundle", "", "notificationId", "Landroid/app/Notification;", "createGenericPendingIntentsForNotif", "(Lh61;LQB0;Lorg/json/JSONObject;I)Landroid/app/Notification;", "notificationBuilder", "", "applyNotificationExtender", "(Lr61;Lh61;)V", "fcmJson", "addBackgroundImage", "(Lorg/json/JSONObject;Lh61;)V", "Landroid/widget/RemoteViews;", "customView", "viewId", "", "colorPayloadKey", "colorDefaultResource", "setTextColor", "(Landroid/widget/RemoteViews;Lorg/json/JSONObject;ILjava/lang/String;Ljava/lang/String;)V", "colorKey", "safeGetColorFromHex", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/Integer;", "bitmapStr", "Landroid/graphics/Bitmap;", "getBitmapFromAssetsOrResourceName", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "location", "getBitmapFromURL", AppMeasurementSdk.ConditionalUserProperty.NAME, "getBitmap", "iconName", "getResourceIcon", "(Ljava/lang/String;)I", "getDrawableId", "displayNotification", "LWr0;", "LPt0;", "Ldv0;", "LIt0;", "Landroid/content/res/Resources;", "getContextResources", "()Landroid/content/res/Resources;", "contextResources", "Landroid/content/Context;", "getCurrentContext", "()Landroid/content/Context;", "currentContext", "getPackageName", "()Ljava/lang/String;", "packageName", "isRunningOnMainThreadCheck", "()Lkotlin/Unit;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C5864p61 implements InterfaceC1324Jt0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC1246It0 _notificationDisplayBuilder;

    @NotNull
    private final InterfaceC1794Pt0 _notificationLimitManager;

    @NotNull
    private final InterfaceC3462dv0 _summaryNotificationDisplayer;

    /* JADX INFO: renamed from: p61$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.display.impl.NotificationDisplayer", f = "NotificationDisplayer.kt", l = {118, 133, 140}, m = "showNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
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
            return C5864p61.this.showNotification(null, this);
        }
    }

    public C5864p61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC1794Pt0 _notificationLimitManager, @NotNull InterfaceC3462dv0 _summaryNotificationDisplayer, @NotNull InterfaceC1246It0 _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_notificationLimitManager, "_notificationLimitManager");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._notificationLimitManager = _notificationLimitManager;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final void addBackgroundImage(JSONObject fcmJson, C4133h61 notifBuilder) throws JSONException {
        Bitmap bitmapFromAssetsOrResourceName;
        JSONObject jSONObject;
        String string;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            NS0.verbose$default("Cannot use background images in notifications for device on version: " + i, null, 2, null);
            return;
        }
        String strOptString = fcmJson.optString("bg_img", null);
        if (strOptString != null) {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            bitmapFromAssetsOrResourceName = getBitmap(jSONObject2.optString("img", null));
            jSONObject = jSONObject2;
        } else {
            bitmapFromAssetsOrResourceName = null;
            jSONObject = null;
        }
        if (bitmapFromAssetsOrResourceName == null) {
            bitmapFromAssetsOrResourceName = getBitmapFromAssetsOrResourceName("onesignal_bgimage_default_image");
        }
        if (bitmapFromAssetsOrResourceName != null) {
            Context currentContext = getCurrentContext();
            Intrinsics.checkNotNull(currentContext);
            RemoteViews remoteViews = new RemoteViews(currentContext.getPackageName(), C1457Ll1.onesignal_bgimage_notif_layout);
            remoteViews.setTextViewText(C1301Jl1.os_bgimage_notif_title, this._notificationDisplayBuilder.getTitle(fcmJson));
            remoteViews.setTextViewText(C1301Jl1.os_bgimage_notif_body, fcmJson.optString("alert"));
            setTextColor(remoteViews, jSONObject, C1301Jl1.os_bgimage_notif_title, "tc", "onesignal_bgimage_notif_title_color");
            setTextColor(remoteViews, jSONObject, C1301Jl1.os_bgimage_notif_body, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject == null || !jSONObject.has("img_align")) {
                Resources contextResources = getContextResources();
                Intrinsics.checkNotNull(contextResources);
                int identifier = contextResources.getIdentifier("onesignal_bgimage_notif_image_align", "string", getPackageName());
                if (identifier != 0) {
                    Resources contextResources2 = getContextResources();
                    Intrinsics.checkNotNull(contextResources2);
                    string = contextResources2.getString(identifier);
                } else {
                    string = null;
                }
            } else {
                string = jSONObject.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(C1301Jl1.os_bgimage_notif_bgimage_align_layout, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(C1301Jl1.os_bgimage_notif_bgimage_right_aligned, bitmapFromAssetsOrResourceName);
                remoteViews.setViewVisibility(C1301Jl1.os_bgimage_notif_bgimage_right_aligned, 0);
                remoteViews.setViewVisibility(C1301Jl1.os_bgimage_notif_bgimage, 8);
            } else {
                remoteViews.setImageViewBitmap(C1301Jl1.os_bgimage_notif_bgimage, bitmapFromAssetsOrResourceName);
            }
            Intrinsics.checkNotNull(notifBuilder);
            notifBuilder.z.contentView = remoteViews;
            notifBuilder.k(null);
        }
    }

    private final void applyNotificationExtender(C6283r61 notificationJob, C4133h61 notificationBuilder) {
        if (notificationJob.hasExtender()) {
            try {
                Field declaredField = C4133h61.class.getDeclaredField("z");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(notificationBuilder);
                Intrinsics.c(obj, "null cannot be cast to non-null type android.app.Notification");
                Notification notification = (Notification) obj;
                notificationJob.setOrgFlags(Integer.valueOf(notification.flags));
                notificationJob.setOrgSound(notification.sound);
                Intrinsics.checkNotNull(notificationBuilder);
                O51 notification2 = notificationJob.getNotification();
                Intrinsics.checkNotNull(notification2);
                notification2.getNotificationExtender();
                Intrinsics.checkNotNull(null);
                notificationBuilder.getClass();
                throw null;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private final Notification createGenericPendingIntentsForNotif(C4133h61 notifBuilder, QB0 intentGenerator, JSONObject gcmBundle, int notificationId) {
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = intentGenerator.getNewBaseIntent(notificationId).putExtra("onesignalData", gcmBundle.toString());
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "intentGenerator.getNewBa…TA, gcmBundle.toString())");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(iNextInt, intentPutExtra);
        Intrinsics.checkNotNull(notifBuilder);
        notifBuilder.g = newActionPendingIntent;
        notifBuilder.z.deleteIntent = this._notificationDisplayBuilder.getNewDismissActionPendingIntent(secureRandom.nextInt(), this._notificationDisplayBuilder.getNewBaseDismissIntent(notificationId));
        Notification notificationB = notifBuilder.b();
        Intrinsics.checkNotNullExpressionValue(notificationB, "notifBuilder.build()");
        return notificationB;
    }

    private final Bitmap getBitmap(String name) {
        if (name == null) {
            return null;
        }
        int length = name.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(name.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = name.subSequence(i, length + 1).toString();
        return (d.o(string, "http://", false) || d.o(string, "https://", false)) ? getBitmapFromURL(string) : getBitmapFromAssetsOrResourceName(name);
    }

    private final Bitmap getBitmapFromAssetsOrResourceName(String bitmapStr) {
        Bitmap bitmapDecodeStream;
        try {
            Context currentContext = getCurrentContext();
            Intrinsics.checkNotNull(currentContext);
            bitmapDecodeStream = BitmapFactory.decodeStream(currentContext.getAssets().open(bitmapStr));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    Context currentContext2 = getCurrentContext();
                    Intrinsics.checkNotNull(currentContext2);
                    bitmapDecodeStream = BitmapFactory.decodeStream(currentContext2.getAssets().open(bitmapStr + str));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int resourceIcon = getResourceIcon(bitmapStr);
            if (resourceIcon != 0) {
                return BitmapFactory.decodeResource(getContextResources(), resourceIcon);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    private final Bitmap getBitmapFromURL(String location) {
        try {
            return BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(location).openConnection())).getInputStream());
        } catch (Throwable th) {
            NS0.warn("Could not download image!", th);
            return null;
        }
    }

    private final Resources getContextResources() {
        return this._applicationService.getAppContext().getResources();
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    private final int getDrawableId(String name) {
        Resources contextResources = getContextResources();
        Intrinsics.checkNotNull(contextResources);
        return contextResources.getIdentifier(name, "drawable", getPackageName());
    }

    private final String getPackageName() {
        return this._applicationService.getAppContext().getPackageName();
    }

    private final int getResourceIcon(String iconName) {
        if (iconName == null) {
            return 0;
        }
        int length = iconName.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.e(iconName.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        String string = iconName.subSequence(i, length + 1).toString();
        if (!AndroidUtils.INSTANCE.isValidResourceName(string)) {
            return 0;
        }
        int drawableId = getDrawableId(string);
        if (drawableId != 0) {
            return drawableId;
        }
        try {
            return R.drawable.class.getField(iconName).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    private final Integer safeGetColorFromHex(JSONObject fcmJson, String colorKey) {
        if (fcmJson == null) {
            return null;
        }
        try {
            if (fcmJson.has(colorKey)) {
                return Integer.valueOf(new BigInteger(fcmJson.optString(colorKey), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void setTextColor(RemoteViews customView, JSONObject fcmJson, int viewId, String colorPayloadKey, String colorDefaultResource) {
        Integer numSafeGetColorFromHex = safeGetColorFromHex(fcmJson, colorPayloadKey);
        if (numSafeGetColorFromHex != null) {
            customView.setTextColor(viewId, numSafeGetColorFromHex.intValue());
            return;
        }
        Resources contextResources = getContextResources();
        Intrinsics.checkNotNull(contextResources);
        int identifier = contextResources.getIdentifier(colorDefaultResource, "color", getPackageName());
        if (identifier != 0) {
            customView.setTextColor(viewId, C6333rM.getColor(getCurrentContext(), identifier));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:55:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0168, code lost:
    
        if (r4.createGrouplessSummaryNotification(r15, r18, r7, r8, r9) == r3) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x016b, code lost:
    
        r4 = r0;
        r5 = r2;
        r2 = r12;
        r3 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0193, code lost:
    
        if (r4.createSummaryNotification(r15, r0, r7, r9) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object showNotification(defpackage.C6283r61 r23, defpackage.JM<? super java.lang.Boolean> r24) {
        /*
            Method dump skipped, instruction units count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5864p61.showNotification(r61, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1324Jt0
    @Nullable
    public Object displayNotification(@NotNull C6283r61 c6283r61, @NotNull JM<? super Boolean> jm) {
        isRunningOnMainThreadCheck();
        return showNotification(c6283r61, jm);
    }

    @NotNull
    public final Unit isRunningOnMainThreadCheck() {
        if (AndroidUtils.INSTANCE.isRunningOnMainThread()) {
            throw new TV0("Process for showing a notification should never been done on Main Thread!");
        }
        return Unit.a;
    }
}
