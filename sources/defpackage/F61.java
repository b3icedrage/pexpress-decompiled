package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"LF61;", "LRt0;", "LOt0;", "_lifecycleService", "<init>", "(LOt0;)V", "Landroid/content/Intent;", "intent", "Lorg/json/JSONObject;", "covertHMSOpenIntentToJson", "(Landroid/content/Intent;)Lorg/json/JSONObject;", "jsonData", "", "reformatButtonClickAction", "(Lorg/json/JSONObject;)V", "Landroid/app/Activity;", "activity", "handleProcessJsonOpenData", "(Landroid/app/Activity;Lorg/json/JSONObject;LJM;)Ljava/lang/Object;", "handleHMSNotificationOpenIntent", "(Landroid/app/Activity;Landroid/content/Intent;LJM;)Ljava/lang/Object;", "LOt0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class F61 implements InterfaceC1950Rt0 {

    @NotNull
    private final InterfaceC1716Ot0 _lifecycleService;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS", f = "NotificationOpenedProcessorHMS.kt", l = {62, 66}, m = "handleProcessJsonOpenData")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
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
            return F61.this.handleProcessJsonOpenData(null, null, this);
        }
    }

    public F61(@NotNull InterfaceC1716Ot0 _lifecycleService) {
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._lifecycleService = _lifecycleService;
    }

    private final JSONObject covertHMSOpenIntentToJson(Intent intent) {
        if (!C6074q61.INSTANCE.isOneSignalIntent(intent)) {
            return null;
        }
        Intrinsics.checkNotNull(intent);
        Bundle extras = intent.getExtras();
        KD0 kd0 = KD0.INSTANCE;
        Intrinsics.checkNotNull(extras);
        JSONObject jSONObjectBundleAsJSONObject = kd0.bundleAsJSONObject(extras);
        reformatButtonClickAction(jSONObjectBundleAsJSONObject);
        return jSONObjectBundleAsJSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r8.notificationOpened(r6, r7, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object handleProcessJsonOpenData(android.app.Activity r6, org.json.JSONObject r7, defpackage.JM<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof F61.a
            if (r0 == 0) goto L13
            r0 = r8
            F61$a r0 = (F61.a) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            F61$a r0 = new F61$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r8)
            goto L7b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$2
            r7 = r6
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            java.lang.Object r6 = r0.L$1
            android.app.Activity r6 = (android.app.Activity) r6
            java.lang.Object r2 = r0.L$0
            F61 r2 = (defpackage.F61) r2
            defpackage.C1795Pt1.b(r8)
            goto L58
        L43:
            defpackage.C1795Pt1.b(r8)
            Ot0 r8 = r5._lifecycleService
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r8.canOpenNotification(r6, r7, r0)
            if (r8 != r1) goto L57
            goto L7a
        L57:
            r2 = r5
        L58:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L63
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L63:
            Ot0 r8 = r2._lifecycleService
            KD0 r2 = defpackage.KD0.INSTANCE
            org.json.JSONArray r7 = r2.wrapInJsonArray(r7)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.notificationOpened(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F61.handleProcessJsonOpenData(android.app.Activity, org.json.JSONObject, JM):java.lang.Object");
    }

    private final void reformatButtonClickAction(JSONObject jsonData) {
        try {
            String str = (String) C6913u61.INSTANCE.getCustomJSONObject(jsonData).remove("actionId");
            if (str == null) {
                return;
            }
            jsonData.put("actionId", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.InterfaceC1950Rt0
    @Nullable
    public Object handleHMSNotificationOpenIntent(@NotNull Activity activity, @Nullable Intent intent, @NotNull JM<? super Unit> jm) {
        if (intent == null) {
            return Unit.a;
        }
        JSONObject jSONObjectCovertHMSOpenIntentToJson = covertHMSOpenIntentToJson(intent);
        if (jSONObjectCovertHMSOpenIntentToJson == null) {
            return Unit.a;
        }
        Object objHandleProcessJsonOpenData = handleProcessJsonOpenData(activity, jSONObjectCovertHMSOpenIntentToJson, jm);
        return objHandleProcessJsonOpenData == MN.d ? objHandleProcessJsonOpenData : Unit.a;
    }
}
