package com.onesignal.notifications.internal.receivereceipt.impl;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.c;
import com.onesignal.common.AndroidUtils;
import defpackage.AbstractC4477ik2;
import defpackage.C1795Pt1;
import defpackage.C7582xI;
import defpackage.C7766y91;
import defpackage.EnumC4593j41;
import defpackage.EnumC5957pa0;
import defpackage.I71;
import defpackage.InterfaceC0625Au0;
import defpackage.InterfaceC0703Bu0;
import defpackage.InterfaceC2338Wr0;
import defpackage.InterfaceC3253cv0;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.K91;
import defpackage.LM;
import defpackage.MN;
import defpackage.NS0;
import defpackage.R51;
import defpackage.VK;
import defpackage.Z0;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u001a\u001bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager;", "LBu0;", "LWr0;", "_applicationService", "LxI;", "_configModelStore", "Lcv0;", "_subscriptionManager", "<init>", "(LWr0;LxI;Lcv0;)V", "LVK;", "buildConstraints", "()LVK;", "", "notificationId", "", "enqueueReceiveReceipt", "(Ljava/lang/String;)V", "LWr0;", "LxI;", "Lcv0;", "", "minDelay", "I", "maxDelay", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "ReceiveReceiptWorker", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ReceiveReceiptWorkManager implements InterfaceC0703Bu0 {

    @NotNull
    private static final String OS_APP_ID = "os_app_id";

    @NotNull
    private static final String OS_NOTIFICATION_ID = "os_notification_id";

    @NotNull
    private static final String OS_SUBSCRIPTION_ID = "os_subscription_id";

    @NotNull
    private final InterfaceC2338Wr0 _applicationService;

    @NotNull
    private final C7582xI _configModelStore;

    @NotNull
    private final InterfaceC3253cv0 _subscriptionManager;
    private final int maxDelay;
    private final int minDelay;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/onesignal/notifications/internal/receivereceipt/impl/ReceiveReceiptWorkManager$ReceiveReceiptWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "doWork", "(LJM;)Ljava/lang/Object;", "com.onesignal.notifications"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class ReceiveReceiptWorker extends CoroutineWorker {

        @InterfaceC3368dU(c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker", f = "ReceiveReceiptWorkManager.kt", l = {85}, m = "doWork")
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public static final class a extends LM {
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
                return ReceiveReceiptWorker.this.doWork(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ReceiveReceiptWorker(@NotNull Context context, @NotNull WorkerParameters workerParams) {
            super(context, workerParams);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(workerParams, "workerParams");
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.work.CoroutineWorker
        @Nullable
        public Object doWork(@NotNull JM<? super c.a> jm) {
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
            Object obj = aVar.result;
            MN mn = MN.d;
            int i2 = aVar.label;
            if (i2 == 0) {
                C1795Pt1.b(obj);
                Context applicationContext = getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                if (!C7766y91.c(applicationContext)) {
                    c.a.C0243c c0243c = new c.a.C0243c();
                    Intrinsics.checkNotNullExpressionValue(c0243c, "success()");
                    return c0243c;
                }
                String strB = getInputData().b(ReceiveReceiptWorkManager.OS_NOTIFICATION_ID);
                Intrinsics.checkNotNull(strB);
                String strB2 = getInputData().b(ReceiveReceiptWorkManager.OS_APP_ID);
                Intrinsics.checkNotNull(strB2);
                String strB3 = getInputData().b(ReceiveReceiptWorkManager.OS_SUBSCRIPTION_ID);
                Intrinsics.checkNotNull(strB3);
                InterfaceC0625Au0 interfaceC0625Au0 = (InterfaceC0625Au0) C7766y91.b().getService(InterfaceC0625Au0.class);
                aVar.label = 1;
                if (interfaceC0625Au0.sendReceiveReceipt(strB2, strB3, strB, aVar) == mn) {
                    return mn;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            c.a.C0243c c0243c2 = new c.a.C0243c();
            Intrinsics.checkNotNullExpressionValue(c0243c2, "success()");
            return c0243c2;
        }
    }

    public ReceiveReceiptWorkManager(@NotNull InterfaceC2338Wr0 _applicationService, @NotNull C7582xI _configModelStore, @NotNull InterfaceC3253cv0 _subscriptionManager) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_configModelStore, "_configModelStore");
        Intrinsics.checkNotNullParameter(_subscriptionManager, "_subscriptionManager");
        this._applicationService = _applicationService;
        this._configModelStore = _configModelStore;
        this._subscriptionManager = _subscriptionManager;
        this.maxDelay = 25;
    }

    private final VK buildConstraints() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EnumC4593j41 networkType = EnumC4593j41.e;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        return new VK(networkType, false, false, false, false, -1L, -1L, CollectionsKt.h0(linkedHashSet));
    }

    @Override // defpackage.InterfaceC0703Bu0
    public void enqueueReceiveReceipt(@NotNull String notificationId) throws Throwable {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        if (!this._configModelStore.getModel().getReceiveReceiptEnabled()) {
            NS0.debug$default("sendReceiveReceipt disabled", null, 2, null);
            return;
        }
        String appId = this._configModelStore.getModel().getAppId();
        String id = this._subscriptionManager.getSubscriptions().getPush().getId();
        if (id.length() == 0 || appId.length() == 0) {
            NS0.debug$default("ReceiveReceiptWorkManager: No push subscription or appId!", null, 2, null);
        }
        int randomDelay = AndroidUtils.INSTANCE.getRandomDelay(this.minDelay, this.maxDelay);
        HashMap map = new HashMap();
        map.put(OS_NOTIFICATION_ID, notificationId);
        map.put(OS_APP_ID, appId);
        map.put(OS_SUBSCRIPTION_ID, id);
        b bVar = new b(map);
        b.c(bVar);
        Intrinsics.checkNotNullExpressionValue(bVar, "Builder()\n              …\n                .build()");
        VK constraints = buildConstraints();
        K91.a aVar = new K91.a(ReceiveReceiptWorker.class);
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        aVar.b.j = constraints;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        K91 k91A = ((K91.a) aVar.d(randomDelay)).e(bVar).a();
        NS0.debug$default("OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + notificationId + " and delay: " + randomDelay + " seconds", null, 2, null);
        AbstractC4477ik2 i71 = I71.INSTANCE.getInstance(this._applicationService.getAppContext());
        String strC = Z0.c(notificationId, "_receive_receipt");
        EnumC5957pa0 enumC5957pa0 = EnumC5957pa0.e;
        i71.getClass();
        i71.a(strC, enumC5957pa0, Collections.singletonList(k91A));
    }
}
