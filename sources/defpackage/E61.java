package defpackage;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010\"\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000eH\u0082@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0082@ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010(J#\u0010)\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"LE61;", "LQt0;", "Lau0;", "_summaryManager", "LVt0;", "_dataController", "LxI;", "_configModelStore", "LOt0;", "_lifecycleService", "<init>", "(Lau0;LVt0;LxI;LOt0;)V", "Landroid/content/Intent;", "intent", "", "isOneSignalIntent", "(Landroid/content/Intent;)Z", "Landroid/content/Context;", "context", "", "handleDismissFromActionButtonPress", "(Landroid/content/Context;Landroid/content/Intent;)V", "processIntent", "(Landroid/content/Context;Landroid/content/Intent;LJM;)Ljava/lang/Object;", "", "summaryGroup", "Lv61;", "processToOpenIntent", "(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;LJM;)Ljava/lang/Object;", "Lorg/json/JSONArray;", "dataArray", "addChildNotifications", "(Lorg/json/JSONArray;Ljava/lang/String;LJM;)Ljava/lang/Object;", "dismissed", "markNotificationsConsumed", "(Landroid/content/Context;Landroid/content/Intent;ZLJM;)Ljava/lang/Object;", "clearStatusBarNotifications", "(Landroid/content/Context;Ljava/lang/String;LJM;)Ljava/lang/Object;", "Landroid/content/ContentValues;", "newContentValuesWithConsumed", "(Landroid/content/Intent;)Landroid/content/ContentValues;", "processFromContext", "Lau0;", "LVt0;", "LxI;", "LOt0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class E61 implements InterfaceC1872Qt0 {

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC2262Vt0 _dataController;

    @NotNull
    private final InterfaceC1716Ot0 _lifecycleService;

    @NotNull
    private final InterfaceC2831au0 _summaryManager;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {179}, m = "addChildNotifications")
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
            return E61.this.addChildNotifications(null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {191, 192}, m = "markNotificationsConsumed")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(JM<? super b> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return E61.this.markNotificationsConsumed(null, null, false, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {107, 113, 119, 130}, m = "processIntent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public c(JM<? super c> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return E61.this.processIntent(null, null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {150, 169}, m = "processToOpenIntent")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(JM<? super d> jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return E61.this.processToOpenIntent(null, null, null, this);
        }
    }

    public E61(@NotNull InterfaceC2831au0 _summaryManager, @NotNull InterfaceC2262Vt0 _dataController, @NotNull C7582xI _configModelStore, @NotNull InterfaceC1716Ot0 _lifecycleService) {
        Intrinsics.checkNotNullParameter(_summaryManager, "_summaryManager");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_lifecycleService, "_lifecycleService");
        this._summaryManager = _summaryManager;
        this._dataController = _dataController;
        this._configModelStore = _configModelStore;
        this._lifecycleService = _lifecycleService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object addChildNotifications(JSONArray jSONArray, String str, JM<? super Unit> jm) {
        a aVar;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object objListNotificationsForGroup = aVar.result;
        MN mn = MN.d;
        int i2 = aVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objListNotificationsForGroup);
            InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
            aVar.L$0 = jSONArray;
            aVar.label = 1;
            objListNotificationsForGroup = interfaceC2262Vt0.listNotificationsForGroup(str, aVar);
            if (objListNotificationsForGroup == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONArray = (JSONArray) aVar.L$0;
            C1795Pt1.b(objListNotificationsForGroup);
        }
        Iterator it = ((List) objListNotificationsForGroup).iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject(((InterfaceC2262Vt0.b) it.next()).getFullData()));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object clearStatusBarNotifications(Context context, String str, JM<? super Unit> jm) {
        if (str != null) {
            Object objClearNotificationOnSummaryClick = this._summaryManager.clearNotificationOnSummaryClick(str, jm);
            return objClearNotificationOnSummaryClick == MN.d ? objClearNotificationOnSummaryClick : Unit.a;
        }
        C6913u61 c6913u61 = C6913u61.INSTANCE;
        if (c6913u61.getGrouplessNotifsCount(context) < 1) {
            c6913u61.getNotificationManager(context).cancel(C6913u61.GROUPLESS_SUMMARY_ID);
        }
        return Unit.a;
    }

    @SuppressLint({"MissingPermission"})
    private final void handleDismissFromActionButtonPress(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            Intrinsics.checkNotNull(context);
            B61 b61 = new B61(context);
            b61.b.cancel(null, intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    private final boolean isOneSignalIntent(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8.markAsConsumed(r9, r3, r4, r5, r6) == r0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object markNotificationsConsumed(android.content.Context r8, android.content.Intent r9, boolean r10, defpackage.JM<? super kotlin.Unit> r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof E61.b
            if (r0 == 0) goto L14
            r0 = r11
            E61$b r0 = (E61.b) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            E61$b r0 = new E61$b
            r0.<init>(r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.result
            MN r0 = defpackage.MN.d
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            defpackage.C1795Pt1.b(r11)
            goto L8c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            boolean r10 = r6.Z$0
            java.lang.Object r8 = r6.L$2
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r6.L$1
            android.content.Intent r9 = (android.content.Intent) r9
            java.lang.Object r1 = r6.L$0
            E61 r1 = (defpackage.E61) r1
            defpackage.C1795Pt1.b(r11)
            r4 = r8
        L46:
            r3 = r10
            goto L65
        L48:
            defpackage.C1795Pt1.b(r11)
            java.lang.String r11 = "summary"
            java.lang.String r11 = r9.getStringExtra(r11)
            r6.L$0 = r7
            r6.L$1 = r9
            r6.L$2 = r11
            r6.Z$0 = r10
            r6.label = r3
            java.lang.Object r8 = r7.clearStatusBarNotifications(r8, r11, r6)
            if (r8 != r0) goto L62
            goto L8b
        L62:
            r1 = r7
            r4 = r11
            goto L46
        L65:
            Vt0 r8 = r1._dataController
            java.lang.String r10 = "androidNotificationId"
            r11 = 0
            int r9 = r9.getIntExtra(r10, r11)
            xI r10 = r1._configModelStore
            D01 r10 = r10.getModel()
            wI r10 = (defpackage.C7371wI) r10
            boolean r5 = r10.getClearGroupOnSummaryClick()
            r10 = 0
            r6.L$0 = r10
            r6.L$1 = r10
            r6.L$2 = r10
            r6.label = r2
            r1 = r8
            r2 = r9
            java.lang.Object r8 = r1.markAsConsumed(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L8c
        L8b:
            return r0
        L8c:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E61.markNotificationsConsumed(android.content.Context, android.content.Intent, boolean, JM):java.lang.Object");
    }

    private final ContentValues newContentValuesWithConsumed(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
            return contentValues;
        }
        contentValues.put("opened", (Integer) 1);
        return contentValues;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fd A[PHI: r5 r8 r9 r12 r13
      0x00fd: PHI (r5v9 android.content.Intent) = (r5v7 android.content.Intent), (r5v7 android.content.Intent), (r5v11 android.content.Intent) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r8v7 android.content.Context) = (r8v6 android.content.Context), (r8v6 android.content.Context), (r8v9 android.content.Context) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r9v4 E61) = (r9v3 E61), (r9v3 E61), (r9v5 E61) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r12v6 boolean) = (r12v5 boolean), (r12v5 boolean), (r12v13 boolean) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]
      0x00fd: PHI (r13v5 v61) = (r13v4 v61), (r13v4 v61), (r13v8 v61) binds: [B:35:0x00d5, B:37:0x00dd, B:42:0x00fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0149  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0164, code lost:
    
        if (r9._lifecycleService.notificationOpened((android.app.Activity) r8, r13, r0) == r1) goto L52;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00fd, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:45:0x011c, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:49:0x0137, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processIntent(android.content.Context r12, android.content.Intent r13, defpackage.JM<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E61.processIntent(android.content.Context, android.content.Intent, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00db, code lost:
    
        if (r1.addChildNotifications(r11, r12, r2) == r3) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processToOpenIntent(android.content.Context r10, android.content.Intent r11, java.lang.String r12, defpackage.JM<? super defpackage.C7123v61> r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.E61.processToOpenIntent(android.content.Context, android.content.Intent, java.lang.String, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1872Qt0
    @Nullable
    public Object processFromContext(@NotNull Context context, @NotNull Intent intent, @NotNull JM<? super Unit> jm) {
        if (!isOneSignalIntent(intent)) {
            return Unit.a;
        }
        handleDismissFromActionButtonPress(context, intent);
        Object objProcessIntent = processIntent(context, intent, jm);
        return objProcessIntent == MN.d ? objProcessIntent : Unit.a;
    }
}
