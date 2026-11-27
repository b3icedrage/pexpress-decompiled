package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0016J\u001b\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"LT61;", "Lau0;", "LWr0;", "_applicationService", "LVt0;", "_dataController", "Ldv0;", "_summaryNotificationDisplayer", "LxI;", "_configModelStore", "LWt0;", "_notificationRestoreProcessor", "Lgv0;", "_time", "<init>", "(LWr0;LVt0;Ldv0;LxI;LWt0;Lgv0;)V", "", "group", "", "dismissed", "", "internalUpdateSummaryNotificationAfterChildRemoved", "(Ljava/lang/String;ZLJM;)Ljava/lang/Object;", "restoreSummary", "(Ljava/lang/String;LJM;)Ljava/lang/Object;", "", "androidNotificationId", "updatePossibleDependentSummaryOnDismiss", "(ILJM;)Ljava/lang/Object;", "updateSummaryNotificationAfterChildRemoved", "clearNotificationOnSummaryClick", "LWr0;", "LVt0;", "Ldv0;", "LxI;", "LWt0;", "Lgv0;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class T61 implements InterfaceC2831au0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC2262Vt0 _dataController;

    @NotNull
    private final InterfaceC2344Wt0 _notificationRestoreProcessor;

    @NotNull
    private final InterfaceC3462dv0 _summaryNotificationDisplayer;

    @NotNull
    private final InterfaceC4092gv0 _time;

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {99, 109, 118}, m = "clearNotificationOnSummaryClick")
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
            return T61.this.clearNotificationOnSummaryClick(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {44, 48, 59, 67, 81}, m = "internalUpdateSummaryNotificationAfterChildRemoved")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        int I$0;
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
            return T61.this.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {88, 90}, m = "restoreSummary")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class c extends LM {
        Object L$0;
        Object L$1;
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
            return T61.this.restoreSummary(null, this);
        }
    }

    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {25, 28}, m = "updatePossibleDependentSummaryOnDismiss")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class d extends LM {
        Object L$0;
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
            return T61.this.updatePossibleDependentSummaryOnDismiss(0, this);
        }
    }

    public T61(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2262Vt0 _dataController, @NotNull InterfaceC3462dv0 _summaryNotificationDisplayer, @NotNull C7582xI _configModelStore, @NotNull InterfaceC2344Wt0 _notificationRestoreProcessor, @NotNull InterfaceC4092gv0 _time) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_summaryNotificationDisplayer, "_summaryNotificationDisplayer");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_notificationRestoreProcessor, "_notificationRestoreProcessor");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._summaryNotificationDisplayer = _summaryNotificationDisplayer;
        this._configModelStore = _configModelStore;
        this._notificationRestoreProcessor = _notificationRestoreProcessor;
        this._time = _time;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef A[Catch: JSONException -> 0x0036, TRY_ENTER, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0036, blocks: (B:16:0x0031, B:49:0x00ef), top: B:58:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x012b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (defpackage.InterfaceC2262Vt0.a.markAsConsumed$default(r1, r14, r13, null, false, r6, 12, null) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e9, code lost:
    
        if (r8.restoreSummary(r5, r6) == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0122, code lost:
    
        if (r12.updateSummaryNotification(r14, r6) == r0) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String r12, boolean r13, defpackage.JM<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T61.internalUpdateSummaryNotificationAfterChildRemoved(java.lang.String, boolean, JM):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:22:0x005c->B:31:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object restoreSummary(String str, JM<? super Unit> jm) {
        c cVar;
        T61 t61;
        T61 t62;
        Iterator it;
        c cVar2;
        InterfaceC2262Vt0.b bVar;
        InterfaceC2344Wt0 interfaceC2344Wt0;
        if (jm instanceof c) {
            cVar = (c) jm;
            int i = cVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.label = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(jm);
            }
        } else {
            cVar = new c(jm);
        }
        Object objListNotificationsForGroup = cVar.result;
        MN mn = MN.d;
        int i2 = cVar.label;
        if (i2 == 0) {
            C1795Pt1.b(objListNotificationsForGroup);
            InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
            cVar.L$0 = this;
            cVar.label = 1;
            objListNotificationsForGroup = interfaceC2262Vt0.listNotificationsForGroup(str, cVar);
            if (objListNotificationsForGroup != mn) {
                t61 = this;
            }
            return mn;
        }
        if (i2 == 1) {
            t61 = (T61) cVar.L$0;
            C1795Pt1.b(objListNotificationsForGroup);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) cVar.L$1;
            t62 = (T61) cVar.L$0;
            C1795Pt1.b(objListNotificationsForGroup);
        }
        cVar2 = cVar;
        while (it.hasNext()) {
            bVar = (InterfaceC2262Vt0.b) it.next();
            interfaceC2344Wt0 = t62._notificationRestoreProcessor;
            cVar2.L$0 = t62;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (InterfaceC2344Wt0.a.processNotification$default(interfaceC2344Wt0, bVar, 0, cVar2, 2, null) == mn) {
                return mn;
            }
        }
        return Unit.a;
        t62 = t61;
        it = ((List) objListNotificationsForGroup).iterator();
        cVar2 = cVar;
        while (it.hasNext()) {
            bVar = (InterfaceC2262Vt0.b) it.next();
            interfaceC2344Wt0 = t62._notificationRestoreProcessor;
            cVar2.L$0 = t62;
            cVar2.L$1 = it;
            cVar2.label = 2;
            if (InterfaceC2344Wt0.a.processNotification$default(interfaceC2344Wt0, bVar, 0, cVar2, 2, null) == mn) {
                return mn;
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
    
        if (r11.markAsDismissed(r12, r0) == r1) goto L38;
     */
    @Override // defpackage.InterfaceC2831au0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clearNotificationOnSummaryClick(@org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T61.clearNotificationOnSummaryClick(java.lang.String, JM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, true, r0) == r1) goto L24;
     */
    @Override // defpackage.InterfaceC2831au0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object updatePossibleDependentSummaryOnDismiss(int r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof T61.d
            if (r0 == 0) goto L13
            r0 = r7
            T61$d r0 = (T61.d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            T61$d r0 = new T61$d
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            MN r1 = defpackage.MN.d
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.Object r6 = r0.L$0
            T61 r6 = (defpackage.T61) r6
            defpackage.C1795Pt1.b(r7)
            goto L4b
        L3a:
            defpackage.C1795Pt1.b(r7)
            Vt0 r7 = r5._dataController
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r7 = r7.getGroupId(r6, r0)
            if (r7 != r1) goto L4a
            goto L5a
        L4a:
            r6 = r5
        L4b:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L5e
            r2 = 0
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r6 = r6.internalUpdateSummaryNotificationAfterChildRemoved(r7, r4, r0)
            if (r6 != r1) goto L5b
        L5a:
            return r1
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        L5e:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.T61.updatePossibleDependentSummaryOnDismiss(int, JM):java.lang.Object");
    }

    @Override // defpackage.InterfaceC2831au0
    @Nullable
    public Object updateSummaryNotificationAfterChildRemoved(@NotNull String str, boolean z, @NotNull JM<? super Unit> jm) {
        Object objInternalUpdateSummaryNotificationAfterChildRemoved = internalUpdateSummaryNotificationAfterChildRemoved(str, z, jm);
        return objInternalUpdateSummaryNotificationAfterChildRemoved == MN.d ? objInternalUpdateSummaryNotificationAfterChildRemoved : Unit.a;
    }
}
