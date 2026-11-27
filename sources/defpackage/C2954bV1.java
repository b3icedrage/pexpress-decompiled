package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: renamed from: bV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J-\u0010%\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0016\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J3\u0010(\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010'\u001a\u00020\n2\u0006\u0010$\u001a\u00020\nH\u0097@ø\u0001\u0000¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"LbV1;", "Ldv0;", "LWr0;", "_applicationService", "LVt0;", "_dataController", "LIt0;", "_notificationDisplayBuilder", "<init>", "(LWr0;LVt0;LIt0;)V", "", "summaryNotificationId", "LQB0;", "intentGenerator", "Lorg/json/JSONObject;", "fcmJson", "", "group", "Landroid/content/Intent;", "createBaseSummaryIntent", "(ILQB0;Lorg/json/JSONObject;Ljava/lang/String;)Landroid/content/Intent;", "Lh61;", "notifBuilder", "gcmBundle", "notificationId", "", "createGenericPendingIntentsForGroup", "(Lh61;LQB0;Lorg/json/JSONObject;Ljava/lang/String;I)V", "Lr61;", "notificationJob", "Landroid/app/Notification;", "createSingleNotificationBeforeSummaryBuilder", "(Lr61;Lh61;)Landroid/app/Notification;", "updateSummaryNotification", "(Lr61;LJM;)Ljava/lang/Object;", "Ln61$a;", "groupAlertBehavior", "createSummaryNotification", "(Lr61;Ln61$a;ILJM;)Ljava/lang/Object;", "grouplessNotifCount", "createGrouplessSummaryNotification", "(Lr61;LQB0;IILJM;)Ljava/lang/Object;", "LWr0;", "LVt0;", "LIt0;", "Landroid/content/Context;", "getCurrentContext", "()Landroid/content/Context;", "currentContext", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C2954bV1 implements InterfaceC3462dv0 {

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final InterfaceC2262Vt0 _dataController;

    @NotNull
    private final InterfaceC1246It0 _notificationDisplayBuilder;

    /* JADX INFO: renamed from: bV1$a */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", f = "SummaryNotificationDisplayer.kt", l = {267}, m = "createGrouplessSummaryNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends LM {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
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
            return C2954bV1.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: renamed from: bV1$b */
    @InterfaceC3368dU(c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", f = "SummaryNotificationDisplayer.kt", l = {111, 116, 119}, m = "createSummaryNotification")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends LM {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
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
            return C2954bV1.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public C2954bV1(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull InterfaceC2262Vt0 _dataController, @NotNull InterfaceC1246It0 _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int summaryNotificationId, QB0 intentGenerator, JSONObject fcmJson, String group) {
        Intent intentPutExtra = intentGenerator.getNewBaseIntent(summaryNotificationId).putExtra("onesignalData", fcmJson.toString()).putExtra("summary", group);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "intentGenerator.getNewBa…utExtra(\"summary\", group)");
        return intentPutExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // defpackage.InterfaceC3462dv0
    public void createGenericPendingIntentsForGroup(@Nullable C4133h61 notifBuilder, @NotNull QB0 intentGenerator, @NotNull JSONObject gcmBundle, @NotNull String group, int notificationId) {
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        Intrinsics.checkNotNullParameter(gcmBundle, "gcmBundle");
        Intrinsics.checkNotNullParameter(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = intentGenerator.getNewBaseIntent(notificationId).putExtra("onesignalData", gcmBundle.toString()).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "intentGenerator.getNewBa…)).putExtra(\"grp\", group)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(iNextInt, intentPutExtra);
        Intrinsics.checkNotNull(notifBuilder);
        notifBuilder.g = newActionPendingIntent;
        InterfaceC1246It0 interfaceC1246It0 = this._notificationDisplayBuilder;
        int iNextInt2 = secureRandom.nextInt();
        Intent intentPutExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(notificationId).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "_notificationDisplayBuil…d).putExtra(\"grp\", group)");
        notifBuilder.z.deleteIntent = interfaceC1246It0.getNewDismissActionPendingIntent(iNextInt2, intentPutExtra2);
        notifBuilder.p = group;
        try {
            notifBuilder.x = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC3462dv0
    @Nullable
    public Object createGrouplessSummaryNotification(@NotNull C6283r61 c6283r61, @NotNull QB0 qb0, int i, int i2, @NotNull JM<? super Unit> jm) {
        a aVar;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        C2954bV1 c2954bV1;
        String str2;
        C6283r61 c6283r62;
        int i3;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i4 = aVar.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar.label = i4 - Integer.MIN_VALUE;
            } else {
                aVar = new a(jm);
            }
        } else {
            aVar = new a(jm);
        }
        Object obj = aVar.result;
        MN mn = MN.d;
        int i5 = aVar.label;
        if (i5 == 0) {
            C1795Pt1.b(obj);
            jsonPayload = c6283r61.getJsonPayload();
            Intrinsics.checkNotNull(jsonPayload);
            secureRandom = new SecureRandom();
            str = i + " new messages";
            InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
            aVar.L$0 = this;
            aVar.L$1 = c6283r61;
            aVar.L$2 = qb0;
            aVar.L$3 = jsonPayload;
            aVar.L$4 = secureRandom;
            aVar.L$5 = C6913u61.GROUPLESS_SUMMARY_KEY;
            aVar.L$6 = str;
            aVar.I$0 = i;
            aVar.I$1 = i2;
            aVar.I$2 = C6913u61.GROUPLESS_SUMMARY_ID;
            aVar.label = 1;
            if (interfaceC2262Vt0.createSummaryNotification(C6913u61.GROUPLESS_SUMMARY_ID, C6913u61.GROUPLESS_SUMMARY_KEY, aVar) == mn) {
                return mn;
            }
            c2954bV1 = this;
            str2 = C6913u61.GROUPLESS_SUMMARY_KEY;
            c6283r62 = c6283r61;
            i3 = -718463522;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = aVar.I$2;
            i2 = aVar.I$1;
            i = aVar.I$0;
            String str3 = (String) aVar.L$6;
            str2 = (String) aVar.L$5;
            secureRandom = (SecureRandom) aVar.L$4;
            jsonPayload = (JSONObject) aVar.L$3;
            QB0 qb1 = (QB0) aVar.L$2;
            c6283r62 = (C6283r61) aVar.L$1;
            c2954bV1 = (C2954bV1) aVar.L$0;
            C1795Pt1.b(obj);
            str = str3;
            qb0 = qb1;
        }
        PendingIntent newActionPendingIntent = qb0.getNewActionPendingIntent(secureRandom.nextInt(), c2954bV1.createBaseSummaryIntent(i3, qb0, jsonPayload, str2));
        InterfaceC1246It0 interfaceC1246It0 = c2954bV1._notificationDisplayBuilder;
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = c2954bV1._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
        PendingIntent newDismissActionPendingIntent = interfaceC1246It0.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
        C4133h61 compatBuilder = c2954bV1._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(c6283r62).getCompatBuilder();
        if (c6283r62.getOverriddenSound() != null) {
            Intrinsics.checkNotNull(compatBuilder);
            compatBuilder.j(c6283r62.getOverriddenSound());
        }
        if (c6283r62.getOverriddenFlags() != null) {
            Intrinsics.checkNotNull(compatBuilder);
            Integer overriddenFlags = c6283r62.getOverriddenFlags();
            Intrinsics.checkNotNull(overriddenFlags);
            compatBuilder.f(overriddenFlags.intValue());
        }
        Intrinsics.checkNotNull(compatBuilder);
        compatBuilder.g = newActionPendingIntent;
        compatBuilder.z.deleteIntent = newDismissActionPendingIntent;
        Context currentContext = c2954bV1.getCurrentContext();
        Intrinsics.checkNotNull(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = c2954bV1.getCurrentContext();
        Intrinsics.checkNotNull(currentContext2);
        compatBuilder.e = C4133h61.c(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
        compatBuilder.f = C4133h61.c(str);
        compatBuilder.i = i;
        compatBuilder.z.icon = c2954bV1._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder.h(c2954bV1._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder.g(8, true);
        compatBuilder.g(16, false);
        compatBuilder.p = str2;
        compatBuilder.q = true;
        try {
            compatBuilder.x = i2;
        } catch (Throwable unused) {
        }
        C4811k61 c4811k61 = new C4811k61();
        c4811k61.b = C4133h61.c(str);
        compatBuilder.k(c4811k61);
        Notification notificationB = compatBuilder.b();
        Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
        Context currentContext3 = c2954bV1.getCurrentContext();
        Intrinsics.checkNotNull(currentContext3);
        new B61(currentContext3).a(i3, notificationB);
        return Unit.a;
    }

    @Override // defpackage.InterfaceC3462dv0
    @NotNull
    public Notification createSingleNotificationBeforeSummaryBuilder(@NotNull C6283r61 notificationJob, @Nullable C4133h61 notifBuilder) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        Intrinsics.checkNotNull(notifBuilder);
        Notification notificationB = notifBuilder.b();
        Intrinsics.checkNotNullExpressionValue(notificationB, "notifBuilder!!.build()");
        return notificationB;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0237 A[EDGE_INSN: B:116:0x0237->B:54:0x0237 BREAK  A[LOOP:0: B:35:0x01c8->B:120:0x01c8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0227 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:42:0x01ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x0251  */
    /* JADX WARN: Code duplicated, block: B:58:0x0258 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0283  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0283, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC3462dv0
    @Nullable
    public Object createSummaryNotification(@NotNull C6283r61 c6283r61, @Nullable C5444n61.a aVar, int i, @NotNull JM<? super Unit> jm) {
        b bVar;
        QB0 qb0;
        String group;
        PendingIntent newDismissActionPendingIntent;
        C6283r61 c6283r62;
        C5444n61.a aVar2;
        int i2;
        JSONObject jSONObject;
        boolean z;
        SecureRandom secureRandom;
        C2954bV1 c2954bV1;
        QB0 qb1;
        C6283r61 c6283r63;
        PendingIntent pendingIntent;
        SecureRandom secureRandom2;
        C5444n61.a aVar3;
        String group2;
        JSONObject jSONObject2;
        Integer num;
        Integer num2;
        QB0 qb2;
        int i3;
        JSONObject jSONObject3;
        C6283r61 c6283r64;
        String str;
        C5444n61.a aVar4;
        boolean z2;
        C2954bV1 c2954bV2;
        int i4;
        C5444n61.a aVar5;
        ArrayList<SpannableString> arrayList;
        Iterator it;
        String fullData;
        String strConcat;
        PendingIntent newActionPendingIntent;
        Notification notificationB;
        String strM;
        String string;
        InterfaceC2262Vt0.b bVar2;
        SpannableString spannableString;
        if (jm instanceof b) {
            bVar = (b) jm;
            int i5 = bVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.label = i5 - Integer.MIN_VALUE;
            } else {
                bVar = new b(jm);
            }
        } else {
            bVar = new b(jm);
        }
        Object objListNotificationsForGroup = bVar.result;
        MN mn = MN.d;
        int i6 = bVar.label;
        if (i6 == 0) {
            C1795Pt1.b(objListNotificationsForGroup);
            boolean isRestoring = c6283r61.getIsRestoring();
            JSONObject jsonPayload = c6283r61.getJsonPayload();
            Intrinsics.checkNotNull(jsonPayload);
            Context currentContext = getCurrentContext();
            Intrinsics.checkNotNull(currentContext);
            qb0 = new QB0(currentContext);
            group = jsonPayload.optString("grp", null);
            SecureRandom secureRandom3 = new SecureRandom();
            InterfaceC1246It0 interfaceC1246It0 = this._notificationDisplayBuilder;
            int iNextInt = secureRandom3.nextInt();
            Intent intentPutExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", group);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
            newDismissActionPendingIntent = interfaceC1246It0.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
            InterfaceC2262Vt0 interfaceC2262Vt0 = this._dataController;
            Intrinsics.checkNotNullExpressionValue(group, "group");
            bVar.L$0 = this;
            c6283r62 = c6283r61;
            bVar.L$1 = c6283r62;
            aVar2 = aVar;
            bVar.L$2 = aVar2;
            bVar.L$3 = jsonPayload;
            bVar.L$4 = qb0;
            bVar.L$5 = group;
            bVar.L$6 = secureRandom3;
            bVar.L$7 = newDismissActionPendingIntent;
            i2 = i;
            bVar.I$0 = i2;
            bVar.Z$0 = isRestoring;
            bVar.label = 1;
            Object androidIdForGroup = interfaceC2262Vt0.getAndroidIdForGroup(group, true, bVar);
            if (androidIdForGroup != mn) {
                jSONObject = jsonPayload;
                z = isRestoring;
                objListNotificationsForGroup = androidIdForGroup;
                secureRandom = secureRandom3;
                c2954bV1 = this;
            }
            return mn;
        }
        if (i6 == 1) {
            z = bVar.Z$0;
            int i7 = bVar.I$0;
            PendingIntent pendingIntent2 = (PendingIntent) bVar.L$7;
            SecureRandom secureRandom4 = (SecureRandom) bVar.L$6;
            String str2 = (String) bVar.L$5;
            QB0 qb3 = (QB0) bVar.L$4;
            JSONObject jSONObject4 = (JSONObject) bVar.L$3;
            C5444n61.a aVar6 = (C5444n61.a) bVar.L$2;
            C6283r61 c6283r65 = (C6283r61) bVar.L$1;
            C2954bV1 c2954bV3 = (C2954bV1) bVar.L$0;
            C1795Pt1.b(objListNotificationsForGroup);
            i2 = i7;
            qb0 = qb3;
            newDismissActionPendingIntent = pendingIntent2;
            group = str2;
            c2954bV1 = c2954bV3;
            secureRandom = secureRandom4;
            jSONObject = jSONObject4;
            aVar2 = aVar6;
            c6283r62 = c6283r65;
        } else {
            if (i6 == 2) {
                z = bVar.Z$0;
                i3 = bVar.I$0;
                num2 = (Integer) bVar.L$8;
                newDismissActionPendingIntent = (PendingIntent) bVar.L$7;
                secureRandom = (SecureRandom) bVar.L$6;
                str = (String) bVar.L$5;
                qb2 = (QB0) bVar.L$4;
                jSONObject3 = (JSONObject) bVar.L$3;
                aVar4 = (C5444n61.a) bVar.L$2;
                c6283r64 = (C6283r61) bVar.L$1;
                c2954bV1 = (C2954bV1) bVar.L$0;
                C1795Pt1.b(objListNotificationsForGroup);
                aVar3 = aVar4;
                num = num2;
                pendingIntent = newDismissActionPendingIntent;
                secureRandom2 = secureRandom;
                group2 = str;
                qb1 = qb2;
                jSONObject2 = jSONObject3;
                i2 = i3;
                c6283r63 = c6283r64;
                InterfaceC2262Vt0 interfaceC2262Vt1 = c2954bV1._dataController;
                Intrinsics.checkNotNullExpressionValue(group2, "group");
                bVar.L$0 = c2954bV1;
                bVar.L$1 = c6283r63;
                bVar.L$2 = aVar3;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = qb1;
                bVar.L$5 = group2;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num;
                bVar.I$0 = i2;
                bVar.Z$0 = z;
                bVar.label = 3;
                objListNotificationsForGroup = interfaceC2262Vt1.listNotificationsForGroup(group2, bVar);
                if (objListNotificationsForGroup != mn) {
                    z2 = z;
                    c2954bV2 = c2954bV1;
                    i4 = i2;
                    aVar5 = aVar3;
                }
                return mn;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = bVar.Z$0;
            i4 = bVar.I$0;
            num = (Integer) bVar.L$8;
            pendingIntent = (PendingIntent) bVar.L$7;
            secureRandom2 = (SecureRandom) bVar.L$6;
            group2 = (String) bVar.L$5;
            qb1 = (QB0) bVar.L$4;
            jSONObject2 = (JSONObject) bVar.L$3;
            aVar5 = (C5444n61.a) bVar.L$2;
            c6283r63 = (C6283r61) bVar.L$1;
            c2954bV2 = (C2954bV1) bVar.L$0;
            C1795Pt1.b(objListNotificationsForGroup);
            z2 = z3;
        }
        arrayList = new ArrayList();
        it = ((List) objListNotificationsForGroup).iterator();
        fullData = null;
        while (true) {
            it = it;
            num = num;
            strConcat = "";
            if (!it.hasNext()) {
                break;
            }
            bVar2 = (InterfaceC2262Vt0.b) it.next();
            String str3 = fullData;
            if (z2 == 0 || bVar2.getAndroidId() != c6283r63.getAndroidId()) {
                String title = bVar2.getTitle();
                strConcat = title != null ? title.concat(" ") : "";
                StringBuilder sbF = C1039Gc0.f(strConcat);
                sbF.append(bVar2.getMessage());
                spannableString = new SpannableString(sbF.toString());
                if (strConcat.length() > 0) {
                    spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                }
                arrayList.add(spannableString);
                if (str3 == null) {
                }
            }
        }
        int iNextInt2 = secureRandom2.nextInt();
        Intrinsics.checkNotNull(num);
        int iIntValue = num.intValue();
        Intrinsics.checkNotNullExpressionValue(group2, "group");
        newActionPendingIntent = qb1.getNewActionPendingIntent(iNextInt2, c2954bV2.createBaseSummaryIntent(iIntValue, qb1, jSONObject2, group2));
        if ((z2 != 0 || arrayList.size() <= 1) && (z2 != 0 || arrayList.size() <= 0)) {
            Intrinsics.checkNotNull(aVar5);
            C4133h61 compatBuilder = aVar5.getCompatBuilder();
            Intrinsics.checkNotNull(compatBuilder);
            compatBuilder.b.clear();
            c2954bV2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, qb1, compatBuilder, num.intValue(), group2);
            compatBuilder.g = newActionPendingIntent;
            compatBuilder.z.deleteIntent = pendingIntent;
            compatBuilder.g(8, z2);
            compatBuilder.g(16, false);
            compatBuilder.p = group2;
            compatBuilder.q = true;
            try {
                compatBuilder.x = i4;
            } catch (Throwable unused) {
            }
            notificationB = compatBuilder.b();
            Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
            c2954bV2._notificationDisplayBuilder.addXiaomiSettings(aVar5, notificationB);
        } else {
            int size = arrayList.size() + (!z2);
            String strSafeString = JD0.safeString(jSONObject2, "grp_msg");
            if (strSafeString != null) {
                strM = d.m(strSafeString, "$[notif_count]", "" + size);
                if (strM == null) {
                    strM = size + " new messages";
                }
            } else {
                strM = size + " new messages";
            }
            C4133h61 compatBuilder2 = c2954bV2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(c6283r63).getCompatBuilder();
            if (z2 != 0) {
                c2954bV2._notificationDisplayBuilder.removeNotifyOptions(compatBuilder2);
            } else {
                if (c6283r63.getOverriddenSound() != null) {
                    Intrinsics.checkNotNull(compatBuilder2);
                    compatBuilder2.j(c6283r63.getOverriddenSound());
                }
                if (c6283r63.getOverriddenFlags() != null) {
                    Intrinsics.checkNotNull(compatBuilder2);
                    Integer overriddenFlags = c6283r63.getOverriddenFlags();
                    Intrinsics.checkNotNull(overriddenFlags);
                    compatBuilder2.f(overriddenFlags.intValue());
                }
            }
            Intrinsics.checkNotNull(compatBuilder2);
            compatBuilder2.g = newActionPendingIntent;
            compatBuilder2.z.deleteIntent = pendingIntent;
            Context currentContext2 = c2954bV2.getCurrentContext();
            Intrinsics.checkNotNull(currentContext2);
            PackageManager packageManager = currentContext2.getPackageManager();
            Context currentContext3 = c2954bV2.getCurrentContext();
            Intrinsics.checkNotNull(currentContext3);
            compatBuilder2.e = C4133h61.c(packageManager.getApplicationLabel(currentContext3.getApplicationInfo()));
            compatBuilder2.f = C4133h61.c(strM);
            compatBuilder2.i = size;
            compatBuilder2.z.icon = c2954bV2._notificationDisplayBuilder.getDefaultSmallIconId();
            compatBuilder2.h(c2954bV2._notificationDisplayBuilder.getDefaultLargeIcon());
            compatBuilder2.g(8, z2);
            compatBuilder2.g(16, false);
            compatBuilder2.p = group2;
            compatBuilder2.q = true;
            try {
                compatBuilder2.x = i4;
            } catch (Throwable unused2) {
            }
            if (z2 == 0) {
                compatBuilder2.z.tickerText = C4133h61.c(strM);
            }
            C4811k61 c4811k61 = new C4811k61();
            if (z2 == 0) {
                String strValueOf = c6283r63.getTitle() != null ? String.valueOf(c6283r63.getTitle()) : null;
                String strConcat2 = strValueOf == null ? "" : strValueOf.concat(" ");
                CharSequence body = c6283r63.getBody();
                if (body != null && (string = body.toString()) != null) {
                    strConcat = string;
                }
                SpannableString spannableString2 = new SpannableString(Z0.c(strConcat2, strConcat));
                if (strConcat2.length() > 0) {
                    spannableString2.setSpan(new StyleSpan(1), 0, strConcat2.length(), 0);
                }
                c4811k61.e.add(C4133h61.c(spannableString2));
            }
            for (SpannableString spannableString3 : arrayList) {
                if (spannableString3 != null) {
                    c4811k61.e.add(C4133h61.c(spannableString3));
                }
            }
            c4811k61.b = C4133h61.c(strM);
            compatBuilder2.k(c4811k61);
            notificationB = compatBuilder2.b();
            Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
        }
        Context currentContext4 = c2954bV2.getCurrentContext();
        Intrinsics.checkNotNull(currentContext4);
        new B61(currentContext4).a(num.intValue(), notificationB);
        return Unit.a;
        Integer num3 = (Integer) objListNotificationsForGroup;
        if (num3 == null) {
            num2 = new Integer(secureRandom.nextInt());
            InterfaceC2262Vt0 interfaceC2262Vt2 = c2954bV1._dataController;
            int iIntValue2 = num2.intValue();
            Intrinsics.checkNotNullExpressionValue(group, "group");
            bVar.L$0 = c2954bV1;
            bVar.L$1 = c6283r62;
            bVar.L$2 = aVar2;
            bVar.L$3 = jSONObject;
            bVar.L$4 = qb0;
            bVar.L$5 = group;
            bVar.L$6 = secureRandom;
            bVar.L$7 = newDismissActionPendingIntent;
            bVar.L$8 = num2;
            bVar.I$0 = i2;
            bVar.Z$0 = z;
            boolean z4 = z;
            bVar.label = 2;
            if (interfaceC2262Vt2.createSummaryNotification(iIntValue2, group, bVar) != mn) {
                C5444n61.a aVar7 = aVar2;
                qb2 = qb0;
                i3 = i2;
                jSONObject3 = jSONObject;
                c6283r64 = c6283r62;
                str = group;
                aVar4 = aVar7;
                z = z4;
                aVar3 = aVar4;
                num = num2;
                pendingIntent = newDismissActionPendingIntent;
                secureRandom2 = secureRandom;
                group2 = str;
                qb1 = qb2;
                jSONObject2 = jSONObject3;
                i2 = i3;
                c6283r63 = c6283r64;
                InterfaceC2262Vt0 interfaceC2262Vt3 = c2954bV1._dataController;
                Intrinsics.checkNotNullExpressionValue(group2, "group");
                bVar.L$0 = c2954bV1;
                bVar.L$1 = c6283r63;
                bVar.L$2 = aVar3;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = qb1;
                bVar.L$5 = group2;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num;
                bVar.I$0 = i2;
                bVar.Z$0 = z;
                bVar.label = 3;
                objListNotificationsForGroup = interfaceC2262Vt3.listNotificationsForGroup(group2, bVar);
                if (objListNotificationsForGroup != mn) {
                    z2 = z;
                    c2954bV2 = c2954bV1;
                    i4 = i2;
                    aVar5 = aVar3;
                    arrayList = new ArrayList();
                    it = ((List) objListNotificationsForGroup).iterator();
                    fullData = null;
                    while (true) {
                        it = it;
                        num = num;
                        strConcat = "";
                        if (!it.hasNext()) {
                            break;
                            break;
                        }
                        bVar2 = (InterfaceC2262Vt0.b) it.next();
                        String str4 = fullData;
                        if (z2 == 0) {
                        }
                        String title2 = bVar2.getTitle();
                        if (title2 != null) {
                        }
                        StringBuilder sbF2 = C1039Gc0.f(strConcat);
                        sbF2.append(bVar2.getMessage());
                        spannableString = new SpannableString(sbF2.toString());
                        if (strConcat.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                        }
                        arrayList.add(spannableString);
                        fullData = str4 == null ? bVar2.getFullData() : str4;
                    }
                    int iNextInt3 = secureRandom2.nextInt();
                    Intrinsics.checkNotNull(num);
                    int iIntValue3 = num.intValue();
                    Intrinsics.checkNotNullExpressionValue(group2, "group");
                    newActionPendingIntent = qb1.getNewActionPendingIntent(iNextInt3, c2954bV2.createBaseSummaryIntent(iIntValue3, qb1, jSONObject2, group2));
                    if (z2 != 0) {
                        Intrinsics.checkNotNull(aVar5);
                        C4133h61 compatBuilder3 = aVar5.getCompatBuilder();
                        Intrinsics.checkNotNull(compatBuilder3);
                        compatBuilder3.b.clear();
                        c2954bV2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, qb1, compatBuilder3, num.intValue(), group2);
                        compatBuilder3.g = newActionPendingIntent;
                        compatBuilder3.z.deleteIntent = pendingIntent;
                        compatBuilder3.g(8, z2);
                        compatBuilder3.g(16, false);
                        compatBuilder3.p = group2;
                        compatBuilder3.q = true;
                        compatBuilder3.x = i4;
                        notificationB = compatBuilder3.b();
                        Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
                        c2954bV2._notificationDisplayBuilder.addXiaomiSettings(aVar5, notificationB);
                    } else {
                        Intrinsics.checkNotNull(aVar5);
                        C4133h61 compatBuilder4 = aVar5.getCompatBuilder();
                        Intrinsics.checkNotNull(compatBuilder4);
                        compatBuilder4.b.clear();
                        c2954bV2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, qb1, compatBuilder4, num.intValue(), group2);
                        compatBuilder4.g = newActionPendingIntent;
                        compatBuilder4.z.deleteIntent = pendingIntent;
                        compatBuilder4.g(8, z2);
                        compatBuilder4.g(16, false);
                        compatBuilder4.p = group2;
                        compatBuilder4.q = true;
                        compatBuilder4.x = i4;
                        notificationB = compatBuilder4.b();
                        Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
                        c2954bV2._notificationDisplayBuilder.addXiaomiSettings(aVar5, notificationB);
                    }
                    Context currentContext5 = c2954bV2.getCurrentContext();
                    Intrinsics.checkNotNull(currentContext5);
                    new B61(currentContext5).a(num.intValue(), notificationB);
                    return Unit.a;
                }
            }
        } else {
            C6283r61 c6283r66 = c6283r62;
            qb1 = qb0;
            c6283r63 = c6283r66;
            pendingIntent = newDismissActionPendingIntent;
            secureRandom2 = secureRandom;
            aVar3 = aVar2;
            group2 = group;
            jSONObject2 = jSONObject;
            num = num3;
            InterfaceC2262Vt0 interfaceC2262Vt4 = c2954bV1._dataController;
            Intrinsics.checkNotNullExpressionValue(group2, "group");
            bVar.L$0 = c2954bV1;
            bVar.L$1 = c6283r63;
            bVar.L$2 = aVar3;
            bVar.L$3 = jSONObject2;
            bVar.L$4 = qb1;
            bVar.L$5 = group2;
            bVar.L$6 = secureRandom2;
            bVar.L$7 = pendingIntent;
            bVar.L$8 = num;
            bVar.I$0 = i2;
            bVar.Z$0 = z;
            bVar.label = 3;
            objListNotificationsForGroup = interfaceC2262Vt4.listNotificationsForGroup(group2, bVar);
            if (objListNotificationsForGroup != mn) {
                z2 = z;
                c2954bV2 = c2954bV1;
                i4 = i2;
                aVar5 = aVar3;
                arrayList = new ArrayList();
                it = ((List) objListNotificationsForGroup).iterator();
                fullData = null;
                while (true) {
                    it = it;
                    num = num;
                    strConcat = "";
                    if (!it.hasNext()) {
                        break;
                        break;
                    }
                    bVar2 = (InterfaceC2262Vt0.b) it.next();
                    String str5 = fullData;
                    if (z2 == 0) {
                    }
                    String title3 = bVar2.getTitle();
                    if (title3 != null) {
                    }
                    StringBuilder sbF3 = C1039Gc0.f(strConcat);
                    sbF3.append(bVar2.getMessage());
                    spannableString = new SpannableString(sbF3.toString());
                    if (strConcat.length() > 0) {
                        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                    }
                    arrayList.add(spannableString);
                    if (str5 == null) {
                    }
                }
                int iNextInt4 = secureRandom2.nextInt();
                Intrinsics.checkNotNull(num);
                int iIntValue4 = num.intValue();
                Intrinsics.checkNotNullExpressionValue(group2, "group");
                newActionPendingIntent = qb1.getNewActionPendingIntent(iNextInt4, c2954bV2.createBaseSummaryIntent(iIntValue4, qb1, jSONObject2, group2));
                if (z2 != 0) {
                    Intrinsics.checkNotNull(aVar5);
                    C4133h61 compatBuilder5 = aVar5.getCompatBuilder();
                    Intrinsics.checkNotNull(compatBuilder5);
                    compatBuilder5.b.clear();
                    c2954bV2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, qb1, compatBuilder5, num.intValue(), group2);
                    compatBuilder5.g = newActionPendingIntent;
                    compatBuilder5.z.deleteIntent = pendingIntent;
                    compatBuilder5.g(8, z2);
                    compatBuilder5.g(16, false);
                    compatBuilder5.p = group2;
                    compatBuilder5.q = true;
                    compatBuilder5.x = i4;
                    notificationB = compatBuilder5.b();
                    Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
                    c2954bV2._notificationDisplayBuilder.addXiaomiSettings(aVar5, notificationB);
                } else {
                    Intrinsics.checkNotNull(aVar5);
                    C4133h61 compatBuilder6 = aVar5.getCompatBuilder();
                    Intrinsics.checkNotNull(compatBuilder6);
                    compatBuilder6.b.clear();
                    c2954bV2._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, qb1, compatBuilder6, num.intValue(), group2);
                    compatBuilder6.g = newActionPendingIntent;
                    compatBuilder6.z.deleteIntent = pendingIntent;
                    compatBuilder6.g(8, z2);
                    compatBuilder6.g(16, false);
                    compatBuilder6.p = group2;
                    compatBuilder6.q = true;
                    compatBuilder6.x = i4;
                    notificationB = compatBuilder6.b();
                    Intrinsics.checkNotNullExpressionValue(notificationB, "summaryBuilder.build()");
                    c2954bV2._notificationDisplayBuilder.addXiaomiSettings(aVar5, notificationB);
                }
                Context currentContext6 = c2954bV2.getCurrentContext();
                Intrinsics.checkNotNull(currentContext6);
                new B61(currentContext6).a(num.intValue(), notificationB);
                return Unit.a;
            }
        }
        return mn;
    }

    @Override // defpackage.InterfaceC3462dv0
    @Nullable
    public Object updateSummaryNotification(@NotNull C6283r61 c6283r61, @NotNull JM<? super Unit> jm) {
        Object objCreateSummaryNotification = createSummaryNotification(c6283r61, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), jm);
        return objCreateSummaryNotification == MN.d ? objCreateSummaryNotification : Unit.a;
    }
}
